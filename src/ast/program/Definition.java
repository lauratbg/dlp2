package ast.program;

import ast.ASTNode;
import ast.types.Type;

public interface Definition extends ASTNode {
     String getName();
     int getScope();

     Type getType();
     void setScope(int scope);
}
