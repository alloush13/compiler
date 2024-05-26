package ASTClasses;

public class block {
    //block : OpenBrace statementList? CloseBrace ;
    private statementList statementList;

    public ASTClasses.statementList getStatementList() {
        return statementList;
    }

    public void setStatementList(ASTClasses.statementList statementList) {
        this.statementList = statementList;
    }

    public String toString() {
        StringBuilder stringBuilder = ASTStringBuilder.buildElement(5,"statementList",statementList);

        return stringBuilder.toString();
    }
}
