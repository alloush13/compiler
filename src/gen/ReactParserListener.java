// Generated from /Users/alloush/Documents/Compiler/ReactJs/src/Antlr/ReactParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReactParser}.
 */
public interface ReactParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ReactParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ReactParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(ReactParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(ReactParser.SourceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ReactParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ReactParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ReactParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ReactParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(ReactParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(ReactParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(ReactParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(ReactParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterImportFromBlock(ReactParser.ImportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitImportFromBlock(ReactParser.ImportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#moduleItems}.
	 * @param ctx the parse tree
	 */
	void enterModuleItems(ReactParser.ModuleItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#moduleItems}.
	 * @param ctx the parse tree
	 */
	void exitModuleItems(ReactParser.ModuleItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void enterImportNamespace(ReactParser.ImportNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void exitImportNamespace(ReactParser.ImportNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void enterImportFrom(ReactParser.ImportFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void exitImportFrom(ReactParser.ImportFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void enterAliasName(ReactParser.AliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void exitAliasName(ReactParser.AliasNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportDeclaration(ReactParser.ExportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportDeclaration(ReactParser.ExportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportDefaultDeclaration(ReactParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportDefaultDeclaration(ReactParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#exportFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterExportFromBlock(ReactParser.ExportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#exportFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitExportFromBlock(ReactParser.ExportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ReactParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ReactParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(ReactParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(ReactParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(ReactParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(ReactParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ReactParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ReactParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ReactParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ReactParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ReactParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ReactParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(ReactParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(ReactParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarModifier(ReactParser.VarModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarModifier(ReactParser.VarModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ReactParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ReactParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(ReactParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(ReactParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabelledStatement(ReactParser.LabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabelledStatement(ReactParser.LabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ReactParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ReactParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(ReactParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(ReactParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterArg(ReactParser.FormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterArg(ReactParser.FormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameterArg(ReactParser.LastFormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameterArg(ReactParser.LastFormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(ReactParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(ReactParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(ReactParser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(ReactParser.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(ReactParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(ReactParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(ReactParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(ReactParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(ReactParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(ReactParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyExpressionAssignment(ReactParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyExpressionAssignment(ReactParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterComputedPropertyExpressionAssignment(ReactParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitComputedPropertyExpressionAssignment(ReactParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterFunctionProperty(ReactParser.FunctionPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitFunctionProperty(ReactParser.FunctionPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyShorthand(ReactParser.PropertyShorthandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyShorthand(ReactParser.PropertyShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(ReactParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(ReactParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ReactParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ReactParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(ReactParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(ReactParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(ReactParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(ReactParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(ReactParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(ReactParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringExpression(ReactParser.TemplateStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringExpression(ReactParser.TemplateStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ReactParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ReactParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ReactParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ReactParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(ReactParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(ReactParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(ReactParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(ReactParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(ReactParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(ReactParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(ReactParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(ReactParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(ReactParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(ReactParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(ReactParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(ReactParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberDotExpression(ReactParser.MemberDotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberDotExpression(ReactParser.MemberDotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberIndexExpression(ReactParser.MemberIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberIndexExpression(ReactParser.MemberIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(ReactParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(ReactParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsxElementExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterJsxElementExpression(ReactParser.JsxElementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsxElementExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitJsxElementExpression(ReactParser.JsxElementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpression(ReactParser.ArgumentsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpression(ReactParser.ArgumentsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(ReactParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(ReactParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(ReactParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(ReactParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitAndExpression(ReactParser.BitAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitAndExpression(ReactParser.BitAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitOrExpression(ReactParser.BitOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitOrExpression(ReactParser.BitOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterImportExpression(ReactParser.ImportExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitImportExpression(ReactParser.ImportExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ReactParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ReactParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitXOrExpression(ReactParser.BitXOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitXOrExpression(ReactParser.BitXOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterVoidExpression(ReactParser.VoidExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitVoidExpression(ReactParser.VoidExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ReactParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ReactParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxElements}.
	 * @param ctx the parse tree
	 */
	void enterJsxElements(ReactParser.JsxElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxElements}.
	 * @param ctx the parse tree
	 */
	void exitJsxElements(ReactParser.JsxElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxElementBegin}.
	 * @param ctx the parse tree
	 */
	void enterJsxElementBegin(ReactParser.JsxElementBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxElementBegin}.
	 * @param ctx the parse tree
	 */
	void exitJsxElementBegin(ReactParser.JsxElementBeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void enterJsxElement(ReactParser.JsxElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void exitJsxElement(ReactParser.JsxElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxSelfClosingElement}.
	 * @param ctx the parse tree
	 */
	void enterJsxSelfClosingElement(ReactParser.JsxSelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxSelfClosingElement}.
	 * @param ctx the parse tree
	 */
	void exitJsxSelfClosingElement(ReactParser.JsxSelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxOpeningElement}.
	 * @param ctx the parse tree
	 */
	void enterJsxOpeningElement(ReactParser.JsxOpeningElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxOpeningElement}.
	 * @param ctx the parse tree
	 */
	void exitJsxOpeningElement(ReactParser.JsxOpeningElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxClosingElement}.
	 * @param ctx the parse tree
	 */
	void enterJsxClosingElement(ReactParser.JsxClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxClosingElement}.
	 * @param ctx the parse tree
	 */
	void exitJsxClosingElement(ReactParser.JsxClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxChildren}.
	 * @param ctx the parse tree
	 */
	void enterJsxChildren(ReactParser.JsxChildrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxChildren}.
	 * @param ctx the parse tree
	 */
	void exitJsxChildren(ReactParser.JsxChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxSelfClosingElementName}.
	 * @param ctx the parse tree
	 */
	void enterJsxSelfClosingElementName(ReactParser.JsxSelfClosingElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxSelfClosingElementName}.
	 * @param ctx the parse tree
	 */
	void exitJsxSelfClosingElementName(ReactParser.JsxSelfClosingElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxOpeningElementName}.
	 * @param ctx the parse tree
	 */
	void enterJsxOpeningElementName(ReactParser.JsxOpeningElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxOpeningElementName}.
	 * @param ctx the parse tree
	 */
	void exitJsxOpeningElementName(ReactParser.JsxOpeningElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxClosingElementName}.
	 * @param ctx the parse tree
	 */
	void enterJsxClosingElementName(ReactParser.JsxClosingElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxClosingElementName}.
	 * @param ctx the parse tree
	 */
	void exitJsxClosingElementName(ReactParser.JsxClosingElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxAttributes}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttributes(ReactParser.JsxAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxAttributes}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttributes(ReactParser.JsxAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxSpreadAttribute}.
	 * @param ctx the parse tree
	 */
	void enterJsxSpreadAttribute(ReactParser.JsxSpreadAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxSpreadAttribute}.
	 * @param ctx the parse tree
	 */
	void exitJsxSpreadAttribute(ReactParser.JsxSpreadAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttribute(ReactParser.JsxAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttribute(ReactParser.JsxAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxAttributeName}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttributeName(ReactParser.JsxAttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxAttributeName}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttributeName(ReactParser.JsxAttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttributeValue(ReactParser.JsxAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttributeValue(ReactParser.JsxAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignable(ReactParser.AssignableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignable(ReactParser.AssignableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(ReactParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(ReactParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#openBrace}.
	 * @param ctx the parse tree
	 */
	void enterOpenBrace(ReactParser.OpenBraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#openBrace}.
	 * @param ctx the parse tree
	 */
	void exitOpenBrace(ReactParser.OpenBraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#objectExpressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpressionSequence(ReactParser.ObjectExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#objectExpressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpressionSequence(ReactParser.ObjectExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(ReactParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(ReactParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnoymousFunctionDecl}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnoymousFunctionDecl(ReactParser.AnoymousFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnoymousFunctionDecl}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnoymousFunctionDecl(ReactParser.AnoymousFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(ReactParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(ReactParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionParameters(ReactParser.ArrowFunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionParameters(ReactParser.ArrowFunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionBody(ReactParser.ArrowFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionBody(ReactParser.ArrowFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ReactParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ReactParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#templateStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringLiteral(ReactParser.TemplateStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#templateStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringLiteral(ReactParser.TemplateStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#templateStringAtom}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringAtom(ReactParser.TemplateStringAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#templateStringAtom}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringAtom(ReactParser.TemplateStringAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(ReactParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(ReactParser.EosContext ctx);
}