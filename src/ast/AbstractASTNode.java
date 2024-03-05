package ast;

import errorhandler.ErrorHandler;

public abstract class AbstractASTNode implements ASTNode{
    private int line;
    private int column;

    public AbstractASTNode(int line, int columm) {
        this.line = line;
        this.column = column;

    }

    @Override
    public int getLine(){
        return line;
    }
    public int getColumn(){
        return column;
    }
}