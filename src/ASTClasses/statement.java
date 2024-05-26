package ASTClasses;

public class statement {

//
//    statement
//    : block
//    | variableStatement
//    | importStatement
//    | exportStatement
//    | expressionStatement
//    | ifStatement
//    | iterationStatement
//    | returnStatement
//    | withStatement
//    | labelledStatement
//    | switchStatement
//    | functionDeclaration
//    ;

    private block block;

    public block getBlock() {
        return block;
    }

    public void setBlock(block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder =ASTStringBuilder.buildElement(4,"block",block);


        return stringBuilder.toString();
    }
}
