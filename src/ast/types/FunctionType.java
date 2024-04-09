package ast.types;

import ast.program.VarDefinition;
import semantic.Visitor;

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
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return type + " " + varDefinitionList;
    }

    @Override
    public Type parenthesis(int line, int column, List<Type> t){
        if(t.size() != varDefinitionList.size())
            return new ErrorType(line, column, "The number of parameters is NOT correct");
        for(int i = 0; i < t.size(); i++){
            if(!t.get(i).isAssignable(varDefinitionList.get(i).getType())){
                return new ErrorType(line, column, "There is an invalid parameter in function invocation");
            }
        }
        return type;
    }

}
