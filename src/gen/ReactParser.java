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
		RULE_moduleItems = 7, RULE_importNamespace = 8, RULE_importFrom = 9, RULE_aliasName = 10, 
		RULE_exportStatement = 11, RULE_exportFromBlock = 12, RULE_declaration = 13, 
		RULE_variableStatement = 14, RULE_variableDeclarationList = 15, RULE_variableDeclaration = 16, 
		RULE_expressionStatement = 17, RULE_ifStatement = 18, RULE_iterationStatement = 19, 
		RULE_varModifier = 20, RULE_returnStatement = 21, RULE_withStatement = 22, 
		RULE_labelledStatement = 23, RULE_functionDeclaration = 24, RULE_formalParameterList = 25, 
		RULE_formalParameterArg = 26, RULE_lastFormalParameterArg = 27, RULE_functionBody = 28, 
		RULE_sourceElements = 29, RULE_arrayLiteral = 30, RULE_elementList = 31, 
		RULE_arrayElement = 32, RULE_propertyAssignment = 33, RULE_propertyName = 34, 
		RULE_arguments = 35, RULE_argument = 36, RULE_expressionSequence = 37, 
		RULE_singleExpression = 38, RULE_jsxElements = 39, RULE_jsxElementBegin = 40, 
		RULE_jsxElement = 41, RULE_jsxSelfClosingElement = 42, RULE_jsxOpeningElement = 43, 
		RULE_jsxClosingElement = 44, RULE_jsxChildren = 45, RULE_jsxSelfClosingElementName = 46, 
		RULE_jsxOpeningElementName = 47, RULE_jsxClosingElementName = 48, RULE_jsxAttributes = 49, 
		RULE_jsxSpreadAttribute = 50, RULE_jsxAttribute = 51, RULE_jsxAttributeName = 52, 
		RULE_jsxAttributeValue = 53, RULE_assignable = 54, RULE_objectLiteral = 55, 
		RULE_openBrace = 56, RULE_objectExpressionSequence = 57, RULE_anoymousFunction = 58, 
		RULE_arrowFunctionParameters = 59, RULE_arrowFunctionBody = 60, RULE_literal = 61, 
		RULE_templateStringLiteral = 62, RULE_templateStringAtom = 63, RULE_eos = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sourceElement", "statement", "block", "statementList", "importStatement", 
			"importFromBlock", "moduleItems", "importNamespace", "importFrom", "aliasName", 
			"exportStatement", "exportFromBlock", "declaration", "variableStatement", 
			"variableDeclarationList", "variableDeclaration", "expressionStatement", 
			"ifStatement", "iterationStatement", "varModifier", "returnStatement", 
			"withStatement", "labelledStatement", "functionDeclaration", "formalParameterList", 
			"formalParameterArg", "lastFormalParameterArg", "functionBody", "sourceElements", 
			"arrayLiteral", "elementList", "arrayElement", "propertyAssignment", 
			"propertyName", "arguments", "argument", "expressionSequence", "singleExpression", 
			"jsxElements", "jsxElementBegin", "jsxElement", "jsxSelfClosingElement", 
			"jsxOpeningElement", "jsxClosingElement", "jsxChildren", "jsxSelfClosingElementName", 
			"jsxOpeningElementName", "jsxClosingElementName", "jsxAttributes", "jsxSpreadAttribute", 
			"jsxAttribute", "jsxAttributeName", "jsxAttributeValue", "assignable", 
			"objectLiteral", "openBrace", "objectExpressionSequence", "anoymousFunction", 
			"arrowFunctionParameters", "arrowFunctionBody", "literal", "templateStringLiteral", 
			"templateStringAtom", "eos"
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
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HashBangLine) {
				{
				setState(130);
				match(HashBangLine);
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 72632643920878681L) != 0) || _la==JsxChildrenOpeningElementBegin) {
				{
				setState(133);
				sourceElements();
				}
			}

			setState(136);
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
			setState(138);
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				importStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				exportStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				expressionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				ifStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				iterationStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(147);
				returnStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(148);
				withStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(149);
				labelledStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(150);
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
			setState(153);
			match(OpenBrace);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 72632643920878681L) != 0) || _la==JsxChildrenOpeningElementBegin) {
				{
				setState(154);
				statementList();
				}
			}

			setState(157);
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
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				statement();
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 72632643920878681L) != 0) || _la==JsxChildrenOpeningElementBegin );
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
			setState(164);
			match(Import);
			setState(165);
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
		public AliasNameContext aliasName() {
			return getRuleContext(AliasNameContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ReactParser.Comma, 0); }
		public ModuleItemsContext moduleItems() {
			return getRuleContext(ModuleItemsContext.class,0);
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
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
			case Multiply:
			case From:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					{
					setState(167);
					importNamespace();
					}
					}
					break;
				case 2:
					{
					{
					setState(168);
					aliasName();
					setState(169);
					match(Comma);
					setState(170);
					moduleItems();
					}
					}
					break;
				case 3:
					{
					{
					setState(172);
					moduleItems();
					}
					}
					break;
				}
				setState(175);
				importFrom();
				setState(176);
				eos();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(StringLiteral);
				setState(179);
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
			setState(182);
			match(OpenBrace);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					aliasName();
					setState(184);
					match(Comma);
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(191);
				aliasName();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(192);
					match(Comma);
					}
				}

				}
			}

			setState(197);
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
	public static class ImportNamespaceContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ReactParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ReactParser.Identifier, i);
		}
		public TerminalNode As() { return getToken(ReactParser.As, 0); }
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
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
		enterRule(_localctx, 16, RULE_importNamespace);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(200);
					match(Identifier);
					setState(201);
					match(As);
					setState(202);
					match(Identifier);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(205);
				match(Multiply);
				setState(206);
				match(As);
				setState(207);
				match(Identifier);
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
		enterRule(_localctx, 18, RULE_importFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(From);
			setState(211);
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
		public List<TerminalNode> Identifier() { return getTokens(ReactParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ReactParser.Identifier, i);
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
		enterRule(_localctx, 20, RULE_aliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(Identifier);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(214);
				match(As);
				setState(215);
				match(Identifier);
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
		enterRule(_localctx, 22, RULE_exportStatement);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ExportDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(Export);
				setState(221);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBrace:
				case Multiply:
				case From:
				case Identifier:
					{
					setState(219);
					exportFromBlock();
					}
					break;
				case Var:
				case Function_:
				case Const:
				case Async:
				case Let:
					{
					setState(220);
					declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(223);
				eos();
				}
				break;
			case 2:
				_localctx = new ExportDefaultDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(Export);
				setState(226);
				match(Default);
				setState(227);
				singleExpression(0);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(228);
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
		enterRule(_localctx, 24, RULE_exportFromBlock);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
			case From:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				importNamespace();
				setState(234);
				importFrom();
				setState(235);
				eos();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				moduleItems();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==From) {
					{
					setState(238);
					importFrom();
					}
				}

				setState(241);
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
		enterRule(_localctx, 26, RULE_declaration);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
			case Const:
			case Let:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				variableStatement();
				}
				break;
			case Function_:
			case Async:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
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
		enterRule(_localctx, 28, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			variableDeclarationList();
			setState(250);
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
		enterRule(_localctx, 30, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			varModifier();
			setState(253);
			variableDeclaration();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(254);
				match(Comma);
				setState(255);
				variableDeclaration();
				}
				}
				setState(260);
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
		enterRule(_localctx, 32, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			assignable();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(262);
				match(Assign);
				setState(263);
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
		enterRule(_localctx, 34, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			expressionSequence();
			setState(267);
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
		enterRule(_localctx, 36, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(If);
			setState(270);
			match(OpenParen);
			setState(271);
			expressionSequence();
			setState(272);
			match(CloseParen);
			setState(273);
			statement();
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(274);
				match(Else);
				setState(275);
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
		enterRule(_localctx, 38, RULE_iterationStatement);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(For);
				setState(279);
				match(OpenParen);
				setState(282);
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
					setState(280);
					expressionSequence();
					}
					break;
				case Var:
				case Const:
				case Let:
					{
					setState(281);
					variableDeclarationList();
					}
					break;
				case SemiColon:
					break;
				default:
					break;
				}
				setState(284);
				match(SemiColon);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 4616225558391423169L) != 0)) {
					{
					setState(285);
					expressionSequence();
					}
				}

				setState(288);
				match(SemiColon);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 4616225558391423169L) != 0)) {
					{
					setState(289);
					expressionSequence();
					}
				}

				setState(292);
				match(CloseParen);
				setState(293);
				statement();
				}
				break;
			case 2:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(For);
				setState(295);
				match(OpenParen);
				setState(298);
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
					setState(296);
					singleExpression(0);
					}
					break;
				case Var:
				case Const:
				case Let:
					{
					setState(297);
					variableDeclarationList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(300);
				match(In);
				setState(301);
				expressionSequence();
				setState(302);
				match(CloseParen);
				setState(303);
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
		enterRule(_localctx, 40, RULE_varModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
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
		enterRule(_localctx, 42, RULE_returnStatement);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(Return);
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(310);
					expressionSequence();
					}
					break;
				}
				setState(313);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(Return);
				setState(315);
				match(OpenParen);
				setState(316);
				jsxElements();
				setState(317);
				match(CloseParen);
				setState(318);
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
		enterRule(_localctx, 44, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(With);
			setState(323);
			match(OpenParen);
			setState(324);
			expressionSequence();
			setState(325);
			match(CloseParen);
			setState(326);
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
	public static class LabelledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
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
		enterRule(_localctx, 46, RULE_labelledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(Identifier);
			setState(329);
			match(Colon);
			setState(330);
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
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
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
		enterRule(_localctx, 48, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Async) {
				{
				setState(332);
				match(Async);
				}
			}

			setState(335);
			match(Function_);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Multiply) {
				{
				setState(336);
				match(Multiply);
				}
			}

			setState(339);
			match(Identifier);
			setState(340);
			match(OpenParen);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16520L) != 0) || _la==Identifier) {
				{
				setState(341);
				formalParameterList();
				}
			}

			setState(344);
			match(CloseParen);
			setState(345);
			match(OpenBrace);
			setState(346);
			functionBody();
			setState(347);
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
		enterRule(_localctx, 50, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
			case OpenBrace:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				formalParameterArg();
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(350);
						match(Comma);
						setState(351);
						formalParameterArg();
						}
						} 
					}
					setState(356);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(357);
					match(Comma);
					setState(358);
					lastFormalParameterArg();
					}
				}

				}
				break;
			case Ellipsis:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
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
		enterRule(_localctx, 52, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			assignable();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(365);
				match(Assign);
				setState(366);
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
		enterRule(_localctx, 54, RULE_lastFormalParameterArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(Ellipsis);
			setState(370);
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
		enterRule(_localctx, 56, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 72632643920878681L) != 0) || _la==JsxChildrenOpeningElementBegin) {
				{
				setState(372);
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
		enterRule(_localctx, 58, RULE_sourceElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(375);
				sourceElement();
				}
				}
				setState(378); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 72632643920878681L) != 0) || _la==JsxChildrenOpeningElementBegin );
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
		enterRule(_localctx, 60, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(380);
			match(OpenBracket);
			setState(381);
			elementList();
			setState(382);
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
		enterRule(_localctx, 62, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(384);
					match(Comma);
					}
					} 
				}
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 4616225558391423169L) != 0)) {
				{
				setState(390);
				arrayElement();
				}
			}

			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(394); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(393);
						match(Comma);
						}
						}
						setState(396); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					setState(398);
					arrayElement();
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(404);
				match(Comma);
				}
				}
				setState(409);
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
		enterRule(_localctx, 64, RULE_arrayElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(410);
				match(Ellipsis);
				}
			}

			setState(413);
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
		enterRule(_localctx, 66, RULE_propertyAssignment);
		int _la;
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				propertyName();
				setState(416);
				match(Colon);
				setState(417);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new ComputedPropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(OpenBracket);
				setState(420);
				singleExpression(0);
				setState(421);
				match(CloseBracket);
				setState(422);
				match(Colon);
				setState(423);
				singleExpression(0);
				}
				break;
			case 3:
				_localctx = new FunctionPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Async) {
					{
					setState(425);
					match(Async);
					}
				}

				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiply) {
					{
					setState(428);
					match(Multiply);
					}
				}

				setState(431);
				propertyName();
				setState(432);
				match(OpenParen);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16520L) != 0) || _la==Identifier) {
					{
					setState(433);
					formalParameterList();
					}
				}

				setState(436);
				match(CloseParen);
				setState(437);
				match(OpenBrace);
				setState(438);
				functionBody();
				setState(439);
				match(CloseBrace);
				}
				break;
			case 4:
				_localctx = new PropertyShorthandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(441);
					match(Ellipsis);
					}
				}

				setState(444);
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
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
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
		enterRule(_localctx, 68, RULE_propertyName);
		try {
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(Identifier);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(StringLiteral);
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				match(OpenBracket);
				setState(450);
				singleExpression(0);
				setState(451);
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
		enterRule(_localctx, 70, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(OpenParen);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316531007660L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 4616225558391423169L) != 0)) {
				{
				setState(456);
				argument();
				setState(461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(457);
						match(Comma);
						setState(458);
						argument();
						}
						} 
					}
					setState(463);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(464);
					match(Comma);
					}
				}

				}
			}

			setState(469);
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
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
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
		enterRule(_localctx, 72, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(471);
				match(Ellipsis);
				}
			}

			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(474);
				singleExpression(0);
				}
				break;
			case 2:
				{
				setState(475);
				match(Identifier);
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
		enterRule(_localctx, 74, RULE_expressionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(478);
				match(Ellipsis);
				}
			}

			setState(481);
			singleExpression(0);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(482);
				match(Comma);
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(483);
					match(Ellipsis);
					}
				}

				setState(486);
				singleExpression(0);
				}
				}
				setState(491);
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
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
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
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(493);
				anoymousFunction();
				}
				break;
			case 2:
				{
				_localctx = new VoidExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(494);
				match(Void);
				setState(495);
				singleExpression(20);
				}
				break;
			case 3:
				{
				_localctx = new ImportExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(496);
				match(Import);
				setState(497);
				match(OpenParen);
				setState(498);
				singleExpression(0);
				setState(499);
				match(CloseParen);
				}
				break;
			case 4:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(501);
				match(This);
				}
				break;
			case 5:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(502);
				match(Identifier);
				}
				break;
			case 6:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(503);
				literal();
				}
				break;
			case 7:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(504);
				arrayLiteral();
				}
				break;
			case 8:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(505);
				objectLiteral();
				}
				break;
			case 9:
				{
				_localctx = new JsxElementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(506);
				jsxElements();
				}
				break;
			case 10:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(507);
				match(OpenParen);
				setState(508);
				expressionSequence();
				setState(509);
				match(CloseParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(564);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(513);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(514);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(515);
						singleExpression(20);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(516);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(517);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(518);
						singleExpression(19);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(519);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(520);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(521);
						singleExpression(18);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(522);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(523);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(524);
						singleExpression(17);
						}
						break;
					case 5:
						{
						_localctx = new BitAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(525);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(526);
						match(BitAnd);
						setState(527);
						singleExpression(16);
						}
						break;
					case 6:
						{
						_localctx = new BitXOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(528);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(529);
						match(BitXOr);
						setState(530);
						singleExpression(15);
						}
						break;
					case 7:
						{
						_localctx = new BitOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(531);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(532);
						match(BitOr);
						setState(533);
						singleExpression(14);
						}
						break;
					case 8:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(534);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(535);
						match(And);
						setState(536);
						singleExpression(13);
						}
						break;
					case 9:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(537);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(538);
						match(Or);
						setState(539);
						singleExpression(12);
						}
						break;
					case 10:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(540);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(541);
						match(QuestionMark);
						setState(542);
						singleExpression(0);
						setState(543);
						match(Colon);
						setState(544);
						singleExpression(11);
						}
						break;
					case 11:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(546);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(547);
						match(OpenBracket);
						setState(548);
						expressionSequence();
						setState(549);
						match(CloseBracket);
						}
						break;
					case 12:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(551);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(553);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMark) {
							{
							setState(552);
							match(QuestionMark);
							}
						}

						setState(555);
						match(Dot);
						setState(557);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Hashtag) {
							{
							setState(556);
							match(Hashtag);
							}
						}

						setState(559);
						match(Identifier);
						}
						break;
					case 13:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(560);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(561);
						arguments();
						}
						break;
					case 14:
						{
						_localctx = new TemplateStringExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(562);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(563);
						templateStringLiteral();
						}
						break;
					}
					} 
				}
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
		enterRule(_localctx, 78, RULE_jsxElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(570); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(569);
					jsxElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(572); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		enterRule(_localctx, 80, RULE_jsxElementBegin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
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
		enterRule(_localctx, 82, RULE_jsxElement);
		try {
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				jsxSelfClosingElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				jsxOpeningElement();
				setState(578);
				jsxChildren();
				setState(579);
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
		enterRule(_localctx, 84, RULE_jsxSelfClosingElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			jsxElementBegin();
			setState(584);
			jsxSelfClosingElementName();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JsxOpeningElementOpenBrace || _la==JsxOpeningElementId) {
				{
				setState(585);
				jsxAttributes();
				}
			}

			setState(588);
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
		enterRule(_localctx, 86, RULE_jsxOpeningElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			jsxElementBegin();
			setState(591);
			jsxOpeningElementName();
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JsxOpeningElementOpenBrace || _la==JsxOpeningElementId) {
				{
				setState(592);
				jsxAttributes();
				}
			}

			setState(595);
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
		enterRule(_localctx, 88, RULE_jsxClosingElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(JsxChildrenClosingElementSlashBegin);
			setState(598);
			jsxClosingElementName();
			setState(599);
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
		enterRule(_localctx, 90, RULE_jsxChildren);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HtmlChardata) {
				{
				setState(601);
				match(HtmlChardata);
				}
			}

			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JsxElementBegin || _la==OpenBrace || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 5137L) != 0)) {
				{
				{
				setState(606);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JsxElementBegin:
				case JsxOpeningElementBegin:
				case JsxChildrenOpeningElementBegin:
					{
					setState(604);
					jsxElement();
					}
					break;
				case OpenBrace:
				case JsxOpeningElementOpenBrace:
				case JsxChildrenOpenBrace:
					{
					setState(605);
					objectExpressionSequence();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HtmlChardata) {
					{
					setState(608);
					match(HtmlChardata);
					}
				}

				}
				}
				setState(615);
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
		enterRule(_localctx, 92, RULE_jsxSelfClosingElementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(616);
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
		enterRule(_localctx, 94, RULE_jsxOpeningElementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(619);
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
		enterRule(_localctx, 96, RULE_jsxClosingElementName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JsxClosingElementId) {
				{
				setState(622);
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
		enterRule(_localctx, 98, RULE_jsxAttributes);
		int _la;
		try {
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JsxOpeningElementOpenBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				jsxSpreadAttribute();
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JsxOpeningElementOpenBrace || _la==JsxOpeningElementId) {
					{
					setState(626);
					jsxAttributes();
					}
				}

				}
				break;
			case JsxOpeningElementId:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				jsxAttribute();
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JsxOpeningElementOpenBrace || _la==JsxOpeningElementId) {
					{
					setState(630);
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
		enterRule(_localctx, 100, RULE_jsxSpreadAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(JsxOpeningElementOpenBrace);
			setState(636);
			match(Ellipsis);
			setState(637);
			singleExpression(0);
			setState(638);
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
		enterRule(_localctx, 102, RULE_jsxAttribute);
		try {
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				jsxAttributeName();
				setState(641);
				match(JsxAssign);
				setState(642);
				jsxAttributeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
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
		enterRule(_localctx, 104, RULE_jsxAttributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
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
		enterRule(_localctx, 106, RULE_jsxAttributeValue);
		try {
			setState(652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JsxAttributeValue:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				match(JsxAttributeValue);
				}
				break;
			case JsxElementBegin:
			case JsxOpeningElementBegin:
			case JsxChildrenOpeningElementBegin:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				jsxElement();
				}
				break;
			case OpenBrace:
			case JsxOpeningElementOpenBrace:
			case JsxChildrenOpenBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(651);
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
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
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
		enterRule(_localctx, 108, RULE_assignable);
		try {
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				match(Identifier);
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(656);
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
		enterRule(_localctx, 110, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(OpenBrace);
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008806316535201964L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 4616225558391423169L) != 0)) {
				{
				setState(660);
				propertyAssignment();
				setState(665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(661);
						match(Comma);
						setState(662);
						propertyAssignment();
						}
						} 
					}
					setState(667);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(668);
					match(Comma);
					}
				}

				}
			}

			setState(673);
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
		enterRule(_localctx, 112, RULE_openBrace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
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
		enterRule(_localctx, 114, RULE_objectExpressionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			openBrace();
			setState(678);
			expressionSequence();
			setState(679);
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
		enterRule(_localctx, 116, RULE_anoymousFunction);
		int _la;
		try {
			setState(705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				_localctx = new FunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				functionDeclaration();
				}
				break;
			case 2:
				_localctx = new AnoymousFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Async) {
					{
					setState(682);
					match(Async);
					}
				}

				setState(685);
				match(Function_);
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiply) {
					{
					setState(686);
					match(Multiply);
					}
				}

				setState(689);
				match(OpenParen);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16520L) != 0) || _la==Identifier) {
					{
					setState(690);
					formalParameterList();
					}
				}

				setState(693);
				match(CloseParen);
				setState(694);
				match(OpenBrace);
				setState(695);
				functionBody();
				setState(696);
				match(CloseBrace);
				}
				break;
			case 3:
				_localctx = new ArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Async) {
					{
					setState(698);
					match(Async);
					}
				}

				setState(701);
				arrowFunctionParameters();
				setState(702);
				match(ARROW);
				setState(703);
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
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
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
		enterRule(_localctx, 118, RULE_arrowFunctionParameters);
		int _la;
		try {
			setState(713);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				match(Identifier);
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				match(OpenParen);
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16520L) != 0) || _la==Identifier) {
					{
					setState(709);
					formalParameterList();
					}
				}

				setState(712);
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
		enterRule(_localctx, 120, RULE_arrowFunctionBody);
		try {
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				singleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				match(OpenBrace);
				setState(717);
				functionBody();
				setState(718);
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
		enterRule(_localctx, 122, RULE_literal);
		try {
			setState(728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				match(BooleanLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(724);
				match(StringLiteral);
				}
				break;
			case BackTick:
				enterOuterAlt(_localctx, 4);
				{
				setState(725);
				templateStringLiteral();
				}
				break;
			case RegularExpressionLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(726);
				match(RegularExpressionLiteral);
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(727);
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
		enterRule(_localctx, 124, RULE_templateStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(BackTick);
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TemplateStringStartExpression || _la==TemplateStringAtom) {
				{
				{
				setState(731);
				templateStringAtom();
				}
				}
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(737);
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
		enterRule(_localctx, 126, RULE_templateStringAtom);
		try {
			setState(744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TemplateStringAtom:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				match(TemplateStringAtom);
				}
				break;
			case TemplateStringStartExpression:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				match(TemplateStringStartExpression);
				setState(741);
				singleExpression(0);
				setState(742);
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
		enterRule(_localctx, 128, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(746);
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
		case 38:
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
		"\u0004\u0001\u0093\u02ee\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"@\u0001\u0000\u0003\u0000\u0084\b\u0000\u0001\u0000\u0003\u0000\u0087"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0098\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u009c\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0004\u0004\u00a1\b\u0004\u000b\u0004\f\u0004\u00a2\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00ae\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b5\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00bb\b\u0007\n\u0007"+
		"\f\u0007\u00be\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c2\b\u0007"+
		"\u0003\u0007\u00c4\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00cc\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d1\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u00d9\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00de\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e6"+
		"\b\u000b\u0003\u000b\u00e8\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00f0\b\f\u0001\f\u0001\f\u0003\f\u00f4\b\f\u0001\r"+
		"\u0001\r\u0003\r\u00f8\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0101\b\u000f\n\u000f"+
		"\f\u000f\u0104\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0109\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0115\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u011b\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u011f\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0123\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u012b\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0132"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0138"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0141\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0003\u0018\u014e\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0152\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0157\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0161\b\u0019\n"+
		"\u0019\f\u0019\u0164\t\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0168"+
		"\b\u0019\u0001\u0019\u0003\u0019\u016b\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0170\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0003\u001c\u0176\b\u001c\u0001\u001d\u0004\u001d\u0179\b"+
		"\u001d\u000b\u001d\f\u001d\u017a\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0005\u001f\u0182\b\u001f\n\u001f\f\u001f\u0185\t\u001f"+
		"\u0001\u001f\u0003\u001f\u0188\b\u001f\u0001\u001f\u0004\u001f\u018b\b"+
		"\u001f\u000b\u001f\f\u001f\u018c\u0001\u001f\u0005\u001f\u0190\b\u001f"+
		"\n\u001f\f\u001f\u0193\t\u001f\u0001\u001f\u0005\u001f\u0196\b\u001f\n"+
		"\u001f\f\u001f\u0199\t\u001f\u0001 \u0003 \u019c\b \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u01ab\b!\u0001!\u0003!\u01ae\b!\u0001!\u0001!\u0001!\u0003!\u01b3"+
		"\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01bb\b!\u0001!\u0003"+
		"!\u01be\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01c6"+
		"\b\"\u0001#\u0001#\u0001#\u0001#\u0005#\u01cc\b#\n#\f#\u01cf\t#\u0001"+
		"#\u0003#\u01d2\b#\u0003#\u01d4\b#\u0001#\u0001#\u0001$\u0003$\u01d9\b"+
		"$\u0001$\u0001$\u0003$\u01dd\b$\u0001%\u0003%\u01e0\b%\u0001%\u0001%\u0001"+
		"%\u0003%\u01e5\b%\u0001%\u0005%\u01e8\b%\n%\f%\u01eb\t%\u0001&\u0001&"+
		"\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0200\b&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u022a\b&\u0001&\u0001&\u0003&\u022e\b&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0005&\u0235\b&\n&\f&\u0238\t&\u0001\'\u0004\'\u023b\b\'\u000b\'\f\'"+
		"\u023c\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0246\b"+
		")\u0001*\u0001*\u0001*\u0003*\u024b\b*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0003+\u0252\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001-\u0003"+
		"-\u025b\b-\u0001-\u0001-\u0003-\u025f\b-\u0001-\u0003-\u0262\b-\u0005"+
		"-\u0264\b-\n-\f-\u0267\t-\u0001.\u0003.\u026a\b.\u0001/\u0003/\u026d\b"+
		"/\u00010\u00030\u0270\b0\u00011\u00011\u00031\u0274\b1\u00011\u00011\u0003"+
		"1\u0278\b1\u00031\u027a\b1\u00012\u00012\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00013\u00013\u00033\u0286\b3\u00014\u00014\u00015\u00015\u0001"+
		"5\u00035\u028d\b5\u00016\u00016\u00016\u00036\u0292\b6\u00017\u00017\u0001"+
		"7\u00017\u00057\u0298\b7\n7\f7\u029b\t7\u00017\u00037\u029e\b7\u00037"+
		"\u02a0\b7\u00017\u00017\u00018\u00018\u00019\u00019\u00019\u00019\u0001"+
		":\u0001:\u0003:\u02ac\b:\u0001:\u0001:\u0003:\u02b0\b:\u0001:\u0001:\u0003"+
		":\u02b4\b:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u02bc\b:\u0001"+
		":\u0001:\u0001:\u0001:\u0003:\u02c2\b:\u0001;\u0001;\u0001;\u0003;\u02c7"+
		"\b;\u0001;\u0003;\u02ca\b;\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u02d1"+
		"\b<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u02d9\b=\u0001>\u0001"+
		">\u0005>\u02dd\b>\n>\f>\u02e0\t>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0003?\u02e9\b?\u0001@\u0003@\u02ec\b@\u0001@\u0000\u0001LA\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0000\b"+
		"\u0003\u0000KKeekk\u0001\u0000\u0016\u0018\u0001\u0000\u0012\u0013\u0001"+
		"\u0000\u001f\"\u0001\u0000#&\u0003\u0000\u0002\u0002\u0083\u0083\u008d"+
		"\u008d\u0003\u0000\u0007\u0007\u0087\u0087\u008f\u008f\u0001\u0001\t\t"+
		"\u0335\u0000\u0083\u0001\u0000\u0000\u0000\u0002\u008a\u0001\u0000\u0000"+
		"\u0000\u0004\u0097\u0001\u0000\u0000\u0000\u0006\u0099\u0001\u0000\u0000"+
		"\u0000\b\u00a0\u0001\u0000\u0000\u0000\n\u00a4\u0001\u0000\u0000\u0000"+
		"\f\u00b4\u0001\u0000\u0000\u0000\u000e\u00b6\u0001\u0000\u0000\u0000\u0010"+
		"\u00d0\u0001\u0000\u0000\u0000\u0012\u00d2\u0001\u0000\u0000\u0000\u0014"+
		"\u00d5\u0001\u0000\u0000\u0000\u0016\u00e7\u0001\u0000\u0000\u0000\u0018"+
		"\u00f3\u0001\u0000\u0000\u0000\u001a\u00f7\u0001\u0000\u0000\u0000\u001c"+
		"\u00f9\u0001\u0000\u0000\u0000\u001e\u00fc\u0001\u0000\u0000\u0000 \u0105"+
		"\u0001\u0000\u0000\u0000\"\u010a\u0001\u0000\u0000\u0000$\u010d\u0001"+
		"\u0000\u0000\u0000&\u0131\u0001\u0000\u0000\u0000(\u0133\u0001\u0000\u0000"+
		"\u0000*\u0140\u0001\u0000\u0000\u0000,\u0142\u0001\u0000\u0000\u0000."+
		"\u0148\u0001\u0000\u0000\u00000\u014d\u0001\u0000\u0000\u00002\u016a\u0001"+
		"\u0000\u0000\u00004\u016c\u0001\u0000\u0000\u00006\u0171\u0001\u0000\u0000"+
		"\u00008\u0175\u0001\u0000\u0000\u0000:\u0178\u0001\u0000\u0000\u0000<"+
		"\u017c\u0001\u0000\u0000\u0000>\u0183\u0001\u0000\u0000\u0000@\u019b\u0001"+
		"\u0000\u0000\u0000B\u01bd\u0001\u0000\u0000\u0000D\u01c5\u0001\u0000\u0000"+
		"\u0000F\u01c7\u0001\u0000\u0000\u0000H\u01d8\u0001\u0000\u0000\u0000J"+
		"\u01df\u0001\u0000\u0000\u0000L\u01ff\u0001\u0000\u0000\u0000N\u023a\u0001"+
		"\u0000\u0000\u0000P\u023e\u0001\u0000\u0000\u0000R\u0245\u0001\u0000\u0000"+
		"\u0000T\u0247\u0001\u0000\u0000\u0000V\u024e\u0001\u0000\u0000\u0000X"+
		"\u0255\u0001\u0000\u0000\u0000Z\u025a\u0001\u0000\u0000\u0000\\\u0269"+
		"\u0001\u0000\u0000\u0000^\u026c\u0001\u0000\u0000\u0000`\u026f\u0001\u0000"+
		"\u0000\u0000b\u0279\u0001\u0000\u0000\u0000d\u027b\u0001\u0000\u0000\u0000"+
		"f\u0285\u0001\u0000\u0000\u0000h\u0287\u0001\u0000\u0000\u0000j\u028c"+
		"\u0001\u0000\u0000\u0000l\u0291\u0001\u0000\u0000\u0000n\u0293\u0001\u0000"+
		"\u0000\u0000p\u02a3\u0001\u0000\u0000\u0000r\u02a5\u0001\u0000\u0000\u0000"+
		"t\u02c1\u0001\u0000\u0000\u0000v\u02c9\u0001\u0000\u0000\u0000x\u02d0"+
		"\u0001\u0000\u0000\u0000z\u02d8\u0001\u0000\u0000\u0000|\u02da\u0001\u0000"+
		"\u0000\u0000~\u02e8\u0001\u0000\u0000\u0000\u0080\u02eb\u0001\u0000\u0000"+
		"\u0000\u0082\u0084\u0005\u0001\u0000\u0000\u0083\u0082\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000"+
		"\u0000\u0085\u0087\u0003:\u001d\u0000\u0086\u0085\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0005\u0000\u0000\u0001\u0089\u0001\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0003\u0004\u0002\u0000\u008b\u0003\u0001\u0000\u0000\u0000"+
		"\u008c\u0098\u0003\u0006\u0003\u0000\u008d\u0098\u0003\u001c\u000e\u0000"+
		"\u008e\u0098\u0003\n\u0005\u0000\u008f\u0098\u0003\u0016\u000b\u0000\u0090"+
		"\u0098\u0003\"\u0011\u0000\u0091\u0098\u0003$\u0012\u0000\u0092\u0098"+
		"\u0003&\u0013\u0000\u0093\u0098\u0003*\u0015\u0000\u0094\u0098\u0003,"+
		"\u0016\u0000\u0095\u0098\u0003.\u0017\u0000\u0096\u0098\u00030\u0018\u0000"+
		"\u0097\u008c\u0001\u0000\u0000\u0000\u0097\u008d\u0001\u0000\u0000\u0000"+
		"\u0097\u008e\u0001\u0000\u0000\u0000\u0097\u008f\u0001\u0000\u0000\u0000"+
		"\u0097\u0090\u0001\u0000\u0000\u0000\u0097\u0091\u0001\u0000\u0000\u0000"+
		"\u0097\u0092\u0001\u0000\u0000\u0000\u0097\u0093\u0001\u0000\u0000\u0000"+
		"\u0097\u0094\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0005\u0001\u0000\u0000\u0000"+
		"\u0099\u009b\u0005\u0007\u0000\u0000\u009a\u009c\u0003\b\u0004\u0000\u009b"+
		"\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0005\b\u0000\u0000\u009e\u0007"+
		"\u0001\u0000\u0000\u0000\u009f\u00a1\u0003\u0004\u0002\u0000\u00a0\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\t\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0005g\u0000\u0000\u00a5\u00a6\u0003\f"+
		"\u0006\u0000\u00a6\u000b\u0001\u0000\u0000\u0000\u00a7\u00ae\u0003\u0010"+
		"\b\u0000\u00a8\u00a9\u0003\u0014\n\u0000\u00a9\u00aa\u0005\n\u0000\u0000"+
		"\u00aa\u00ab\u0003\u000e\u0007\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ae\u0003\u000e\u0007\u0000\u00ad\u00a7\u0001\u0000\u0000\u0000"+
		"\u00ad\u00a8\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0003\u0012\t\u0000\u00b0"+
		"\u00b1\u0003\u0080@\u0000\u00b1\u00b5\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0005t\u0000\u0000\u00b3\u00b5\u0003\u0080@\u0000\u00b4\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\r\u0001\u0000\u0000"+
		"\u0000\u00b6\u00bc\u0005\u0007\u0000\u0000\u00b7\u00b8\u0003\u0014\n\u0000"+
		"\u00b8\u00b9\u0005\n\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b7\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c3\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c1\u0003\u0014\n\u0000\u00c0\u00c2\u0005\n\u0000\u0000\u00c1\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0005\b\u0000\u0000\u00c6\u000f\u0001\u0000\u0000\u0000\u00c7\u00d1\u0005"+
		"s\u0000\u0000\u00c8\u00c9\u0005s\u0000\u0000\u00c9\u00ca\u0005^\u0000"+
		"\u0000\u00ca\u00cc\u0005s\u0000\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00d1\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0005\u0016\u0000\u0000\u00ce\u00cf\u0005^\u0000\u0000\u00cf"+
		"\u00d1\u0005s\u0000\u0000\u00d0\u00c7\u0001\u0000\u0000\u0000\u00d0\u00cb"+
		"\u0001\u0000\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d1\u0011"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005_\u0000\u0000\u00d3\u00d4\u0005"+
		"t\u0000\u0000\u00d4\u0013\u0001\u0000\u0000\u0000\u00d5\u00d8\u0005s\u0000"+
		"\u0000\u00d6\u00d7\u0005^\u0000\u0000\u00d7\u00d9\u0005s\u0000\u0000\u00d8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u0015\u0001\u0000\u0000\u0000\u00da\u00dd\u0005f\u0000\u0000\u00db\u00de"+
		"\u0003\u0018\f\u0000\u00dc\u00de\u0003\u001a\r\u0000\u00dd\u00db\u0001"+
		"\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0003\u0080@\u0000\u00e0\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0005f\u0000\u0000\u00e2\u00e3\u0005X\u0000\u0000"+
		"\u00e3\u00e5\u0003L&\u0000\u00e4\u00e6\u0005\t\u0000\u0000\u00e5\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e7\u00da\u0001\u0000\u0000\u0000\u00e7\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e8\u0017\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0003\u0010\b\u0000\u00ea\u00eb\u0003\u0012\t\u0000\u00eb\u00ec\u0003"+
		"\u0080@\u0000\u00ec\u00f4\u0001\u0000\u0000\u0000\u00ed\u00ef\u0003\u000e"+
		"\u0007\u0000\u00ee\u00f0\u0003\u0012\t\u0000\u00ef\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0003\u0080@\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f3\u00e9\u0001\u0000\u0000\u0000\u00f3\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f4\u0019\u0001\u0000\u0000\u0000\u00f5\u00f8\u0003\u001c\u000e\u0000"+
		"\u00f6\u00f8\u00030\u0018\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f8\u001b\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0003\u001e\u000f\u0000\u00fa\u00fb\u0003\u0080@\u0000\u00fb\u001d"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0003(\u0014\u0000\u00fd\u0102\u0003"+
		" \u0010\u0000\u00fe\u00ff\u0005\n\u0000\u0000\u00ff\u0101\u0003 \u0010"+
		"\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000"+
		"\u0000\u0103\u001f\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000"+
		"\u0000\u0105\u0108\u0003l6\u0000\u0106\u0107\u0005\u000b\u0000\u0000\u0107"+
		"\u0109\u0003L&\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001"+
		"\u0000\u0000\u0000\u0109!\u0001\u0000\u0000\u0000\u010a\u010b\u0003J%"+
		"\u0000\u010b\u010c\u0003\u0080@\u0000\u010c#\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0005Y\u0000\u0000\u010e\u010f\u0005\u0005\u0000\u0000\u010f\u0110"+
		"\u0003J%\u0000\u0110\u0111\u0005\u0006\u0000\u0000\u0111\u0114\u0003\u0004"+
		"\u0002\u0000\u0112\u0113\u0005I\u0000\u0000\u0113\u0115\u0003\u0004\u0002"+
		"\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115%\u0001\u0000\u0000\u0000\u0116\u0117\u0005Q\u0000\u0000\u0117"+
		"\u011a\u0005\u0005\u0000\u0000\u0118\u011b\u0003J%\u0000\u0119\u011b\u0003"+
		"\u001e\u000f\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u0119\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u011e\u0005\t\u0000\u0000\u011d\u011f\u0003J"+
		"%\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0122\u0005\t\u0000\u0000"+
		"\u0121\u0123\u0003J%\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0005\u0006\u0000\u0000\u0125\u0132\u0003\u0004\u0002\u0000\u0126\u0127"+
		"\u0005Q\u0000\u0000\u0127\u012a\u0005\u0005\u0000\u0000\u0128\u012b\u0003"+
		"L&\u0000\u0129\u012b\u0003\u001e\u000f\u0000\u012a\u0128\u0001\u0000\u0000"+
		"\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0005\\\u0000\u0000\u012d\u012e\u0003J%\u0000\u012e"+
		"\u012f\u0005\u0006\u0000\u0000\u012f\u0130\u0003\u0004\u0002\u0000\u0130"+
		"\u0132\u0001\u0000\u0000\u0000\u0131\u0116\u0001\u0000\u0000\u0000\u0131"+
		"\u0126\u0001\u0000\u0000\u0000\u0132\'\u0001\u0000\u0000\u0000\u0133\u0134"+
		"\u0007\u0000\u0000\u0000\u0134)\u0001\u0000\u0000\u0000\u0135\u0137\u0005"+
		"N\u0000\u0000\u0136\u0138\u0003J%\u0000\u0137\u0136\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000"+
		"\u0000\u0139\u0141\u0003\u0080@\u0000\u013a\u013b\u0005N\u0000\u0000\u013b"+
		"\u013c\u0005\u0005\u0000\u0000\u013c\u013d\u0003N\'\u0000\u013d\u013e"+
		"\u0005\u0006\u0000\u0000\u013e\u013f\u0003\u0080@\u0000\u013f\u0141\u0001"+
		"\u0000\u0000\u0000\u0140\u0135\u0001\u0000\u0000\u0000\u0140\u013a\u0001"+
		"\u0000\u0000\u0000\u0141+\u0001\u0000\u0000\u0000\u0142\u0143\u0005W\u0000"+
		"\u0000\u0143\u0144\u0005\u0005\u0000\u0000\u0144\u0145\u0003J%\u0000\u0145"+
		"\u0146\u0005\u0006\u0000\u0000\u0146\u0147\u0003\u0004\u0002\u0000\u0147"+
		"-\u0001\u0000\u0000\u0000\u0148\u0149\u0005s\u0000\u0000\u0149\u014a\u0005"+
		"\r\u0000\u0000\u014a\u014b\u0003\u0004\u0002\u0000\u014b/\u0001\u0000"+
		"\u0000\u0000\u014c\u014e\u0005h\u0000\u0000\u014d\u014c\u0001\u0000\u0000"+
		"\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000"+
		"\u0000\u014f\u0151\u0005U\u0000\u0000\u0150\u0152\u0005\u0016\u0000\u0000"+
		"\u0151\u0150\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0005s\u0000\u0000\u0154"+
		"\u0156\u0005\u0005\u0000\u0000\u0155\u0157\u00032\u0019\u0000\u0156\u0155"+
		"\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158"+
		"\u0001\u0000\u0000\u0000\u0158\u0159\u0005\u0006\u0000\u0000\u0159\u015a"+
		"\u0005\u0007\u0000\u0000\u015a\u015b\u00038\u001c\u0000\u015b\u015c\u0005"+
		"\b\u0000\u0000\u015c1\u0001\u0000\u0000\u0000\u015d\u0162\u00034\u001a"+
		"\u0000\u015e\u015f\u0005\n\u0000\u0000\u015f\u0161\u00034\u001a\u0000"+
		"\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000"+
		"\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000"+
		"\u0163\u0167\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0005\n\u0000\u0000\u0166\u0168\u00036\u001b\u0000\u0167"+
		"\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168"+
		"\u016b\u0001\u0000\u0000\u0000\u0169\u016b\u00036\u001b\u0000\u016a\u015d"+
		"\u0001\u0000\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b3\u0001"+
		"\u0000\u0000\u0000\u016c\u016f\u0003l6\u0000\u016d\u016e\u0005\u000b\u0000"+
		"\u0000\u016e\u0170\u0003L&\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f"+
		"\u0170\u0001\u0000\u0000\u0000\u01705\u0001\u0000\u0000\u0000\u0171\u0172"+
		"\u0005\u000e\u0000\u0000\u0172\u0173\u0003L&\u0000\u01737\u0001\u0000"+
		"\u0000\u0000\u0174\u0176\u0003:\u001d\u0000\u0175\u0174\u0001\u0000\u0000"+
		"\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u01769\u0001\u0000\u0000\u0000"+
		"\u0177\u0179\u0003\u0002\u0001\u0000\u0178\u0177\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0001\u0000\u0000\u0000\u017b;\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0005\u0003\u0000\u0000\u017d\u017e\u0003>\u001f\u0000\u017e\u017f"+
		"\u0005\u0004\u0000\u0000\u017f=\u0001\u0000\u0000\u0000\u0180\u0182\u0005"+
		"\n\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182\u0185\u0001\u0000"+
		"\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000"+
		"\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000"+
		"\u0000\u0000\u0186\u0188\u0003@ \u0000\u0187\u0186\u0001\u0000\u0000\u0000"+
		"\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0191\u0001\u0000\u0000\u0000"+
		"\u0189\u018b\u0005\n\u0000\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018b"+
		"\u018c\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c"+
		"\u018d\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e"+
		"\u0190\u0003@ \u0000\u018f\u018a\u0001\u0000\u0000\u0000\u0190\u0193\u0001"+
		"\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001"+
		"\u0000\u0000\u0000\u0192\u0197\u0001\u0000\u0000\u0000\u0193\u0191\u0001"+
		"\u0000\u0000\u0000\u0194\u0196\u0005\n\u0000\u0000\u0195\u0194\u0001\u0000"+
		"\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000"+
		"\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198?\u0001\u0000\u0000"+
		"\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u019c\u0005\u000e\u0000"+
		"\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e\u0003L&\u0000\u019e"+
		"A\u0001\u0000\u0000\u0000\u019f\u01a0\u0003D\"\u0000\u01a0\u01a1\u0005"+
		"\r\u0000\u0000\u01a1\u01a2\u0003L&\u0000\u01a2\u01be\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a4\u0005\u0003\u0000\u0000\u01a4\u01a5\u0003L&\u0000\u01a5"+
		"\u01a6\u0005\u0004\u0000\u0000\u01a6\u01a7\u0005\r\u0000\u0000\u01a7\u01a8"+
		"\u0003L&\u0000\u01a8\u01be\u0001\u0000\u0000\u0000\u01a9\u01ab\u0005h"+
		"\u0000\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac\u01ae\u0005\u0016"+
		"\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b0\u0003D\""+
		"\u0000\u01b0\u01b2\u0005\u0005\u0000\u0000\u01b1\u01b3\u00032\u0019\u0000"+
		"\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005\u0006\u0000\u0000"+
		"\u01b5\u01b6\u0005\u0007\u0000\u0000\u01b6\u01b7\u00038\u001c\u0000\u01b7"+
		"\u01b8\u0005\b\u0000\u0000\u01b8\u01be\u0001\u0000\u0000\u0000\u01b9\u01bb"+
		"\u0005\u000e\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01ba\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01be"+
		"\u0003L&\u0000\u01bd\u019f\u0001\u0000\u0000\u0000\u01bd\u01a3\u0001\u0000"+
		"\u0000\u0000\u01bd\u01aa\u0001\u0000\u0000\u0000\u01bd\u01ba\u0001\u0000"+
		"\u0000\u0000\u01beC\u0001\u0000\u0000\u0000\u01bf\u01c6\u0005s\u0000\u0000"+
		"\u01c0\u01c6\u0005t\u0000\u0000\u01c1\u01c2\u0005\u0003\u0000\u0000\u01c2"+
		"\u01c3\u0003L&\u0000\u01c3\u01c4\u0005\u0004\u0000\u0000\u01c4\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c5\u01bf\u0001\u0000\u0000\u0000\u01c5\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c1\u0001\u0000\u0000\u0000\u01c6E\u0001\u0000"+
		"\u0000\u0000\u01c7\u01d3\u0005\u0005\u0000\u0000\u01c8\u01cd\u0003H$\u0000"+
		"\u01c9\u01ca\u0005\n\u0000\u0000\u01ca\u01cc\u0003H$\u0000\u01cb\u01c9"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d1"+
		"\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d2"+
		"\u0005\n\u0000\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d4\u0001\u0000\u0000\u0000\u01d3\u01c8\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d6\u0005\u0006\u0000\u0000\u01d6G\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d9\u0005\u000e\u0000\u0000\u01d8\u01d7\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000"+
		"\u0000\u0000\u01da\u01dd\u0003L&\u0000\u01db\u01dd\u0005s\u0000\u0000"+
		"\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000"+
		"\u01ddI\u0001\u0000\u0000\u0000\u01de\u01e0\u0005\u000e\u0000\u0000\u01df"+
		"\u01de\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e9\u0003L&\u0000\u01e2\u01e4\u0005"+
		"\n\u0000\u0000\u01e3\u01e5\u0005\u000e\u0000\u0000\u01e4\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e8\u0003L&\u0000\u01e7\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e8\u01eb\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000"+
		"\u01e9\u01ea\u0001\u0000\u0000\u0000\u01eaK\u0001\u0000\u0000\u0000\u01eb"+
		"\u01e9\u0001\u0000\u0000\u0000\u01ec\u01ed\u0006&\uffff\uffff\u0000\u01ed"+
		"\u0200\u0003t:\u0000\u01ee\u01ef\u0005O\u0000\u0000\u01ef\u0200\u0003"+
		"L&\u0014\u01f0\u01f1\u0005g\u0000\u0000\u01f1\u01f2\u0005\u0005\u0000"+
		"\u0000\u01f2\u01f3\u0003L&\u0000\u01f3\u01f4\u0005\u0006\u0000\u0000\u01f4"+
		"\u0200\u0001\u0000\u0000\u0000\u01f5\u0200\u0005V\u0000\u0000\u01f6\u0200"+
		"\u0005s\u0000\u0000\u01f7\u0200\u0003z=\u0000\u01f8\u0200\u0003<\u001e"+
		"\u0000\u01f9\u0200\u0003n7\u0000\u01fa\u0200\u0003N\'\u0000\u01fb\u01fc"+
		"\u0005\u0005\u0000\u0000\u01fc\u01fd\u0003J%\u0000\u01fd\u01fe\u0005\u0006"+
		"\u0000\u0000\u01fe\u0200\u0001\u0000\u0000\u0000\u01ff\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ff\u01ee\u0001\u0000\u0000\u0000\u01ff\u01f0\u0001\u0000"+
		"\u0000\u0000\u01ff\u01f5\u0001\u0000\u0000\u0000\u01ff\u01f6\u0001\u0000"+
		"\u0000\u0000\u01ff\u01f7\u0001\u0000\u0000\u0000\u01ff\u01f8\u0001\u0000"+
		"\u0000\u0000\u01ff\u01f9\u0001\u0000\u0000\u0000\u01ff\u01fa\u0001\u0000"+
		"\u0000\u0000\u01ff\u01fb\u0001\u0000\u0000\u0000\u0200\u0236\u0001\u0000"+
		"\u0000\u0000\u0201\u0202\n\u0013\u0000\u0000\u0202\u0203\u0007\u0001\u0000"+
		"\u0000\u0203\u0235\u0003L&\u0014\u0204\u0205\n\u0012\u0000\u0000\u0205"+
		"\u0206\u0007\u0002\u0000\u0000\u0206\u0235\u0003L&\u0013\u0207\u0208\n"+
		"\u0011\u0000\u0000\u0208\u0209\u0007\u0003\u0000\u0000\u0209\u0235\u0003"+
		"L&\u0012\u020a\u020b\n\u0010\u0000\u0000\u020b\u020c\u0007\u0004\u0000"+
		"\u0000\u020c\u0235\u0003L&\u0011\u020d\u020e\n\u000f\u0000\u0000\u020e"+
		"\u020f\u0005\'\u0000\u0000\u020f\u0235\u0003L&\u0010\u0210\u0211\n\u000e"+
		"\u0000\u0000\u0211\u0212\u0005(\u0000\u0000\u0212\u0235\u0003L&\u000f"+
		"\u0213\u0214\n\r\u0000\u0000\u0214\u0215\u0005)\u0000\u0000\u0215\u0235"+
		"\u0003L&\u000e\u0216\u0217\n\f\u0000\u0000\u0217\u0218\u0005*\u0000\u0000"+
		"\u0218\u0235\u0003L&\r\u0219\u021a\n\u000b\u0000\u0000\u021a\u021b\u0005"+
		"+\u0000\u0000\u021b\u0235\u0003L&\f\u021c\u021d\n\n\u0000\u0000\u021d"+
		"\u021e\u0005\f\u0000\u0000\u021e\u021f\u0003L&\u0000\u021f\u0220\u0005"+
		"\r\u0000\u0000\u0220\u0221\u0003L&\u000b\u0221\u0235\u0001\u0000\u0000"+
		"\u0000\u0222\u0223\n\u0017\u0000\u0000\u0223\u0224\u0005\u0003\u0000\u0000"+
		"\u0224\u0225\u0003J%\u0000\u0225\u0226\u0005\u0004\u0000\u0000\u0226\u0235"+
		"\u0001\u0000\u0000\u0000\u0227\u0229\n\u0016\u0000\u0000\u0228\u022a\u0005"+
		"\f\u0000\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000"+
		"\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022d\u0005\u000f"+
		"\u0000\u0000\u022c\u022e\u0005\u001b\u0000\u0000\u022d\u022c\u0001\u0000"+
		"\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000"+
		"\u0000\u0000\u022f\u0235\u0005s\u0000\u0000\u0230\u0231\n\u0015\u0000"+
		"\u0000\u0231\u0235\u0003F#\u0000\u0232\u0233\n\b\u0000\u0000\u0233\u0235"+
		"\u0003|>\u0000\u0234\u0201\u0001\u0000\u0000\u0000\u0234\u0204\u0001\u0000"+
		"\u0000\u0000\u0234\u0207\u0001\u0000\u0000\u0000\u0234\u020a\u0001\u0000"+
		"\u0000\u0000\u0234\u020d\u0001\u0000\u0000\u0000\u0234\u0210\u0001\u0000"+
		"\u0000\u0000\u0234\u0213\u0001\u0000\u0000\u0000\u0234\u0216\u0001\u0000"+
		"\u0000\u0000\u0234\u0219\u0001\u0000\u0000\u0000\u0234\u021c\u0001\u0000"+
		"\u0000\u0000\u0234\u0222\u0001\u0000\u0000\u0000\u0234\u0227\u0001\u0000"+
		"\u0000\u0000\u0234\u0230\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000"+
		"\u0000\u0000\u0235\u0238\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000"+
		"\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237M\u0001\u0000\u0000"+
		"\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0239\u023b\u0003R)\u0000\u023a"+
		"\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c"+
		"\u023a\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d"+
		"O\u0001\u0000\u0000\u0000\u023e\u023f\u0007\u0005\u0000\u0000\u023fQ\u0001"+
		"\u0000\u0000\u0000\u0240\u0246\u0003T*\u0000\u0241\u0242\u0003V+\u0000"+
		"\u0242\u0243\u0003Z-\u0000\u0243\u0244\u0003X,\u0000\u0244\u0246\u0001"+
		"\u0000\u0000\u0000\u0245\u0240\u0001\u0000\u0000\u0000\u0245\u0241\u0001"+
		"\u0000\u0000\u0000\u0246S\u0001\u0000\u0000\u0000\u0247\u0248\u0003P("+
		"\u0000\u0248\u024a\u0003\\.\u0000\u0249\u024b\u0003b1\u0000\u024a\u0249"+
		"\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024c"+
		"\u0001\u0000\u0000\u0000\u024c\u024d\u0005\u0085\u0000\u0000\u024dU\u0001"+
		"\u0000\u0000\u0000\u024e\u024f\u0003P(\u0000\u024f\u0251\u0003^/\u0000"+
		"\u0250\u0252\u0003b1\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0251\u0252"+
		"\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0254"+
		"\u0005\u0084\u0000\u0000\u0254W\u0001\u0000\u0000\u0000\u0255\u0256\u0005"+
		"\u008e\u0000\u0000\u0256\u0257\u0003`0\u0000\u0257\u0258\u0005\u0090\u0000"+
		"\u0000\u0258Y\u0001\u0000\u0000\u0000\u0259\u025b\u0005\u008c\u0000\u0000"+
		"\u025a\u0259\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000"+
		"\u025b\u0265\u0001\u0000\u0000\u0000\u025c\u025f\u0003R)\u0000\u025d\u025f"+
		"\u0003r9\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025e\u025d\u0001\u0000"+
		"\u0000\u0000\u025f\u0261\u0001\u0000\u0000\u0000\u0260\u0262\u0005\u008c"+
		"\u0000\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000"+
		"\u0000\u0000\u0262\u0264\u0001\u0000\u0000\u0000\u0263\u025e\u0001\u0000"+
		"\u0000\u0000\u0264\u0267\u0001\u0000\u0000\u0000\u0265\u0263\u0001\u0000"+
		"\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266[\u0001\u0000\u0000"+
		"\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0268\u026a\u0005\u0088\u0000"+
		"\u0000\u0269\u0268\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000"+
		"\u0000\u026a]\u0001\u0000\u0000\u0000\u026b\u026d\u0005\u0088\u0000\u0000"+
		"\u026c\u026b\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000"+
		"\u026d_\u0001\u0000\u0000\u0000\u026e\u0270\u0005\u0091\u0000\u0000\u026f"+
		"\u026e\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270"+
		"a\u0001\u0000\u0000\u0000\u0271\u0273\u0003d2\u0000\u0272\u0274\u0003"+
		"b1\u0000\u0273\u0272\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000"+
		"\u0000\u0274\u027a\u0001\u0000\u0000\u0000\u0275\u0277\u0003f3\u0000\u0276"+
		"\u0278\u0003b1\u0000\u0277\u0276\u0001\u0000\u0000\u0000\u0277\u0278\u0001"+
		"\u0000\u0000\u0000\u0278\u027a\u0001\u0000\u0000\u0000\u0279\u0271\u0001"+
		"\u0000\u0000\u0000\u0279\u0275\u0001\u0000\u0000\u0000\u027ac\u0001\u0000"+
		"\u0000\u0000\u027b\u027c\u0005\u0087\u0000\u0000\u027c\u027d\u0005\u000e"+
		"\u0000\u0000\u027d\u027e\u0003L&\u0000\u027e\u027f\u0005\b\u0000\u0000"+
		"\u027fe\u0001\u0000\u0000\u0000\u0280\u0281\u0003h4\u0000\u0281\u0282"+
		"\u0005\u0086\u0000\u0000\u0282\u0283\u0003j5\u0000\u0283\u0286\u0001\u0000"+
		"\u0000\u0000\u0284\u0286\u0003h4\u0000\u0285\u0280\u0001\u0000\u0000\u0000"+
		"\u0285\u0284\u0001\u0000\u0000\u0000\u0286g\u0001\u0000\u0000\u0000\u0287"+
		"\u0288\u0005\u0088\u0000\u0000\u0288i\u0001\u0000\u0000\u0000\u0289\u028d"+
		"\u0005\u008b\u0000\u0000\u028a\u028d\u0003R)\u0000\u028b\u028d\u0003r"+
		"9\u0000\u028c\u0289\u0001\u0000\u0000\u0000\u028c\u028a\u0001\u0000\u0000"+
		"\u0000\u028c\u028b\u0001\u0000\u0000\u0000\u028dk\u0001\u0000\u0000\u0000"+
		"\u028e\u0292\u0005s\u0000\u0000\u028f\u0292\u0003<\u001e\u0000\u0290\u0292"+
		"\u0003n7\u0000\u0291\u028e\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000"+
		"\u0000\u0000\u0291\u0290\u0001\u0000\u0000\u0000\u0292m\u0001\u0000\u0000"+
		"\u0000\u0293\u029f\u0005\u0007\u0000\u0000\u0294\u0299\u0003B!\u0000\u0295"+
		"\u0296\u0005\n\u0000\u0000\u0296\u0298\u0003B!\u0000\u0297\u0295\u0001"+
		"\u0000\u0000\u0000\u0298\u029b\u0001\u0000\u0000\u0000\u0299\u0297\u0001"+
		"\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029d\u0001"+
		"\u0000\u0000\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029c\u029e\u0005"+
		"\n\u0000\u0000\u029d\u029c\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000"+
		"\u0000\u0000\u029e\u02a0\u0001\u0000\u0000\u0000\u029f\u0294\u0001\u0000"+
		"\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000"+
		"\u0000\u0000\u02a1\u02a2\u0005\b\u0000\u0000\u02a2o\u0001\u0000\u0000"+
		"\u0000\u02a3\u02a4\u0007\u0006\u0000\u0000\u02a4q\u0001\u0000\u0000\u0000"+
		"\u02a5\u02a6\u0003p8\u0000\u02a6\u02a7\u0003J%\u0000\u02a7\u02a8\u0005"+
		"\b\u0000\u0000\u02a8s\u0001\u0000\u0000\u0000\u02a9\u02c2\u00030\u0018"+
		"\u0000\u02aa\u02ac\u0005h\u0000\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000"+
		"\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000"+
		"\u02ad\u02af\u0005U\u0000\u0000\u02ae\u02b0\u0005\u0016\u0000\u0000\u02af"+
		"\u02ae\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0"+
		"\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b3\u0005\u0005\u0000\u0000\u02b2"+
		"\u02b4\u00032\u0019\u0000\u02b3\u02b2\u0001\u0000\u0000\u0000\u02b3\u02b4"+
		"\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b6"+
		"\u0005\u0006\u0000\u0000\u02b6\u02b7\u0005\u0007\u0000\u0000\u02b7\u02b8"+
		"\u00038\u001c\u0000\u02b8\u02b9\u0005\b\u0000\u0000\u02b9\u02c2\u0001"+
		"\u0000\u0000\u0000\u02ba\u02bc\u0005h\u0000\u0000\u02bb\u02ba\u0001\u0000"+
		"\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000"+
		"\u0000\u0000\u02bd\u02be\u0003v;\u0000\u02be\u02bf\u00058\u0000\u0000"+
		"\u02bf\u02c0\u0003x<\u0000\u02c0\u02c2\u0001\u0000\u0000\u0000\u02c1\u02a9"+
		"\u0001\u0000\u0000\u0000\u02c1\u02ab\u0001\u0000\u0000\u0000\u02c1\u02bb"+
		"\u0001\u0000\u0000\u0000\u02c2u\u0001\u0000\u0000\u0000\u02c3\u02ca\u0005"+
		"s\u0000\u0000\u02c4\u02c6\u0005\u0005\u0000\u0000\u02c5\u02c7\u00032\u0019"+
		"\u0000\u02c6\u02c5\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02ca\u0005\u0006\u0000"+
		"\u0000\u02c9\u02c3\u0001\u0000\u0000\u0000\u02c9\u02c4\u0001\u0000\u0000"+
		"\u0000\u02caw\u0001\u0000\u0000\u0000\u02cb\u02d1\u0003L&\u0000\u02cc"+
		"\u02cd\u0005\u0007\u0000\u0000\u02cd\u02ce\u00038\u001c\u0000\u02ce\u02cf"+
		"\u0005\b\u0000\u0000\u02cf\u02d1\u0001\u0000\u0000\u0000\u02d0\u02cb\u0001"+
		"\u0000\u0000\u0000\u02d0\u02cc\u0001\u0000\u0000\u0000\u02d1y\u0001\u0000"+
		"\u0000\u0000\u02d2\u02d9\u00059\u0000\u0000\u02d3\u02d9\u0005:\u0000\u0000"+
		"\u02d4\u02d9\u0005t\u0000\u0000\u02d5\u02d9\u0003|>\u0000\u02d6\u02d9"+
		"\u0005|\u0000\u0000\u02d7\u02d9\u0005;\u0000\u0000\u02d8\u02d2\u0001\u0000"+
		"\u0000\u0000\u02d8\u02d3\u0001\u0000\u0000\u0000\u02d8\u02d4\u0001\u0000"+
		"\u0000\u0000\u02d8\u02d5\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001\u0000"+
		"\u0000\u0000\u02d8\u02d7\u0001\u0000\u0000\u0000\u02d9{\u0001\u0000\u0000"+
		"\u0000\u02da\u02de\u0005v\u0000\u0000\u02db\u02dd\u0003~?\u0000\u02dc"+
		"\u02db\u0001\u0000\u0000\u0000\u02dd\u02e0\u0001\u0000\u0000\u0000\u02de"+
		"\u02dc\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000\u0000\u0000\u02df"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e1"+
		"\u02e2\u0005v\u0000\u0000\u02e2}\u0001\u0000\u0000\u0000\u02e3\u02e9\u0005"+
		"\u0082\u0000\u0000\u02e4\u02e5\u0005\u0081\u0000\u0000\u02e5\u02e6\u0003"+
		"L&\u0000\u02e6\u02e7\u0005\b\u0000\u0000\u02e7\u02e9\u0001\u0000\u0000"+
		"\u0000\u02e8\u02e3\u0001\u0000\u0000\u0000\u02e8\u02e4\u0001\u0000\u0000"+
		"\u0000\u02e9\u007f\u0001\u0000\u0000\u0000\u02ea\u02ec\u0007\u0007\u0000"+
		"\u0000\u02eb\u02ea\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000"+
		"\u0000\u02ec\u0081\u0001\u0000\u0000\u0000_\u0083\u0086\u0097\u009b\u00a2"+
		"\u00ad\u00b4\u00bc\u00c1\u00c3\u00cb\u00d0\u00d8\u00dd\u00e5\u00e7\u00ef"+
		"\u00f3\u00f7\u0102\u0108\u0114\u011a\u011e\u0122\u012a\u0131\u0137\u0140"+
		"\u014d\u0151\u0156\u0162\u0167\u016a\u016f\u0175\u017a\u0183\u0187\u018c"+
		"\u0191\u0197\u019b\u01aa\u01ad\u01b2\u01ba\u01bd\u01c5\u01cd\u01d1\u01d3"+
		"\u01d8\u01dc\u01df\u01e4\u01e9\u01ff\u0229\u022d\u0234\u0236\u023c\u0245"+
		"\u024a\u0251\u025a\u025e\u0261\u0265\u0269\u026c\u026f\u0273\u0277\u0279"+
		"\u0285\u028c\u0291\u0299\u029d\u029f\u02ab\u02af\u02b3\u02bb\u02c1\u02c6"+
		"\u02c9\u02d0\u02d8\u02de\u02e8\u02eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}