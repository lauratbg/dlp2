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

public interface Visitor<TP, TR> {

    //  Expressions
    TR visit(Arithmetic arith, TP param);
    TR visit(Cast cast, TP param);
    TR visit(Char_Literal charLiteral, TP param);
    TR visit(Comparison comparison, TP param);
    TR visit(FieldAccess fieldAccess, TP param);
    TR visit(Indexing indexing, TP param);
    TR visit(Int_Literal intLiteral, TP param);
    TR visit(Logical logical, TP param);
    TR visit(Modulus modulus, TP param);
    TR visit(Real_Literal realLiteral, TP param);
    TR visit(UnaryMinus unaryMinus, TP param);
    TR visit(UnaryNot unaryNot, TP param);
    TR visit(Variable variable, TP param);

    //  Program
    TR visit(FuncDefinition funcDefinition, TP param);
    TR visit(Program program, TP param);
    TR visit(VarDefinition varDefinition, TP param);

    //  Statements
    TR visit(Assignment assignment, TP param);
    TR visit(FunctionInvocation functionInvocation, TP param);
    TR visit(IfElse ifElse, TP param);
    TR visit(Read read, TP param);
    TR visit(Return ret, TP param);
    TR visit(While wh, TP param);
    TR visit(Write write, TP param);

    //  Types
    TR visit(Array array, TP param);
    TR visit(ErrorType errorType, TP param);
    TR visit(FunctionType functionType, TP param);
    TR visit(Record record, TP param);
    TR visit(RecordField recordField, TP param);
    TR visit(VoidType voidType, TP param);
    TR visit(CharType charType, TP param);
    TR visit(DoubleType doubleType, TP param);
    TR visit(IntType intType, TP param);



}
