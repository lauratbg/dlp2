package ast.program;

import ast.ASTNode;
import ast.types.Type;

public interface Definition extends ASTNode {
     String getName();
     int getScope();

     void setScope(int scope);
}
