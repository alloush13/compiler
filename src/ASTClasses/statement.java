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



    private importStatement importStatement;

    public ASTClasses.importStatement getImportStatement() {
        return importStatement;
    }

    public void setImportStatement(ASTClasses.importStatement importStatement) {
        this.importStatement = importStatement;
    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        StringBuilder blockStringBuilder =ASTStringBuilder.buildElement(4,"block",block);
        StringBuilder importStatementStringBuilder =ASTStringBuilder.buildElement(4,"importStatement",importStatement);

        stringBuilder.append(blockStringBuilder).append(importStatementStringBuilder);
        return stringBuilder.toString();
    }
}
