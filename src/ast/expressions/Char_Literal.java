package ast.expressions;

import semantic.Visitor;

public class Char_Literal extends AbstractExpression{
    public char value;
    public Char_Literal(int line, int column, char value) {
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
