package ast.types.builtin;

import ast.types.AbstractType;
import ast.types.BoolType;
import ast.types.ErrorType;
import ast.types.Type;
import codegeneration.CodeGenerator;
import com.sun.jdi.IntegerType;
import semantic.Visitor;

public class DoubleType extends AbstractType {

    public DoubleType(int line, int column) {
        super(line, column);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "real";
    }
    @Override
    public boolean isAssignable(Type type) {
        return (type instanceof DoubleType || type instanceof ErrorType);
    }
    @Override
    public void assignTo(Type t) {
        if (t instanceof DoubleType)
            return;
        if (t instanceof ErrorType)
            return;
        new ErrorType(t.getLine(), t.getColumn(),
                "The double '" + t + "' can NOT be assigned to type '" + this + "'"
        );
    }

    @Override
    public Type arithmetic(Type t) {
        if (t instanceof ErrorType)
            return t;
        if (t instanceof DoubleType)
            return this;
        return new ErrorType(t.getLine(), t.getColumn(), "'" + t + "' does not support arithmetic operations with '" + this +"'");
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

    //double and int
    @Override
    public Type comparison(Type t) {
        if(t instanceof ErrorType)
            return t;
        if(t instanceof DoubleType)
            return new BoolType(t.getLine(), t.getColumn());
        return new ErrorType(t.getLine(), t.getColumn(), "'" + t + "' does not support comparison operations with '" + this +"'");
    }



//    @Override
//    public Type logical(Type t) {
//        if(!this.isAssignable(t))
//            return super.logical(t);
//        return t;
//    }

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
    public void returnAs (int line, int column, Type t) {
        if (t instanceof DoubleType) return;
        if (t instanceof ErrorType) return;

        new ErrorType(line, column, "The return should return '" + t +"' instead of '" +
                this + "'");
    }

    @Override
    public int numberOfBytes() {
        return 4;
    }

    @Override
    public char suffix() {
        return 'f';
    }

    @Override
    public void convertTo(CodeGenerator codeGenerator, Type type){
        if(type instanceof CharType) {
            codeGenerator.f2i();
            codeGenerator.i2b();
        }
        else if(type instanceof IntType){
            codeGenerator.f2i();

        }
    }

    @Override
    public Type highestType(Type type) {
        if (type instanceof DoubleType || type instanceof IntType || type instanceof CharType)
            return this;
        return null;
    }
}
