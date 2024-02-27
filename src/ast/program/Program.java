package ast.program;

import ast.AbstractASTNode;

import java.util.List;

public class Program extends AbstractASTNode{
    private List<Definition> definitionList;

    public Program(int line, int column, List<Definition> definitionList) {
        super(line, column);
        this.definitionList = definitionList;
    }

    @Override
    public String toString() {
        return "Program{" +
                "definitionList=" + definitionList +
                '}';
    }
}
