package ast.types;

import semantic.Visitor;

public class Array extends AbstractType{
    private int size;
    private Type type;

    public Array(int line, int column, int size, Type type) {
        super(line, column);
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    /**
     * FACTORY
     * t -> t[]
     *   -> int
     * When we do things like before to do a 2D array, we get an array with the sizes
     * in inverse order, so this method is to solve that error reinverting the sizes
     *
     * It is necessary to do a factory bc if we create a 2D array or more using the
     * constructor, this one is always  going to return the last created object
     *
     *
     * @param line
     * @param column
     * @param type
     * @param size
     * @return
     */
    public static Array createArray(int line, int column, Type type, int size) {
        Array res = new Array(line, column, size, type);
        // int[10][20]
        if(type instanceof Array){
            // save current array size
            int oldSize = res.size; //saves 20
            //assign to my array the size of the contained array
            res.size = ((Array)type).size; //assigns 10
            // call again this function with the type of the inner array
            res.type = createArray(line, column,((Array) type).type, oldSize); //calls again createArray passing type int and size 20
        }
        return res;
    }


    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return type + "[" + size + "]";
    }
}
