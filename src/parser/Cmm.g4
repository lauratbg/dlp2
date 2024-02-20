grammar Cmm;	

program: ID
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

  //  REAL_CONSTANT: (REAL | INT_CONSTANT) ([Ee] [+-]? INT_CONSTANT)?
  //                 NO BC IT WILL RECOGNIZE INT_CONSTANT
  //                 ;

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