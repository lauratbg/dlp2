package errorhandler;

import ast.types.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

    private List<ErrorType> errors;
    private static ErrorHandler INSTANCE;

    private ErrorHandler() {
        this.errors = new ArrayList<>();
    }

    public static ErrorHandler getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ErrorHandler();
        }

        return INSTANCE;
    }

    public boolean anyErrors(){
        return !errors.isEmpty();
    }

    public void showErrors(PrintStream out){
        for(ErrorType error : errors)
            out.println(error.toString());
    }

    public void addError(ErrorType error){
        errors.add(error);
    }

}
