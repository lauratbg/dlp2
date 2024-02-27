grammar Cmm;

@header{
    import ast.*;
    import ast.expressions.*;
    import ast.program.*;
    import ast.statements.*;
    import ast.types.*;
    import ast.types.builtin.*;
}

//A program is a sequence of variable and function definitions.
program: (varDefinition | functionDefinition)* main;

expression returns [Expression ast]:
            '(' expression ')'
                //???????
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
                {$ast = new UnaryMinus($ID.getLine(), $ID.getCharPositionInLine()+1, $e.ast);}
            | OP = '!' e = expression
                {$ast = new UnaryNot($ID.getLine(), $ID.getCharPositionInLine()+1, $e.ast);}
            | e1 = expression ('%') e2 = expression
                {$ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(), $OP.text, $e1.ast, $e2.ast);}
            | e1 = expression ('%') e2 = expression
                {$ast = new Modulus($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast);}
            | e1 = expression OP = ('+' | '-') e2 = expression
                {$ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(), $OP.text, $e1.ast, $e2.ast);}
            | expression ('>' | '>=' | '<' | '<=' | '!=' | '==') expression
                {$ast = new Comparison($e1.ast.getLine(), $e1.ast.getColumn(), $OP.text, $e1.ast, $e2.ast);}
            | e1 = expression OP = ('&&' | '||') e2 = expression
                {$ast = new Logical($e1.ast.getLine(), $e1.ast.getColumn(), $OP.text, $e1.ast, $e2.ast);}
            | functionInvocation
            | ID
                {$ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text);}
            | IC = INT_CONSTANT
                {$ast = new Int_Literal($ID.getLine(), $ID.getCharPositionInLine()+1, LexerHelper.lexemeToInt($IC.text));}
            | RC = REAL_CONSTANT
                {$ast = new Real_Literal($ID.getLine(), $ID.getCharPositionInLine()+1, LexerHelper.lexemeToReal($RC.text));}
            | CC = CHAR_CONSTANT
                {$ast = new Char_Literal($ID.getLine(), $ID.getCharPositionInLine()+1, LexerHelper.lexemeToChar($CC.text));}
            ;


statement returns [Statement ast]
          locals [List<Statement> list = new ArrayList<>()]:
            e1 = expression '=' e2 = expression ';'
                {$ast = new Assignment($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast); }
            | W = 'write' ((e1 = expression ',')* e2 = expression) ';'
            | 'read' ((expression ',')* expression) ';'
            | 'while' '(' expression ')' block
            | 'if' '(' expression ')' block
            | 'if' '(' expression ')' block 'else' block
            | functionInvocation ';'
            | 'return' expression? ';'
            | varDefinition
            ;

//TODO: non-empty comma-separated list of expressions. FOR READ AND WRITE
expressionList returns [List<Expression> ast = new ArrayList<>();]:
              (expression ',')* expression
              ;

// Array types can be created with the "[]" type constructor, following the Java syntax but specifying
// the size of the array with an integer constant
// The "struct" type constructor is added for specifying record types.
// Records have no type identifier, and fields are declared as var definitions between { and }.
type: type '[' INT_CONSTANT ']'
    | builtin
    | 'struct' '{' varDefinition* '}'
    ;

block: '{' statement* '}'
      | statement
      ;

//type followed by a non-empty enumeration of comma-separated identifiers.
// Variable definitions must end with the ";" character.
varDefinition: type ID (',' ID)* ';'
             ;

//return type, the function identifier and a list of comma-separated parameters between ( and ).
// Parameter types must be built-in (i.e., no arrays or records).
// Return types could be built-in or void.
// The function body goes between { and }.
functionDefinition: returnType ID '(' ((builtin ID) (',' builtin ID)*)* ')' '{' functionBody '}'
                  ;

returnType: builtin
          | 'void'
          ;

//sequences of variable definitions followed by sequences of statements. Both must end with the ";" character.
functionBody: (varDefinition statement*)*
            ;
functionInvocation:  ID '(' ((expression ',')* expression)? ')' ;

//Built-in types are "int", "double" and "char".
builtin returns [Type ast]:
        I = 'int'       {$ast = new IntType($I.getLine(), $I.getCharPositionInLine()+1);}
       | D = 'double'   {$ast = new DoubleType($D.getLine(), $D.getCharPositionInLine()+1);}
       | C = 'char'     {$ast = new CharType($C.getLine(), $C.getCharPositionInLine()+1);}
       ;

// returns void and receives no parameters.
main: 'void' 'main' '(' ')' '{' functionBody '}'
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