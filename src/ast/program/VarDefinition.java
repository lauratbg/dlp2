package ast.program;

import ast.statements.Statement;
import ast.types.Type;
import semantic.Visitor;

public class VarDefinition extends AbstractDefinition implements Statement {

    private Type type;
    private int offset;
    public VarDefinition(int line, int column, Type type, String name) {
        super(line, column, name);
        this.type = type;
        offset = 0;
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

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public Type getReturnType() {
        return type;
    }

    @Override
    public void setReturnType(Type type) {
        this.type  =type;
    }
}
