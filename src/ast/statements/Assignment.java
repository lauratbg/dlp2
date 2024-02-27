package ast.statements;

import ast.expressions.Expression;

public class Assignment extends AbstractStatement {
    private Expression expression1;
    private Expression expression2;

    public Assignment(int line, int column, Expression expression1, Expression expression2) {
        super(line, column);
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "expression1=" + expression1 +
                ", expression2=" + expression2 +
                '}';
    }
}
