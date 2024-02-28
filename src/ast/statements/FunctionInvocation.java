package ast.statements;

import ast.expressions.AbstractExpression;
import ast.expressions.Expression;
import ast.expressions.Variable;
import ast.types.Type;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement{
    public String functionName;

    private List<Expression> params;

    public FunctionInvocation(int line, int column, String name, List<Expression> params) {
        super(line, column);
        this.functionName = name;
        this.params = params;
    }

    @Override
    public String toString() {
        return functionName + "(" + params +")";
    }
}
