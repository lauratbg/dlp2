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

    /*
    Checks that there is no repeated name of any record field in a struct
     */
    private void checkErrors(List<RecordField> recordFieldList) {
        for (int i = 0; i < recordFieldList.size(); i++) {
            for (int j = i+1; j < recordFieldList.size(); j++) {
                if (recordFieldList.get(i).equals(recordFieldList.get(j))) {
                    new ErrorType(recordFieldList.get(j).getLine(),
                            recordFieldList.get(j).getColumn(),
                                String.format("Duplicated names '%s' in struct type", recordFieldList.get(j).getName()));
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
