package ast.expressions;

public class Real_Literal extends AbstractExpression{

    private Double value;

    public Real_Literal(int line, int column, Double value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";

    }
}
