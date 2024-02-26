grammar Cmm;

//A program is a sequence of variable and function definitions.
program: (varDefinition | functionDefinition)* main;

expression: '(' expression ')'
            | expression '[' expression ']' //RECURSION ->
            //v[1][2]
            //v[1] = exp 1, [2] = exp 2
            //v = exp 1.1, [1] = exp 1.2
            | expression '.' ID //v[2].execute()     a.do()
            | '(' builtin ')' expression
            | '-' expression
            | '!' expression
            | expression ('*' | '/' | '%') expression
            | expression ('+' | '-') expression
            | expression ('>' | '>=' | '<' | '<=' | '!=' | '==') expression
            | expression ('&&' | '||') expression
            | functionInvocation
            | ID
            | INT_CONSTANT
            | REAL_CONSTANT
            | CHAR_CONSTANT
            ;


statement: expression '=' expression ';'
            | 'write' ((expression ',')* expression)+ ';'
            | 'read' ((expression ',')* expression)+ ';'
            | 'while' '(' expression ')' block
            | 'if' '(' expression ')' block
            | 'if' '(' expression ')' block 'else' block
            | functionInvocation ';'
            | 'return' expression? ';'
            | varDefinition
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
builtin: 'int'
       | 'double'
       | 'char'
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