grammar Cmm;

@header{
    import ast.*;
    import ast.expressions.*;
    import ast.program.*;
    import ast.statements.*;
    import ast.types.*;
    import ast.types.Record;
    import ast.types.builtin.*;
}

// A program is a sequence of variable and function definitions.
// EOF, there is nothing beyond main!!!
program returns [Program ast]
        locals [List<Definition> list = new ArrayList<>()]:
        (v = varDefinitions {$list.addAll($v.ast);} | f = functionDefinition {$list.add($f.ast);})*
            m = main {$list.add($m.ast);}
        {$ast = new Program($m.ast.getLine(), $m.ast.getColumn(), $list);} EOF
        ;

expression returns [Expression ast]:
            '(' e = expression ')'
                {$ast = $e.ast;}
            | e1 = expression '[' e2 = expression ']' //RECURSION ->
            //v[1][2]
            //v[1] = exp 1, [2] = exp 2
            //v = exp 1.1, [1] = exp 1.2
                {$ast = new Indexing($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast);}
            | e = expression '.' ID //v[2].execute()     a.do()
                {$ast = new FieldAccess($e.ast.getLine(), $e.ast.getColumn(), $ID.text, $e.ast);}
            | '(' t = builtin ')' e = expression //cast
                {$ast = new Cast($e.ast.getLine(), $e.ast.getColumn(), $t.ast, $e.ast);}
            | OP = '-' e = expression
                {$ast = new UnaryMinus($OP.getLine(), $OP.getCharPositionInLine()+1, $e.ast);}
            | OP = '!' e = expression
                {$ast = new UnaryNot($OP.getLine(), $OP.getCharPositionInLine()+1, $e.ast);}
            | e1 = expression OP = ('/' | '*' | '%') e2 = expression
                {$ast = Arithmetic.createArithmetic($e1.ast.getLine(), $e1.ast.getColumn(), $OP.text, $e1.ast, $e2.ast);}
            | e1 = expression OP = ('+' | '-') e2 = expression
                {$ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(), $OP.text, $e1.ast, $e2.ast);}
            | e1 = expression OP = ('>' | '>=' | '<' | '<=' | '!=' | '==') e2 = expression
                {$ast = new Comparison($e1.ast.getLine(), $e1.ast.getColumn(), $OP.text, $e1.ast, $e2.ast);}
            | e1 = expression OP = ('&&' | '||') e2 = expression
                {$ast = new Logical($e1.ast.getLine(), $e1.ast.getColumn(), $OP.text, $e1.ast, $e2.ast);}
            | f = functionInvocation
                {$ast = $f.ast;}
            | ID
                {$ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text);}
            | IC = INT_CONSTANT
                {$ast = new Int_Literal($IC.getLine(), $IC.getCharPositionInLine()+1, LexerHelper.lexemeToInt($IC.text));}
            | RC = REAL_CONSTANT
                {$ast = new Real_Literal($RC.getLine(), $RC.getCharPositionInLine()+1, LexerHelper.lexemeToReal($RC.text));}
            | CC = CHAR_CONSTANT
                {$ast = new Char_Literal($CC.getLine(), $CC.getCharPositionInLine()+1, LexerHelper.lexemeToChar($CC.text));}
            ;


statement returns [List<Statement> ast = new ArrayList<>()]:
            e1 = expression '=' e2 = expression ';'
                {$ast.add(new Assignment($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast)); }
            | W = 'write' (e1 = expression ',' {$ast.add(new Write($W.getLine(), $W.getCharPositionInLine()+1, $e1.ast));})*
                e2 = expression ';'
                {$ast.add(new Write($W.getLine(), $W.getCharPositionInLine()+1, $e2.ast));}
            | R = 'read' (e1 = expression ',' {$ast.add(new Read($R.getLine(), $R.getCharPositionInLine()+1, $e1.ast));})*
                e2 = expression ';'
                {$ast.add(new Read($R.getLine(), $R.getCharPositionInLine()+1, $e2.ast));}
            | W = 'while' '(' e = expression ')' b = block
                {$ast.add(new While($W.getLine(), $W.getCharPositionInLine() + 1, $b.ast, $e.ast));}
            | I = 'if' '(' e = expression ')' b = block
                 {$ast.add(new IfElse($I.getLine(), $I.getCharPositionInLine() + 1, $b.ast, $e.ast));}
            | I = 'if' '(' e = expression ')' b1 = block 'else' b2 = block
                 {$ast.add(new IfElse($I.getLine(), $I.getCharPositionInLine() + 1, $b1.ast, $b2.ast, $e.ast));}
            | f = functionInvocation ';'
                 {$ast.add($f.ast);}
            | R = 'return' (e = expression
                 {$ast.add(new Return($R.getLine(), $R.getCharPositionInLine() + 1, $e.ast));})? ';'
            ;

// Array types can be created with the "[]" type constructor, following the Java syntax but specifying
// the size of the array with an integer constant
// The "struct" type constructor is added for specifying record types.
// Records have no type identifier, and fields are declared as var definitions between { and }.
type returns [Type ast]
     locals [List<RecordField> list = new ArrayList<>()]:
    t = type '[' IC = INT_CONSTANT ']'
        {$ast = Array.createArray($t.ast.getLine(), $t.ast.getColumn(), $t.ast, Integer.valueOf($IC.text));}
    | b = builtin
        {$ast = $b.ast;}
    | S = 'struct' '{' ( {int i = 0;} v = varDefinitions
              {
                for (VarDefinition varDef : $v.ast) {
                    $list.add(new RecordField(varDef.getLine(), varDef.getColumn(), varDef.getType(), varDef.getName()));
                }
              })*
      '}'
      {$ast = new Record($S.getLine(), $S.getCharPositionInLine() + 1, $list);}
    ;

//type followed by a non-empty enumeration of comma-separated identifiers.
// Variable definitions must end with the ";" character.
varDefinitions returns [List<VarDefinition> ast = new ArrayList<>()]:
             t = type ID1 = ID
                {$ast.add(new VarDefinition($t.ast.getLine(), $t.ast.getColumn(), $t.ast, $ID1.text));}
                    (',' ID2 = ID {$ast.add(new VarDefinition($t.ast.getLine(), $t.ast.getColumn(), $t.ast, $ID2.text));})* ';'
             ;

block returns [List<Statement> ast = new ArrayList<>()]:
      '{' (s1 = statement {$ast.addAll($s1.ast);})* '}'
      | s2 = statement {$ast.addAll($s2.ast);}
      ;



// return type, the function identifier and a list of comma-separated parameters between ( and ).
// Parameter types must be built-in (i.e., no arrays or records).
// Return types could be built-in or void.
// The function body goes between { and }.
functionDefinition returns [FuncDefinition ast]
                   locals [List<VarDefinition> list = new ArrayList<>()]:
                   r = returnType ID1 = ID '(' (b1 = builtin ID2 = ID ','
                        // adding the parameters if more than one
                        {$list.add(new VarDefinition($b1.ast.getLine(), $b1.ast.getColumn(), $b1.ast, $ID2.text));})*
                        // adding a parameter if one or more
                         (b2 = builtin ID3 = ID
                             {$list.add(new VarDefinition($b2.ast.getLine(), $b2.ast.getColumn(), $b2.ast, $ID3.text));})? ')'
                             '{' f = functionBody '}'
                                // the parameters are passed by the Function type
                                {$ast = new FuncDefinition($r.ast.getLine(), $r.ast.getColumn(),
                                            new FunctionType($ID1.getLine(), $ID1.getCharPositionInLine()+1, $r.ast, $list),
                                        $ID1.text, $f.ast);}
                   ;

// only void or builtin
returnType returns [Type ast]:
           b = builtin
                {$ast = $b.ast;}
          | V = 'void'
                {$ast = new VoidType($V.getLine(), $V.getCharPositionInLine() + 1);}
          ;

//sequences of variable definitions followed by sequences of statements. Both must end with the ";" character.
functionBody returns [List<Statement> ast = new ArrayList<>()]:
            (v = varDefinitions {$ast.addAll($v.ast);})* (s = statement {$ast.addAll($s.ast);})*
            ;

functionInvocation returns [FunctionInvocation ast]
                   locals [List<Expression> list = new ArrayList<Expression>()]:
            ID '(' ((e1 = expression ',' {$list.add($e1.ast);})* e2 = expression {$list.add($e2.ast);})? ')'
           {$ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1,
                new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text), $list);}
            ;

//Built-in types are "int", "double" and "char".
builtin returns [Type ast]:
        I = 'int'       {$ast = new IntType($I.getLine(), $I.getCharPositionInLine()+1);}
       | D = 'double'   {$ast = new DoubleType($D.getLine(), $D.getCharPositionInLine()+1);}
       | C = 'char'     {$ast = new CharType($C.getLine(), $C.getCharPositionInLine()+1);}
       ;

// returns void and receives no parameters.
main returns [FuncDefinition ast]:
        V = 'void' M = 'main' '(' ')' '{' f = functionBody '}'
        {$ast = new FuncDefinition($V.getLine(), $V.getCharPositionInLine() + 1,
            new FunctionType($V.getLine(), $V.getCharPositionInLine() + 1,
                            new VoidType($V.getLine(), $V.getCharPositionInLine() + 1), new ArrayList<VarDefinition>()),
                 $M.text, $f.ast);}
    ;

  //  One-line comments starting with //
  SINGLE_LINE_COMMENT: '//' .*? ([\n] | EOF)
                     -> skip
                     ;
  //  Multiple-line comments starting with /* and ending with */
  MULTIPLE_LINE_COMMENT: '/*' .*? '*/'
                       -> skip
                       ;

  //  Identifiers starting with a letter or _ and followed by letter, digit or _
  ID: [a-zA-Z_] [a-zA-Z0-9_]*
    ;

  //  Integer constants without sign. Only base 10 constants are supported; neither octal nor hexadecimal numbers are allowed.
  INT_CONSTANT: '0'
              | [1-9][0-9]*
              ;

  //  Real constants with floating point (without sign). Examples: 12.3, 2., .34
  //  Real constants with mantissa and exponent. Examples: 4.12E-3, .3E+3, 3e3, 2.e23
  fragment
  REAL: INT_CONSTANT '.' NUMBER?
      | INT_CONSTANT? '.' NUMBER
      ;

  REAL_CONSTANT: (REAL | INT_CONSTANT) [Ee] [+-]? INT_CONSTANT
               | REAL
               ;

  fragment
  NUMBER: [0-9]+
        ;

  //  Char constants between ' and '. Examples: 'a' '.' '~'
  //  Char constants identifying the ASCII code, e.g. '\126' (any integer constant without sign can be written between ' and ')
  CHAR_CONSTANT: '\'' . '\''
               | '\'' '\\' INT_CONSTANT '\''
               | '\'' (. | '\\n' | '\\t' | '\\r') '\''
               ;

  //  The two special char constants '\n' and '\t'
  // [\r\n\t   ]+ not necessary the + bc it's triggered whenever appears a blank
  WS: [ \r\n\t]
    -> skip
    ;