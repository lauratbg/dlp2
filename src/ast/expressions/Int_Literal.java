package ast.expressions;

public class Int_Literal extends AbstractExpression{
    private int value;

    public Int_Literal(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public String toString() {
        return "Int_Literal{" +
                "value=" + value +
                '}';
    }
}
