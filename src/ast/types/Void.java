package ast.types;

public class Void extends AbstractType{

    public Void(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "Void{}";
    }
}
