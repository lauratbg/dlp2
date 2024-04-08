package ast.statements;

import ast.expressions.Expression;
import semantic.Visitor;

import java.util.ArrayList;
import java.util.List;

public class IfElse extends AbstractStatement{
    private List<Statement> ifList;
    private List<Statement> elseList;

    private Expression expression;

    public IfElse(int line, int column, List<Statement> ifList, List<Statement> elseList, Expression expression) {
        super(line, column);
        this.ifList = new ArrayList<>(ifList);
        this.elseList = new ArrayList<>(elseList);
        this.expression = expression;

    }

    public IfElse(int line, int column, List<Statement> ifList, Expression expression) {
        super(line, column);
        this.ifList = new ArrayList<>(ifList);
        this.elseList = new ArrayList<>();

        this.expression = expression;

    }

    public List<Statement> getIfList() {
        return ifList;
    }

    public void setIfList(List<Statement> ifList) {
        this.ifList = ifList;
    }

    public List<Statement> getElseList() {
        return elseList;
    }

    public void setElseList(List<Statement> elseList) {
        this.elseList = elseList;
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
        if(elseList==null)
            return "if (" +expression +")" + "{" +  ifList + "}";
        else
            return "if (" +expression +")" + "{" +  ifList + "}" + "else" + "{" + elseList + "}";
    }
}
