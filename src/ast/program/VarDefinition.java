package ast.program;

import ast.statements.Statement;
import ast.types.Type;

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
    public String toString() {
        return type + " " + getName();
    }
}
