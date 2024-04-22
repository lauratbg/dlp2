package codegeneration;

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
import codegeneration.CodeGenerator;
import semantic.Visitor;

import java.sql.Struct;
import java.util.function.Function;

public abstract class AbstractCGVisitor<TP, TR> implements Visitor<TP, TR> {

    protected CodeGenerator cg; //protected para poder usarlo fuera

    public AbstractCGVisitor(CodeGenerator cg){
        this.cg = cg;
    }

    public CodeGenerator getCodeGenerator(){
        return cg;
    }

    @Override
    public TR visit(Arithmetic arithmetic, TP param) {
        return null;
    }

    @Override
    public TR visit(Indexing indexing, TP param) {
        return null;
    }

    @Override
    public TR visit(Logical logic, TP param) {
        return null;
    }

    @Override
    public TR visit(FuncDefinition functionDefinition, TP param) {
        return null;
    }

    @Override
    public TR visit(VarDefinition variableDefinition, TP param) {
        return null;
    }

    @Override
    public TR visit(Comparison comparison, TP param) {
        return null;
    }

    @Override
    public TR visit(Modulus modulus, TP param) {
        return null;
    }

    @Override
    public TR visit(Cast cast, TP param) {
        return null;
    }

    @Override
    public TR visit(Char_Literal charLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(Real_Literal realLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(Int_Literal intLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(FieldAccess fieldAccess, TP param) {
        return null;
    }

    @Override
    public TR visit(UnaryMinus unaryMinus, TP param) {
        return null;
    }

    @Override
    public TR visit(UnaryNot unaryNot, TP param) {
        return null;
    }

    @Override
    public TR visit(Variable variable, TP param) {
        return null;
    }

    @Override
    public TR visit(Read read, TP param) {
        return null;
    }

    @Override
    public TR visit(Write writeStatement, TP param) {
        return null;
    }

    @Override
    public TR visit(ErrorType errorType, TP param) {
        return null;
    }
    @Override
    public TR visit(Array array, TP param) {
        return null;
    }


    @Override
    public TR visit(Record struct, TP param) {
        return null;
    }

    @Override
    public TR visit(VoidType v, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionType function, TP param) {
        return null;
    }

    @Override
    public TR visit(RecordField recordField, TP param) {
        return null;
    }

    @Override
    public TR visit(Assignment assignment, TP param) {
        return null;
    }

    @Override
    public TR visit(Return r, TP param) {
        return null;
    }

    @Override
    public TR visit(IfElse ifElse, TP param) {
        return null;
    }

    @Override
    public TR visit(While wh, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionInvocation functionInvocation, TP param) {
        return null;
    }

    @Override
    public TR visit(CharType c, TP param) {
        return null;
    }

    @Override
    public TR visit(DoubleType doubleType, TP param) {
        return null;
    }

    @Override
    public TR visit(IntType i, TP param) {
        return null;
    }

    @Override
    public TR visit(Program program, TP param) {
        return null;
    }
}