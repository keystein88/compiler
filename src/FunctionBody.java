package ast;

<<<<<<< HEAD
import semantics.*;
import type.*;

=======
>>>>>>> daaabcc7c0d1bdd3a143a14a0ce8f99392224858
public class FunctionBody extends ASTNode {

     public VariableDeclarationList vdl;
     public StatementList stml;


    public FunctionBody(VariableDeclarationList v,StatementList s){
        vdl = v;
        stml = s;
    }

    //two kinds of nodes in functionbody : VariableDeclaration or Statement
    public void addElement(VariableDeclaration vd) {
        vdl.addElement(vd);
    }

    public void addElement (Statement s) {
        stml.addElement(s);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

<<<<<<< HEAD
    public Type accept(TypeVisitor v) throws SemanticException{
        return v.visit(this);
    }
=======
>>>>>>> daaabcc7c0d1bdd3a143a14a0ce8f99392224858
}
