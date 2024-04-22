package codegeneration;

import ast.expressions.Variable;
import ast.program.VarDefinition;
import ast.types.builtin.IntType;
import semantic.AbstractVisitor;

public class AddressCGVisitor extends AbstractCGVisitor<Void,Void> {

    public AddressCGVisitor(CodeGenerator cg){
        super(cg);
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
}
