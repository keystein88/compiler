package ast;

<<<<<<< HEAD
import type.*;
import semantics.*;

=======
>>>>>>> daaabcc7c0d1bdd3a143a14a0ce8f99392224858
public class IfStatement extends Statement {
     Expression expr;
     Block blk1;
     Block blk2;
<<<<<<< HEAD
     int line;
     int offset;


    public IfStatement (Expression e, Block b, int l, int o) {
        expr = e;
        blk1 = b;
        blk2 = null;
        line = l;
        offset = o;
    }

    public Expression getCondExpr() {
        return expr;
    }

    public Block getBlock1() {
        return blk1;
    }

    public Block getBlock2() {
        return blk2;
=======


    public IfStatement (Expression e, Block b) {
        expr = e;
        blk1 = b;
        blk2 = null;
>>>>>>> daaabcc7c0d1bdd3a143a14a0ce8f99392224858
    }

    public void setB2 (Block b) {
        blk2 = b;
    }
<<<<<<< HEAD

    public int getLine() {
        return line;
    }

    public int getOffset() {
        return offset;
    }
    
    public void accept (Visitor v) {
        v.visit(this);
    }

    public Type accept (TypeVisitor v) throws SemanticException {
        return v.visit(this);
    }
=======
    public void accept (Visitor v) {
        v.visit(this);
    }
>>>>>>> daaabcc7c0d1bdd3a143a14a0ce8f99392224858
}
