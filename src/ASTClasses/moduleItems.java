package ASTClasses;

import java.util.List;

public class moduleItems {
    //moduleItems: OpenBrace (aliasName ',')* (aliasName ','?)? CloseBrace;
    private List<aliasName> aliasName;

    public List<ASTClasses.aliasName> getAliasName() {
        return aliasName;
    }

    public void setAliasName(List<ASTClasses.aliasName> aliasName) {
        this.aliasName = aliasName;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = ASTStringBuilder.buildElement(2,"aliasName",this.aliasName);


        return stringBuilder.toString();
    }
}
