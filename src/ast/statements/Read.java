package ast.statements;

import ast.expressions.Expression;

import java.util.ArrayList;
import java.util.List;

public class Read extends AbstractStatement{
    private Expression expression;

    public Read(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "read " + expression ;
    }
}
