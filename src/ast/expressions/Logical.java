package ast.expressions;

public class Logical extends AbstractExpression{

    private Expression expression1;
    private Expression expression2;
    private String operator;
    public Logical(int line, int column, String operator, Expression expression1, Expression expression2) {
        super(line, column);
        this.expression1 = expression1;
        this.expression2 = expression2;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return expression1 + " " + operator + " " + expression2;
    }
}
