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
        StringBuilder stringBuilder = new StringBuilder();
        if (sourceElement!=null) {
            for (int i = 0; i < sourceElement.size(); i++)
            {
                stringBuilder.append(ASTStringBuilder.printElement(2,"sourceElement",sourceElement.get(i).toString()));

            }
        }

        return stringBuilder.toString();
    }
    public String toHtml() {
        StringBuilder htmlBuilder = new StringBuilder();

        return htmlBuilder.toString();
    }
}
