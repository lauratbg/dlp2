package ast.program;

import ast.statements.Statement;
import ast.types.FunctionType;
import ast.types.Type;

import java.util.List;

public class FuncDefinition extends AbstractDefinition {

    private FunctionType type;
    private List<Statement> functionBody;

    public FuncDefinition(int line, int column, FunctionType type, String name, List<Statement> functionBody) {
        super(line, column, name);
        this.functionBody = functionBody;
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " " + getName() + " {" + functionBody +"}";
    }
}
