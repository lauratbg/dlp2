package ast.types;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import ast.types.builtin.CharType;
import ast.types.builtin.DoubleType;
import com.sun.jdi.IntegerType;

import java.util.List;

public abstract class AbstractType extends AbstractASTNode implements Type {
    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public Type arithmetic(Type type) {
        return new ErrorType(type.getLine(), type.getColumn(), "Not supported type '" + type +
                "' in arithmetic operation");
    }

    @Override
    public Type castTo(Type type) {
        return new ErrorType(type.getLine(), type.getColumn(), "Type '" + this + "' can NOT be cast to '" + type + "'");
    }

    @Override
    public Type comparison(Type type) {
        return new ErrorType(type.getLine(), type.getColumn(), "Type '" + this + "' can NOT be compared to '" + type + "'");
    }

    @Override
    public Type dot(int line, int column, String id) {
        return new ErrorType(line, column, "'" + id + "' can NOT be field accessed");
    }

    @Override
    public Type logical(Type type) {
        return new ErrorType(type.getLine(), type.getColumn(), "Type '" + this + "' can NOT be logical to '" + type + "'");
    }

    @Override
    public Type logical(int line, int column) {
        return new ErrorType(line, column, "Unary not con NOT be applied to '" + this +"'");
    }

    @Override
    public Type modulus(Type type) {
        return new ErrorType(type.getLine(), type.getColumn(), "Type '" + this + "' can NOT be modulled to '" + type + "'");
    }

    @Override
    public Type minus(int line, int column) {
        return new ErrorType(line, column, "Unary minus con NOT be applied to '" + this +"'");
    }

    @Override
    public Type assignTo(Type type) {
        return new ErrorType(type.getLine(), type.getColumn(), "Type '" + this + "' can NOT be assigned to '" + type + "'");
    }

    @Override
    public Type mustBeReadable(int line, int column) {
        return new ErrorType(line, column, "'" + this +"' can NOT be read");
    }

    @Override
    public Type mustBeWritable(int line, int column) {
         return new ErrorType(line, column, "'" + this +"' can not be written");
    }

    @Override
    public Type mustBeBoolean(int line, int column) {
        return new ErrorType(line, column, "'" + this +"' must be boolean");
    }

    @Override
    public Type returnAs(int line, int column, Type type) {
        return new ErrorType(line, column, "The return type '" + this +"' is NOT correct");
    }

    @Override
    public Type parenthesis(int line, int column, List<Type> list){
        return new ErrorType(line, column, "The function invocation '" + list +"' is NOT correct");
    }

    @Override
    public boolean isAssignable(Type type) {
        return false;
    }



}
