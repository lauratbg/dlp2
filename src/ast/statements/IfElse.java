package ast.statements;

import ast.expressions.Expression;

import java.util.List;

public class IfElse extends AbstractStatement{
    private List<Statement> ifList;
    private List<Statement> elseList;

    private Expression expression;

    public IfElse(int line, int column, List<Statement> ifList, List<Statement> elseList, Expression expression) {
        super(line, column);
        this.ifList = ifList;
        this.elseList = elseList;
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "IfElse{" +
                "ifList=" + ifList +
                ", elseList=" + elseList +
                ", expression=" + expression +
                '}';
    }
}
