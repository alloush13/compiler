// Generated from /Users/alloush/Documents/Compiler/ReactJs/src/Antlr/ReactParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReactParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReactParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ReactParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#sourceElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElement(ReactParser.SourceElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ReactParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ReactParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(ReactParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(ReactParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importFromBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromBlock(ReactParser.ImportFromBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#moduleItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleItems(ReactParser.ModuleItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDefault(ReactParser.ImportDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNamespace(ReactParser.ImportNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFrom(ReactParser.ImportFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#aliasName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasName(ReactParser.AliasNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDeclaration(ReactParser.ExportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDefaultDeclaration(ReactParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#exportFromBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportFromBlock(ReactParser.ExportFromBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ReactParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(ReactParser.VariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationList(ReactParser.VariableDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(ReactParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ReactParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ReactParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link ReactParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(ReactParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#varModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarModifier(ReactParser.VarModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ReactParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#withStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStatement(ReactParser.WithStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(ReactParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(ReactParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#caseClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClauses(ReactParser.CaseClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(ReactParser.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#defaultClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClause(ReactParser.DefaultClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#labelledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelledStatement(ReactParser.LabelledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(ReactParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(ReactParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#formalParameterArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterArg(ReactParser.FormalParameterArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameterArg(ReactParser.LastFormalParameterArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(ReactParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#sourceElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElements(ReactParser.SourceElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(ReactParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(ReactParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(ReactParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyExpressionAssignment(ReactParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputedPropertyExpressionAssignment(ReactParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionProperty(ReactParser.FunctionPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link ReactParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyShorthand(ReactParser.PropertyShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyName(ReactParser.PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ReactParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(ReactParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#expressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSequence(ReactParser.ExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(ReactParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringExpression(ReactParser.TemplateStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(ReactParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(ReactParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(ReactParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(ReactParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpression(ReactParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(ReactParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(ReactParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpression(ReactParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDotExpression(ReactParser.MemberDotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberIndexExpression(ReactParser.MemberIndexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(ReactParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsxElementExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElementExpression(ReactParser.JsxElementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsExpression(ReactParser.ArgumentsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(ReactParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(ReactParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAndExpression(ReactParser.BitAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOrExpression(ReactParser.BitOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportExpression(ReactParser.ImportExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(ReactParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitXOrExpression(ReactParser.BitXOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidExpression(ReactParser.VoidExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ReactParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(ReactParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElements(ReactParser.JsxElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxElementBegin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElementBegin(ReactParser.JsxElementBeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElement(ReactParser.JsxElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxSelfClosingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxSelfClosingElement(ReactParser.JsxSelfClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxOpeningElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxOpeningElement(ReactParser.JsxOpeningElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxClosingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxClosingElement(ReactParser.JsxClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxChildren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxChildren(ReactParser.JsxChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxSelfClosingElementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxSelfClosingElementName(ReactParser.JsxSelfClosingElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxOpeningElementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxOpeningElementName(ReactParser.JsxOpeningElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxClosingElementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxClosingElementName(ReactParser.JsxClosingElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttributes(ReactParser.JsxAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxSpreadAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxSpreadAttribute(ReactParser.JsxSpreadAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttribute(ReactParser.JsxAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxAttributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttributeName(ReactParser.JsxAttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttributeValue(ReactParser.JsxAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignable(ReactParser.AssignableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(ReactParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#openBrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenBrace(ReactParser.OpenBraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#objectExpressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpressionSequence(ReactParser.ObjectExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(ReactParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnoymousFunctionDecl}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnoymousFunctionDecl(ReactParser.AnoymousFunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link ReactParser#anoymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(ReactParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionParameters(ReactParser.ArrowFunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionBody(ReactParser.ArrowFunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ReactParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#templateStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringLiteral(ReactParser.TemplateStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#templateStringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringAtom(ReactParser.TemplateStringAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#identifierName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierName(ReactParser.IdentifierNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ReactParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#reservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedWord(ReactParser.ReservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(ReactParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(ReactParser.EosContext ctx);
}