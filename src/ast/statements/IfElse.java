package ast.statements;

import ast.expressions.Expression;

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
        this.expression = expression;
    }

    @Override
    public String toString() {
        if(elseList==null)
            return "if (" +expression +")" + "{" +  ifList + "}";
        else
            return "if (" +expression +")" + "{" +  ifList + "}" + "else" + "{" + elseList + "}";
    }
}
