package ASTClasses;

public class ASTStringBuilder {

    public static String addSpace(int parentNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<parentNumber;i++)
            stringBuilder.append("\t");

        return stringBuilder.toString();
    }
    public static String printElement(int parentNumber,String elementName,String elementValue) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ASTStringBuilder.addSpace(parentNumber));
        //if (!elementValue.isEmpty())
            stringBuilder.append(elementName).append(" :\n").append(elementValue);


        return stringBuilder.toString();
    }
}
