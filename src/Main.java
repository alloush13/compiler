import gen.ReactLexer;
import gen.ReactParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
import java.io.FileWriter;
import java.io.IOException;
import ASTClasses.program;
import visitors.BaseVisitor;
public class Main {
    public static void main(String[] args) {

        try{
            String source = "src/Tests/App.js";
            CharStream cs =fromFileName(source);


            ReactLexer lexer = new ReactLexer(cs);
            lexer.removeErrorListeners();
            CommonTokenStream token = new CommonTokenStream(lexer);

            ReactParser parser = new ReactParser(token);
            parser.removeErrorListeners();
            ParseTree tree = parser.program();

            BaseVisitor visitor = new BaseVisitor();
            program program = (program) visitor.visit(tree);
            System.out.println( program.toString());



        }catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }
    }
}