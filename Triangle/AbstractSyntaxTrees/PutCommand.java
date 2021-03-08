package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class PutCommand extends Command {
    public Vname V;
    public Expression E;
    public Expression E2;

    public PutCommand(Vname vAST, Expression eAST, Expression e2AST, SourcePosition sourcePosition){
        super(sourcePosition);
        V = vAST;
        E = eAST;
        E2 = e2AST;
    }

    public Object visit(Visitor v, Object o){
        return v.VisitPutCommand(this, o);
    }

}