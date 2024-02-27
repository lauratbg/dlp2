package ast.expressions;

import java.util.ArrayList;
import java.util.List;

public class FunctionInvocation extends AbstractExpression{
    private List<Expression> expressionList;
    private Variable variable;

    public FunctionInvocation(int line, int column, List<Expression> expressionList, Variable variable) {
        super(line, column);
        this.expressionList = new ArrayList<>(expressionList);
        this.variable = variable;
    }

    @Override
    public String toString() {
        return "FunctionInvocation{" +
                "expressionList=" + expressionList +
                ", variable=" + variable +
                '}';
    }
}
