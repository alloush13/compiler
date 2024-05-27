package ASTClasses;

public class importFromBlock {
//    importFromBlock
//    : ((importNamespace)|( aliasName ',' moduleItems)| (moduleItems))importFrom eos
//    | StringLiteral eos
//            ;
    private aliasName aliasName;
    private moduleItems moduleItems;
    private String stringLiteral;
    public ASTClasses.aliasName getAliasName() {
        return aliasName;
    }

    public void setAliasName(ASTClasses.aliasName aliasName) {
        this.aliasName = aliasName;
    }

    public ASTClasses.moduleItems getModuleItems() {
        return moduleItems;
    }

    public void setModuleItems(ASTClasses.moduleItems moduleItems) {
        this.moduleItems = moduleItems;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    @Override
    public String toString() {

        StringBuilder aliasNameStringBuilder = ASTStringBuilder.buildElement(5,"aliasName",aliasName);
        StringBuilder moduleItemsStatementStringBuilder =ASTStringBuilder.buildElement(4,"moduleItems",moduleItems);
        StringBuilder stringLiteralStringBuilder =ASTStringBuilder.buildElement(4,"stringLiteral",stringLiteral);
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder
                .append(aliasNameStringBuilder)
                .append(moduleItemsStatementStringBuilder)
                .append(stringLiteralStringBuilder);
        return stringBuilder.toString();
    }
}
