package codegeneration;

import ast.expressions.*;
import ast.statements.FunctionInvocation;
import ast.types.BoolType;
import ast.types.ErrorType;
import ast.types.Type;
import semantic.AbstractVisitor;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {

    private AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator cg, AddressCGVisitor addressCGVisitor) {
        super(cg);
        this.addressCGVisitor = addressCGVisitor;
    }



    // Integer
    /*
        value[[IntLiteral: exp ⟶ IntType]]:
            <pushi > exp.value
     */
    @Override
    public Void visit(Int_Literal intLiteral, Void param){
        cg.push(intLiteral.getValue());
        return null;
    }

    // Character
    /*
        value[[CharLiteral: exp ⟶ CharType]]:
            <pushb > (Integer) exp.value
     */

    @Override
    public Void visit(Char_Literal charLiteral, Void param){
        cg.pushb(charLiteral.getValue());
        return null;
    }

    // Real
    /*
        value[[Real_Literal: exp ⟶ DoubleType]]:
            <pushf > exp.value
     */
    @Override
    public Void visit(Real_Literal realLiteral, Void param){
        cg.pushf(realLiteral.getValue());
        return null;
    }

    // Variable
    /*
        value[[Variable: exp ⟶ ID]] =
            address[[exp]]
            load suffix
     */
    @Override
    public Void visit(Variable variable, Void param){
        variable.accept(addressCGVisitor, null);
        cg.load(variable.getDefinition().getType());
        return null;
    }

    // Arithmetic:
    /*
        value[[Arithmetic: expression1 ⟶ expression2 (+|-|*|/) expression3]] =
            value[[expression2]]
            expression2.type.convertTo(expression1) need conversion bc of characters
            value[[expression3]]
            expression3.type.convertTo(expression1)
            switch (expression1.operator) {
                case "+": <add> expression1.suffix
                    break;
                case "-": <sub> expression1.suffix
                    break;
                case "*": <mul> expression1.suffix
                    break;
                case "/": <div> expression1.suffix
                    break;
                default: assert false;
            }
     */
    @Override
    public Void visit(Arithmetic arithmetic, Void param){
        arithmetic.getExpression1().accept(this, null);
        arithmetic.getExpression1().getType().convertTo(cg, arithmetic.getType());
        arithmetic.getExpression2().accept(this, null);
        arithmetic.getExpression2().getType().convertTo(cg, arithmetic.getType());

        switch (arithmetic.getOperator()){
            case "+":
                cg.add(arithmetic.getType()); break;
            case "-":
                cg.sub(arithmetic.getType()); break;
            case "*":
                cg.mul(arithmetic.getType()); break;
            case "/":
                cg.div(arithmetic.getType()); break;
        }

        return null;
    }

    // Comparison
    /*
        value[[Comparison: expression1 ⟶ expression2 ( > | < | >= | <= | == | != ) expression3]] =
            Type highestType = expression2.type.highestType(expression3.type)
            value[[expression2]]
            expression2.type.convertTo(highestType)
            value[[expression3]]
            expression3.type.convertTo(highestType)
            switch (operator) {
                case ">": <gt> highestType.suffix
                    break;
                case "<": <lt> highestType.suffix
                    break;
                case ">=": <ge> highestType.suffix
                    break;
                case "<=": <le> highestType.suffix
                    break;
                case "==": <eq> highestType.suffix
                    break;
                case "!=": <ne> highestType.suffix
                    break;
            }
     */
    @Override
    public Void visit(Comparison comparison, Void param) {
        Type highestType = comparison.getExpression1().getType().highestType(comparison.getExpression2().getType());
        comparison.getExpression1().accept(this, null);
        comparison.getExpression1().getType().convertTo(cg, highestType);
        comparison.getExpression2().accept(this, null);
        comparison.getExpression2().getType().convertTo(cg, highestType);


        switch (comparison.getOperator()) {
            case ">": cg.gt(highestType.suffix());
                break;
            case "<": cg.lt(highestType.suffix());
                break;
            case ">=": cg.ge(highestType.suffix());
                break;
            case "<=": cg.le(highestType.suffix());
                break;
            case "==": cg.eq(highestType.suffix());
                break;
            case "!=": cg.ne(highestType.suffix());
                break;

        }

        // it should print true or false
        System.out.println(((BoolType)(comparison.getType())).getValue());


        return null;
    }


    // Logical
    /*
        value[[Logical: expression1 ⟶ expression2 (&& | ||) expression3]] =
            value[[expression2]]
            value[[expression3]]
            switch (expression1.operator){
                case "&&": <and>
                    break;
                case "||": <or>
                    break;
                default: assert false;
            }
     */
    @Override
    public Void visit(Logical logical, Void param){
        logical.getExpression1().accept(this, null);
        logical.getExpression2().accept(this, null);
        switch(logical.getOperator()){
            case "&&":
                cg.and(); break;
            case "||":
                cg.or(); break;
        }

        // it should print true or false
        System.out.println(((BoolType)(logical.getType())).getValue());

        return null;
    }

    // Cast
    /*
        value[[Cast: exp1 ⟶ type exp2]]
            value[[exp2]]
            exp2.type.convertTo(exp1.type)
     */
    @Override
    public Void visit(Cast cast, Void param){
        cast.getExpression().accept(this, null);
        cast.getExpression().getType().convertTo(cg, cast.getCastType());

        return null;
    }

    /* UnaryNot
   value[[UnaryNot: exp1 ⟶ exp2]] =
       value[[exp1]]
       <not>
    */
    @Override
    public Void visit(UnaryNot unaryNot, Void param) {
        unaryNot.getExpression().accept(this, param);
        cg.not();
        return null;
    }

    /* Modulus
    value[[Modulus: exp1 ⟶ exp2 % exp3]] =
        value[[exp2]]
        value[[exp3]]
        <mod > exp1.type.suffix
     */
    @Override
    public Void visit(Modulus mod, Void param){
        mod.getExpression1().accept(this, null);
        mod.getExpression2().accept(this, null);
        cg.mod(mod.getType());

        return null;
    }

    // Indexing
    /*
        value[[Indexing: exp1 ⟶ exp2 exp3]] =
            address[[exp1]]
            <load > exp1.type.suffix()
     */
    @Override
    public Void visit(Indexing indexing, Void param){
        indexing.accept(addressCGVisitor, param);
        cg.load(indexing.getType());
        return null;
    }

    // FieldAccess
    /*
        value[[FieldAccess: exp1 ⟶ exp2 ID]] =
            address[[exp1]];
            <load > exp1.type.suffix()
     */
    @Override
    public Void visit(FieldAccess fieldAccess, Void param){
        fieldAccess.accept(addressCGVisitor, param); //must traverse the parent
        cg.load(fieldAccess.getType());
        return null;
    }

    //Funct Invocation as expression
    /*
        value[[FunctionInvocation: expression1 -> expression2 expression3*]] =
            expression3.forEach(param -> value[[param]])
            <call > expression2.name
     */
    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        for(int i = 0; i < functionInvocation.getParams().size(); i++)
            functionInvocation.getParams().get(i).accept(this, null);
        cg.call(functionInvocation.getFunctionName().getName());
        return null;
    }

}
