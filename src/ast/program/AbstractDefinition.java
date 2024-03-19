package ast.program;

import ast.AbstractASTNode;
import ast.types.Type;


public abstract class AbstractDefinition extends AbstractASTNode implements Definition{

    private String name;
    private int scope;

    public AbstractDefinition(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }
}
