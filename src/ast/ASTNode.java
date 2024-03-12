package ast;

import semantic.Visitor;

public interface ASTNode {

    public int getLine();
    public int getColumn();

    <TP, TR> TR accept (Visitor<TP, TR> visitor, TP param);
}
