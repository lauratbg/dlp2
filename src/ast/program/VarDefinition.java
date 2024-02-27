package ast.program;

import ast.types.Type;

public class VarDefinition extends AbstractDefinition{
    public VarDefinition(int line, int column, Type type, String name) {
        super(line, column, type, name);
    }
}
