package ast.expressions;

import semantic.Visitor;

public class Int_Literal extends AbstractExpression{
    private int value;

    public Int_Literal(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "(" + lvalue + ")" + value + "";
    }
}
