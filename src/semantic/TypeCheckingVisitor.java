package semantic;

import ast.expressions.*;
import ast.program.FuncDefinition;
import ast.statements.*;
import ast.types.*;
import ast.types.builtin.CharType;
import ast.types.builtin.DoubleType;
import ast.types.builtin.IntType;

import java.util.stream.Collectors;


public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {

    /*
        ****** EXPRESSIONS ******

        P: FunctionInvocation: exp1 -> exp2 exp*
        R: exp1.type -> exp2.type.parenthesis(exp*.stream().map(exp -> exp.type).toArray())

        P: FunctionInvocation: stmt -> exp exp*
        R: exp.type.parenthesis(exp*.stream().map(exp -> exp.type).toArray())


     */

    @Override
    public Void visit(Arithmetic arith, Void param) {
        arith.getExpression1().accept(this, param);
        arith.getExpression2().accept(this, param);
        arith.setLvalue(false);
        arith.setType(arith.getExpression1().getType().arithmetic(arith.getExpression2().getType()));
        return null;
    }

    // lvalue false bc the return is something temporary
    /*
        P: Cast: exp1 -> type exp2
        R: exp1.type = exp2.type.castTo(type)
     */
    @Override
    public Void visit(Cast cast, Void param) {
        cast.getExpression().accept(this, param);
        cast.getCastType().accept(this, param);
        cast.setLvalue(false);
        cast.setType(cast.getExpression().getType().castTo(cast.getCastType()));
        return null;
    }

    /*
        P: Char_Literal: exp -> CHAR
        R: exp.type = new CharType()
     */
    @Override
    public Void visit(Char_Literal charLiteral, Void param) {
        charLiteral.setLvalue(false);
        charLiteral.setType(new CharType(charLiteral.getLine(), charLiteral.getColumn()));
        return null;
    }

    /*
        P: Comparison: exp1 -> exp2 exp3
        R: exp1.type = exp2.type.comparison(exp3.type)
     */
    @Override
    public Void visit(Comparison comparison, Void param) {
        comparison.getExpression1().accept(this, param);
        comparison.getExpression2().accept(this, param);
        comparison.setLvalue(false);
        comparison.setType(comparison.getExpression1().getType().comparison(comparison.getExpression2().getType()));
        return null;
    }

    /*
        P: FieldAccess: exp1 -> exp2 ID
        R: exp1.type = exp2.type.dot(ID)
     */
    @Override
    public Void visit(FieldAccess fieldAccess, Void param) {
        fieldAccess.getExpression().accept(this, param);
        fieldAccess.setLvalue(true);
        fieldAccess.setType(fieldAccess.getExpression().getType().dot(fieldAccess.getLine(), fieldAccess.getColumn(), fieldAccess.getField()));
        return null;
    }

    /*
        P: Indexing: expression1 -> expression2 expression3
        R: exp1.type = exp2.type.squareBrackets(exp3.type)
     */
    @Override
    public Void visit(Indexing indexing, Void param) {
        indexing.getExpression1().accept(this, param);
        indexing.getExpression2().accept(this, param);
        indexing.setLvalue(true);
        indexing.setType(indexing.getExpression1().getType().squareBrackets(indexing.getExpression2().getType()));
        return null;
    }

    /*
        P: Int_Literal: exp -> INT
        R: exp.type = new IntegerType()
     */
    @Override
    public Void visit(Int_Literal intLiteral, Void param) {
        intLiteral.setLvalue(false);
        intLiteral.setType(new IntType(intLiteral.getLine(), intLiteral.getColumn()));
        return null;
    }

    /*
        P: Logical: exp1 -> exp2 exp3
        R: exp1.type = exp2.type.logical(exp3.type)
     */
    @Override
    public Void visit(Logical logical, Void param) {
        logical.getExpression1().accept(this, null);
        logical.getExpression2().accept(this, null);
        logical.setLvalue(false);
        logical.setType(logical.getExpression1().getType().logical(logical.getExpression2().getType()));
        return null;
    }

    /*
        P: Modulus: exp1 -> exp2 exp3
        R: exp1.type = exp2.type.modulus(exp3.type)
     */
    @Override
    public Void visit(Modulus modulus, Void param) {
        modulus.getExpression1().accept(this, null);
        modulus.getExpression2().accept(this, null);
        modulus.setLvalue(false);
        modulus.setType(modulus.getExpression1().getType().modulus(modulus.getExpression2().getType()));
        return null;
    }

    /*
        P: Real_Literal: exp -> REAL
        R: exp.type = new RealType()
     */
    @Override
    public Void visit(Real_Literal realLiteral, Void param) {
        realLiteral.setLvalue(false);
        realLiteral.setType(new DoubleType(realLiteral.getLine(), realLiteral.getColumn()));
        return null;
    }

    /*
        P: UnaryMinus: exp1 -> exp2
        R: exp1.type = exp2.type.minus()
     */
    @Override
    public Void visit(UnaryMinus unaryMinus, Void param) {
        unaryMinus.getExpression().accept(this, param);

        unaryMinus.setLvalue(false);
        unaryMinus.setType(unaryMinus.getType().minus(unaryMinus.getLine(), unaryMinus.getColumn()));
        return null;
    }

    /*
        P: UnaryNot: exp1 -> exp2
        R: exp1.type = exp2.type.logical()
     */
    @Override
    public Void visit(UnaryNot unaryNot, Void param) {
        unaryNot.getExpression().accept(this, param);

        unaryNot.setLvalue(false);
        unaryNot.setType(unaryNot.getExpression().getType().logical(unaryNot.getLine(), unaryNot.getColumn()));
        return null;
    }


    /*
        P: Variable: exp -> ID
        R: exp.type = exp.def.type
     */
    @Override
    public Void visit(Variable variable, Void param) {
        variable.setLvalue(true);
        if (variable.getDefinition() == null)
            variable.setType(new ErrorType(variable.getLine(), variable.getColumn(),
                    String.format("Variable '" + variable.getName() + "' is NOT defined")));
        else
            variable.setType(variable.getDefinition().getType());
        return null;
    }

    //  Statements
    /*
        P: FunctionInvocation: exp1 -> exp2 exp*
        R: exp1.type -> exp2.type.parenthesis(exp*.stream().map(exp -> exp.type).toArray())

        P: FunctionInvocation: stmt -> exp exp*
        R: exp.type.parenthesis(exp*.stream().map(exp -> exp.type).toArray)
     */
    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        functionInvocation.getFunctionName().accept(this, param);
        for (int i = 0; i < functionInvocation.getParams().size(); i++)
            functionInvocation.getParams().get(i).accept(this, param);
        functionInvocation.setLvalue(false);
        functionInvocation.setType(functionInvocation.getType().parenthesis(functionInvocation.getLine(), functionInvocation.getColumn(), functionInvocation.getParams().stream().map(Expression::getType).collect(Collectors.toList())));
        return null;
    }

    /*
        P: Assignment: stmt -> exp1 exp2
        R: exp2.type.assignTo(exp1.type)
     */
    @Override
    public Void visit(Assignment assignment, Void param) {
        super.visit(assignment, null);
        if (!assignment.getExpression1().getLvalue())
            new ErrorType(assignment.getExpression1().getLine(), assignment.getExpression1().getColumn(),
                    "The lvalue in the assignment must be true");
        assignment.getExpression1().getType().assignTo(assignment.getExpression2().getType());
        return null;
    }

    /*
        P: Read: stmt -> exp
        R: exp.type.mustBeReadable()
     */
    @Override
    public Void visit(Read read, Void param) {
        read.getExpression().accept(this, null);
            new ErrorType(read.getExpression().getLine(), read.getExpression().getColumn(),
                    "The lvalue expression of the read must be true");
        read.getExpression().getType().mustBeReadable(read.getLine(), read.getColumn());
        return null;
    }

    /*
        P: Write: stmt -> exp
        R: exp.type.mustBeWritable()
     */
    @Override
    public Void visit(Write write, Void param) {
        write.getExpression().accept(this, null);

        write.getExpression().getType().mustBeWritable(write.getLine(), write.getColumn());
        return null;
    }

    /*
        P: WhileStmt: stmt1 -> expression stmt2*
        R: exp.type.mustBeBoolean()
     */
    @Override
    public Void visit(While wh, Void param) {
        wh.getExpression().accept(this, param);
        for(int i = 0; i < wh.getStatementList().size(); i++)
            wh.getStatementList().get(i).accept(this, param);
        wh.getExpression().getType().mustBeBoolean(wh.getLine(), wh.getColumn());
        //TODO:
        return null;
    }

    /*
        P: IfElse: stmt1 -> expression stmt2*
        R: exp.type.mustBeBoolean()
     */
    @Override
    public Void visit(IfElse ifElse, Void param) {
        ifElse.getExpression().accept(this, param);

        for(int i = 0; i < ifElse.getIfList().size(); i++)
            ifElse.getIfList().get(i).accept(this, param);

        if(ifElse.getElseList() != null || !ifElse.getElseList().isEmpty() )
            for(int i = 0; i < ifElse.getElseList().size(); i++)
                ifElse.getElseList().get(i).accept(this, param);

        ifElse.getExpression().getType().mustBeBoolean(ifElse.getLine(), ifElse.getColumn());

        //TODO: return type
        return null;
    }

    /*
        P: Ret: stmt -> exp
        R: exp.type.returnAs(stmt.returnType)
        stmt.type will be the return type of the function, get from functionType
     */
    @Override
    public Void visit(Return ret, Void param) {
        ret.getExpression().accept(this, param);
        ret.getExpression().getType().returnAs(ret.getLine(), ret.getColumn(), ret.getExpression().getType());
        return null;
    }

    /*
        P: FunctionDefinition: def -> type ID varDef* stmt
        R: stmt*.returnType = type.returnType
     */
    @Override
    public Void visit(FuncDefinition funcDefinition, Void param) {
//        funcDefinition.getFunctionBody().forEach(st -> st.setReturnType(((FunctionType)funcDefinition.getType()).getReturnType()));//TODO

        funcDefinition.getType().accept(this, param);
        funcDefinition.getFunctionBody().forEach(b -> b.accept(this, param));
return null;
    }

}
