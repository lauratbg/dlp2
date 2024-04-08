package ast.types;


import errorhandler.ErrorHandler;
import semantic.Visitor;

import java.util.List;

public class ErrorType extends AbstractType{

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
        ErrorHandler.getInstance().addError(this);

    }

    public String getMessage() {
        return message;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }


    @Override
    public String toString() {
        return "[ERROR] line: " + getLine() + ", column: " + getColumn() + " -> " + message;
    }

    @Override
    public Type arithmetic(Type t) {
        return this;
    }

    @Override
    public void assignTo(Type t) {
    }

    @Override
    public Type mustBeReadable(int line, int column) {
        return this;
    }

    @Override
    public Type mustBeWritable(int line, int column) {
        return this;
    }

    @Override
    public Type mustBeBoolean(int line, int column) {
        return this;
    }

    @Override
    public Type castTo(Type t) {
        return this;
    }

    @Override
    public Type comparison(Type t) {
        return this;
    }

    @Override
    public Type dot(int line, int column, String t) {
        return this;
    }

    @Override
    public Type parenthesis(int line, int column, List<Type> t) {
        return this;
    }

    @Override
    public Type squareBrackets(Type t) {
        return this;
    }

    @Override
    public Type logical(Type t) {
        return this;
    }

    @Override
    public Type modulus(Type t) {
        return this;
    }

    @Override
    public Type minus(int line, int column) {
        return this;
    }

    @Override
    public Type logical(int line, int column) {
        return this;
    }

    @Override
    public void returnAs(int line, int column, Type t) {
    }
}
