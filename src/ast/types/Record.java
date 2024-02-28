package ast.types;

import java.util.ArrayList;
import java.util.List;

public class Record extends AbstractType{

    private List<RecordField> recordFieldList;
    public Record(int line, int column, List<RecordField> recordFieldList) {
        super(line, column);
        this.recordFieldList=new ArrayList<>(recordFieldList);
    }

    public List<RecordField> getRecordFieldList() {
        return recordFieldList;
    }

    public void setRecordFieldList(List<RecordField> recordFieldList) {
        this.recordFieldList = recordFieldList;
    }

    @Override
    public String toString() {
        return "struct {" + recordFieldList + "}";
    }
}
