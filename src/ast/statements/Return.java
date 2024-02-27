package ast.statements;

import ast.expressions.Expression;

import java.util.ArrayList;
import java.util.List;

public class Return extends AbstractStatement{
    private List<Statement> statementList;
    private Expression expression;

    public Return(int line, int column, List<Statement> statementList, Expression expression) {
        super(line, column);
        this.statementList = new ArrayList<>(statementList);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Return{" +
                "statementList=" + statementList +
                ", expression=" + expression +
                '}';
    }
}
