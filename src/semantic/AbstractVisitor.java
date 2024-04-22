package semantic;

import ast.expressions.*;
import ast.program.FuncDefinition;
import ast.program.Program;
import ast.program.VarDefinition;
import ast.statements.*;
import ast.types.*;
import ast.types.Record;
import ast.types.builtin.CharType;
import ast.types.builtin.DoubleType;
import ast.types.builtin.IntType;

public abstract class AbstractVisitor<TP, TR> implements Visitor<TP, TR>{
    @Override
    public TR visit(Arithmetic arith, TP param) {
        arith.getExpression1().accept(this, param);
        arith.getExpression2().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Cast cast, TP param) {
        cast.getExpression().accept(this, param);
        cast.getCastType().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Char_Literal charLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(Comparison comparison, TP param) {
        comparison.getExpression1().accept(this, param);
        comparison.getExpression2().accept(this, param);
        return null;
    }

    @Override
    public TR visit(FieldAccess fieldAccess, TP param) {
        fieldAccess.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Indexing indexing, TP param) {
        indexing.getExpression1().accept(this, param);
        indexing.getExpression2().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Int_Literal intLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(Logical logical, TP param) {
        logical.getExpression1().accept(this, null);
        logical.getExpression2().accept(this, null);
        return null;
    }

    @Override
    public TR visit(Modulus modulus, TP param) {
        modulus.getExpression1().accept(this, null);
        modulus.getExpression2().accept(this, null);
        return null;
    }

    @Override
    public TR visit(Real_Literal realLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(UnaryMinus unaryMinus, TP param) {
        unaryMinus.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(UnaryNot unaryNot, TP param) {
        unaryNot.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Variable variable, TP param) {
        return null;
    }

    @Override
    public TR visit(FuncDefinition funcDefinition, TP param) {
        for(int i = 0; i < funcDefinition.getFunctionBody().size(); i++)
            funcDefinition.getFunctionBody().get(i).accept(this, param);
        funcDefinition.getType().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Program program, TP param) {
        for(int i = 0; i < program.getDefinitionList().size(); i++)
            program.getDefinitionList().get(i).accept(this, param);
        return null;
    }

    @Override
    public TR visit(VarDefinition varDefinition, TP param) {
        varDefinition.getType().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Assignment assignment, TP param) {
        assignment.getExpression1().accept(this, param);
        assignment.getExpression2().accept(this, param);
//        if(!assignment.getExpression1().getLvalue())
//            new ErrorType(assignment.getExpression1().getLine(), assignment.getExpression1().getColumn(),
//                    "The left-hand side lvalue expression must be true");
        return null;
    }

    @Override
    public TR visit(FunctionInvocation functionInvocation, TP param) {
        functionInvocation.getFunctionName().accept(this, param);
        for(int i = 0; i < functionInvocation.getParams().size(); i++)
            functionInvocation.getParams().get(i).accept(this, param);
        functionInvocation.setLvalue(false);
        return null;
    }

    @Override
    public TR visit(IfElse ifElse, TP param) {
        ifElse.getExpression().accept(this, param);

        for(int i = 0; i < ifElse.getIfList().size(); i++)
            ifElse.getIfList().get(i).accept(this, param);
        if(ifElse.getElseList() != null || !ifElse.getElseList().isEmpty() )
            for(int i = 0; i < ifElse.getElseList().size(); i++)
                ifElse.getElseList().get(i).accept(this, param);
        return null;
    }

    @Override
    public TR visit(Read read, TP param) {
        read.getExpression().accept(this, param);

        return null;
    }

    @Override
    public TR visit(Return ret, TP param) {
        ret.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(While wh, TP param) {
        wh.getExpression().accept(this, param);
        for(int i = 0; i < wh.getStatementList().size(); i++)
            wh.getStatementList().get(i).accept(this, param);
        return null;
    }

    @Override
    public TR visit(Write write, TP param) {
        write.getExpression().accept(this, param);
//        if(!write.getExpression().getLvalue())
//            new ErrorType(write.getLine(), write.getColumn(),
//                    "The lvalue expression of the write must be true");
        return null;
    }

    @Override
    public TR visit(Array array, TP param) {
        array.getType().accept(this, param);
        return null;
    }

    @Override
    public TR visit(ErrorType errorType, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionType functionType, TP param) {
        functionType.getReturnType().accept(this, param);
        for(int i = 0; i < functionType.getVarDefinitionList().size(); i++)
            functionType.getVarDefinitionList().get(i).accept(this, param);
        return null;
    }

    @Override
    public TR visit(Record record, TP param) {
        for(int i=0; i < record.getRecordFieldList().size();i++){
            record.getRecordFieldList().get(i).accept(this, param);
        }

        return null;
    }

    @Override
    public TR visit(RecordField recordField, TP param) {
        recordField.getType().accept(this, param);
        return null;
    }

    @Override
    public TR visit(VoidType voidType, TP param) {
        return null;
    }

    @Override
    public TR visit(CharType charType, TP param) {
        return null;
    }

    @Override
    public TR visit(DoubleType doubleType, TP param) {
        return null;
    }

    @Override
    public TR visit(IntType intType, TP param) {
        return null;
    }


}
