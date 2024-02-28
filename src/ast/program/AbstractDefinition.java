package ast.program;

import ast.AbstractASTNode;
import ast.types.Type;


public abstract class AbstractDefinition extends AbstractASTNode implements Definition{

    private String name;

    public AbstractDefinition(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }


}
