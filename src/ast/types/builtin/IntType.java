package ast.types.builtin;

import ast.types.AbstractType;

public class IntType extends AbstractType {

    public IntType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "Int";
    }
}
