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
        StringBuilder stringBuilder = new StringBuilder();
        if (this.statement!=null) {
            for (int i = 0; i < this.statement.size(); i++)
            {
                stringBuilder.append(ASTStringBuilder.printElement(6,"statement",this.statement.get(i).toString()));
            }
        }

        return stringBuilder.toString();
    }
}
