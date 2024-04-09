package ast.types;

import ast.ASTNode;
import ast.expressions.Expression;

import java.util.List;

public interface Type extends ASTNode {
    Type arithmetic(Type type);

    Type castTo(Type castType);

    Type comparison(Type type);

    Type dot(int line, int column, String field);

    Type logical(Type type);

    Type logical(int line, int column);

    Type modulus(Type type);

    Type minus(int line, int column);

    void assignTo(Type type);

    Type mustBeReadable(int line, int column);

    Type mustBeWritable(int line, int column);

    Type mustBeBoolean(int line, int column);

    void returnAs(int line, int column, Type type);

    Type parenthesis(int line, int column, List<Type> collect);
    boolean isAssignable(Type type);

    Type squareBrackets(Type type);

    int numberOfBytes();
}
