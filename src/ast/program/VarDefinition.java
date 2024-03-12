package ast.program;

import ast.statements.Statement;
import ast.types.Type;
import semantic.Visitor;

public class VarDefinition extends AbstractDefinition implements Statement {

    private Type type;
    public VarDefinition(int line, int column, Type type, String name) {
        super(line, column, name);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return type + " " + getName();
    }
}
