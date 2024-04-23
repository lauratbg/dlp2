package codegeneration;

import ast.expressions.Modulus;
import ast.program.Definition;
import ast.program.FuncDefinition;
import ast.program.Program;
import ast.program.VarDefinition;
import ast.statements.*;
import ast.types.FunctionType;
import semantic.AbstractVisitor;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {

    private ValueCGVisitor valueCGVisitor;
    private AddressCGVisitor addressCGVisitor;
    public ExecuteCGVisitor(CodeGenerator cg, ValueCGVisitor valueCGVisitor, AddressCGVisitor addressCGVisitor) {
        super(cg);
        this.valueCGVisitor = valueCGVisitor;
        this.addressCGVisitor = addressCGVisitor;
    }

    // Read
    /*
        execute[[Read: statement ⟶ expression]]
            address[[expression]
            <in> expression.suffix
            <store> expression.suffix
     */
    @Override
    public Void visit(Read read, Void param) {
        cg.writeLine(read.getLine());
        cg.addComment("Read");
        read.getExpression().accept(addressCGVisitor, null);
        cg.in(read.getExpression().getType().suffix());
        cg.store(read.getExpression().getType().suffix());
        return null;
    }

    // Write
    /*
        execute[[Write: statement ⟶ expression]]
            value[[expression] (the value is what I want to print)
            <out> expression.suffix
     */
    @Override
    public Void visit(Write write, Void param) {
        cg.writeLine(write.getLine());
        cg.addComment("Write");
        write.getExpression().accept(valueCGVisitor, null);
        cg.out(write.getExpression().getType().suffix());
        return null;
    }

    // Assignment
    /*
        execute[[Assignment: statement ⟶ exp1 exp2]] =
            address[[exp1]]
            value[[exp2]]
            store exp1.suffix
     */
    @Override
    public Void visit(Assignment assignment, Void param) {
        cg.writeLine(assignment.getLine());
        assignment.getExpression1().accept(addressCGVisitor, null);
        assignment.getExpression2().accept(valueCGVisitor, null);
        cg.store(assignment.getExpression1().getType().suffix());
        return null;
    }

    // Function Definition
    /*
        execute[[FunctionDefinition: definition -> type ID varDefinition*]] =
            <ID: >
            execute[[funcType]]
            <Local variables>
            for(VarDefinition var : varDefinition*)
                execute[[var]]
            <enter > type.sumBytes
            for(Statement smt : smt*)
                execute[[smt]]
            <ret 0, funcDef.sumBytes, param.type.numOfBytes)
     */
    @Override
    public Void visit(FuncDefinition funcDefinition, Void param) {
        cg.writeLine(funcDefinition.getLine());
        cg.write("\n " + funcDefinition.getName() + ": ");
        funcDefinition.getType().accept(this, null);
        cg.addComment("Local variables");
        //TODO: no están saliendo las locales
        for(Statement stmt : funcDefinition.getFunctionBody())
            if(stmt instanceof VarDefinition)
                stmt.accept(this, null);
        cg.enter(funcDefinition.sumOfBytes());
        for(Statement stmt : funcDefinition.getFunctionBody())
            if(!(stmt instanceof VarDefinition))
                stmt.accept(this, null);
        cg.ret(0, funcDefinition.sumOfBytes(), ((FunctionType)funcDefinition.getType()).numberOfBytes());
        return null;
    }

    // Variable definition
    /*
        execute[[VarDefinition: definition ⟶ type ID]] =
            <'* > type ID <(offset > definition.offset <)>
     */
    @Override
    public Void visit(VarDefinition varDefinition, Void param) {
        cg.addComment(varDefinition.getType() + " " + varDefinition.getName() + " (offset " + varDefinition.getOffset() + ")");

        return null;
    }


    /* Function
    execute [[Function : function -> type ID varDefinition+]] =
        <' * Parameters>
        for(VarDefinition var : varDefinition*)
            execute[[var]]
     */
    @Override
    public Void visit(FunctionType functionType, Void param) {
        cg.addComment("Parameters");
        for(VarDefinition var : functionType.getVarDefinitionList())
            var.accept(this, null);
        return null;
    }

    // Program
    /*
        execute[[Program: definition*]] =
            <' Invocation to the main function>
            for(Definition def : definition*)
                if(def instanceof VarDefinition)
                    execute[[def]]

            <call main>
            <halt>

            for(Definition def : definition*)
                if(def instanceof FunctionDefinition)
                    execute[[def]]
     */
    @Override
    public Void visit(Program program, Void param) {
        cg.addComment("Global variables:");

        for(Definition def : program.getDefinitionList())
            if(def instanceof VarDefinition)
                def.accept(this, null);
        cg.write("\n' Invocation to the main function");
        cg.write("call main");
        cg.write("halt");

        for(Definition def : program.getDefinitionList())
            if(def instanceof FuncDefinition)
                def.accept(this, null);
        return null;
    }

    // While
    /*
        execute[[WhileStmt: statement ⟶ expression statement*]] =
            String condLabel = cg.nextLabel();
                   exitLabel = cg.nextLabel();
            condLabel<:>
            value[[expression]]
            <jz > exitLabel
            statement*.forEach(stmt -> execute[[stmt]])
            <jmp > condLabel
            exitLabel<:>
     */
    @Override
    public Void visit(While wh, Void param) {
        String condLabel = cg.nextLabel();
        String exitLabel = cg.nextLabel();
        cg.write(condLabel + ":");
        wh.getExpression().accept(valueCGVisitor, param);
        cg.jz(exitLabel);
        for(Statement statement : wh.getStatementList())
            statement.accept(this, param);
        cg.jmp(condLabel);
        cg.write(exitLabel + ":");
        return null;
    }

    // IfElse
    /*
        execute[[IfElse: statement1 -> expression statement2* statement3*]] =
            value[[expression]]
            String elseBody = codeGenerator.nextLabel(),
                   exitLabel = codeGenerator.nextLabel();
            <jz > elseBody
            statement2*.forEach(stmt -> execute[[stmt]])
            <jmp > exitLabel
            elseBody <:>
            statement3*.forEach(stmt -> execute[[stmt]])
            exitLabel <:>
     */
    @Override
    public Void visit(IfElse ifElse, Void param) {
        ifElse.getExpression().accept(valueCGVisitor, param);
        String elseBody = cg.nextLabel();
        String exitLabel = cg.nextLabel();
        cg.jz(elseBody);
        for(Statement statement : ifElse.getIfList())
            statement.accept(this, param);
        cg.jmp(exitLabel);
        cg.write(elseBody + ":");
        for(Statement statement : ifElse.getElseList())
            statement.accept(this, param);

        cg.write(exitLabel + ":");
        return null;
    }
}
