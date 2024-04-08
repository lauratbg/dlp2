package ast.types.builtin;

import ast.types.AbstractType;
import ast.types.ErrorType;
import ast.types.Type;
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
        return "Int";
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
                "[Error] [" + t + "] can NOT be assigned to type [" + this + "]"
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

        new ErrorType(line, column, "[Error] The return is returning [" + t +"] instead of [" +
                this + "]");
    }




}
