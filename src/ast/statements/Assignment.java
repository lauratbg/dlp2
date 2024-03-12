package ast.statements;

import ast.expressions.Expression;
import ast.types.ErrorType;
import ast.types.RecordField;
import semantic.Visitor;

import java.util.List;

public class Assignment extends AbstractStatement {
    private Expression expression1;
    private Expression expression2;

    public Assignment(int line, int column, Expression expression1, Expression expression2) {
        super(line, column);
        this.expression1 = expression1;
        this.expression2 = expression2;

    }

    public Expression getExpression1() {
        return expression1;
    }

    public void setExpression1(Expression expression1) {
        this.expression1 = expression1;
    }

    public Expression getExpression2() {
        return expression2;
    }

    public void setExpression2(Expression expression2) {
        this.expression2 = expression2;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return expression1 + "=" + expression2 ;
    }
}
