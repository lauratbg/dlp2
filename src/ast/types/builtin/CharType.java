package ast.types.builtin;

import ast.types.AbstractType;

public class CharType extends AbstractType {

    public CharType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "Char{}";
    }
}
