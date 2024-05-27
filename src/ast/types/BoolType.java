package ast.types;

import ast.types.builtin.CharType;
import ast.types.builtin.DoubleType;
import ast.types.builtin.IntType;
import codegeneration.CodeGenerator;
import semantic.Visitor;

public class BoolType extends AbstractType {

    private String value;
    public BoolType(int line, int column) {
        super(line, column);
    }


    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "bool";
    }


    @Override
    public Type logical(Type t) {
        if(t instanceof BoolType)
            return new BoolType(t.getLine(), t.getColumn());
        this.setValue(((BoolType)(t.logical(this))).getValue());
        return t;
    }

    @Override
    public Type mustBeBoolean(int line, int column){
        return this;
    }
    @Override
    public Type mustBeWritable(int line, int column) {
        return this;
    }

    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public char suffix() {
        return 'i';
    }

    //Should return true or false depending
    public String getValue() {
        return "bool";
    }

    public void setValue(String value) {
        this.value = value;
    }
}
