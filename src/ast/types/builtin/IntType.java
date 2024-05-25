package ast.types.builtin;

import ast.types.AbstractType;
import ast.types.ErrorType;
import ast.types.Type;
import codegeneration.CodeGenerator;
import semantic.Visitor;

public class IntType extends AbstractType {

    public IntType(int line, int column) {
        super(line, column);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "int";
    }

    @Override
    public boolean isAssignable(Type type) {
        return (type instanceof IntType || type instanceof ErrorType);
    }

    @Override
    public void assignTo(Type t) {
        if (t instanceof IntType)
            return;
        if (t instanceof ErrorType)
            return;
        new ErrorType(t.getLine(), t.getColumn(),
                "The int '" + t + "' can NOT be assigned to type '" + this + "'"
        );
    }
    @Override
    public Type arithmetic(Type t) {
        if(!this.isAssignable(t))
            return super.arithmetic(t);
        return t;
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
        if (t instanceof IntType || t instanceof DoubleType || t instanceof CharType || t instanceof ErrorType)
            return t;
        return super.castTo(t);
    }

    @Override
    public Type comparison(Type t) {
        if(!this.isAssignable(t))
            return super.comparison(t);
        return t;
    }

    @Override
    public Type mustBeBoolean(int line, int column){
        return this;
    }

    @Override
    public Type logical(Type t) {
        if (t instanceof IntType || t instanceof ErrorType)
            return t;
        return super.logical(t);
    }

    @Override
    public Type modulus(Type t) {
        if(!this.isAssignable(t))
            return super.modulus(t);
        return t;
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
        if (t instanceof IntType) return;
        if (t instanceof ErrorType) return;

        new ErrorType(line, column, "The return should return '" + t +"' instead of '" +
                this + "'");
    }

    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public char suffix() {
        return 'i';
    }

    @Override
    public void convertTo(CodeGenerator codeGenerator, Type type){
        if(type instanceof DoubleType)
            codeGenerator.i2f();
        else if(type instanceof CharType)
            codeGenerator.i2b();
    }

    @Override
    public Type highestType(Type type) {
        if (type instanceof IntType || type instanceof CharType)
            return this;
        if (type instanceof DoubleType)
            return type;
        return null;
    }
}
