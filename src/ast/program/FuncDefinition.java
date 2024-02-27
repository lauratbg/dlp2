package ast.program;

import ast.types.Type;

public class FuncDefinition extends AbstractDefinition {

    public FuncDefinition(int line, int column, Type type, String name) {
        super(line, column, type, name);
    }
}
