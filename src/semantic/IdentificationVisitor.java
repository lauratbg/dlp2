package semantic;

import ast.expressions.Variable;
import ast.program.Definition;
import ast.program.FuncDefinition;
import ast.program.VarDefinition;
import ast.types.ErrorType;
import semantic.symboltable.SymbolTable;


public class IdentificationVisitor extends AbstractVisitor<Void, Void> {
    private SymbolTable st = new SymbolTable();

    @Override
    public Void visit(Variable variable, Void param) {
        Definition definition = st.find(variable.getName());
        // If there is no variable with the same name
//        if (definition != null)
            variable.setDefinition(definition);
//        else
//            new ErrorType(variable.getLine(), variable.getColumn(), "The variable '" + variable.getName() + "' is NOT defined");
        return null;
    }

    @Override
    public Void visit(FuncDefinition funcDefinition, Void param) {
        // If there is no another funcdef with the same name in the SAME SCOPE
        if (st.insert(funcDefinition)) {
            st.set();
            funcDefinition.getType().accept(this, param); // IT IS NECESSARY TO BE THIS LINE BEFORE THE FOLLOWING TWO
            for(int i = 0; i < funcDefinition.getFunctionBody().size(); i++)
                funcDefinition.getFunctionBody().get(i).accept(this, param);
            st.reset();
        }
        else
            new ErrorType(funcDefinition.getLine(), funcDefinition.getColumn(),
                    "The function definition '" + funcDefinition.getName() + "' has already been defined");

        return null;
    }

    @Override
    public Void visit(VarDefinition varDefinition, Void param) {
        // If there is another vardef with the same name in the SAME SCOPE
        if (!st.insert(varDefinition))
            new ErrorType(varDefinition.getLine(), varDefinition.getColumn(),
                    "Variable definition '" + varDefinition.getName() + "' has already been defined");
        return null;
    }


}
