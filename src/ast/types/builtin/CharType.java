package ast.types.builtin;

import ast.types.AbstractType;
import ast.types.ErrorType;
import ast.types.Type;
import codegeneration.CodeGenerator;
import com.sun.jdi.IntegerType;
import semantic.Visitor;

public class CharType extends AbstractType {

    public CharType(int line, int column) {
        super(line, column);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "char";
    }
    @Override
    public boolean isAssignable(Type type) {
        return (type instanceof IntType || type instanceof ErrorType
                || type instanceof CharType || type instanceof DoubleType);
    }

    @Override
    public int numberOfBytes() {
        return 1;
    }

    @Override
    public void assignTo(Type t) {
        if (t instanceof CharType)
            return;
        if (t instanceof ErrorType)
            return;
        new ErrorType(t.getLine(), t.getColumn(),
                "The char '" + t + "' can NOT be assigned to type '" + this + "'"
        );
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
    public Type castTo(Type t) {
        if(!this.isAssignable(t))
            super.castTo(t);
        return t;
    }

    @Override
    public void returnAs(int line, int column, Type t) {
        if (t instanceof CharType) return;
        if (t instanceof ErrorType) return;

        new ErrorType(line, column, "The return should return '" + t + "' instead of '" +
                this + "'");
    }

    @Override
    public Type modulus(Type type) {
        if (type instanceof CharType || type instanceof ErrorType)
            return new IntType(type.getLine(), type.getColumn());
        return super.modulus(type);
    }

    @Override
    public Type arithmetic(Type type) {
        if (type instanceof ErrorType)
            return type;
        if (type instanceof CharType)
            return this;
        return new ErrorType(type.getLine(), type.getColumn(), "'" + type + "' does not support arithmetic operations with '" + this +"'");
    }

    @Override
    public char suffix() {
        return 'b';
    }

    @Override
    public void convertTo(CodeGenerator codeGenerator, Type type){
        if(type instanceof DoubleType) {
            codeGenerator.b2i();
            codeGenerator.i2f();
        }
        else if(type instanceof IntType)
            codeGenerator.b2i();
    }

    @Override
    public Type comparison(Type t) {
        if (t instanceof ErrorType)
            return t;
        if (t instanceof CharType)
            return this;
        return new ErrorType(t.getLine(), t.getColumn(), "'" + t + "' does not support comparison operations with '" + this +"'");
    }

    @Override
    public Type highestType(Type type) {
        if (type instanceof IntType || type instanceof DoubleType)
            return type;
        return this;
    }
}
