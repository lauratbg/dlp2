package ast.expressions;

import semantic.Visitor;

public class Arithmetic extends AbstractExpression{
    private String operator;
    private Expression expression1;
    private Expression expression2;


    public Arithmetic(int line, int column, String operator, Expression expression1, Expression expression2) {
        super(line, column);
        this.operator = operator;
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    // Although * / and % are all arithmetic expressions, they can not be separated in different productions
    // bc they have the same precedence
    public static Expression createArithmetic(int line, int column, String operator, Expression expression1, Expression expression2){
        if(operator.equals("%")){
            return new Modulus(line, column, expression1, expression2);
        }
        return new Arithmetic(line, column, operator, expression1, expression2);
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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
    public String toString() {
        return "(" + getLvalue() + ")" + expression1 + " " + operator + " " + expression2;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
