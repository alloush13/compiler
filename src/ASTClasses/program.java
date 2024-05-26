package ASTClasses;

import java.util.List;

public class program {
    //program : HashBangLine? sourceElements? EOF;

    private sourceElements sourceElements;

    public ASTClasses.sourceElements getSourceElements() {
        return sourceElements;
    }

    public void setSourceElements(ASTClasses.sourceElements sourceElements) {
        this.sourceElements = sourceElements;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("program : \n");
        stringBuilder.append(ASTStringBuilder.printElement(1,"sourceElements",sourceElements.toString()));

        return stringBuilder.toString();
    }


    public String toHtml() {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<html>\n");
        htmlBuilder.append("<head>\n");
        htmlBuilder.append("<title>Generated Code</title>\n");
        htmlBuilder.append("</head>\n");
        htmlBuilder.append("<body>\n");
        htmlBuilder.append(sourceElements.toHtml());
        htmlBuilder.append("</body>\n");
        htmlBuilder.append("</html>");
        return htmlBuilder.toString();
    }
}
