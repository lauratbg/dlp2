package ast.expressions;

import semantic.Visitor;

public class Real_Literal extends AbstractExpression{

    private double value;

    public Real_Literal(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "(" + getLvalue() + ")" + value + "";

    }

    public double getValue() {
        return value;
    }
}
