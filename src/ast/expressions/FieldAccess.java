package ast.expressions;

public class FieldAccess extends AbstractExpression {
    private String field;
    private Expression expression;

    public FieldAccess(int line, int column, String field, Expression expression) {
        super(line, column);
        this.field = field;
        this.expression = expression;
    }

    @Override
    public String toString() {
        return field + ". " + expression ;
    }
}
