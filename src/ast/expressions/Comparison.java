package ast.expressions;

public class Comparison extends AbstractExpression {
    private Expression expression1;
    private Expression expression2;

    private String operand;

    public Comparison(int line, int column, String operand, Expression expression1, Expression expression2) {
        super(line, column);
        this.expression1 = expression1;
        this.expression2 = expression2;
        this.operand = operand;
    }

    @Override
    public String toString() {
        return "Comparison{" +
                "expression1=" + expression1 +
                ", expression2=" + expression2 +
                '}';
    }
}
