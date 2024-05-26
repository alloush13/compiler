// Generated from /Users/alloush/Documents/Compiler/ReactJs/src/Antlr/ReactParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReactParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HashBangLine=1, JsxElementBegin=2, OpenBracket=3, CloseBracket=4, OpenParen=5, 
		CloseParen=6, OpenBrace=7, CloseBrace=8, SemiColon=9, Comma=10, Assign=11, 
		QuestionMark=12, Colon=13, Ellipsis=14, Dot=15, PlusPlus=16, MinusMinus=17, 
		Plus=18, Minus=19, BitNot=20, Not=21, Multiply=22, Divide=23, Modulus=24, 
		Power=25, NullCoalesce=26, Hashtag=27, RightShiftArithmetic=28, LeftShiftArithmetic=29, 
		RightShiftLogical=30, LessThan=31, MoreThan=32, LessThanEquals=33, GreaterThanEquals=34, 
		Equals_=35, NotEquals=36, IdentityEquals=37, IdentityNotEquals=38, BitAnd=39, 
		BitXOr=40, BitOr=41, And=42, Or=43, MultiplyAssign=44, DivideAssign=45, 
		ModulusAssign=46, PlusAssign=47, MinusAssign=48, LeftShiftArithmeticAssign=49, 
		RightShiftArithmeticAssign=50, RightShiftLogicalAssign=51, BitAndAssign=52, 
		BitXorAssign=53, BitOrAssign=54, PowerAssign=55, ARROW=56, NullLiteral=57, 
		BooleanLiteral=58, DecimalLiteral=59, HexIntegerLiteral=60, OctalIntegerLiteral=61, 
		OctalIntegerLiteral2=62, BinaryIntegerLiteral=63, BigHexIntegerLiteral=64, 
		BigOctalIntegerLiteral=65, BigBinaryIntegerLiteral=66, BigDecimalIntegerLiteral=67, 
		Break=68, Do=69, Instanceof=70, Typeof=71, Case=72, Else=73, New=74, Var=75, 
		Catch=76, Finally=77, Return=78, Void=79, Continue=80, For=81, Switch=82, 
		While=83, Debugger=84, Function_=85, This=86, With=87, Default=88, If=89, 
		Throw=90, Delete=91, In=92, Try=93, As=94, From=95, YieldStar=96, Class=97, 
		Enum=98, Extends=99, Super=100, Const=101, Export=102, Import=103, Async=104, 
		Await=105, Implements=106, Let=107, Private=108, Public=109, Interface=110, 
		Package=111, Protected=112, Static=113, Yield=114, Identifier=115, StringLiteral=116, 
		LinkLiteral=117, BackTick=118, WhiteSpaces=119, LineTerminator=120, JsxComment=121, 
		MultiLineComment=122, SingleLineComment=123, RegularExpressionLiteral=124, 
		HtmlComment=125, CDataComment=126, UnexpectedCharacter=127, CDATA=128, 
		TemplateStringStartExpression=129, TemplateStringAtom=130, JsxOpeningElementBegin=131, 
		JsxOpeningElementEnd=132, JsxOpeningElementSlashEnd=133, JsxAssign=134, 
		JsxOpeningElementOpenBrace=135, JsxOpeningElementId=136, JsxOpeningElementWhiteSpaces=137, 
		JsxOpeningElementLineTerminator=138, JsxAttributeValue=139, HtmlChardata=140, 
		JsxChildrenOpeningElementBegin=141, JsxChildrenClosingElementSlashBegin=142, 
		JsxChildrenOpenBrace=143, JsxClosingElementEnd=144, JsxClosingElementId=145, 
		JsxClosingElementLineTerminator=146, JsxClosingElementWhiteSpaces=147;
	public static final int
		RULE_program = 0, RULE_sourceElement = 1, RULE_statement = 2, RULE_block = 3, 
		RULE_statementList = 4, RULE_importStatement = 5, RULE_importFromBlock = 6, 
		RULE_moduleItems = 7, RULE_importDefault = 8, RULE_importNamespace = 9, 
		RULE_importFrom = 10, RULE_aliasName = 11, RULE_exportStatement = 12, 
		RULE_exportFromBlock = 13, RULE_declaration = 14, RULE_variableStatement = 15, 
		RULE_variableDeclarationList = 16, RULE_variableDeclaration = 17, RULE_expressionStatement = 18, 
		RULE_ifStatement = 19, RULE_iterationStatement = 20, RULE_varModifier = 21, 
		RULE_returnStatement = 22, RULE_withStatement = 23, RULE_switchStatement = 24, 
		RULE_caseBlock = 25, RULE_caseClauses = 26, RULE_caseClause = 27, RULE_defaultClause = 28, 
		RULE_labelledStatement = 29, RULE_functionDeclaration = 30, RULE_formalParameterList = 31, 
		RULE_formalParameterArg = 32, RULE_lastFormalParameterArg = 33, RULE_functionBody = 34, 
		RULE_sourceElements = 35, RULE_arrayLiteral = 36, RULE_elementList = 37, 
		RULE_arrayElement = 38, RULE_propertyAssignment = 39, RULE_propertyName = 40, 
		RULE_arguments = 41, RULE_argument = 42, RULE_expressionSequence = 43, 
		RULE_singleExpression = 44, RULE_jsxElements = 45, RULE_jsxElementBegin = 46, 
		RULE_jsxElement = 47, RULE_jsxSelfClosingElement = 48, RULE_jsxOpeningElement = 49, 
		RULE_jsxClosingElement = 50, RULE_jsxChildren = 51, RULE_jsxSelfClosingElementName = 52, 
		RULE_jsxOpeningElementName = 53, RULE_jsxClosingElementName = 54, RULE_jsxAttributes = 55, 
		RULE_jsxSpreadAttribute = 56, RULE_jsxAttribute = 57, RULE_jsxAttributeName = 58, 
		RULE_jsxAttributeValue = 59, RULE_assignable = 60, RULE_objectLiteral = 61, 
		RULE_openBrace = 62, RULE_objectExpressionSequence = 63, RULE_anoymousFunction = 64, 
		RULE_arrowFunctionParameters = 65, RULE_arrowFunctionBody = 66, RULE_literal = 67, 
		RULE_templateStringLiteral = 68, RULE_templateStringAtom = 69, RULE_identifierName = 70, 
		RULE_identifier = 71, RULE_reservedWord = 72, RULE_keyword = 73, RULE_eos = 74;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sourceElement", "statement", "block", "statementList", "importStatement", 
			"importFromBlock", "moduleItems", "importDefault", "importNamespace", 
			"importFrom", "aliasName", "exportStatement", "exportFromBlock", "declaration", 
			"variableStatement", "variableDeclarationList", "variableDeclaration", 
			"expressionStatement", "ifStatement", "iterationStatement", "varModifier", 
			"returnStatement", "withStatement", "switchStatement", "caseBlock", "caseClauses", 
			"caseClause", "defaultClause", "labelledStatement", "functionDeclaration", 
			"formalParameterList", "formalParameterArg", "lastFormalParameterArg", 
			"functionBody", "sourceElements", "arrayLiteral", "elementList", "arrayElement", 
			"propertyAssignment", "propertyName", "arguments", "argument", "expressionSequence", 
			"singleExpression", "jsxElements", "jsxElementBegin", "jsxElement", "jsxSelfClosingElement", 
			"jsxOpeningElement", "jsxClosingElement", "jsxChildren", "jsxSelfClosingElementName", 
			"jsxOpeningElementName", "jsxClosingElementName", "jsxAttributes", "jsxSpreadAttribute", 
			"jsxAttribute", "jsxAttributeName", "jsxAttributeValue", "assignable", 
			"objectLiteral", "openBrace", "objectExpressionSequence", "anoymousFunction", 
			"arrowFunctionParameters", "arrowFunctionBody", "literal", "templateStringLiteral", 
			"templateStringAtom", "identifierName", "identifier", "reservedWord", 
			"keyword", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'['", "']'", "'('", "')'", null, "'}'", "';'", "','", 
			null, "'?'", "':'", "'...'", "'.'", "'++'", "'--'", "'+'", "'-'", "'~'", 
			"'!'", "'*'", "'/'", "'%'", "'**'", "'??'", "'#'", "'>>'", "'<<'", "'>>>'", 
			null, null, "'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", "'&'", 
			"'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", "'-='", 
			"'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", "'**='", "'=>'", 
			"'null'", null, null, null, null, null, null, null, null, null, null, 
			"'break'", "'do'", "'instanceof'", "'typeof'", "'case'", "'else'", "'new'", 
			"'var'", "'catch'", "'finally'", "'return'", "'void'", "'continue'", 
			"'for'", "'switch'", "'while'", "'debugger'", "'function'", "'this'", 
			"'with'", "'default'", "'if'", "'throw'", "'delete'", "'in'", "'try'", 
			"'as'", "'from'", "'yield*'", "'class'", "'enum'", "'extends'", "'super'", 
			"'const'", "'export'", "'import'", "'async'", "'await'", "'implements'", 
			"'let'", "'private'", "'public'", "'interface'", "'package'", "'protected'", 
			"'static'", "'yield'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'${'", null, null, null, "'/>'", 
			null, null, null, null, null, null, null, null, "'</'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HashBangLine", "JsxElementBegin", "OpenBracket", "CloseBracket", 
			"OpenParen", "CloseParen", "OpenBrace", "CloseBrace", "SemiColon", "Comma", 
			"Assign", "QuestionMark", "Colon", "Ellipsis", "Dot", "PlusPlus", "MinusMinus", 
			"Plus", "Minus", "BitNot", "Not", "Multiply", "Divide", "Modulus", "Power", 
			"NullCoalesce", "Hashtag", "RightShiftArithmetic", "LeftShiftArithmetic", 
			"RightShiftLogical", "LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", 
			"Equals_", "NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", 
			"BitXOr", "BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
			"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
			"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"PowerAssign", "ARROW", "NullLiteral", "BooleanLiteral", "DecimalLiteral", 
			"HexIntegerLiteral", "OctalIntegerLiteral", "OctalIntegerLiteral2", "BinaryIntegerLiteral", 
			"BigHexIntegerLiteral", "BigOctalIntegerLiteral", "BigBinaryIntegerLiteral", 
			"BigDecimalIntegerLiteral", "Break", "Do", "Instanceof", "Typeof", "Case", 
			"Else", "New", "Var", "Catch", "Finally", "Return", "Void", "Continue", 
			"For", "Switch", "While", "Debugger", "Function_", "This", "With", "Default", 
			"If", "Throw", "Delete", "In", "Try", "As", "From", "YieldStar", "Class", 
			"Enum", "Extends", "Super", "Const", "Export", "Import", "Async", "Await", 
			"Implements", "Let", "Private", "Public", "Interface", "Package", "Protected", 
			"Static", "Yield", "Identifier", "StringLiteral", "LinkLiteral", "BackTick", 
			"WhiteSpaces", "LineTerminator", "JsxComment", "MultiLineComment", "SingleLineComment", 
			"RegularExpressionLiteral", "HtmlComment", "CDataComment", "UnexpectedCharacter", 
			"CDATA", "TemplateStringStartExpression", "TemplateStringAtom", "JsxOpeningElementBegin", 
			"JsxOpeningElementEnd", "JsxOpeningElementSlashEnd", "JsxAssign", "JsxOpeningElementOpenBrace", 
			"JsxOpeningElementId", "JsxOpeningElementWhiteSpaces", "JsxOpeningElementLineTerminator", 
			"JsxAttributeValue", "HtmlChardata", "JsxChildrenOpeningElementBegin", 
			"JsxChildrenClosingElementSlashBegin", "JsxChildrenOpenBrace", "JsxClosingElementEnd", 
			"JsxClosingElementId", "JsxClosingElementLineTerminator", "JsxClosingElementWhiteSpaces"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ReactParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReactParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ReactParser.EOF, 0); }
		public TerminalNode HashBangLine() { return getToken(ReactParser.HashBangLine, 0); }
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HashBangLine) {
				{
				setState(150);
				match(HashBangLine);
				}
			}

			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 72632643920878809L) != 0) || _la==JsxChildrenOpeningElementBegin) {
				{
				setState(153);
				sourceElements();
				}
			}

			setState(156);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceElementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SourceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSourceElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSourceElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSourceElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementContext sourceElement() throws RecognitionException {
		SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public LabelledStatementContext labelledStatement() {
			return getRuleContext(LabelledStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				importStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				exportStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				expressionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				ifStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				iterationStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(167);
				returnStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(168);
				withStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(169);
				labelledStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(170);
				switchStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(171);
				functionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(OpenBrace);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 72632643920878809L) != 0) || _la==JsxChildrenOpeningElementBegin) {
				{
				setState(175);
				statementList();
				}
			}

			setState(178);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				statement();
				}
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 72632643920878809L) != 0) || _la==JsxChildrenOpeningElementBegin );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(ReactParser.Import, 0); }
		public ImportFromBlockContext importFromBlock() {
			return getRuleContext(ImportFromBlockContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(Import);
			setState(186);
			importFromBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromBlockContext extends ParserRuleContext {
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public ModuleItemsContext moduleItems() {
			return getRuleContext(ModuleItemsContext.class,0);
		}
		public ImportDefaultContext importDefault() {
			return getRuleContext(ImportDefaultContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(ReactParser.StringLiteral, 0); }
		public ImportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportFromBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportFromBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportFromBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromBlockContext importFromBlock() throws RecognitionException {
		ImportFromBlockContext _localctx = new ImportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importFromBlock);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
			case Multiply:
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Async:
			case Await:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(188);
					importDefault();
					}
					break;
				}
				setState(193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Multiply:
				case NullLiteral:
				case BooleanLiteral:
				case Break:
				case Do:
				case Instanceof:
				case Typeof:
				case Case:
				case Else:
				case New:
				case Var:
				case Catch:
				case Finally:
				case Return:
				case Void:
				case Continue:
				case For:
				case Switch:
				case While:
				case Debugger:
				case Function_:
				case This:
				case With:
				case Default:
				case If:
				case Throw:
				case Delete:
				case In:
				case Try:
				case As:
				case From:
				case Class:
				case Enum:
				case Extends:
				case Super:
				case Const:
				case Export:
				case Import:
				case Async:
				case Await:
				case Implements:
				case Let:
				case Private:
				case Public:
				case Interface:
				case Package:
				case Protected:
				case Static:
				case Yield:
				case Identifier:
					{
					setState(191);
					importNamespace();
					}
					break;
				case OpenBrace:
					{
					setState(192);
					moduleItems();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(195);
				importFrom();
				setState(196);
				eos();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(StringLiteral);
				setState(199);
				eos();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleItemsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<AliasNameContext> aliasName() {
			return getRuleContexts(AliasNameContext.class);
		}
		public AliasNameContext aliasName(int i) {
			return getRuleContext(AliasNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ModuleItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterModuleItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitModuleItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitModuleItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleItemsContext moduleItems() throws RecognitionException {
		ModuleItemsContext _localctx = new ModuleItemsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moduleItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(OpenBrace);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					aliasName();
					setState(204);
					match(Comma);
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 576460202547607555L) != 0)) {
				{
				setState(211);
				aliasName();
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(212);
					match(Comma);
					}
				}

				}
			}

			setState(217);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDefaultContext extends ParserRuleContext {
		public AliasNameContext aliasName() {
			return getRuleContext(AliasNameContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ReactParser.Comma, 0); }
		public ImportDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDefaultContext importDefault() throws RecognitionException {
		ImportDefaultContext _localctx = new ImportDefaultContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			aliasName();
			setState(220);
			match(Comma);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportNamespaceContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
		public List<IdentifierNameContext> identifierName() {
			return getRuleContexts(IdentifierNameContext.class);
		}
		public IdentifierNameContext identifierName(int i) {
			return getRuleContext(IdentifierNameContext.class,i);
		}
		public TerminalNode As() { return getToken(ReactParser.As, 0); }
		public ImportNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNamespaceContext importNamespace() throws RecognitionException {
		ImportNamespaceContext _localctx = new ImportNamespaceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importNamespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
				{
				setState(222);
				match(Multiply);
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Async:
			case Await:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
			case Identifier:
				{
				setState(223);
				identifierName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(226);
				match(As);
				setState(227);
				identifierName();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromContext extends ParserRuleContext {
		public TerminalNode From() { return getToken(ReactParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(ReactParser.StringLiteral, 0); }
		public ImportFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromContext importFrom() throws RecognitionException {
		ImportFromContext _localctx = new ImportFromContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_importFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(From);
			setState(231);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasNameContext extends ParserRuleContext {
		public List<IdentifierNameContext> identifierName() {
			return getRuleContexts(IdentifierNameContext.class);
		}
		public IdentifierNameContext identifierName(int i) {
			return getRuleContext(IdentifierNameContext.class,i);
		}
		public TerminalNode As() { return getToken(ReactParser.As, 0); }
		public AliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAliasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAliasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasNameContext aliasName() throws RecognitionException {
		AliasNameContext _localctx = new AliasNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_aliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			identifierName();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(234);
				match(As);
				setState(235);
				identifierName();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends ParserRuleContext {
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
	 
		public ExportStatementContext() { }
		public void copyFrom(ExportStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportDefaultDeclarationContext extends ExportStatementContext {
		public TerminalNode Export() { return getToken(ReactParser.Export, 0); }
		public TerminalNode Default() { return getToken(ReactParser.Default, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(ReactParser.SemiColon, 0); }
		public ExportDefaultDeclarationContext(ExportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExportDefaultDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExportDefaultDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExportDefaultDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportDeclarationContext extends ExportStatementContext {
		public TerminalNode Export() { return getToken(ReactParser.Export, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExportFromBlockContext exportFromBlock() {
			return getRuleContext(ExportFromBlockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExportDeclarationContext(ExportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exportStatement);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ExportDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(Export);
				setState(241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(239);
					exportFromBlock();
					}
					break;
				case 2:
					{
					setState(240);
					declaration();
					}
					break;
				}
				setState(243);
				eos();
				}
				break;
			case 2:
				_localctx = new ExportDefaultDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(Export);
				setState(246);
				match(Default);
				setState(247);
				singleExpression(0);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(248);
					match(SemiColon);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportFromBlockContext extends ParserRuleContext {
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ModuleItemsContext moduleItems() {
			return getRuleContext(ModuleItemsContext.class,0);
		}
		public ExportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportFromBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExportFromBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExportFromBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExportFromBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportFromBlockContext exportFromBlock() throws RecognitionException {
		ExportFromBlockContext _localctx = new ExportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exportFromBlock);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Async:
			case Await:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				importNamespace();
				setState(254);
				importFrom();
				setState(255);
				eos();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				moduleItems();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==From) {
					{
					setState(258);
					importFrom();
					}
				}

				setState(261);
				eos();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaration);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
			case Const:
			case Let:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				variableStatement();
				}
				break;
			case Function_:
			case Async:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				functionDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableStatementContext extends ParserRuleContext {
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			variableDeclarationList();
			setState(270);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationListContext extends ParserRuleContext {
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			varModifier();
			setState(273);
			variableDeclaration();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(274);
				match(Comma);
				setState(275);
				variableDeclaration();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			assignable();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(282);
				match(Assign);
				setState(283);
				singleExpression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			expressionSequence();
			setState(287);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(ReactParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(ReactParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(If);
			setState(290);
			match(OpenParen);
			setState(291);
			expressionSequence();
			setState(292);
			match(CloseParen);
			setState(293);
			statement();
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(294);
				match(Else);
				setState(295);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ReactParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(ReactParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ReactParser.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ForStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ReactParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode In() { return getToken(ReactParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ForInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitForInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_iterationStatement);
		int _la;
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(For);
				setState(299);
				match(OpenParen);
				setState(302);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JsxElementBegin:
				case OpenBracket:
				case OpenParen:
				case OpenBrace:
				case Ellipsis:
				case NullLiteral:
				case BooleanLiteral:
				case DecimalLiteral:
				case Void:
				case Function_:
				case This:
				case Import:
				case Async:
				case Identifier:
				case StringLiteral:
				case BackTick:
				case RegularExpressionLiteral:
				case JsxOpeningElementBegin:
				case JsxChildrenOpeningElementBegin:
					{
					setState(300);
					expressionSequence();
					}
					break;
				case Var:
				case Const:
				case Let:
					{
					setState(301);
					variableDeclarationList();
					}
					break;
				case SemiColon:
					break;
				default:
					break;
				}
				setState(304);
				match(SemiColon);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 4616225558391423169L) != 0)) {
					{
					setState(305);
					expressionSequence();
					}
				}

				setState(308);
				match(SemiColon);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 4616225558391423169L) != 0)) {
					{
					setState(309);
					expressionSequence();
					}
				}

				setState(312);
				match(CloseParen);
				setState(313);
				statement();
				}
				break;
			case 2:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(For);
				setState(315);
				match(OpenParen);
				setState(318);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JsxElementBegin:
				case OpenBracket:
				case OpenParen:
				case OpenBrace:
				case NullLiteral:
				case BooleanLiteral:
				case DecimalLiteral:
				case Void:
				case Function_:
				case This:
				case Import:
				case Async:
				case Identifier:
				case StringLiteral:
				case BackTick:
				case RegularExpressionLiteral:
				case JsxOpeningElementBegin:
				case JsxChildrenOpeningElementBegin:
					{
					setState(316);
					singleExpression(0);
					}
					break;
				case Var:
				case Const:
				case Let:
					{
					setState(317);
					variableDeclarationList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(320);
				match(In);
				setState(321);
				expressionSequence();
				setState(322);
				match(CloseParen);
				setState(323);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarModifierContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(ReactParser.Var, 0); }
		public TerminalNode Let() { return getToken(ReactParser.Let, 0); }
		public TerminalNode Const() { return getToken(ReactParser.Const, 0); }
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVarModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVarModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVarModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_varModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 4362076161L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ReactParser.Return, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public JsxElementsContext jsxElements() {
			return getRuleContext(JsxElementsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnStatement);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(Return);
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(330);
					expressionSequence();
					}
					break;
				}
				setState(333);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(Return);
				setState(335);
				match(OpenParen);
				setState(336);
				jsxElements();
				setState(337);
				match(CloseParen);
				setState(338);
				eos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode With() { return getToken(ReactParser.With, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWithStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWithStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWithStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(With);
			setState(343);
			match(OpenParen);
			setState(344);
			expressionSequence();
			setState(345);
			match(CloseParen);
			setState(346);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(ReactParser.Switch, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(Switch);
			setState(349);
			match(OpenParen);
			setState(350);
			expressionSequence();
			setState(351);
			match(CloseParen);
			setState(352);
			caseBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<CaseClausesContext> caseClauses() {
			return getRuleContexts(CaseClausesContext.class);
		}
		public CaseClausesContext caseClauses(int i) {
			return getRuleContext(CaseClausesContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCaseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(OpenBrace);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(355);
				caseClauses();
				}
			}

			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(358);
				defaultClause();
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(359);
					caseClauses();
					}
				}

				}
			}

			setState(364);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCaseClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCaseClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCaseClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(366);
				caseClause();
				}
				}
				setState(369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(ReactParser.Case, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(Case);
			setState(372);
			expressionSequence();
			setState(373);
			match(Colon);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 72632643920878809L) != 0) || _la==JsxChildrenOpeningElementBegin) {
				{
				setState(374);
				statementList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(ReactParser.Default, 0); }
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDefaultClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDefaultClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDefaultClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_defaultClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(Default);
			setState(378);
			match(Colon);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 72632643920878809L) != 0) || _la==JsxChildrenOpeningElementBegin) {
				{
				setState(379);
				statementList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelledStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLabelledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLabelledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelledStatementContext labelledStatement() throws RecognitionException {
		LabelledStatementContext _localctx = new LabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_labelledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			identifier();
			setState(383);
			match(Colon);
			setState(384);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(ReactParser.Function_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TerminalNode Async() { return getToken(ReactParser.Async, 0); }
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Async) {
				{
				setState(386);
				match(Async);
				}
			}

			setState(389);
			match(Function_);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Multiply) {
				{
				setState(390);
				match(Multiply);
				}
			}

			setState(393);
			identifier();
			setState(394);
			match(OpenParen);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16520L) != 0) || _la==Async || _la==Identifier) {
				{
				setState(395);
				formalParameterList();
				}
			}

			setState(398);
			match(CloseParen);
			setState(399);
			match(OpenBrace);
			setState(400);
			functionBody();
			setState(401);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterArgContext> formalParameterArg() {
			return getRuleContexts(FormalParameterArgContext.class);
		}
		public FormalParameterArgContext formalParameterArg(int i) {
			return getRuleContext(FormalParameterArgContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public LastFormalParameterArgContext lastFormalParameterArg() {
			return getRuleContext(LastFormalParameterArgContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
			case OpenBrace:
			case Async:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				formalParameterArg();
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(404);
						match(Comma);
						setState(405);
						formalParameterArg();
						}
						} 
					}
					setState(410);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(411);
					match(Comma);
					setState(412);
					lastFormalParameterArg();
					}
				}

				}
				break;
			case Ellipsis:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				lastFormalParameterArg();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterArgContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public FormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFormalParameterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFormalParameterArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFormalParameterArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterArgContext formalParameterArg() throws RecognitionException {
		FormalParameterArgContext _localctx = new FormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			assignable();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(419);
				match(Assign);
				setState(420);
				singleExpression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LastFormalParameterArgContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(ReactParser.Ellipsis, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public LastFormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameterArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLastFormalParameterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLastFormalParameterArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLastFormalParameterArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterArgContext lastFormalParameterArg() throws RecognitionException {
		LastFormalParameterArgContext _localctx = new LastFormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_lastFormalParameterArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(Ellipsis);
			setState(424);
			singleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 72632643920878809L) != 0) || _la==JsxChildrenOpeningElementBegin) {
				{
				setState(426);
				sourceElements();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceElementsContext extends ParserRuleContext {
		public List<SourceElementContext> sourceElement() {
			return getRuleContexts(SourceElementContext.class);
		}
		public SourceElementContext sourceElement(int i) {
			return getRuleContext(SourceElementContext.class,i);
		}
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSourceElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSourceElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSourceElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sourceElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(429);
				sourceElement();
				}
				}
				setState(432); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 72632643920878809L) != 0) || _la==JsxChildrenOpeningElementBegin );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(ReactParser.OpenBracket, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(ReactParser.CloseBracket, 0); }
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(434);
			match(OpenBracket);
			setState(435);
			elementList();
			setState(436);
			match(CloseBracket);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementListContext extends ParserRuleContext {
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(438);
					match(Comma);
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 4616225558391423169L) != 0)) {
				{
				setState(444);
				arrayElement();
				}
			}

			setState(455);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(448); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(447);
						match(Comma);
						}
						}
						setState(450); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					setState(452);
					arrayElement();
					}
					} 
				}
				setState(457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(458);
				match(Comma);
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(ReactParser.Ellipsis, 0); }
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(464);
				match(Ellipsis);
				}
			}

			setState(467);
			singleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
	 
		public PropertyAssignmentContext() { }
		public void copyFrom(PropertyAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPropertyExpressionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPropertyExpressionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComputedPropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public TerminalNode OpenBracket() { return getToken(ReactParser.OpenBracket, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode CloseBracket() { return getToken(ReactParser.CloseBracket, 0); }
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public ComputedPropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComputedPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComputedPropertyExpressionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComputedPropertyExpressionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyShorthandContext extends PropertyAssignmentContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(ReactParser.Ellipsis, 0); }
		public PropertyShorthandContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPropertyShorthand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPropertyShorthand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPropertyShorthand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionPropertyContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TerminalNode Async() { return getToken(ReactParser.Async, 0); }
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionPropertyContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_propertyAssignment);
		int _la;
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				propertyName();
				setState(470);
				match(Colon);
				setState(471);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new ComputedPropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(OpenBracket);
				setState(474);
				singleExpression(0);
				setState(475);
				match(CloseBracket);
				setState(476);
				match(Colon);
				setState(477);
				singleExpression(0);
				}
				break;
			case 3:
				_localctx = new FunctionPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(479);
					match(Async);
					}
					break;
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiply) {
					{
					setState(482);
					match(Multiply);
					}
				}

				setState(485);
				propertyName();
				setState(486);
				match(OpenParen);
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16520L) != 0) || _la==Async || _la==Identifier) {
					{
					setState(487);
					formalParameterList();
					}
				}

				setState(490);
				match(CloseParen);
				setState(491);
				match(OpenBrace);
				setState(492);
				functionBody();
				setState(493);
				match(CloseBrace);
				}
				break;
			case 4:
				_localctx = new PropertyShorthandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(495);
					match(Ellipsis);
					}
				}

				setState(498);
				singleExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(ReactParser.StringLiteral, 0); }
		public TerminalNode OpenBracket() { return getToken(ReactParser.OpenBracket, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(ReactParser.CloseBracket, 0); }
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_propertyName);
		try {
			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Async:
			case Await:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(StringLiteral);
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				match(OpenBracket);
				setState(504);
				singleExpression(0);
				setState(505);
				match(CloseBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(OpenParen);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 4616225558391423169L) != 0)) {
				{
				setState(510);
				argument();
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(511);
						match(Comma);
						setState(512);
						argument();
						}
						} 
					}
					setState(517);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(518);
					match(Comma);
					}
				}

				}
			}

			setState(523);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(ReactParser.Ellipsis, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(525);
				match(Ellipsis);
				}
			}

			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(528);
				singleExpression(0);
				}
				break;
			case 2:
				{
				setState(529);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(ReactParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(ReactParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpressionSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpressionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expressionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(532);
				match(Ellipsis);
				}
			}

			setState(535);
			singleExpression(0);
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(536);
				match(Comma);
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(537);
					match(Ellipsis);
					}
				}

				setState(540);
				singleExpression(0);
				}
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleExpressionContext extends ParserRuleContext {
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	 
		public SingleExpressionContext() { }
		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateStringExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TemplateStringLiteralContext templateStringLiteral() {
			return getRuleContext(TemplateStringLiteralContext.class,0);
		}
		public TemplateStringExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTemplateStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTemplateStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTemplateStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(ReactParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(ReactParser.Minus, 0); }
		public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode LessThan() { return getToken(ReactParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(ReactParser.MoreThan, 0); }
		public TerminalNode LessThanEquals() { return getToken(ReactParser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(ReactParser.GreaterThanEquals, 0); }
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode QuestionMark() { return getToken(ReactParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(ReactParser.And, 0); }
		public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralExpressionContext extends SingleExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterObjectLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitObjectLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitObjectLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(ReactParser.Or, 0); }
		public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrayLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrayLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrayLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberDotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(ReactParser.Dot, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(ReactParser.QuestionMark, 0); }
		public TerminalNode Hashtag() { return getToken(ReactParser.Hashtag, 0); }
		public MemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMemberDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMemberDotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMemberDotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberIndexExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(ReactParser.OpenBracket, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(ReactParser.CloseBracket, 0); }
		public MemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMemberIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMemberIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMemberIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends SingleExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementExpressionContext extends SingleExpressionContext {
		public JsxElementsContext jsxElements() {
			return getRuleContext(JsxElementsContext.class,0);
		}
		public JsxElementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxElementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxElementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxElementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArgumentsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArgumentsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArgumentsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExpressionContext extends SingleExpressionContext {
		public TerminalNode This() { return getToken(ReactParser.This, 0); }
		public ThisExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExpressionContext extends SingleExpressionContext {
		public AnoymousFunctionContext anoymousFunction() {
			return getRuleContext(AnoymousFunctionContext.class,0);
		}
		public FunctionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitAnd() { return getToken(ReactParser.BitAnd, 0); }
		public BitAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBitAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitOr() { return getToken(ReactParser.BitOr, 0); }
		public BitOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBitOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportExpressionContext extends SingleExpressionContext {
		public TerminalNode Import() { return getToken(ReactParser.Import, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public ImportExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Equals_() { return getToken(ReactParser.Equals_, 0); }
		public TerminalNode NotEquals() { return getToken(ReactParser.NotEquals, 0); }
		public TerminalNode IdentityEquals() { return getToken(ReactParser.IdentityEquals, 0); }
		public TerminalNode IdentityNotEquals() { return getToken(ReactParser.IdentityNotEquals, 0); }
		public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitXOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitXOr() { return getToken(ReactParser.BitXOr, 0); }
		public BitXOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBitXOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBitXOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBitXOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidExpressionContext extends SingleExpressionContext {
		public TerminalNode Void() { return getToken(ReactParser.Void, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VoidExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVoidExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVoidExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVoidExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(ReactParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(ReactParser.Modulus, 0); }
		public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(547);
				anoymousFunction();
				}
				break;
			case 2:
				{
				_localctx = new VoidExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(548);
				match(Void);
				setState(549);
				singleExpression(20);
				}
				break;
			case 3:
				{
				_localctx = new ImportExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(550);
				match(Import);
				setState(551);
				match(OpenParen);
				setState(552);
				singleExpression(0);
				setState(553);
				match(CloseParen);
				}
				break;
			case 4:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(555);
				match(This);
				}
				break;
			case 5:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(556);
				identifier();
				}
				break;
			case 6:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(557);
				literal();
				}
				break;
			case 7:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(558);
				arrayLiteral();
				}
				break;
			case 8:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(559);
				objectLiteral();
				}
				break;
			case 9:
				{
				_localctx = new JsxElementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(560);
				jsxElements();
				}
				break;
			case 10:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(561);
				match(OpenParen);
				setState(562);
				expressionSequence();
				setState(563);
				match(CloseParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(620);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(618);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(567);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(568);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(569);
						singleExpression(20);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(570);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(571);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(572);
						singleExpression(19);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(573);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(574);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(575);
						singleExpression(18);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(576);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(577);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(578);
						singleExpression(17);
						}
						break;
					case 5:
						{
						_localctx = new BitAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(579);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(580);
						match(BitAnd);
						setState(581);
						singleExpression(16);
						}
						break;
					case 6:
						{
						_localctx = new BitXOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(582);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(583);
						match(BitXOr);
						setState(584);
						singleExpression(15);
						}
						break;
					case 7:
						{
						_localctx = new BitOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(585);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(586);
						match(BitOr);
						setState(587);
						singleExpression(14);
						}
						break;
					case 8:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(588);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(589);
						match(And);
						setState(590);
						singleExpression(13);
						}
						break;
					case 9:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(591);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(592);
						match(Or);
						setState(593);
						singleExpression(12);
						}
						break;
					case 10:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(594);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(595);
						match(QuestionMark);
						setState(596);
						singleExpression(0);
						setState(597);
						match(Colon);
						setState(598);
						singleExpression(11);
						}
						break;
					case 11:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(600);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(601);
						match(OpenBracket);
						setState(602);
						expressionSequence();
						setState(603);
						match(CloseBracket);
						}
						break;
					case 12:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(605);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(607);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMark) {
							{
							setState(606);
							match(QuestionMark);
							}
						}

						setState(609);
						match(Dot);
						setState(611);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Hashtag) {
							{
							setState(610);
							match(Hashtag);
							}
						}

						setState(613);
						identifierName();
						}
						break;
					case 13:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(614);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(615);
						arguments();
						}
						break;
					case 14:
						{
						_localctx = new TemplateStringExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(616);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(617);
						templateStringLiteral();
						}
						break;
					}
					} 
				}
				setState(622);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementsContext extends ParserRuleContext {
		public List<JsxElementContext> jsxElement() {
			return getRuleContexts(JsxElementContext.class);
		}
		public JsxElementContext jsxElement(int i) {
			return getRuleContext(JsxElementContext.class,i);
		}
		public JsxElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementsContext jsxElements() throws RecognitionException {
		JsxElementsContext _localctx = new JsxElementsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_jsxElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(624); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(623);
					jsxElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(626); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementBeginContext extends ParserRuleContext {
		public TerminalNode JsxElementBegin() { return getToken(ReactParser.JsxElementBegin, 0); }
		public TerminalNode JsxOpeningElementBegin() { return getToken(ReactParser.JsxOpeningElementBegin, 0); }
		public TerminalNode JsxChildrenOpeningElementBegin() { return getToken(ReactParser.JsxChildrenOpeningElementBegin, 0); }
		public JsxElementBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElementBegin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxElementBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxElementBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxElementBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementBeginContext jsxElementBegin() throws RecognitionException {
		JsxElementBeginContext _localctx = new JsxElementBeginContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_jsxElementBegin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_la = _input.LA(1);
			if ( !(_la==JsxElementBegin || _la==JsxOpeningElementBegin || _la==JsxChildrenOpeningElementBegin) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementContext extends ParserRuleContext {
		public JsxSelfClosingElementContext jsxSelfClosingElement() {
			return getRuleContext(JsxSelfClosingElementContext.class,0);
		}
		public JsxOpeningElementContext jsxOpeningElement() {
			return getRuleContext(JsxOpeningElementContext.class,0);
		}
		public JsxChildrenContext jsxChildren() {
			return getRuleContext(JsxChildrenContext.class,0);
		}
		public JsxClosingElementContext jsxClosingElement() {
			return getRuleContext(JsxClosingElementContext.class,0);
		}
		public JsxElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementContext jsxElement() throws RecognitionException {
		JsxElementContext _localctx = new JsxElementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_jsxElement);
		try {
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				jsxSelfClosingElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				jsxOpeningElement();
				setState(632);
				jsxChildren();
				setState(633);
				jsxClosingElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxSelfClosingElementContext extends ParserRuleContext {
		public JsxElementBeginContext jsxElementBegin() {
			return getRuleContext(JsxElementBeginContext.class,0);
		}
		public JsxSelfClosingElementNameContext jsxSelfClosingElementName() {
			return getRuleContext(JsxSelfClosingElementNameContext.class,0);
		}
		public TerminalNode JsxOpeningElementSlashEnd() { return getToken(ReactParser.JsxOpeningElementSlashEnd, 0); }
		public JsxAttributesContext jsxAttributes() {
			return getRuleContext(JsxAttributesContext.class,0);
		}
		public JsxSelfClosingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxSelfClosingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxSelfClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxSelfClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxSelfClosingElementContext jsxSelfClosingElement() throws RecognitionException {
		JsxSelfClosingElementContext _localctx = new JsxSelfClosingElementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_jsxSelfClosingElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			jsxElementBegin();
			setState(638);
			jsxSelfClosingElementName();
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JsxOpeningElementOpenBrace || _la==JsxOpeningElementId) {
				{
				setState(639);
				jsxAttributes();
				}
			}

			setState(642);
			match(JsxOpeningElementSlashEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxOpeningElementContext extends ParserRuleContext {
		public JsxElementBeginContext jsxElementBegin() {
			return getRuleContext(JsxElementBeginContext.class,0);
		}
		public JsxOpeningElementNameContext jsxOpeningElementName() {
			return getRuleContext(JsxOpeningElementNameContext.class,0);
		}
		public TerminalNode JsxOpeningElementEnd() { return getToken(ReactParser.JsxOpeningElementEnd, 0); }
		public JsxAttributesContext jsxAttributes() {
			return getRuleContext(JsxAttributesContext.class,0);
		}
		public JsxOpeningElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxOpeningElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxOpeningElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxOpeningElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxOpeningElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxOpeningElementContext jsxOpeningElement() throws RecognitionException {
		JsxOpeningElementContext _localctx = new JsxOpeningElementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_jsxOpeningElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			jsxElementBegin();
			setState(645);
			jsxOpeningElementName();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JsxOpeningElementOpenBrace || _la==JsxOpeningElementId) {
				{
				setState(646);
				jsxAttributes();
				}
			}

			setState(649);
			match(JsxOpeningElementEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxClosingElementContext extends ParserRuleContext {
		public TerminalNode JsxChildrenClosingElementSlashBegin() { return getToken(ReactParser.JsxChildrenClosingElementSlashBegin, 0); }
		public JsxClosingElementNameContext jsxClosingElementName() {
			return getRuleContext(JsxClosingElementNameContext.class,0);
		}
		public TerminalNode JsxClosingElementEnd() { return getToken(ReactParser.JsxClosingElementEnd, 0); }
		public JsxClosingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxClosingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxClosingElementContext jsxClosingElement() throws RecognitionException {
		JsxClosingElementContext _localctx = new JsxClosingElementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_jsxClosingElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(JsxChildrenClosingElementSlashBegin);
			setState(652);
			jsxClosingElementName();
			setState(653);
			match(JsxClosingElementEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxChildrenContext extends ParserRuleContext {
		public List<TerminalNode> HtmlChardata() { return getTokens(ReactParser.HtmlChardata); }
		public TerminalNode HtmlChardata(int i) {
			return getToken(ReactParser.HtmlChardata, i);
		}
		public List<JsxElementContext> jsxElement() {
			return getRuleContexts(JsxElementContext.class);
		}
		public JsxElementContext jsxElement(int i) {
			return getRuleContext(JsxElementContext.class,i);
		}
		public List<ObjectExpressionSequenceContext> objectExpressionSequence() {
			return getRuleContexts(ObjectExpressionSequenceContext.class);
		}
		public ObjectExpressionSequenceContext objectExpressionSequence(int i) {
			return getRuleContext(ObjectExpressionSequenceContext.class,i);
		}
		public JsxChildrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxChildren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxChildren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxChildrenContext jsxChildren() throws RecognitionException {
		JsxChildrenContext _localctx = new JsxChildrenContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_jsxChildren);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HtmlChardata) {
				{
				setState(655);
				match(HtmlChardata);
				}
			}

			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JsxElementBegin || _la==OpenBrace || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 5137L) != 0)) {
				{
				{
				setState(660);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JsxElementBegin:
				case JsxOpeningElementBegin:
				case JsxChildrenOpeningElementBegin:
					{
					setState(658);
					jsxElement();
					}
					break;
				case OpenBrace:
				case JsxOpeningElementOpenBrace:
				case JsxChildrenOpenBrace:
					{
					setState(659);
					objectExpressionSequence();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HtmlChardata) {
					{
					setState(662);
					match(HtmlChardata);
					}
				}

				}
				}
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxSelfClosingElementNameContext extends ParserRuleContext {
		public TerminalNode JsxOpeningElementId() { return getToken(ReactParser.JsxOpeningElementId, 0); }
		public JsxSelfClosingElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxSelfClosingElementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxSelfClosingElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxSelfClosingElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxSelfClosingElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxSelfClosingElementNameContext jsxSelfClosingElementName() throws RecognitionException {
		JsxSelfClosingElementNameContext _localctx = new JsxSelfClosingElementNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_jsxSelfClosingElementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(670);
				match(JsxOpeningElementId);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxOpeningElementNameContext extends ParserRuleContext {
		public TerminalNode JsxOpeningElementId() { return getToken(ReactParser.JsxOpeningElementId, 0); }
		public JsxOpeningElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxOpeningElementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxOpeningElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxOpeningElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxOpeningElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxOpeningElementNameContext jsxOpeningElementName() throws RecognitionException {
		JsxOpeningElementNameContext _localctx = new JsxOpeningElementNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_jsxOpeningElementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(673);
				match(JsxOpeningElementId);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxClosingElementNameContext extends ParserRuleContext {
		public TerminalNode JsxClosingElementId() { return getToken(ReactParser.JsxClosingElementId, 0); }
		public JsxClosingElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxClosingElementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxClosingElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxClosingElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxClosingElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxClosingElementNameContext jsxClosingElementName() throws RecognitionException {
		JsxClosingElementNameContext _localctx = new JsxClosingElementNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_jsxClosingElementName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JsxClosingElementId) {
				{
				setState(676);
				match(JsxClosingElementId);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxAttributesContext extends ParserRuleContext {
		public JsxSpreadAttributeContext jsxSpreadAttribute() {
			return getRuleContext(JsxSpreadAttributeContext.class,0);
		}
		public JsxAttributesContext jsxAttributes() {
			return getRuleContext(JsxAttributesContext.class,0);
		}
		public JsxAttributeContext jsxAttribute() {
			return getRuleContext(JsxAttributeContext.class,0);
		}
		public JsxAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttributesContext jsxAttributes() throws RecognitionException {
		JsxAttributesContext _localctx = new JsxAttributesContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_jsxAttributes);
		int _la;
		try {
			setState(687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JsxOpeningElementOpenBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				jsxSpreadAttribute();
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JsxOpeningElementOpenBrace || _la==JsxOpeningElementId) {
					{
					setState(680);
					jsxAttributes();
					}
				}

				}
				break;
			case JsxOpeningElementId:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				jsxAttribute();
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JsxOpeningElementOpenBrace || _la==JsxOpeningElementId) {
					{
					setState(684);
					jsxAttributes();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxSpreadAttributeContext extends ParserRuleContext {
		public TerminalNode JsxOpeningElementOpenBrace() { return getToken(ReactParser.JsxOpeningElementOpenBrace, 0); }
		public TerminalNode Ellipsis() { return getToken(ReactParser.Ellipsis, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public JsxSpreadAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxSpreadAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxSpreadAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxSpreadAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxSpreadAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxSpreadAttributeContext jsxSpreadAttribute() throws RecognitionException {
		JsxSpreadAttributeContext _localctx = new JsxSpreadAttributeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_jsxSpreadAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(JsxOpeningElementOpenBrace);
			setState(690);
			match(Ellipsis);
			setState(691);
			singleExpression(0);
			setState(692);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxAttributeContext extends ParserRuleContext {
		public JsxAttributeNameContext jsxAttributeName() {
			return getRuleContext(JsxAttributeNameContext.class,0);
		}
		public TerminalNode JsxAssign() { return getToken(ReactParser.JsxAssign, 0); }
		public JsxAttributeValueContext jsxAttributeValue() {
			return getRuleContext(JsxAttributeValueContext.class,0);
		}
		public JsxAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttributeContext jsxAttribute() throws RecognitionException {
		JsxAttributeContext _localctx = new JsxAttributeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_jsxAttribute);
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				jsxAttributeName();
				setState(695);
				match(JsxAssign);
				setState(696);
				jsxAttributeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(698);
				jsxAttributeName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxAttributeNameContext extends ParserRuleContext {
		public TerminalNode JsxOpeningElementId() { return getToken(ReactParser.JsxOpeningElementId, 0); }
		public JsxAttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttributeNameContext jsxAttributeName() throws RecognitionException {
		JsxAttributeNameContext _localctx = new JsxAttributeNameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_jsxAttributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(JsxOpeningElementId);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxAttributeValueContext extends ParserRuleContext {
		public TerminalNode JsxAttributeValue() { return getToken(ReactParser.JsxAttributeValue, 0); }
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public ObjectExpressionSequenceContext objectExpressionSequence() {
			return getRuleContext(ObjectExpressionSequenceContext.class,0);
		}
		public JsxAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttributeValueContext jsxAttributeValue() throws RecognitionException {
		JsxAttributeValueContext _localctx = new JsxAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_jsxAttributeValue);
		try {
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JsxAttributeValue:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				match(JsxAttributeValue);
				}
				break;
			case JsxElementBegin:
			case JsxOpeningElementBegin:
			case JsxChildrenOpeningElementBegin:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				jsxElement();
				}
				break;
			case OpenBrace:
			case JsxOpeningElementOpenBrace:
			case JsxChildrenOpenBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(705);
				objectExpressionSequence();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAssignable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAssignable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAssignable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_assignable);
		try {
			setState(711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Async:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				identifier();
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(710);
				objectLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(OpenBrace);
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316535201964L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & -9149625593225019393L) != 0) || _la==JsxChildrenOpeningElementBegin) {
				{
				setState(714);
				propertyAssignment();
				setState(719);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(715);
						match(Comma);
						setState(716);
						propertyAssignment();
						}
						} 
					}
					setState(721);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(722);
					match(Comma);
					}
				}

				}
			}

			setState(727);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenBraceContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode JsxOpeningElementOpenBrace() { return getToken(ReactParser.JsxOpeningElementOpenBrace, 0); }
		public TerminalNode JsxChildrenOpenBrace() { return getToken(ReactParser.JsxChildrenOpenBrace, 0); }
		public OpenBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openBrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOpenBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOpenBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOpenBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenBraceContext openBrace() throws RecognitionException {
		OpenBraceContext _localctx = new OpenBraceContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_openBrace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==JsxOpeningElementOpenBrace || _la==JsxChildrenOpenBrace) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExpressionSequenceContext extends ParserRuleContext {
		public OpenBraceContext openBrace() {
			return getRuleContext(OpenBraceContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public ObjectExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectExpressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterObjectExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitObjectExpressionSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitObjectExpressionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectExpressionSequenceContext objectExpressionSequence() throws RecognitionException {
		ObjectExpressionSequenceContext _localctx = new ObjectExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_objectExpressionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			openBrace();
			setState(732);
			expressionSequence();
			setState(733);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnoymousFunctionContext extends ParserRuleContext {
		public AnoymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anoymousFunction; }
	 
		public AnoymousFunctionContext() { }
		public void copyFrom(AnoymousFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnoymousFunctionDeclContext extends AnoymousFunctionContext {
		public TerminalNode Function_() { return getToken(ReactParser.Function_, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TerminalNode Async() { return getToken(ReactParser.Async, 0); }
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public AnoymousFunctionDeclContext(AnoymousFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAnoymousFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAnoymousFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAnoymousFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends AnoymousFunctionContext {
		public ArrowFunctionParametersContext arrowFunctionParameters() {
			return getRuleContext(ArrowFunctionParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public ArrowFunctionBodyContext arrowFunctionBody() {
			return getRuleContext(ArrowFunctionBodyContext.class,0);
		}
		public TerminalNode Async() { return getToken(ReactParser.Async, 0); }
		public ArrowFunctionContext(AnoymousFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends AnoymousFunctionContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionDeclContext(AnoymousFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnoymousFunctionContext anoymousFunction() throws RecognitionException {
		AnoymousFunctionContext _localctx = new AnoymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_anoymousFunction);
		int _la;
		try {
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				_localctx = new FunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				functionDeclaration();
				}
				break;
			case 2:
				_localctx = new AnoymousFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Async) {
					{
					setState(736);
					match(Async);
					}
				}

				setState(739);
				match(Function_);
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiply) {
					{
					setState(740);
					match(Multiply);
					}
				}

				setState(743);
				match(OpenParen);
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16520L) != 0) || _la==Async || _la==Identifier) {
					{
					setState(744);
					formalParameterList();
					}
				}

				setState(747);
				match(CloseParen);
				setState(748);
				match(OpenBrace);
				setState(749);
				functionBody();
				setState(750);
				match(CloseBrace);
				}
				break;
			case 3:
				_localctx = new ArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(753);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(752);
					match(Async);
					}
					break;
				}
				setState(755);
				arrowFunctionParameters();
				setState(756);
				match(ARROW);
				setState(757);
				arrowFunctionBody();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionParametersContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ArrowFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrowFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrowFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrowFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionParametersContext arrowFunctionParameters() throws RecognitionException {
		ArrowFunctionParametersContext _localctx = new ArrowFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_arrowFunctionParameters);
		int _la;
		try {
			setState(767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Async:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				identifier();
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				match(OpenParen);
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16520L) != 0) || _la==Async || _la==Identifier) {
					{
					setState(763);
					formalParameterList();
					}
				}

				setState(766);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionBodyContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public ArrowFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrowFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrowFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrowFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionBodyContext arrowFunctionBody() throws RecognitionException {
		ArrowFunctionBodyContext _localctx = new ArrowFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_arrowFunctionBody);
		try {
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				singleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				match(OpenBrace);
				setState(771);
				functionBody();
				setState(772);
				match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(ReactParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ReactParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ReactParser.StringLiteral, 0); }
		public TemplateStringLiteralContext templateStringLiteral() {
			return getRuleContext(TemplateStringLiteralContext.class,0);
		}
		public TerminalNode RegularExpressionLiteral() { return getToken(ReactParser.RegularExpressionLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(ReactParser.DecimalLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_literal);
		try {
			setState(782);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				match(BooleanLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(778);
				match(StringLiteral);
				}
				break;
			case BackTick:
				enterOuterAlt(_localctx, 4);
				{
				setState(779);
				templateStringLiteral();
				}
				break;
			case RegularExpressionLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(780);
				match(RegularExpressionLiteral);
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(781);
				match(DecimalLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateStringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> BackTick() { return getTokens(ReactParser.BackTick); }
		public TerminalNode BackTick(int i) {
			return getToken(ReactParser.BackTick, i);
		}
		public List<TemplateStringAtomContext> templateStringAtom() {
			return getRuleContexts(TemplateStringAtomContext.class);
		}
		public TemplateStringAtomContext templateStringAtom(int i) {
			return getRuleContext(TemplateStringAtomContext.class,i);
		}
		public TemplateStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTemplateStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTemplateStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTemplateStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStringLiteralContext templateStringLiteral() throws RecognitionException {
		TemplateStringLiteralContext _localctx = new TemplateStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_templateStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(BackTick);
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TemplateStringStartExpression || _la==TemplateStringAtom) {
				{
				{
				setState(785);
				templateStringAtom();
				}
				}
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(791);
			match(BackTick);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateStringAtomContext extends ParserRuleContext {
		public TerminalNode TemplateStringAtom() { return getToken(ReactParser.TemplateStringAtom, 0); }
		public TerminalNode TemplateStringStartExpression() { return getToken(ReactParser.TemplateStringStartExpression, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TemplateStringAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStringAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTemplateStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTemplateStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTemplateStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStringAtomContext templateStringAtom() throws RecognitionException {
		TemplateStringAtomContext _localctx = new TemplateStringAtomContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_templateStringAtom);
		try {
			setState(798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TemplateStringAtom:
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				match(TemplateStringAtom);
				}
				break;
			case TemplateStringStartExpression:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				match(TemplateStringStartExpression);
				setState(795);
				singleExpression(0);
				setState(796);
				match(CloseBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIdentifierName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIdentifierName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIdentifierName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_identifierName);
		try {
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				reservedWord();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode Async() { return getToken(ReactParser.Async, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_la = _input.LA(1);
			if ( !(_la==Async || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReservedWordContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode NullLiteral() { return getToken(ReactParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ReactParser.BooleanLiteral, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitReservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitReservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_reservedWord);
		try {
			setState(809);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Async:
			case Await:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				keyword();
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				match(BooleanLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(ReactParser.Break, 0); }
		public TerminalNode Do() { return getToken(ReactParser.Do, 0); }
		public TerminalNode Instanceof() { return getToken(ReactParser.Instanceof, 0); }
		public TerminalNode Typeof() { return getToken(ReactParser.Typeof, 0); }
		public TerminalNode Case() { return getToken(ReactParser.Case, 0); }
		public TerminalNode Else() { return getToken(ReactParser.Else, 0); }
		public TerminalNode New() { return getToken(ReactParser.New, 0); }
		public TerminalNode Var() { return getToken(ReactParser.Var, 0); }
		public TerminalNode Catch() { return getToken(ReactParser.Catch, 0); }
		public TerminalNode Finally() { return getToken(ReactParser.Finally, 0); }
		public TerminalNode Return() { return getToken(ReactParser.Return, 0); }
		public TerminalNode Void() { return getToken(ReactParser.Void, 0); }
		public TerminalNode Continue() { return getToken(ReactParser.Continue, 0); }
		public TerminalNode For() { return getToken(ReactParser.For, 0); }
		public TerminalNode Switch() { return getToken(ReactParser.Switch, 0); }
		public TerminalNode While() { return getToken(ReactParser.While, 0); }
		public TerminalNode Debugger() { return getToken(ReactParser.Debugger, 0); }
		public TerminalNode Function_() { return getToken(ReactParser.Function_, 0); }
		public TerminalNode This() { return getToken(ReactParser.This, 0); }
		public TerminalNode With() { return getToken(ReactParser.With, 0); }
		public TerminalNode Default() { return getToken(ReactParser.Default, 0); }
		public TerminalNode If() { return getToken(ReactParser.If, 0); }
		public TerminalNode Throw() { return getToken(ReactParser.Throw, 0); }
		public TerminalNode Delete() { return getToken(ReactParser.Delete, 0); }
		public TerminalNode In() { return getToken(ReactParser.In, 0); }
		public TerminalNode Try() { return getToken(ReactParser.Try, 0); }
		public TerminalNode Class() { return getToken(ReactParser.Class, 0); }
		public TerminalNode Enum() { return getToken(ReactParser.Enum, 0); }
		public TerminalNode Extends() { return getToken(ReactParser.Extends, 0); }
		public TerminalNode Super() { return getToken(ReactParser.Super, 0); }
		public TerminalNode Const() { return getToken(ReactParser.Const, 0); }
		public TerminalNode Export() { return getToken(ReactParser.Export, 0); }
		public TerminalNode Import() { return getToken(ReactParser.Import, 0); }
		public TerminalNode Implements() { return getToken(ReactParser.Implements, 0); }
		public TerminalNode Let() { return getToken(ReactParser.Let, 0); }
		public TerminalNode Private() { return getToken(ReactParser.Private, 0); }
		public TerminalNode Public() { return getToken(ReactParser.Public, 0); }
		public TerminalNode Interface() { return getToken(ReactParser.Interface, 0); }
		public TerminalNode Package() { return getToken(ReactParser.Package, 0); }
		public TerminalNode Protected() { return getToken(ReactParser.Protected, 0); }
		public TerminalNode Static() { return getToken(ReactParser.Static, 0); }
		public TerminalNode Yield() { return getToken(ReactParser.Yield, 0); }
		public TerminalNode Async() { return getToken(ReactParser.Async, 0); }
		public TerminalNode Await() { return getToken(ReactParser.Await, 0); }
		public TerminalNode From() { return getToken(ReactParser.From, 0); }
		public TerminalNode As() { return getToken(ReactParser.As, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 140737219919871L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(ReactParser.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(ReactParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(813);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==SemiColon) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 44:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 23);
		case 11:
			return precpred(_ctx, 22);
		case 12:
			return precpred(_ctx, 21);
		case 13:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0093\u0331\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0001\u0000\u0003\u0000\u0098\b\u0000\u0001\u0000\u0003\u0000\u009b"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00ad"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u00b1\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0004\u0004\u00b6\b\u0004\u000b\u0004\f\u0004"+
		"\u00b7\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006\u00be"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c2\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c9\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00cf\b\u0007"+
		"\n\u0007\f\u0007\u00d2\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d6"+
		"\b\u0007\u0003\u0007\u00d8\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0003\t\u00e1\b\t\u0001\t\u0001\t\u0003\t\u00e5"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00ed\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00f2\b\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00fa\b\f\u0003\f\u00fc"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0104\b\r"+
		"\u0001\r\u0001\r\u0003\r\u0108\b\r\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u010c\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0115\b\u0010\n\u0010\f\u0010\u0118"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u011d\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0129\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u012f\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0133\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0137\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u013f\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0146\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u014c\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0155\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u0165\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0169\b\u0019\u0003\u0019\u016b\b"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0004\u001a\u0170\b\u001a\u000b"+
		"\u001a\f\u001a\u0171\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0178\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u017d"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0003"+
		"\u001e\u0184\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0188\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u018d\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u0197\b\u001f\n\u001f\f\u001f\u019a\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u019e\b\u001f\u0001\u001f\u0003\u001f\u01a1"+
		"\b\u001f\u0001 \u0001 \u0001 \u0003 \u01a6\b \u0001!\u0001!\u0001!\u0001"+
		"\"\u0003\"\u01ac\b\"\u0001#\u0004#\u01af\b#\u000b#\f#\u01b0\u0001$\u0001"+
		"$\u0001$\u0001$\u0001%\u0005%\u01b8\b%\n%\f%\u01bb\t%\u0001%\u0003%\u01be"+
		"\b%\u0001%\u0004%\u01c1\b%\u000b%\f%\u01c2\u0001%\u0005%\u01c6\b%\n%\f"+
		"%\u01c9\t%\u0001%\u0005%\u01cc\b%\n%\f%\u01cf\t%\u0001&\u0003&\u01d2\b"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01e1\b\'\u0001\'\u0003\'\u01e4"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0003\'\u01e9\b\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0003\'\u01f1\b\'\u0001\'\u0003\'\u01f4\b\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u01fc\b(\u0001)\u0001)\u0001"+
		")\u0001)\u0005)\u0202\b)\n)\f)\u0205\t)\u0001)\u0003)\u0208\b)\u0003)"+
		"\u020a\b)\u0001)\u0001)\u0001*\u0003*\u020f\b*\u0001*\u0001*\u0003*\u0213"+
		"\b*\u0001+\u0003+\u0216\b+\u0001+\u0001+\u0001+\u0003+\u021b\b+\u0001"+
		"+\u0005+\u021e\b+\n+\f+\u0221\t+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0003,\u0236\b,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u0260\b,\u0001,\u0001,\u0003"+
		",\u0264\b,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u026b\b,\n,\f,\u026e"+
		"\t,\u0001-\u0004-\u0271\b-\u000b-\f-\u0272\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0003/\u027c\b/\u00010\u00010\u00010\u00030\u0281"+
		"\b0\u00010\u00010\u00011\u00011\u00011\u00031\u0288\b1\u00011\u00011\u0001"+
		"2\u00012\u00012\u00012\u00013\u00033\u0291\b3\u00013\u00013\u00033\u0295"+
		"\b3\u00013\u00033\u0298\b3\u00053\u029a\b3\n3\f3\u029d\t3\u00014\u0003"+
		"4\u02a0\b4\u00015\u00035\u02a3\b5\u00016\u00036\u02a6\b6\u00017\u0001"+
		"7\u00037\u02aa\b7\u00017\u00017\u00037\u02ae\b7\u00037\u02b0\b7\u0001"+
		"8\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u0003"+
		"9\u02bc\b9\u0001:\u0001:\u0001;\u0001;\u0001;\u0003;\u02c3\b;\u0001<\u0001"+
		"<\u0001<\u0003<\u02c8\b<\u0001=\u0001=\u0001=\u0001=\u0005=\u02ce\b=\n"+
		"=\f=\u02d1\t=\u0001=\u0003=\u02d4\b=\u0003=\u02d6\b=\u0001=\u0001=\u0001"+
		">\u0001>\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0003@\u02e2\b@\u0001"+
		"@\u0001@\u0003@\u02e6\b@\u0001@\u0001@\u0003@\u02ea\b@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0003@\u02f2\b@\u0001@\u0001@\u0001@\u0001@\u0003"+
		"@\u02f8\b@\u0001A\u0001A\u0001A\u0003A\u02fd\bA\u0001A\u0003A\u0300\b"+
		"A\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u0307\bB\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0003C\u030f\bC\u0001D\u0001D\u0005D\u0313\bD\n"+
		"D\fD\u0316\tD\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E"+
		"\u031f\bE\u0001F\u0001F\u0003F\u0323\bF\u0001G\u0001G\u0001H\u0001H\u0001"+
		"H\u0003H\u032a\bH\u0001I\u0001I\u0001J\u0003J\u032f\bJ\u0001J\u0000\u0001"+
		"XK\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0000\n\u0003\u0000"+
		"KKeekk\u0001\u0000\u0016\u0018\u0001\u0000\u0012\u0013\u0001\u0000\u001f"+
		"\"\u0001\u0000#&\u0003\u0000\u0002\u0002\u0083\u0083\u008d\u008d\u0003"+
		"\u0000\u0007\u0007\u0087\u0087\u008f\u008f\u0002\u0000hhss\u0002\u0000"+
		"D_ar\u0001\u0001\t\t\u0377\u0000\u0097\u0001\u0000\u0000\u0000\u0002\u009e"+
		"\u0001\u0000\u0000\u0000\u0004\u00ac\u0001\u0000\u0000\u0000\u0006\u00ae"+
		"\u0001\u0000\u0000\u0000\b\u00b5\u0001\u0000\u0000\u0000\n\u00b9\u0001"+
		"\u0000\u0000\u0000\f\u00c8\u0001\u0000\u0000\u0000\u000e\u00ca\u0001\u0000"+
		"\u0000\u0000\u0010\u00db\u0001\u0000\u0000\u0000\u0012\u00e0\u0001\u0000"+
		"\u0000\u0000\u0014\u00e6\u0001\u0000\u0000\u0000\u0016\u00e9\u0001\u0000"+
		"\u0000\u0000\u0018\u00fb\u0001\u0000\u0000\u0000\u001a\u0107\u0001\u0000"+
		"\u0000\u0000\u001c\u010b\u0001\u0000\u0000\u0000\u001e\u010d\u0001\u0000"+
		"\u0000\u0000 \u0110\u0001\u0000\u0000\u0000\"\u0119\u0001\u0000\u0000"+
		"\u0000$\u011e\u0001\u0000\u0000\u0000&\u0121\u0001\u0000\u0000\u0000("+
		"\u0145\u0001\u0000\u0000\u0000*\u0147\u0001\u0000\u0000\u0000,\u0154\u0001"+
		"\u0000\u0000\u0000.\u0156\u0001\u0000\u0000\u00000\u015c\u0001\u0000\u0000"+
		"\u00002\u0162\u0001\u0000\u0000\u00004\u016f\u0001\u0000\u0000\u00006"+
		"\u0173\u0001\u0000\u0000\u00008\u0179\u0001\u0000\u0000\u0000:\u017e\u0001"+
		"\u0000\u0000\u0000<\u0183\u0001\u0000\u0000\u0000>\u01a0\u0001\u0000\u0000"+
		"\u0000@\u01a2\u0001\u0000\u0000\u0000B\u01a7\u0001\u0000\u0000\u0000D"+
		"\u01ab\u0001\u0000\u0000\u0000F\u01ae\u0001\u0000\u0000\u0000H\u01b2\u0001"+
		"\u0000\u0000\u0000J\u01b9\u0001\u0000\u0000\u0000L\u01d1\u0001\u0000\u0000"+
		"\u0000N\u01f3\u0001\u0000\u0000\u0000P\u01fb\u0001\u0000\u0000\u0000R"+
		"\u01fd\u0001\u0000\u0000\u0000T\u020e\u0001\u0000\u0000\u0000V\u0215\u0001"+
		"\u0000\u0000\u0000X\u0235\u0001\u0000\u0000\u0000Z\u0270\u0001\u0000\u0000"+
		"\u0000\\\u0274\u0001\u0000\u0000\u0000^\u027b\u0001\u0000\u0000\u0000"+
		"`\u027d\u0001\u0000\u0000\u0000b\u0284\u0001\u0000\u0000\u0000d\u028b"+
		"\u0001\u0000\u0000\u0000f\u0290\u0001\u0000\u0000\u0000h\u029f\u0001\u0000"+
		"\u0000\u0000j\u02a2\u0001\u0000\u0000\u0000l\u02a5\u0001\u0000\u0000\u0000"+
		"n\u02af\u0001\u0000\u0000\u0000p\u02b1\u0001\u0000\u0000\u0000r\u02bb"+
		"\u0001\u0000\u0000\u0000t\u02bd\u0001\u0000\u0000\u0000v\u02c2\u0001\u0000"+
		"\u0000\u0000x\u02c7\u0001\u0000\u0000\u0000z\u02c9\u0001\u0000\u0000\u0000"+
		"|\u02d9\u0001\u0000\u0000\u0000~\u02db\u0001\u0000\u0000\u0000\u0080\u02f7"+
		"\u0001\u0000\u0000\u0000\u0082\u02ff\u0001\u0000\u0000\u0000\u0084\u0306"+
		"\u0001\u0000\u0000\u0000\u0086\u030e\u0001\u0000\u0000\u0000\u0088\u0310"+
		"\u0001\u0000\u0000\u0000\u008a\u031e\u0001\u0000\u0000\u0000\u008c\u0322"+
		"\u0001\u0000\u0000\u0000\u008e\u0324\u0001\u0000\u0000\u0000\u0090\u0329"+
		"\u0001\u0000\u0000\u0000\u0092\u032b\u0001\u0000\u0000\u0000\u0094\u032e"+
		"\u0001\u0000\u0000\u0000\u0096\u0098\u0005\u0001\u0000\u0000\u0097\u0096"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a"+
		"\u0001\u0000\u0000\u0000\u0099\u009b\u0003F#\u0000\u009a\u0099\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005\u0000\u0000\u0001\u009d\u0001\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0003\u0004\u0002\u0000\u009f\u0003\u0001\u0000"+
		"\u0000\u0000\u00a0\u00ad\u0003\u0006\u0003\u0000\u00a1\u00ad\u0003\u001e"+
		"\u000f\u0000\u00a2\u00ad\u0003\n\u0005\u0000\u00a3\u00ad\u0003\u0018\f"+
		"\u0000\u00a4\u00ad\u0003$\u0012\u0000\u00a5\u00ad\u0003&\u0013\u0000\u00a6"+
		"\u00ad\u0003(\u0014\u0000\u00a7\u00ad\u0003,\u0016\u0000\u00a8\u00ad\u0003"+
		".\u0017\u0000\u00a9\u00ad\u0003:\u001d\u0000\u00aa\u00ad\u00030\u0018"+
		"\u0000\u00ab\u00ad\u0003<\u001e\u0000\u00ac\u00a0\u0001\u0000\u0000\u0000"+
		"\u00ac\u00a1\u0001\u0000\u0000\u0000\u00ac\u00a2\u0001\u0000\u0000\u0000"+
		"\u00ac\u00a3\u0001\u0000\u0000\u0000\u00ac\u00a4\u0001\u0000\u0000\u0000"+
		"\u00ac\u00a5\u0001\u0000\u0000\u0000\u00ac\u00a6\u0001\u0000\u0000\u0000"+
		"\u00ac\u00a7\u0001\u0000\u0000\u0000\u00ac\u00a8\u0001\u0000\u0000\u0000"+
		"\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u0005\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b0\u0005\u0007\u0000\u0000\u00af\u00b1\u0003\b\u0004\u0000\u00b0"+
		"\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\b\u0000\u0000\u00b3\u0007"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b6\u0003\u0004\u0002\u0000\u00b5\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\t\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0005g\u0000\u0000\u00ba\u00bb\u0003\f"+
		"\u0006\u0000\u00bb\u000b\u0001\u0000\u0000\u0000\u00bc\u00be\u0003\u0010"+
		"\b\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00c2\u0003\u0012\t\u0000"+
		"\u00c0\u00c2\u0003\u000e\u0007\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0003\u0014\n\u0000\u00c4\u00c5\u0003\u0094J\u0000\u00c5"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005t\u0000\u0000\u00c7\u00c9"+
		"\u0003\u0094J\u0000\u00c8\u00bd\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c9\r\u0001\u0000\u0000\u0000\u00ca\u00d0\u0005\u0007"+
		"\u0000\u0000\u00cb\u00cc\u0003\u0016\u000b\u0000\u00cc\u00cd\u0005\n\u0000"+
		"\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d5\u0003\u0016\u000b"+
		"\u0000\u00d4\u00d6\u0005\n\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d3\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\b\u0000\u0000\u00da"+
		"\u000f\u0001\u0000\u0000\u0000\u00db\u00dc\u0003\u0016\u000b\u0000\u00dc"+
		"\u00dd\u0005\n\u0000\u0000\u00dd\u0011\u0001\u0000\u0000\u0000\u00de\u00e1"+
		"\u0005\u0016\u0000\u0000\u00df\u00e1\u0003\u008cF\u0000\u00e0\u00de\u0001"+
		"\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0005^\u0000\u0000\u00e3\u00e5\u0003\u008c"+
		"F\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e5\u0013\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005_\u0000\u0000"+
		"\u00e7\u00e8\u0005t\u0000\u0000\u00e8\u0015\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ec\u0003\u008cF\u0000\u00ea\u00eb\u0005^\u0000\u0000\u00eb\u00ed\u0003"+
		"\u008cF\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ed\u0017\u0001\u0000\u0000\u0000\u00ee\u00f1\u0005f\u0000"+
		"\u0000\u00ef\u00f2\u0003\u001a\r\u0000\u00f0\u00f2\u0003\u001c\u000e\u0000"+
		"\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0003\u0094J\u0000\u00f4"+
		"\u00fc\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005f\u0000\u0000\u00f6\u00f7"+
		"\u0005X\u0000\u0000\u00f7\u00f9\u0003X,\u0000\u00f8\u00fa\u0005\t\u0000"+
		"\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00ee\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f5\u0001\u0000\u0000\u0000\u00fc\u0019\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0003\u0012\t\u0000\u00fe\u00ff\u0003\u0014\n\u0000"+
		"\u00ff\u0100\u0003\u0094J\u0000\u0100\u0108\u0001\u0000\u0000\u0000\u0101"+
		"\u0103\u0003\u000e\u0007\u0000\u0102\u0104\u0003\u0014\n\u0000\u0103\u0102"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0003\u0094J\u0000\u0106\u0108\u0001"+
		"\u0000\u0000\u0000\u0107\u00fd\u0001\u0000\u0000\u0000\u0107\u0101\u0001"+
		"\u0000\u0000\u0000\u0108\u001b\u0001\u0000\u0000\u0000\u0109\u010c\u0003"+
		"\u001e\u000f\u0000\u010a\u010c\u0003<\u001e\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c\u001d\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0003 \u0010\u0000\u010e\u010f\u0003\u0094J\u0000"+
		"\u010f\u001f\u0001\u0000\u0000\u0000\u0110\u0111\u0003*\u0015\u0000\u0111"+
		"\u0116\u0003\"\u0011\u0000\u0112\u0113\u0005\n\u0000\u0000\u0113\u0115"+
		"\u0003\"\u0011\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0118\u0001"+
		"\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0117!\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000"+
		"\u0000\u0000\u0119\u011c\u0003x<\u0000\u011a\u011b\u0005\u000b\u0000\u0000"+
		"\u011b\u011d\u0003X,\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0001\u0000\u0000\u0000\u011d#\u0001\u0000\u0000\u0000\u011e\u011f\u0003"+
		"V+\u0000\u011f\u0120\u0003\u0094J\u0000\u0120%\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0005Y\u0000\u0000\u0122\u0123\u0005\u0005\u0000\u0000\u0123"+
		"\u0124\u0003V+\u0000\u0124\u0125\u0005\u0006\u0000\u0000\u0125\u0128\u0003"+
		"\u0004\u0002\u0000\u0126\u0127\u0005I\u0000\u0000\u0127\u0129\u0003\u0004"+
		"\u0002\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000"+
		"\u0000\u0000\u0129\'\u0001\u0000\u0000\u0000\u012a\u012b\u0005Q\u0000"+
		"\u0000\u012b\u012e\u0005\u0005\u0000\u0000\u012c\u012f\u0003V+\u0000\u012d"+
		"\u012f\u0003 \u0010\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012d"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0001\u0000\u0000\u0000\u0130\u0132\u0005\t\u0000\u0000\u0131\u0133\u0003"+
		"V+\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0136\u0005\t\u0000\u0000"+
		"\u0135\u0137\u0003V+\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0005\u0006\u0000\u0000\u0139\u0146\u0003\u0004\u0002\u0000\u013a\u013b"+
		"\u0005Q\u0000\u0000\u013b\u013e\u0005\u0005\u0000\u0000\u013c\u013f\u0003"+
		"X,\u0000\u013d\u013f\u0003 \u0010\u0000\u013e\u013c\u0001\u0000\u0000"+
		"\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0005\\\u0000\u0000\u0141\u0142\u0003V+\u0000\u0142"+
		"\u0143\u0005\u0006\u0000\u0000\u0143\u0144\u0003\u0004\u0002\u0000\u0144"+
		"\u0146\u0001\u0000\u0000\u0000\u0145\u012a\u0001\u0000\u0000\u0000\u0145"+
		"\u013a\u0001\u0000\u0000\u0000\u0146)\u0001\u0000\u0000\u0000\u0147\u0148"+
		"\u0007\u0000\u0000\u0000\u0148+\u0001\u0000\u0000\u0000\u0149\u014b\u0005"+
		"N\u0000\u0000\u014a\u014c\u0003V+\u0000\u014b\u014a\u0001\u0000\u0000"+
		"\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000"+
		"\u0000\u014d\u0155\u0003\u0094J\u0000\u014e\u014f\u0005N\u0000\u0000\u014f"+
		"\u0150\u0005\u0005\u0000\u0000\u0150\u0151\u0003Z-\u0000\u0151\u0152\u0005"+
		"\u0006\u0000\u0000\u0152\u0153\u0003\u0094J\u0000\u0153\u0155\u0001\u0000"+
		"\u0000\u0000\u0154\u0149\u0001\u0000\u0000\u0000\u0154\u014e\u0001\u0000"+
		"\u0000\u0000\u0155-\u0001\u0000\u0000\u0000\u0156\u0157\u0005W\u0000\u0000"+
		"\u0157\u0158\u0005\u0005\u0000\u0000\u0158\u0159\u0003V+\u0000\u0159\u015a"+
		"\u0005\u0006\u0000\u0000\u015a\u015b\u0003\u0004\u0002\u0000\u015b/\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0005R\u0000\u0000\u015d\u015e\u0005\u0005"+
		"\u0000\u0000\u015e\u015f\u0003V+\u0000\u015f\u0160\u0005\u0006\u0000\u0000"+
		"\u0160\u0161\u00032\u0019\u0000\u01611\u0001\u0000\u0000\u0000\u0162\u0164"+
		"\u0005\u0007\u0000\u0000\u0163\u0165\u00034\u001a\u0000\u0164\u0163\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u016a\u0001"+
		"\u0000\u0000\u0000\u0166\u0168\u00038\u001c\u0000\u0167\u0169\u00034\u001a"+
		"\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000"+
		"\u0000\u0169\u016b\u0001\u0000\u0000\u0000\u016a\u0166\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000"+
		"\u0000\u016c\u016d\u0005\b\u0000\u0000\u016d3\u0001\u0000\u0000\u0000"+
		"\u016e\u0170\u00036\u001b\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0001\u0000\u0000\u0000\u01725\u0001\u0000\u0000\u0000\u0173\u0174"+
		"\u0005H\u0000\u0000\u0174\u0175\u0003V+\u0000\u0175\u0177\u0005\r\u0000"+
		"\u0000\u0176\u0178\u0003\b\u0004\u0000\u0177\u0176\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0001\u0000\u0000\u0000\u01787\u0001\u0000\u0000\u0000\u0179"+
		"\u017a\u0005X\u0000\u0000\u017a\u017c\u0005\r\u0000\u0000\u017b\u017d"+
		"\u0003\b\u0004\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c\u017d\u0001"+
		"\u0000\u0000\u0000\u017d9\u0001\u0000\u0000\u0000\u017e\u017f\u0003\u008e"+
		"G\u0000\u017f\u0180\u0005\r\u0000\u0000\u0180\u0181\u0003\u0004\u0002"+
		"\u0000\u0181;\u0001\u0000\u0000\u0000\u0182\u0184\u0005h\u0000\u0000\u0183"+
		"\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184"+
		"\u0185\u0001\u0000\u0000\u0000\u0185\u0187\u0005U\u0000\u0000\u0186\u0188"+
		"\u0005\u0016\u0000\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0187\u0188"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0003\u008eG\u0000\u018a\u018c\u0005\u0005\u0000\u0000\u018b\u018d\u0003"+
		">\u001f\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000"+
		"\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0005\u0006"+
		"\u0000\u0000\u018f\u0190\u0005\u0007\u0000\u0000\u0190\u0191\u0003D\""+
		"\u0000\u0191\u0192\u0005\b\u0000\u0000\u0192=\u0001\u0000\u0000\u0000"+
		"\u0193\u0198\u0003@ \u0000\u0194\u0195\u0005\n\u0000\u0000\u0195\u0197"+
		"\u0003@ \u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000"+
		"\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000"+
		"\u0000\u0000\u0199\u019d\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0005\n\u0000\u0000\u019c\u019e\u0003B!\u0000"+
		"\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000"+
		"\u019e\u01a1\u0001\u0000\u0000\u0000\u019f\u01a1\u0003B!\u0000\u01a0\u0193"+
		"\u0001\u0000\u0000\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a1?\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a5\u0003x<\u0000\u01a3\u01a4\u0005\u000b\u0000"+
		"\u0000\u01a4\u01a6\u0003X,\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a6A\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\u0005\u000e\u0000\u0000\u01a8\u01a9\u0003X,\u0000\u01a9C\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ac\u0003F#\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ac\u0001\u0000\u0000\u0000\u01acE\u0001\u0000\u0000\u0000\u01ad"+
		"\u01af\u0003\u0002\u0001\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b1G\u0001\u0000\u0000\u0000\u01b2\u01b3"+
		"\u0005\u0003\u0000\u0000\u01b3\u01b4\u0003J%\u0000\u01b4\u01b5\u0005\u0004"+
		"\u0000\u0000\u01b5I\u0001\u0000\u0000\u0000\u01b6\u01b8\u0005\n\u0000"+
		"\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000"+
		"\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000"+
		"\u0000\u01bc\u01be\u0003L&\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01bd"+
		"\u01be\u0001\u0000\u0000\u0000\u01be\u01c7\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c1\u0005\n\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c6"+
		"\u0003L&\u0000\u01c5\u01c0\u0001\u0000\u0000\u0000\u01c6\u01c9\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c8\u01cd\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cc\u0005\n\u0000\u0000\u01cb\u01ca\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ceK\u0001\u0000\u0000\u0000"+
		"\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d2\u0005\u000e\u0000\u0000"+
		"\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4\u0003X,\u0000\u01d4M"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d6\u0003P(\u0000\u01d6\u01d7\u0005\r"+
		"\u0000\u0000\u01d7\u01d8\u0003X,\u0000\u01d8\u01f4\u0001\u0000\u0000\u0000"+
		"\u01d9\u01da\u0005\u0003\u0000\u0000\u01da\u01db\u0003X,\u0000\u01db\u01dc"+
		"\u0005\u0004\u0000\u0000\u01dc\u01dd\u0005\r\u0000\u0000\u01dd\u01de\u0003"+
		"X,\u0000\u01de\u01f4\u0001\u0000\u0000\u0000\u01df\u01e1\u0005h\u0000"+
		"\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000\u01e2\u01e4\u0005\u0016\u0000"+
		"\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0003P(\u0000\u01e6"+
		"\u01e8\u0005\u0005\u0000\u0000\u01e7\u01e9\u0003>\u001f\u0000\u01e8\u01e7"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ea"+
		"\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005\u0006\u0000\u0000\u01eb\u01ec"+
		"\u0005\u0007\u0000\u0000\u01ec\u01ed\u0003D\"\u0000\u01ed\u01ee\u0005"+
		"\b\u0000\u0000\u01ee\u01f4\u0001\u0000\u0000\u0000\u01ef\u01f1\u0005\u000e"+
		"\u0000\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f4\u0003X,\u0000"+
		"\u01f3\u01d5\u0001\u0000\u0000\u0000\u01f3\u01d9\u0001\u0000\u0000\u0000"+
		"\u01f3\u01e0\u0001\u0000\u0000\u0000\u01f3\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f4O\u0001\u0000\u0000\u0000\u01f5\u01fc\u0003\u008cF\u0000\u01f6\u01fc"+
		"\u0005t\u0000\u0000\u01f7\u01f8\u0005\u0003\u0000\u0000\u01f8\u01f9\u0003"+
		"X,\u0000\u01f9\u01fa\u0005\u0004\u0000\u0000\u01fa\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fb\u01f5\u0001\u0000\u0000\u0000\u01fb\u01f6\u0001\u0000\u0000"+
		"\u0000\u01fb\u01f7\u0001\u0000\u0000\u0000\u01fcQ\u0001\u0000\u0000\u0000"+
		"\u01fd\u0209\u0005\u0005\u0000\u0000\u01fe\u0203\u0003T*\u0000\u01ff\u0200"+
		"\u0005\n\u0000\u0000\u0200\u0202\u0003T*\u0000\u0201\u01ff\u0001\u0000"+
		"\u0000\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000"+
		"\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0207\u0001\u0000"+
		"\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0206\u0208\u0005\n\u0000"+
		"\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000"+
		"\u0000\u0208\u020a\u0001\u0000\u0000\u0000\u0209\u01fe\u0001\u0000\u0000"+
		"\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000"+
		"\u0000\u020b\u020c\u0005\u0006\u0000\u0000\u020cS\u0001\u0000\u0000\u0000"+
		"\u020d\u020f\u0005\u000e\u0000\u0000\u020e\u020d\u0001\u0000\u0000\u0000"+
		"\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0212\u0001\u0000\u0000\u0000"+
		"\u0210\u0213\u0003X,\u0000\u0211\u0213\u0003\u008eG\u0000\u0212\u0210"+
		"\u0001\u0000\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0213U\u0001"+
		"\u0000\u0000\u0000\u0214\u0216\u0005\u000e\u0000\u0000\u0215\u0214\u0001"+
		"\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0217\u0001"+
		"\u0000\u0000\u0000\u0217\u021f\u0003X,\u0000\u0218\u021a\u0005\n\u0000"+
		"\u0000\u0219\u021b\u0005\u000e\u0000\u0000\u021a\u0219\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000"+
		"\u0000\u021c\u021e\u0003X,\u0000\u021d\u0218\u0001\u0000\u0000\u0000\u021e"+
		"\u0221\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f"+
		"\u0220\u0001\u0000\u0000\u0000\u0220W\u0001\u0000\u0000\u0000\u0221\u021f"+
		"\u0001\u0000\u0000\u0000\u0222\u0223\u0006,\uffff\uffff\u0000\u0223\u0236"+
		"\u0003\u0080@\u0000\u0224\u0225\u0005O\u0000\u0000\u0225\u0236\u0003X"+
		",\u0014\u0226\u0227\u0005g\u0000\u0000\u0227\u0228\u0005\u0005\u0000\u0000"+
		"\u0228\u0229\u0003X,\u0000\u0229\u022a\u0005\u0006\u0000\u0000\u022a\u0236"+
		"\u0001\u0000\u0000\u0000\u022b\u0236\u0005V\u0000\u0000\u022c\u0236\u0003"+
		"\u008eG\u0000\u022d\u0236\u0003\u0086C\u0000\u022e\u0236\u0003H$\u0000"+
		"\u022f\u0236\u0003z=\u0000\u0230\u0236\u0003Z-\u0000\u0231\u0232\u0005"+
		"\u0005\u0000\u0000\u0232\u0233\u0003V+\u0000\u0233\u0234\u0005\u0006\u0000"+
		"\u0000\u0234\u0236\u0001\u0000\u0000\u0000\u0235\u0222\u0001\u0000\u0000"+
		"\u0000\u0235\u0224\u0001\u0000\u0000\u0000\u0235\u0226\u0001\u0000\u0000"+
		"\u0000\u0235\u022b\u0001\u0000\u0000\u0000\u0235\u022c\u0001\u0000\u0000"+
		"\u0000\u0235\u022d\u0001\u0000\u0000\u0000\u0235\u022e\u0001\u0000\u0000"+
		"\u0000\u0235\u022f\u0001\u0000\u0000\u0000\u0235\u0230\u0001\u0000\u0000"+
		"\u0000\u0235\u0231\u0001\u0000\u0000\u0000\u0236\u026c\u0001\u0000\u0000"+
		"\u0000\u0237\u0238\n\u0013\u0000\u0000\u0238\u0239\u0007\u0001\u0000\u0000"+
		"\u0239\u026b\u0003X,\u0014\u023a\u023b\n\u0012\u0000\u0000\u023b\u023c"+
		"\u0007\u0002\u0000\u0000\u023c\u026b\u0003X,\u0013\u023d\u023e\n\u0011"+
		"\u0000\u0000\u023e\u023f\u0007\u0003\u0000\u0000\u023f\u026b\u0003X,\u0012"+
		"\u0240\u0241\n\u0010\u0000\u0000\u0241\u0242\u0007\u0004\u0000\u0000\u0242"+
		"\u026b\u0003X,\u0011\u0243\u0244\n\u000f\u0000\u0000\u0244\u0245\u0005"+
		"\'\u0000\u0000\u0245\u026b\u0003X,\u0010\u0246\u0247\n\u000e\u0000\u0000"+
		"\u0247\u0248\u0005(\u0000\u0000\u0248\u026b\u0003X,\u000f\u0249\u024a"+
		"\n\r\u0000\u0000\u024a\u024b\u0005)\u0000\u0000\u024b\u026b\u0003X,\u000e"+
		"\u024c\u024d\n\f\u0000\u0000\u024d\u024e\u0005*\u0000\u0000\u024e\u026b"+
		"\u0003X,\r\u024f\u0250\n\u000b\u0000\u0000\u0250\u0251\u0005+\u0000\u0000"+
		"\u0251\u026b\u0003X,\f\u0252\u0253\n\n\u0000\u0000\u0253\u0254\u0005\f"+
		"\u0000\u0000\u0254\u0255\u0003X,\u0000\u0255\u0256\u0005\r\u0000\u0000"+
		"\u0256\u0257\u0003X,\u000b\u0257\u026b\u0001\u0000\u0000\u0000\u0258\u0259"+
		"\n\u0017\u0000\u0000\u0259\u025a\u0005\u0003\u0000\u0000\u025a\u025b\u0003"+
		"V+\u0000\u025b\u025c\u0005\u0004\u0000\u0000\u025c\u026b\u0001\u0000\u0000"+
		"\u0000\u025d\u025f\n\u0016\u0000\u0000\u025e\u0260\u0005\f\u0000\u0000"+
		"\u025f\u025e\u0001\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000"+
		"\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0263\u0005\u000f\u0000\u0000"+
		"\u0262\u0264\u0005\u001b\u0000\u0000\u0263\u0262\u0001\u0000\u0000\u0000"+
		"\u0263\u0264\u0001\u0000\u0000\u0000\u0264\u0265\u0001\u0000\u0000\u0000"+
		"\u0265\u026b\u0003\u008cF\u0000\u0266\u0267\n\u0015\u0000\u0000\u0267"+
		"\u026b\u0003R)\u0000\u0268\u0269\n\b\u0000\u0000\u0269\u026b\u0003\u0088"+
		"D\u0000\u026a\u0237\u0001\u0000\u0000\u0000\u026a\u023a\u0001\u0000\u0000"+
		"\u0000\u026a\u023d\u0001\u0000\u0000\u0000\u026a\u0240\u0001\u0000\u0000"+
		"\u0000\u026a\u0243\u0001\u0000\u0000\u0000\u026a\u0246\u0001\u0000\u0000"+
		"\u0000\u026a\u0249\u0001\u0000\u0000\u0000\u026a\u024c\u0001\u0000\u0000"+
		"\u0000\u026a\u024f\u0001\u0000\u0000\u0000\u026a\u0252\u0001\u0000\u0000"+
		"\u0000\u026a\u0258\u0001\u0000\u0000\u0000\u026a\u025d\u0001\u0000\u0000"+
		"\u0000\u026a\u0266\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000"+
		"\u0000\u026b\u026e\u0001\u0000\u0000\u0000\u026c\u026a\u0001\u0000\u0000"+
		"\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026dY\u0001\u0000\u0000\u0000"+
		"\u026e\u026c\u0001\u0000\u0000\u0000\u026f\u0271\u0003^/\u0000\u0270\u026f"+
		"\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0270"+
		"\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273[\u0001"+
		"\u0000\u0000\u0000\u0274\u0275\u0007\u0005\u0000\u0000\u0275]\u0001\u0000"+
		"\u0000\u0000\u0276\u027c\u0003`0\u0000\u0277\u0278\u0003b1\u0000\u0278"+
		"\u0279\u0003f3\u0000\u0279\u027a\u0003d2\u0000\u027a\u027c\u0001\u0000"+
		"\u0000\u0000\u027b\u0276\u0001\u0000\u0000\u0000\u027b\u0277\u0001\u0000"+
		"\u0000\u0000\u027c_\u0001\u0000\u0000\u0000\u027d\u027e\u0003\\.\u0000"+
		"\u027e\u0280\u0003h4\u0000\u027f\u0281\u0003n7\u0000\u0280\u027f\u0001"+
		"\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u0282\u0001"+
		"\u0000\u0000\u0000\u0282\u0283\u0005\u0085\u0000\u0000\u0283a\u0001\u0000"+
		"\u0000\u0000\u0284\u0285\u0003\\.\u0000\u0285\u0287\u0003j5\u0000\u0286"+
		"\u0288\u0003n7\u0000\u0287\u0286\u0001\u0000\u0000\u0000\u0287\u0288\u0001"+
		"\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028a\u0005"+
		"\u0084\u0000\u0000\u028ac\u0001\u0000\u0000\u0000\u028b\u028c\u0005\u008e"+
		"\u0000\u0000\u028c\u028d\u0003l6\u0000\u028d\u028e\u0005\u0090\u0000\u0000"+
		"\u028ee\u0001\u0000\u0000\u0000\u028f\u0291\u0005\u008c\u0000\u0000\u0290"+
		"\u028f\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291"+
		"\u029b\u0001\u0000\u0000\u0000\u0292\u0295\u0003^/\u0000\u0293\u0295\u0003"+
		"~?\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0294\u0293\u0001\u0000\u0000"+
		"\u0000\u0295\u0297\u0001\u0000\u0000\u0000\u0296\u0298\u0005\u008c\u0000"+
		"\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000"+
		"\u0000\u0298\u029a\u0001\u0000\u0000\u0000\u0299\u0294\u0001\u0000\u0000"+
		"\u0000\u029a\u029d\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000\u0000"+
		"\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029cg\u0001\u0000\u0000\u0000"+
		"\u029d\u029b\u0001\u0000\u0000\u0000\u029e\u02a0\u0005\u0088\u0000\u0000"+
		"\u029f\u029e\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000"+
		"\u02a0i\u0001\u0000\u0000\u0000\u02a1\u02a3\u0005\u0088\u0000\u0000\u02a2"+
		"\u02a1\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3"+
		"k\u0001\u0000\u0000\u0000\u02a4\u02a6\u0005\u0091\u0000\u0000\u02a5\u02a4"+
		"\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6m\u0001"+
		"\u0000\u0000\u0000\u02a7\u02a9\u0003p8\u0000\u02a8\u02aa\u0003n7\u0000"+
		"\u02a9\u02a8\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000"+
		"\u02aa\u02b0\u0001\u0000\u0000\u0000\u02ab\u02ad\u0003r9\u0000\u02ac\u02ae"+
		"\u0003n7\u0000\u02ad\u02ac\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000"+
		"\u0000\u0000\u02ae\u02b0\u0001\u0000\u0000\u0000\u02af\u02a7\u0001\u0000"+
		"\u0000\u0000\u02af\u02ab\u0001\u0000\u0000\u0000\u02b0o\u0001\u0000\u0000"+
		"\u0000\u02b1\u02b2\u0005\u0087\u0000\u0000\u02b2\u02b3\u0005\u000e\u0000"+
		"\u0000\u02b3\u02b4\u0003X,\u0000\u02b4\u02b5\u0005\b\u0000\u0000\u02b5"+
		"q\u0001\u0000\u0000\u0000\u02b6\u02b7\u0003t:\u0000\u02b7\u02b8\u0005"+
		"\u0086\u0000\u0000\u02b8\u02b9\u0003v;\u0000\u02b9\u02bc\u0001\u0000\u0000"+
		"\u0000\u02ba\u02bc\u0003t:\u0000\u02bb\u02b6\u0001\u0000\u0000\u0000\u02bb"+
		"\u02ba\u0001\u0000\u0000\u0000\u02bcs\u0001\u0000\u0000\u0000\u02bd\u02be"+
		"\u0005\u0088\u0000\u0000\u02beu\u0001\u0000\u0000\u0000\u02bf\u02c3\u0005"+
		"\u008b\u0000\u0000\u02c0\u02c3\u0003^/\u0000\u02c1\u02c3\u0003~?\u0000"+
		"\u02c2\u02bf\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000\u0000\u0000"+
		"\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c3w\u0001\u0000\u0000\u0000\u02c4"+
		"\u02c8\u0003\u008eG\u0000\u02c5\u02c8\u0003H$\u0000\u02c6\u02c8\u0003"+
		"z=\u0000\u02c7\u02c4\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c8y\u0001\u0000\u0000\u0000"+
		"\u02c9\u02d5\u0005\u0007\u0000\u0000\u02ca\u02cf\u0003N\'\u0000\u02cb"+
		"\u02cc\u0005\n\u0000\u0000\u02cc\u02ce\u0003N\'\u0000\u02cd\u02cb\u0001"+
		"\u0000\u0000\u0000\u02ce\u02d1\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001"+
		"\u0000\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d0\u02d3\u0001"+
		"\u0000\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d2\u02d4\u0005"+
		"\n\u0000\u0000\u02d3\u02d2\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000"+
		"\u0000\u0000\u02d4\u02d6\u0001\u0000\u0000\u0000\u02d5\u02ca\u0001\u0000"+
		"\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000"+
		"\u0000\u0000\u02d7\u02d8\u0005\b\u0000\u0000\u02d8{\u0001\u0000\u0000"+
		"\u0000\u02d9\u02da\u0007\u0006\u0000\u0000\u02da}\u0001\u0000\u0000\u0000"+
		"\u02db\u02dc\u0003|>\u0000\u02dc\u02dd\u0003V+\u0000\u02dd\u02de\u0005"+
		"\b\u0000\u0000\u02de\u007f\u0001\u0000\u0000\u0000\u02df\u02f8\u0003<"+
		"\u001e\u0000\u02e0\u02e2\u0005h\u0000\u0000\u02e1\u02e0\u0001\u0000\u0000"+
		"\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000"+
		"\u0000\u02e3\u02e5\u0005U\u0000\u0000\u02e4\u02e6\u0005\u0016\u0000\u0000"+
		"\u02e5\u02e4\u0001\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000"+
		"\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02e9\u0005\u0005\u0000\u0000"+
		"\u02e8\u02ea\u0003>\u001f\u0000\u02e9\u02e8\u0001\u0000\u0000\u0000\u02e9"+
		"\u02ea\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb"+
		"\u02ec\u0005\u0006\u0000\u0000\u02ec\u02ed\u0005\u0007\u0000\u0000\u02ed"+
		"\u02ee\u0003D\"\u0000\u02ee\u02ef\u0005\b\u0000\u0000\u02ef\u02f8\u0001"+
		"\u0000\u0000\u0000\u02f0\u02f2\u0005h\u0000\u0000\u02f1\u02f0\u0001\u0000"+
		"\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000"+
		"\u0000\u0000\u02f3\u02f4\u0003\u0082A\u0000\u02f4\u02f5\u00058\u0000\u0000"+
		"\u02f5\u02f6\u0003\u0084B\u0000\u02f6\u02f8\u0001\u0000\u0000\u0000\u02f7"+
		"\u02df\u0001\u0000\u0000\u0000\u02f7\u02e1\u0001\u0000\u0000\u0000\u02f7"+
		"\u02f1\u0001\u0000\u0000\u0000\u02f8\u0081\u0001\u0000\u0000\u0000\u02f9"+
		"\u0300\u0003\u008eG\u0000\u02fa\u02fc\u0005\u0005\u0000\u0000\u02fb\u02fd"+
		"\u0003>\u001f\u0000\u02fc\u02fb\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001"+
		"\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe\u0300\u0005"+
		"\u0006\u0000\u0000\u02ff\u02f9\u0001\u0000\u0000\u0000\u02ff\u02fa\u0001"+
		"\u0000\u0000\u0000\u0300\u0083\u0001\u0000\u0000\u0000\u0301\u0307\u0003"+
		"X,\u0000\u0302\u0303\u0005\u0007\u0000\u0000\u0303\u0304\u0003D\"\u0000"+
		"\u0304\u0305\u0005\b\u0000\u0000\u0305\u0307\u0001\u0000\u0000\u0000\u0306"+
		"\u0301\u0001\u0000\u0000\u0000\u0306\u0302\u0001\u0000\u0000\u0000\u0307"+
		"\u0085\u0001\u0000\u0000\u0000\u0308\u030f\u00059\u0000\u0000\u0309\u030f"+
		"\u0005:\u0000\u0000\u030a\u030f\u0005t\u0000\u0000\u030b\u030f\u0003\u0088"+
		"D\u0000\u030c\u030f\u0005|\u0000\u0000\u030d\u030f\u0005;\u0000\u0000"+
		"\u030e\u0308\u0001\u0000\u0000\u0000\u030e\u0309\u0001\u0000\u0000\u0000"+
		"\u030e\u030a\u0001\u0000\u0000\u0000\u030e\u030b\u0001\u0000\u0000\u0000"+
		"\u030e\u030c\u0001\u0000\u0000\u0000\u030e\u030d\u0001\u0000\u0000\u0000"+
		"\u030f\u0087\u0001\u0000\u0000\u0000\u0310\u0314\u0005v\u0000\u0000\u0311"+
		"\u0313\u0003\u008aE\u0000\u0312\u0311\u0001\u0000\u0000\u0000\u0313\u0316"+
		"\u0001\u0000\u0000\u0000\u0314\u0312\u0001\u0000\u0000\u0000\u0314\u0315"+
		"\u0001\u0000\u0000\u0000\u0315\u0317\u0001\u0000\u0000\u0000\u0316\u0314"+
		"\u0001\u0000\u0000\u0000\u0317\u0318\u0005v\u0000\u0000\u0318\u0089\u0001"+
		"\u0000\u0000\u0000\u0319\u031f\u0005\u0082\u0000\u0000\u031a\u031b\u0005"+
		"\u0081\u0000\u0000\u031b\u031c\u0003X,\u0000\u031c\u031d\u0005\b\u0000"+
		"\u0000\u031d\u031f\u0001\u0000\u0000\u0000\u031e\u0319\u0001\u0000\u0000"+
		"\u0000\u031e\u031a\u0001\u0000\u0000\u0000\u031f\u008b\u0001\u0000\u0000"+
		"\u0000\u0320\u0323\u0003\u008eG\u0000\u0321\u0323\u0003\u0090H\u0000\u0322"+
		"\u0320\u0001\u0000\u0000\u0000\u0322\u0321\u0001\u0000\u0000\u0000\u0323"+
		"\u008d\u0001\u0000\u0000\u0000\u0324\u0325\u0007\u0007\u0000\u0000\u0325"+
		"\u008f\u0001\u0000\u0000\u0000\u0326\u032a\u0003\u0092I\u0000\u0327\u032a"+
		"\u00059\u0000\u0000\u0328\u032a\u0005:\u0000\u0000\u0329\u0326\u0001\u0000"+
		"\u0000\u0000\u0329\u0327\u0001\u0000\u0000\u0000\u0329\u0328\u0001\u0000"+
		"\u0000\u0000\u032a\u0091\u0001\u0000\u0000\u0000\u032b\u032c\u0007\b\u0000"+
		"\u0000\u032c\u0093\u0001\u0000\u0000\u0000\u032d\u032f\u0007\t\u0000\u0000"+
		"\u032e\u032d\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000\u0000"+
		"\u032f\u0095\u0001\u0000\u0000\u0000h\u0097\u009a\u00ac\u00b0\u00b7\u00bd"+
		"\u00c1\u00c8\u00d0\u00d5\u00d7\u00e0\u00e4\u00ec\u00f1\u00f9\u00fb\u0103"+
		"\u0107\u010b\u0116\u011c\u0128\u012e\u0132\u0136\u013e\u0145\u014b\u0154"+
		"\u0164\u0168\u016a\u0171\u0177\u017c\u0183\u0187\u018c\u0198\u019d\u01a0"+
		"\u01a5\u01ab\u01b0\u01b9\u01bd\u01c2\u01c7\u01cd\u01d1\u01e0\u01e3\u01e8"+
		"\u01f0\u01f3\u01fb\u0203\u0207\u0209\u020e\u0212\u0215\u021a\u021f\u0235"+
		"\u025f\u0263\u026a\u026c\u0272\u027b\u0280\u0287\u0290\u0294\u0297\u029b"+
		"\u029f\u02a2\u02a5\u02a9\u02ad\u02af\u02bb\u02c2\u02c7\u02cf\u02d3\u02d5"+
		"\u02e1\u02e5\u02e9\u02f1\u02f7\u02fc\u02ff\u0306\u030e\u0314\u031e\u0322"+
		"\u0329\u032e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}