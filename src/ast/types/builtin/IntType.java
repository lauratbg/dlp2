package ast.types.builtin;

import ast.types.AbstractType;
import ast.types.ErrorType;
import ast.types.Type;
import semantic.Visitor;

public class IntType extends AbstractType {

    public IntType(int line, int column) {
        super(line, column);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "Int";
    }


}
