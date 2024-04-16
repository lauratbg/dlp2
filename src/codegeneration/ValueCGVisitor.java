package codegeneration;

public class ValueCGVisitor {
    // Integer
    /*
        value[[IntLiteral: exp ⟶ IntType]]:
            <pushi > exp.value
     */

    // Character
    /*
        value[[CharLiteral: exp ⟶ CharType]]:
            <pushb > (Integer) exp.value
     */

    // Real
    /*
        value[[Real_Literal: exp ⟶ DoubleType]]:
            <pushf > exp.value
     */

    // Variable
    /*
        value[[Variable: exp ⟶ ID]] =
            address[[exp]]
            load suffix
     */

    // Arithmetic:
    /*
        value[[Arithmetic: expression1 ⟶ expression2 (+|-|*|/) expression3]] =
            value[[expression2]]
            expression2.type.convertTo(expression1) need conversion bc of characters
            value[[expression3]]
            expression3.type.convertTo(expression1)
            switch (expression1.operator) {
                case "+": <add> expression1.suffix
                    break;
                case "-": <sub> expression1.suffix
                    break;
                case "*": <mul> expression1.suffix
                    break;
                case "/": <div> expression1.suffix
                    break;
                default: assert false;
            }
     */

    // Comparison
    /*
        value[[Comparison: expression1 ⟶ expression2 ( > | < | >= | <= | == | != ) expression3]] =
            Type highestType = expression2.type.highestType(expression3.type)
            value[[expression2]]
            expression2.type.convertTo(highestType)
            value[[expression3]]
            expression3.type.convertTo(highestType)
            switch (expression1.operator) {
                case ">": <gt> expression2.suffix
                    break;
                case "<": <lt> expression2.suffix
                    break;
                case ">=": <ge> expression2.suffix
                    break;
                case "<=": <le> expression2.suffix
                    break;
                case "==": <eq> expression2.suffix
                    break;
                case "!=": <ne> expression2.suffix
                    break;
            }
     */

    // Logical
    /*
        value[[Logical: expression1 ⟶ expression2 (&& | ||) expression3]] =
            value[[expression2]]
            value[[expression3]]
            switch (expression1.operator){
                case "&&": <and>
                    break;
                case "||": <or>
                    break;
                default: assert false;
            }
     */

    // Cast
    /*
        value[[Cast: exp1 ⟶ type exp2]]
            value[[exp2]]
            exp2.type.convertTo(exp1.type)
     */
}
