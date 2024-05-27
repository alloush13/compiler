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
        if (ctx.importStatement() != null) {
            statement.setImportStatement(visitImportStatement(ctx.importStatement()));
        }
        return statement;
    }
    public importFromBlock visitBlock(ReactParser.ImportFromBlockContext ctx) {
        importFromBlock importFromBlock=new importFromBlock();
        if (ctx.StringLiteral() != null) {
            importFromBlock.setStringLiteral(ctx.StringLiteral().getText());
        }
        if (ctx.moduleItems()!=null){
            importFromBlock.setModuleItems(visitModuleItems(ctx.moduleItems()));

        }
        if (ctx.importFrom()!=null){
            //importFromBlock.setImportFrom(visitImportFrom(ctx.importFrom()));

        }
        return importFromBlock;
    }
    public moduleItems visitModuleItems(ReactParser.ModuleItemsContext ctx) {
        moduleItems moduleItems = new moduleItems();
        for (int i=0;i<ctx.aliasName().size();i++){
            if (ctx.aliasName(i)!=null){
                //moduleItems.getAliasName().add(visitAliasName(ctx.aliasName(i)));

            }

        }
        return moduleItems;
    }
    public aliasName visitAliasName(ReactParser.AliasNameContext ctx) {
        aliasName aliasName = new aliasName();
        if(ctx.Identifier(1)!=null){
            aliasName.setIdentifier(ctx.Identifier(1).getText());
        }
        if(ctx.Identifier(2)!=null){
            aliasName.setAsIdentifier(ctx.Identifier(2).getText());
        }

        return aliasName;
    }
    public block visitBlock(ReactParser.BlockContext ctx) {
        block block=new block();
        if (ctx.statementList() != null) {
            block.setStatementList(visitStatementList(ctx.statementList()));
        }
        return block;
    }
    public importStatement visitImportStatement(ReactParser.ImportStatementContext ctx) {
        importStatement importStatement=new importStatement();
        if (ctx.importFromBlock() != null) {
            importStatement.setImportFromBlock(visitImportFromBlock(ctx.importFromBlock()));
        }
        return importStatement;
    }
    public importFromBlock visitImportFromBlock(ReactParser.ImportFromBlockContext ctx) {
        importFromBlock importFromBlock=new importFromBlock();
        if (ctx.StringLiteral() != null) {
            importFromBlock.setStringLiteral(ctx.StringLiteral().getText());
        }
        return importFromBlock;
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
