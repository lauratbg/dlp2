package ast.expressions;


import ast.expressions.AbstractExpression;
import ast.expressions.Expression;
import ast.statements.AbstractStatement;
import ast.types.Type;

public class Cast extends AbstractExpression {
    private Expression expression;
    private Type type;

    public Cast(int line, int column, Type type, Expression expression) {
        super(line, column);
        this.expression = expression;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cast{}";
    }
}
