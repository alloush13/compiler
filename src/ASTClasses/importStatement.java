package ASTClasses;

public class importStatement {
    //importStatement : Import importFromBlock ;
    private importFromBlock importFromBlock;

    public ASTClasses.importFromBlock getImportFromBlock() {
        return importFromBlock;
    }

    public void setImportFromBlock(ASTClasses.importFromBlock importFromBlock) {
        this.importFromBlock = importFromBlock;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = ASTStringBuilder.buildElement(5,"importFromBlock",importFromBlock);

        return stringBuilder.toString();
    }
}
