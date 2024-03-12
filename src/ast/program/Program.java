package ast.program;

import ast.AbstractASTNode;
import semantic.Visitor;

import java.util.List;

public class Program extends AbstractASTNode{
    private List<Definition> definitionList;

    public Program(int line, int column, List<Definition> definitionList) {
        super(line, column);
        this.definitionList = definitionList;
    }

    public List<Definition> getDefinitionList() {
        return definitionList;
    }

    public void setDefinitionList(List<Definition> definitionList) {
        this.definitionList = definitionList;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "Program{" +
                "definitionList=" + definitionList +
                '}';
    }
}
