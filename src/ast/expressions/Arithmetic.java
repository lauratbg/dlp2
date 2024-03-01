package ast.expressions;

public class Arithmetic extends AbstractExpression{
    private String operator;
    private Expression expression1;
    private Expression expression2;

    public Arithmetic(int line, int column, String operator, Expression expression1, Expression expression2) {
        super(line, column);
        this.operator = operator;
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    // Although * / and % are all arithmetic expressions, they can not be separated in different productions
    // bc they have the same precedence
    public static Expression createArithmetic(int line, int column, String operator, Expression e1, Expression e2){
        if(operator.equals("%")){
            return new Modulus(line, column, e1, e2);
        }
        return new Arithmetic(line, column, operator, e1, e2);
    }

    @Override
    public String toString() {
        return expression1 + " " + operator + " " + expression2;
    }
}
