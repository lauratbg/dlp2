package codegeneration;

import ast.expressions.FieldAccess;
import ast.expressions.Indexing;
import ast.expressions.Variable;
import ast.program.VarDefinition;
import ast.types.Record;
import ast.types.builtin.IntType;
import semantic.AbstractVisitor;

public class AddressCGVisitor extends AbstractCGVisitor<Void,Void> {
    private ValueCGVisitor valueCGVisitor;
    public AddressCGVisitor(CodeGenerator cg){
        super(cg);
        this.valueCGVisitor = new ValueCGVisitor(cg, this);
    }
    // Variable
    /*
        address[[Variable: exp ⟶ ID]] =
            if(exp.def.scope == 0)
                <pusha > exp.definition.offset
            else {
                <pusha > BP
                <pusha > exp.def.offset
                <addi >
            }
            push exp.suffix + exp.definition.offset
     */
    @Override
    public Void visit(Variable variable, Void param){
        VarDefinition var = (VarDefinition) variable.getDefinition();
        if(var.getScope() == 0)
            cg.pusha(var.getOffset());
        else {
            cg.pushBP();
            cg.push(var.getOffset());
            cg.add(new IntType(variable.getLine(), variable.getColumn()));
        }

        return null;
    }

    // Indexing
    /*
        value[[Indexing: exp1 ⟶ exp2 exp3]] =
            address[[exp2]]
            value[[exp3]]
            <pushi > exp1.type.numberOfBytes()
            <muli>
            <addi>

     */
    @Override
    public Void visit(Indexing indexing, Void param){
        indexing.getExpression1().accept(this, param);
        indexing.getExpression2().accept(valueCGVisitor, param);

        cg.push(indexing.getExpression1().getType().numberOfBytes());
        cg.muli();
        cg.addi();
        return null;
    }

    // Field Access
    /*
        address[[FieldAccess: exp1 ⟶ exp2 ID]] =
            address[[exp2]]
            <pushi > expression2.type.getField(ID).offset
            <addi>
     */
    @Override
    public Void visit(FieldAccess fieldAccess, Void param){
        fieldAccess.getExpression().accept(this, null);
        cg.push(((Record)fieldAccess.getExpression().getType()).getRecordField(fieldAccess.getField()).getOffset());
        cg.addi();
        return null;
    }

}
