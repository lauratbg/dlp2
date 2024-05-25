package ast.expressions;

import ast.program.Definition;
import semantic.Visitor;

import java.util.zip.DeflaterInputStream;

public class Variable extends AbstractExpression {
    private String name;

    // Needed for linking variables with its definitions in IdentificationVisitor
    private Definition definition;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public Definition getDefinition() {
        return definition;
    }

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return  "(" + getLvalue() + ")" + name + "";
    }


}
