package semantic;

import ast.expressions.*;
import ast.statements.*;
import ast.types.*;


public class TypeCheckingVisitor extends AbstractVisitor<Void, Void>{

    /*
        ****** EXPRESSIONS ******
        P: Arithmetic: exp1 -> exp2 exp3
        R: exp1.type = exp2.type.arithmetic(exp3.type)

        P: Modulus: exp1 -> exp2 exp3
        R: exp1.type = exp2.type.modulus(exp3.type)

        P: Logical: exp1 -> exp2 exp3
        R: exp1.type = exp2.type.logical(exp3.type)

        P: UnaryNot: exp1 -> exp2
        R: exp1.type = exp2.type.logical()

        P: Comparison: exp1 -> exp2 exp3
        R: exp1.type = exp2.type.comparison(exp3.type)

        P: UnaryMinus: exp1 -> exp2
        R: exp1.type = exp2.type.minus()

        P: Cast: exp1 -> type exp2
        R: exp1.type = exp2.type.castTo(type)

        P: Indexing: exp1 -> exp2 exp3
        R: exp1.type = exp2.type.squareBrackets(exp3.type)

                                            f(3.4 + a, b)
                                            exp1.type refers to the whole thing f(3.4 + a, b)
                                            exp2.type refers to f
                                            those types are NOT the same
                                            exp*.type are the type of the arguments

        P: FunctionInvocation: exp1 -> exp2 exp*
        R: exp1.type -> exp2.type.parenthesis(exp*.stream().map(exp -> exp.type).toArray())

        P: FunctionInvocation: stmt -> exp exp*
        R: exp.type.parenthesis(exp*.stream().map(exp -> exp.type).toArray())

        P: FieldAccess: exp1 -> exp2 ID
        R: exp1.type = exp2.type.dot(ID)

        P: Variable: exp -> ID
        R: exp.type = exp.def.type

        P: Int_Literal: exp -> INT
        R: exp.type = new IntegerType()

        P: Char_Literal: exp -> CHAR
        R: exp.type = new CharType()

        P: Real_Literal: exp -> REAL
        R: exp.type = new RealType()




        ****** STATEMENTS ******
        P: Assignment: stmt -> exp1 exp2
        R: exp2.type.assignTo(exp1.type)

        P: Read: stmt -> exp
        R: exp.type.mustBeReadable()

        P: Write: stmt -> exp
        R: exp.type.mustBeWritable()

        P: WhileStmt: stmt1 -> expression stmt2*
        R: exp.type.mustBeBoolean()

        P: IfElse: stmt1 -> expression stmt2*
        R: exp.type.mustBeBoolean()

        P: Ret: stmt -> exp
        R: exp.type.returnAs(stmt.returnType)
        //TODO: here it must be infered? Idk i did not get it well
        stmt.type will be the return type of the function, get from functionType
     */

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

    /*
        P: Indexing: expression1 -> expression2 expression3
        R: exp1.type = exp2.type.squareBrackets(exp3.type)
     */
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



    //  Statements
    /*
        P: FunctionInvocation: exp1 -> exp2 exp*
        R: exp1.type -> exp2.type.parenthesis(exp*.stream().map(exp -> exp.type).toArray())

        P: FunctionInvocation: stmt -> exp exp*
        R: exp.type.parenthesis(exp*.stream().map(exp -> exp.type).toArray)
     */
    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        functionInvocation.setLvalue(false);
        return null;
    }



}
