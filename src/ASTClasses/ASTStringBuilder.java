package ASTClasses;


import java.util.List;

public class ASTStringBuilder {



    public static StringBuilder buildElement(int parentNumber,String elementName,Object elementValue) {
        StringBuilder stringBuilder = new StringBuilder();

        if(elementValue!=null){
            stringBuilder.append("\t".repeat(parentNumber));
            stringBuilder.append(elementName).append(" :\n").append(elementValue);
        }



        return stringBuilder;
    }
    public static StringBuilder buildElement(int parentNumber, String elementName, List<?> elementValue) {
        StringBuilder stringBuilder = new StringBuilder();

        if (elementValue!=null) {

            for (int i = 0; i < elementValue.size(); i++)
            {
                stringBuilder.append(ASTStringBuilder.buildElement(parentNumber,elementName,elementValue.get(i)).toString());

            }
        }


        return stringBuilder;
    }
}
