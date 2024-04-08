package ast.expressions;


import ast.types.Type;
import semantic.Visitor;

public class Cast extends AbstractExpression {
    private Expression expression;
    private Type castType;

    public Cast(int line, int column, Type castType, Expression expression) {
        super(line, column);
        this.expression = expression;
        this.castType = castType;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Type getCastType() {
        return castType;
    }

    public void setCastType(Type castType) {
        this.castType = castType;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "(" + getLvalue() + ")" + "(" + castType + ")" + " " + expression;
    }
}
