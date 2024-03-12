package ast.statements;

import ast.expressions.Expression;
import semantic.Visitor;

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

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "while (" + expression + ")" + "{" + statementList + "}";
    }
}
