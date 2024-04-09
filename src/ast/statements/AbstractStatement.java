package ast.statements;

import ast.AbstractASTNode;
import ast.types.Type;

public abstract class AbstractStatement extends AbstractASTNode implements Statement {

    private Type returnType;
    public AbstractStatement(int line, int column) {
        super(line, column);
    }
    @Override
    public Type getReturnType(){
        return returnType;
    }

    @Override
    public void setReturnType(Type type){
        this.returnType = type;
    }
}
