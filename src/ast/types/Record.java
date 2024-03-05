package ast.types;

import errorhandler.ErrorHandler;

import java.util.ArrayList;
import java.util.List;

public class Record extends AbstractType {

    private List<RecordField> recordFieldList;

    public Record(int line, int column, List<RecordField> recordFieldList) {
        super(line, column);
        this.recordFieldList = new ArrayList<>(recordFieldList);
        checkErrors(recordFieldList);

    }

    private void checkErrors(List<RecordField> recordFieldList) {

        for (int i = 0; i < recordFieldList.size(); i++) {
            for (int j = i+1; j < recordFieldList.size(); j++) {
                if (recordFieldList.get(i).equals(recordFieldList.get(j))) {
                    ErrorHandler.getInstance().addError(new ErrorType(recordFieldList.get(j).getLine(),
                            recordFieldList.get(j).getColumn(), "Duplicated names in struct type"));
                }
            }
        }
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
