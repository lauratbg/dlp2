package ast.statements;

import ast.expressions.Expression;

import java.util.ArrayList;
import java.util.List;

public class Write extends AbstractStatement{

    private Expression expression;

    public Write(int line, int column,  Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Write{" +
                ", expression=" + expression +
                '}';
    }
}
