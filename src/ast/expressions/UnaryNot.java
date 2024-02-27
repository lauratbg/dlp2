package ast.expressions;

public class UnaryNot extends  AbstractExpression{
    private Expression expression;

    public UnaryNot(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "UnaryNot{" +
                "expression=" + expression +
                '}';
    }
}
