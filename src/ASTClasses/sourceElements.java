package ASTClasses;

import java.util.List;

public class sourceElements {
    //sourceElements: sourceElement+ ;
    private List<sourceElement> sourceElement;

    public List<ASTClasses.sourceElement> getSourceElement() {
        return sourceElement;
    }

    public void setSourceElement(List<ASTClasses.sourceElement> sourceElement) {
        this.sourceElement = sourceElement;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = ASTStringBuilder.buildElement(2,"sourceElement",sourceElement);


        return stringBuilder.toString();
    }
    public String toHtml() {
        StringBuilder htmlBuilder = new StringBuilder();

        return htmlBuilder.toString();
    }
}
