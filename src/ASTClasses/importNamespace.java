package ASTClasses;

public class importNamespace {
    //importNamespace: Identifier | (Identifier As Identifier)? |('*' As Identifier);

    private String Identifier ;
    private String asIdentifier ;

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    public String getAsIdentifier() {
        return asIdentifier;
    }

    public void setAsIdentifier(String asIdentifier) {
        this.asIdentifier = asIdentifier;
    }

    @Override
    public String toString() {

        StringBuilder IdentifierStringBuilder = ASTStringBuilder.buildElement(4,"Identifier",this.Identifier);
        StringBuilder asIdentifierStatementStringBuilder =ASTStringBuilder.buildElement(4,"asIdentifier",this.asIdentifier);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder
                .append(IdentifierStringBuilder)
                .append(asIdentifierStatementStringBuilder);
        return stringBuilder.toString();
    }
}
