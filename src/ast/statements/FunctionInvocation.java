package ast.statements;

import ast.expressions.AbstractExpression;
import ast.expressions.Expression;
import ast.expressions.Variable;
import ast.types.Type;
import semantic.Visitor;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement{
    public Variable functionName;

    private List<Expression> params;

    private Type returnType; //xq me obliga a implementar el get y set

    public FunctionInvocation(int line, int column, Variable name, List<Expression> params) {
        super(line, column);
        this.functionName = name;
        this.params = params;

    }

    public Variable getFunctionName() {
        return functionName;
    }

    public void setFunctionName(Variable functionName) {
        this.functionName = functionName;
    }

    public List<Expression> getParams() {
        return params;
    }

    public void setParams(List<Expression> params) {
        this.params = params;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return functionName + "(" + params +")";
    }

    @Override
    public Type getReturnType() {
        return returnType;
    }

    @Override
    public void setReturnType(Type type) {
this.returnType = type;
    }
}
