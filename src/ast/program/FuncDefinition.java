package ast.program;

import ast.statements.Statement;
import ast.types.FunctionType;
import ast.types.Type;
import semantic.Visitor;

import java.util.List;

public class FuncDefinition extends AbstractDefinition {

    private FunctionType type;
    private List<Statement> functionBody;

    public FuncDefinition(int line, int column, FunctionType type, String name, List<Statement> functionBody) {
        super(line, column, name);
        this.functionBody = functionBody;
        this.type = type;
    }

    public FunctionType getType() {
        return type;
    }

    public void setType(FunctionType type) {
        this.type = type;
    }

    public List<Statement> getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(List<Statement> functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return type + " " + getName() + " {" + functionBody +"}";
    }
}
