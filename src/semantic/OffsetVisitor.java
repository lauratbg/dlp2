package semantic;

import ast.types.Record;
import ast.types.RecordField;

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
