package codegeneration;

import ast.program.FuncDefinition;
import ast.program.VarDefinition;
import ast.statements.Statement;
import ast.types.FunctionType;
import ast.types.Record;
import ast.types.RecordField;
import semantic.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Void, Void> {
    private int globalBytesSum;

    public OffsetVisitor() {
        this.globalBytesSum = 0;
    }
    // &global=ΣnOB(types(prev. globals not including itself))ç
    /*
        P: VarDefinition: varDef -> type ID
        R: if(varDef.scope == 0) { //check
                varDef.offset = globalBytesSum;
                globalBytesSum += varDef.type.noB();
           }
     */
    @Override
    public Void visit(VarDefinition varDefinition, Void param) {
        varDefinition.getType().accept(this, param);

        if(varDefinition.getScope()==0){
            varDefinition.setOffset(globalBytesSum);
            globalBytesSum += varDefinition.getType().numberOfBytes();
        }
        return null;
    }

    // &local=BP-ΣnOB(types(prev. locals including itself))
    /*
        P: FuncDefinition: def -> type ID stmt*
        R: int localBytesSum = 0;
           for(Statement st : def.body) {
                if(st instanceOf VarDefinition vardef){
                    localBytesSun += vardef.types.noB();
                    vardef.offset = -localBytesSum
                }
           }
     */
    @Override
    public Void visit(FuncDefinition funcDefinition, Void param) {
        funcDefinition.getType().accept(this, param);
        funcDefinition.getFunctionBody().forEach(f -> f.accept(this, param));
        int localBytesSum = 0;
        for(Statement st : funcDefinition.getFunctionBody()){
            if(st instanceof VarDefinition vardef){
                localBytesSum += vardef.getType().numberOfBytes();
                vardef.setOffset(-localBytesSum);
            }
        }
        return null;
    }

    // &param = BP + 4 + ΣnOB(types(params on the right not including itself))
    /*
        P: FunctionType: type1 -> type2 def*
        R: int paramsBytesSum = 0;
           for(int i = varDef*.size-1; i >= 0; i--) { not including itself
                VarDefinition v = varDef*.get(i);
                v.offset = 4+paramsBytesSum;
                paramsBytesSum += v.type.noB();
           }
     */
    @Override
    public Void visit(FunctionType functionType, Void param) {
        int paramsBytesSum = 0;
        for(int i = functionType.getVarDefinitionList().size() - 1; i >= 0; i--){
            VarDefinition v = functionType.getVarDefinitionList().get(i);
            v.setOffset(4+paramsBytesSum);
            paramsBytesSum += v.getType().numberOfBytes();
        }
        return null;
    }

    // &field=ΣnOB(types(prev. fields not including itself))
    /*
        P: Record: type -> recordField*
        R: int offsetBytesSum = 0;
           for(RecordField rf : record.getFields()) {
                rf.setOffset(offsetBytesSum);
                offsetBytesSum += rf.getType().noB();
                rf.accept(this, null);
           }
     */
    @Override
    public Void visit(Record record, Void param) {
        int offsetBytesSum = 0;
        for(RecordField rf : record.getRecordFieldList()){
            rf.setOffset(offsetBytesSum);
            offsetBytesSum += rf.getType().numberOfBytes();
            rf.accept(this, null);
        }
        return null;
    }
}
