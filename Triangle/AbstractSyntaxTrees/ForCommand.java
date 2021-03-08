package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ForCommand extends Command {
    public Vname V;
    public IntegerLiteral I;
    public IntegerLiteral I2;
    public Command C;

    public ForCommand(Vname vAST, IntegerLiteral iAST, IntegerLiteral i2AST, Command cAST, SourcePosition sourcePosition) {
        super(sourcePosition);
        V = vAST;
        I = iAST;
        I2 = i2AST;
        C = cAST;

    }
    public Object visit(Visitor v, Object o){
        return v.VisitForCommand(this, o);
    }

}

