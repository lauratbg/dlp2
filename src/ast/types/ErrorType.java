package ast.types;


public class ErrorType extends AbstractType{

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "[ERROR] line: " + getLine() + ", column: " + getColumn() + " -> " + message;
    }
}
