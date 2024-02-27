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

    @Override
    public String toString() {
        return "Arithmetic{" +
                "operator='" + operator + '\'' +
                ", expression1=" + expression1 +
                ", expression2=" + expression2 +
                '}';
    }
}
