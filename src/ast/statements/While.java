package ast.statements;

import ast.expressions.Expression;

import java.util.ArrayList;
import java.util.List;

public class While extends AbstractStatement{
    private List<Statement> statementList;
    private Expression expression;

    public While(int line, int column, List<Statement> statementList, Expression expression) {
        super(line, column);
        this.statementList = new ArrayList<>(statementList);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "While{" +
                "statementList=" + statementList +
                ", expression=" + expression +
                '}';
    }
}
