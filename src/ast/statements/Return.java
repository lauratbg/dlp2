package ast.statements;

import ast.expressions.Expression;

import java.util.ArrayList;
import java.util.List;

public class Return extends AbstractStatement{
    private Expression expression;

    public Return(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "return " + expression;
    }
}
