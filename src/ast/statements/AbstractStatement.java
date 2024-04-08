package ast.statements;

import ast.AbstractASTNode;
import ast.types.Type;

public abstract class AbstractStatement extends AbstractASTNode implements Statement {
    public AbstractStatement(int line, int column) {
        super(line, column);
    }

}
