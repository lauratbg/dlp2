package ast.expressions;


import ast.expressions.AbstractExpression;
import ast.expressions.Expression;
import ast.statements.AbstractStatement;
import ast.types.Type;
import semantic.Visitor;

public class Cast extends AbstractExpression {
    private Expression expression;
    private Type type;

    public Cast(int line, int column, Type type, Expression expression) {
        super(line, column);
        this.expression = expression;
        this.type = type;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "(" + lvalue + ")" + "(" + type+ ")" + " " + expression;
    }
}
