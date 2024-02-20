grammar Cmm;	

expression: '(' expression ')'
            | expression '[' expression ']' //RECURSION ->
            //v[1][2]
            //v[1] = exp 1, [2] = exp 2
            //v = exp 1.1, [1] = exp 1.2
            | expression '.' ID //v[2].execute()     a.do()
//            | '(' type ')' expression
            | '-' expression
            | '!' expression
            | expression ('*' | '/' | '%') expression
            | expression ('+' | '-') expression
            | expression ('>' | '>=' | '<' | '<=' | '!=' | '==') expression
            | expression ('&&' | '||') expression
            | ID '(' ((expression ',')* expression)? ')'
            | ID
            | INT_CONSTANT
            | REAL_CONSTANT
            | CHAR_CONSTANT
            ;

statement: expression '=' expression
            | 'write' ((expression ',')* expression)+ ';'
            | 'read' ((expression ',')* expression)+ ';'
            | 'while' '(' expression ')' block
            | 'if' '(' expression ')' block
            | 'if' '(' expression ')' block 'else' block
            | ID '(' ((expression ',')* expression)? ')' ';'
            ;
type: ;


block: '{' statement '}'
      | statement
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