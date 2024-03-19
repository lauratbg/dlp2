package semantic;

import ast.expressions.*;
import ast.statements.*;
import ast.types.*;


public class TypeCheckingVisitor extends AbstractVisitor<Void, Void>{

    @Override
    public Void visit(Arithmetic arith, Void param) {
        arith.setLvalue(false);

        return null;
    }

    // lvalue false bc the return is something temporary
    @Override
    public Void visit(Cast cast, Void param) {

        cast.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Char_Literal charLiteral, Void param) {
        charLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Comparison comparison, Void param) {

        comparison.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(FieldAccess fieldAccess, Void param) {
        fieldAccess.setLvalue(true);
        return null;
    }

    @Override
    public Void visit(Indexing indexing, Void param) {
        indexing.setLvalue(true);
        return null;
    }

    @Override
    public Void visit(Int_Literal intLiteral, Void param) {
        intLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Logical logical, Void param) {

        logical.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Modulus modulus, Void param) {

        modulus.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Real_Literal realLiteral, Void param) {
        realLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(UnaryMinus unaryMinus, Void param) {
        unaryMinus.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(UnaryNot unaryNot, Void param) {
        unaryNot.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Variable variable, Void param) {
        variable.setLvalue(true);
        return null;
    }

    //  Program


    //  Statements
    @Override
    public Void visit(Assignment assignment, Void param) {
        if(!assignment.getExpression1().getLvalue())
            new ErrorType(assignment.getExpression1().getLine(), assignment.getExpression1().getColumn(),
                    "The left-hand side lvalue expression must be true");
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        functionInvocation.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Read read, Void param) {
        if(!read.getExpression().getLvalue())
            new ErrorType(read.getExpression().getLine(), read.getExpression().getColumn(),
                    "The lvalue expression of the read must be true");
        return null;
    }



    //  Types


}
