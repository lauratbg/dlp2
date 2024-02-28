package ast.expressions;

public class Char_Literal extends AbstractExpression{
    public char value;
    public Char_Literal(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
