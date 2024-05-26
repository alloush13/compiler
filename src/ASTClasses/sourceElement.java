package ASTClasses;

import java.util.List;

public class sourceElement {
    //sourceElement: statement;
    private statement statement;

    public ASTClasses.statement getStatement() {
        return statement;
    }

    public void setStatement(ASTClasses.statement statement) {
        this.statement = statement;
    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ASTStringBuilder.printElement(3,"statement",statement.toString()));
        return stringBuilder.toString();
    }
    public String toHtml() {
        StringBuilder htmlBuilder = new StringBuilder();

        return htmlBuilder.toString();
    }

}
