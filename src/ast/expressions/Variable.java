package ast.expressions;

import semantic.Visitor;

public class Variable extends AbstractExpression{
    private String name;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;

    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return  "(" + lvalue + ")" + name + "";

    }
}
