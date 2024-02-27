package ast.types.builtin;

import ast.types.AbstractType;

public class DoubleType extends AbstractType {

    public DoubleType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "Double{}";
    }
}
