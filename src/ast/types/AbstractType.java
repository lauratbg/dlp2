package ast.types;

import ast.AbstractASTNode;
import ast.expressions.Expression;
import ast.types.builtin.CharType;
import ast.types.builtin.DoubleType;
import codegeneration.CodeGenerator;
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
        return new ErrorType(type.getLine(), type.getColumn(), "Type '" + this + "' and '" + type + "' can NOT be used together in logical operations");
    }

    @Override
    public Type logical(int line, int column) {
        return new ErrorType(line, column, "Unary not con NOT be applied to '" + this +"'");
    }

    @Override
    public Type modulus(Type type) {
        return new ErrorType(type.getLine(), type.getColumn(), "Type '" + this + "' can NOT be used in modulus operations with '" + type + "'");
    }

    @Override
    public Type minus(int line, int column) {
        return new ErrorType(line, column, "Unary minus con NOT be applied to '" + this +"'");
    }

    @Override
    public void assignTo(Type type) {
         new ErrorType(type.getLine(), type.getColumn(), "Type '" + this + "' can NOT be assigned to '" + type + "'");
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
//        return new ErrorType(line, column, "The type '" + this +"' must be boolean");
        return null;
    }

    @Override
    public void returnAs(int line, int column, Type type) {
         new ErrorType(line, column, "The return type '" + this +"' is NOT correct");
    }

    @Override
    public Type parenthesis(int line, int column, List<Type> list){
        return new ErrorType(line, column, "The function invocation '" + list +"' is NOT correct");
    }

    @Override
    public boolean isAssignable(Type type) {
        return false;
    }

    @Override
    public Type squareBrackets(Type type) {
        return new ErrorType(type.getLine(), type.getColumn(), "Indexing with '" + this +"' is NOT correct");
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }

    @Override
    public char suffix() {
        return 'e';
    }

    @Override
    public void convertTo(CodeGenerator cg, Type type){

    }

    @Override
    public Type highestType(Type type) {
        return null;
    }

}
