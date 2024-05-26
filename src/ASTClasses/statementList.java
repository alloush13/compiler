package ASTClasses;

import java.util.List;

public class statementList {
    //statementList: statement+ ;

    private List<statement> statement;

    public List<ASTClasses.statement> getStatement() {
        return statement;
    }

    public void setStatement(List<ASTClasses.statement> statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = ASTStringBuilder.buildElement(6,"statement",this.statement);

        return stringBuilder.toString();
    }
}
