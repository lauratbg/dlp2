package ast.expressions;

public class Modulus extends  AbstractExpression{

    private Expression expression1;
    private Expression expression2;

    public Modulus(int line, int column, Expression expression1, Expression expression2) {
        super(line, column);
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public String toString() {
        return "Modulus{" +
                "expression1=" + expression1 +
                ", expression2=" + expression2 +
                '}';
    }
}