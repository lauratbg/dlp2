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

import javax.swing.*;

public class TypeCheckingVisitor implements Visitor<Void, Void>{

    @Override
    public Void visit(Arithmetic arith, Void param) {
        arith.getExpression1().accept(this, param);
        arith.getExpression2().accept(this, param);
        arith.setLvalue(false);

        return null;
    }

    // lvalue false bc the return is something temporary
    @Override
    public Void visit(Cast cast, Void param) {
        cast.getExpression().accept(this, param);
        cast.getType().accept(this, param);
        cast.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Char_Literal charLiteral, Void param) {
        charLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Comparison comparison, Void param) {
        comparison.getExpression1().accept(this, param);
        comparison.getExpression2().accept(this, param);
        comparison.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(FieldAccess fieldAccess, Void param) {
        fieldAccess.getExpression().accept(this, param);
        fieldAccess.setLvalue(true);
        return null;
    }

    @Override
    public Void visit(Indexing indexing, Void param) {
        indexing.getExpression1().accept(this, param);
        indexing.getExpression2().accept(this, param);
        indexing.setLvalue(true);
        return null;
    }

    @Override
    public Void visit(Int_Literal intLiteral, Void param) {
        intLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Logical logical, Void param) {
        logical.getExpression1().accept(this, null);
        logical.getExpression2().accept(this, null);
        logical.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Modulus modulus, Void param) {
        modulus.getExpression1().accept(this, null);
        modulus.getExpression2().accept(this, null);
        modulus.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Real_Literal realLiteral, Void param) {
        realLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(UnaryMinus unaryMinus, Void param) {
        unaryMinus.getExpression().accept(this, param);
        unaryMinus.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(UnaryNot unaryNot, Void param) {
        unaryNot.getExpression().accept(this, param);
        unaryNot.setLvalue(false);
        return null;
    }

    //TODO: ?
    @Override
    public Void visit(Variable variable, Void param) {
        variable.setLvalue(true);
        return null;
    }

    //  Program
    @Override
    public Void visit(FuncDefinition funcDefinition, Void param) {
        for(int i = 0; i < funcDefinition.getFunctionBody().size(); i++)
            funcDefinition.getFunctionBody().get(i).accept(this, param);
        funcDefinition.getType().accept(this, param);
        return null;
    }

    //TODO: comprobar que esté bien
    @Override
    public Void visit(Program program, Void param) {
        for(int i = 0; i < program.getDefinitionList().size(); i++)
            program.getDefinitionList().get(i).accept(this, param);

        return null;
    }

    @Override
    public Void visit(VarDefinition varDefinition, Void param) {
        varDefinition.getType().accept(this, param);
        return null;
    }

    //  Statements

    @Override
    public Void visit(Assignment assignment, Void param) {
        assignment.getExpression1().accept(this, param);
        assignment.getExpression2().accept(this, param);

        if(!assignment.getExpression1().getLvalue())
            new ErrorType(assignment.getExpression1().getLine(), assignment.getExpression1().getColumn(),
                    "The left-hand side lvalue expression must be true");
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        functionInvocation.getFunctionName().accept(this, param);
        for(int i = 0; i < functionInvocation.getParams().size(); i++)
            functionInvocation.getParams().get(i).accept(this, param);
        functionInvocation.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(IfElse ifElse, Void param) {
        ifElse.getExpression().accept(this, param);
        for(int i = 0; i < ifElse.getIfList().size(); i++)
            ifElse.getIfList().get(i).accept(this, param);
        if(!ifElse.getElseList().isEmpty())
            for(int i = 0; i < ifElse.getElseList().size(); i++)
                ifElse.getElseList().get(i).accept(this, param);
        return null;
    }

    @Override
    public Void visit(Read read, Void param) {
        read.getExpression().accept(this, param);
        if(!read.getExpression().getLvalue())
            new ErrorType(read.getExpression().getLine(), read.getExpression().getColumn(),
                    "The lvalue expression of the read must be true");
        return null;
    }

    @Override
    public Void visit(Return ret, Void param) {
        ret.getExpression().accept(this, param);
        return null;
    }

    @Override
    public Void visit(While wh, Void param) {
        wh.getExpression().accept(this, param);
        for(int i = 0; i < wh.getStatementList().size(); i++)
            wh.getStatementList().get(i).accept(this, param);
        return null;
    }

    @Override
    public Void visit(Write write, Void param) {
        write.getExpression().accept(this, param);
        return null;
    }


    //  Types
    @Override
    public Void visit(Array array, Void param) {
        array.getType().accept(this, param);
        return null;
    }

    @Override
    public Void visit(ErrorType errorType, Void param) {
        return null;
    }

    @Override
    public Void visit(FunctionType functionType, Void param) {
        functionType.getType().accept(this, param);
        for(int i = 0; i <  functionType.getVarDefinitionList().size();i++)
            functionType.getVarDefinitionList().get(i).accept(this, param);
        return null;
    }

    @Override
    public Void visit(Record record, Void param) {
        for(int i = 0; i < record.getRecordFieldList().size(); i++)
            record.getRecordFieldList().get(i).accept(this, param);
        return null;
    }

    @Override
    public Void visit(RecordField recordField, Void param) {
        recordField.getType().accept(this, param);
        return null;
    }

    @Override
    public Void visit(VoidType voidType, Void param) {
        return null;
    }

    @Override
    public Void visit(CharType charType, Void param) {
        return null;
    }

    @Override
    public Void visit(DoubleType doubleType, Void param) {
        return null;
    }

    @Override
    public Void visit(IntType intType, Void param) {
        return null;
    }
}
