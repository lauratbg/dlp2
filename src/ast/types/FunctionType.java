package ast.types;

import ast.program.VarDefinition;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType{
    private Type type;
    private List<VarDefinition> varDefinitionList;

    public FunctionType(int line, int column, Type type, List<VarDefinition> varDefinitionList) {
        super(line, column);
        this.type = type;
        this.varDefinitionList = new ArrayList<>(varDefinitionList);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<VarDefinition> getVarDefinitionList() {
        return varDefinitionList;
    }

    public void setVarDefinitionList(List<VarDefinition> varDefinitionList) {
        this.varDefinitionList = varDefinitionList;
    }

    @Override
    public String toString() {
        return "FunctionType{" +
                "type=" + type +
                ", varDefinitionList=" + varDefinitionList +
                '}';
    }
}