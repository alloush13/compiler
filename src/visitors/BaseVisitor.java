package visitors;
import ASTClasses.program;
import gen.ReactParser;
import gen.ReactParserBaseVisitor;
import ASTClasses.*;
import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends ReactParserBaseVisitor{


    public program visitProgram(ReactParser.ProgramContext ctx) {
        program program=new program();
        if (ctx.sourceElements() != null) {
            program.setSourceElements(visitSourceElements(ctx.sourceElements()));
        }
        return program;
    }
    public sourceElements visitSourceElements(ReactParser.SourceElementsContext ctx) {
        sourceElements sourceElements=new sourceElements();

        if (ctx.sourceElement() != null) {
            List<sourceElement> sourceElement = new ArrayList<>();
            for (int i = 0; i < ctx.sourceElement().size(); i++) {
                sourceElement.add(visitSourceElement(ctx.sourceElement(i)));
            }
            sourceElements.setSourceElement(sourceElement);
        }
        return sourceElements;
    }
    public sourceElement visitSourceElement(ReactParser.SourceElementContext ctx) {
        sourceElement sourceElement = new sourceElement();

        if (ctx.statement() != null) {
            sourceElement.setStatement(visitStatement(ctx.statement()));
        }
        return sourceElement;
    }
    public statement visitStatement(ReactParser.StatementContext ctx) {
        statement statement=new statement();
        if (ctx.block() != null) {
            statement.setBlock(visitBlock(ctx.block()));
        }
        return statement;
    }
    public block visitBlock(ReactParser.BlockContext ctx) {
        block block=new block();
        if (ctx.statementList() != null) {
            block.setStatementList(visitStatementList(ctx.statementList()));
        }
        return block;
    }
    public statementList visitStatementList(ReactParser.StatementListContext ctx) {
        statementList statementList = new statementList();
        if (ctx.statement() != null) {
            List<statement> statement = new ArrayList<>();
            for (int i = 0; i < ctx.statement().size(); i++) {
                statement.add(visitStatement(ctx.statement(i)));
            }
            statementList.setStatement(statement);
        }
        return statementList;
    }






}
