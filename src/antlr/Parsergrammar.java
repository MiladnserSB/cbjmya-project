// Generated from C:/Users/USER/Desktop/compiler project/Compiler_2/src/antlr/Parsergrammar.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Parsergrammar extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORTS=1, FROM=2, EXPORT=3, IMPORT=4, CLASS=5, CONSTRUCTOR=6, RETURN=7, 
		AT=8, IMPLEMENTS=9, NGONINIT=10, SELECTOR=11, TEMPLATEURL=12, STYLEURL=13, 
		STYLEURLS=14, PROVIDEDIN=15, VOIDTYPE=16, NULL=17, BOOLEAN=18, TYPE=19, 
		STATIC=20, ACCESS=21, CROISNN=22, COMPONENT=23, INJECTABLE=24, LBRACE=25, 
		RBRACE=26, LPAREN=27, RPAREN=28, LBRACKET=29, RBRACKET=30, COLON=31, COMMA=32, 
		SEMICOLON=33, ASSIGN=34, DOT=35, THIS=36, HASH=37, UNIT=38, COLOR=39, 
		PROPERTY_NAME=40, VALUE_KEYWORD=41, TAGSFORCSS=42, IDENTIFIER=43, NUMBER=44, 
		STRING_LITERAL=45, STRING=46, PLUS=47, MINUS=48, STAR=49, DIVIDE=50, EQUALS=51, 
		NOT_EQUAL=52, WS=53, LINE_COMMENT=54, BLOCK_COMMENT=55, INTERPOLATION=56, 
		HTML_COMMENT=57, HTML_CONDITIONAL_COMMENT=58, XML=59, CDATA=60, DTD=61, 
		SCRIPTLET=62, TAG_OPEN_SLASH=63, TAG_OPEN=64, TAGS=65, TAGS_VOID=66, HTML_TEXT=67, 
		TAG_CLOSE=68, TAG_SLASH_CLOSE=69, TAG_EQUALS=70, TAG_NAME=71, STRUCTURAL_DIRECTIVE=72, 
		ATTRIBUTE_BINDING=73, EVENT_BINDING=74, TAG_WHITESPACE=75, TAG_NameChar=76, 
		TAG_NameStartChar=77, METHOD_CALL_VALUE=78, ATTVALUE_VALUE=79, ATTRIBUTE=80, 
		ATTCHARS=81, ATTCHAR=82, HEXCHARS=83, DECCHARS=84, DOUBLE_QUOTE_STRING=85, 
		SINGLE_QUOTE_STRING=86;
	public static final int
		RULE_ast = 0, RULE_tsDocument = 1, RULE_classDeclaration = 2, RULE_implementsClause = 3, 
		RULE_classBody = 4, RULE_classBodyStatement = 5, RULE_importStatement = 6, 
		RULE_importBody = 7, RULE_componentDecorator = 8, RULE_componentProperties = 9, 
		RULE_selector = 10, RULE_imports = 11, RULE_styleurl = 12, RULE_templateurl = 13, 
		RULE_injectableDecorator = 14, RULE_providedin = 15, RULE_signature = 16, 
		RULE_values = 17, RULE_parameters = 18, RULE_methodDeclaration = 19, RULE_methodBody = 20, 
		RULE_objectExpression = 21, RULE_arrayExpression1 = 22, RULE_arraybody1 = 23, 
		RULE_arrayExpression2 = 24, RULE_arraybody2 = 25, RULE_constructorDeclaration = 26, 
		RULE_variableDeclaration = 27, RULE_variableAssign = 28, RULE_methodvoid = 29, 
		RULE_methodvoidbody = 30, RULE_methodcall = 31, RULE_ngOnInitMETHOD = 32, 
		RULE_signalDeclaration = 33, RULE_cssDocument = 34, RULE_selectorincss = 35, 
		RULE_ruleSetStart = 36, RULE_ruleSet = 37, RULE_declarationList = 38, 
		RULE_declaration = 39, RULE_value = 40, RULE_htmlDocument = 41, RULE_scriptletOrSeaWs = 42, 
		RULE_htmlElements = 43, RULE_htmlElement = 44, RULE_tsTag = 45, RULE_noEndTag = 46, 
		RULE_normalTag = 47, RULE_htmlContent = 48, RULE_htmlContentStatement = 49, 
		RULE_htmlChardata = 50, RULE_tagAtt = 51, RULE_htmlAttribute = 52, RULE_htmlMisc = 53, 
		RULE_htmlComment = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"ast", "tsDocument", "classDeclaration", "implementsClause", "classBody", 
			"classBodyStatement", "importStatement", "importBody", "componentDecorator", 
			"componentProperties", "selector", "imports", "styleurl", "templateurl", 
			"injectableDecorator", "providedin", "signature", "values", "parameters", 
			"methodDeclaration", "methodBody", "objectExpression", "arrayExpression1", 
			"arraybody1", "arrayExpression2", "arraybody2", "constructorDeclaration", 
			"variableDeclaration", "variableAssign", "methodvoid", "methodvoidbody", 
			"methodcall", "ngOnInitMETHOD", "signalDeclaration", "cssDocument", "selectorincss", 
			"ruleSetStart", "ruleSet", "declarationList", "declaration", "value", 
			"htmlDocument", "scriptletOrSeaWs", "htmlElements", "htmlElement", "tsTag", 
			"noEndTag", "normalTag", "htmlContent", "htmlContentStatement", "htmlChardata", 
			"tagAtt", "htmlAttribute", "htmlMisc", "htmlComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'imports'", "'from'", "'export'", "'import'", "'class'", "'constructor'", 
			"'return'", "'@'", "'implements'", "'ngOnInit'", "'selector'", "'templateUrl'", 
			"'styleUrl'", "'styleUrls'", "'providedIn'", "'void'", "'null'", null, 
			null, null, null, null, "'Component'", "'Injectable'", "'{'", "'}'", 
			"'('", "')'", "'['", "']'", "':'", "','", "';'", "'='", "'.'", "'this'", 
			"'#'", null, null, null, null, null, null, null, null, null, "'+'", "'-'", 
			"'*'", "'/'", "'=='", "'!='", null, null, null, null, null, null, null, 
			null, null, null, "'</'", "'<'", null, null, null, "'>'", "'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORTS", "FROM", "EXPORT", "IMPORT", "CLASS", "CONSTRUCTOR", 
			"RETURN", "AT", "IMPLEMENTS", "NGONINIT", "SELECTOR", "TEMPLATEURL", 
			"STYLEURL", "STYLEURLS", "PROVIDEDIN", "VOIDTYPE", "NULL", "BOOLEAN", 
			"TYPE", "STATIC", "ACCESS", "CROISNN", "COMPONENT", "INJECTABLE", "LBRACE", 
			"RBRACE", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "COLON", "COMMA", 
			"SEMICOLON", "ASSIGN", "DOT", "THIS", "HASH", "UNIT", "COLOR", "PROPERTY_NAME", 
			"VALUE_KEYWORD", "TAGSFORCSS", "IDENTIFIER", "NUMBER", "STRING_LITERAL", 
			"STRING", "PLUS", "MINUS", "STAR", "DIVIDE", "EQUALS", "NOT_EQUAL", "WS", 
			"LINE_COMMENT", "BLOCK_COMMENT", "INTERPOLATION", "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", 
			"XML", "CDATA", "DTD", "SCRIPTLET", "TAG_OPEN_SLASH", "TAG_OPEN", "TAGS", 
			"TAGS_VOID", "HTML_TEXT", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_EQUALS", 
			"TAG_NAME", "STRUCTURAL_DIRECTIVE", "ATTRIBUTE_BINDING", "EVENT_BINDING", 
			"TAG_WHITESPACE", "TAG_NameChar", "TAG_NameStartChar", "METHOD_CALL_VALUE", 
			"ATTVALUE_VALUE", "ATTRIBUTE", "ATTCHARS", "ATTCHAR", "HEXCHARS", "DECCHARS", 
			"DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING"
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
	public String getGrammarFileName() { return "Parsergrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parsergrammar(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AstContext extends ParserRuleContext {
		public TsDocumentContext tsDocument() {
			return getRuleContext(TsDocumentContext.class,0);
		}
		public HtmlDocumentContext htmlDocument() {
			return getRuleContext(HtmlDocumentContext.class,0);
		}
		public CssDocumentContext cssDocument() {
			return getRuleContext(CssDocumentContext.class,0);
		}
		public AstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterAst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitAst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitAst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AstContext ast() throws RecognitionException {
		AstContext _localctx = new AstContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			tsDocument();
			setState(111);
			htmlDocument();
			setState(112);
			cssDocument();
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
	public static class TsDocumentContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public ComponentDecoratorContext componentDecorator() {
			return getRuleContext(ComponentDecoratorContext.class,0);
		}
		public InjectableDecoratorContext injectableDecorator() {
			return getRuleContext(InjectableDecoratorContext.class,0);
		}
		public TsDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTsDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTsDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTsDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsDocumentContext tsDocument() throws RecognitionException {
		TsDocumentContext _localctx = new TsDocumentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tsDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				importStatement();
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(119);
				componentDecorator();
				}
				break;
			case 2:
				{
				setState(120);
				injectableDecorator();
				}
				break;
			}
			setState(123);
			classDeclaration();
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(Parsergrammar.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(Parsergrammar.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public ImplementsClauseContext implementsClause() {
			return getRuleContext(ImplementsClauseContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(EXPORT);
			setState(126);
			match(CLASS);
			setState(127);
			match(IDENTIFIER);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(128);
				implementsClause();
				}
			}

			setState(131);
			match(LBRACE);
			setState(132);
			classBody();
			setState(133);
			match(RBRACE);
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
	public static class ImplementsClauseContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(Parsergrammar.IMPLEMENTS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> CROISNN() { return getTokens(Parsergrammar.CROISNN); }
		public TerminalNode CROISNN(int i) {
			return getToken(Parsergrammar.CROISNN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ImplementsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImplementsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImplementsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImplementsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsClauseContext implementsClause() throws RecognitionException {
		ImplementsClauseContext _localctx = new ImplementsClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_implementsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IMPLEMENTS);
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==CROISNN || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(137);
				match(COMMA);
				setState(138);
				_la = _input.LA(1);
				if ( !(_la==CROISNN || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(143);
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
	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyStatementContext> classBodyStatement() {
			return getRuleContexts(ClassBodyStatementContext.class);
		}
		public ClassBodyStatementContext classBodyStatement(int i) {
			return getRuleContext(ClassBodyStatementContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796096169024L) != 0)) {
				{
				{
				setState(144);
				classBodyStatement();
				}
				}
				setState(149);
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
	public static class ClassBodyStatementContext extends ParserRuleContext {
		public ClassBodyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyStatement; }
	 
		public ClassBodyStatementContext() { }
		public void copyFrom(ClassBodyStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidMethodDeclarationStatementContext extends ClassBodyStatementContext {
		public MethodvoidContext methodvoid() {
			return getRuleContext(MethodvoidContext.class,0);
		}
		public VoidMethodDeclarationStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVoidMethodDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVoidMethodDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVoidMethodDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypedMethodDeclarationStatementContext extends ClassBodyStatementContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TypedMethodDeclarationStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTypedMethodDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTypedMethodDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTypedMethodDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgOnInitMethodStatementContext extends ClassBodyStatementContext {
		public NgOnInitMETHODContext ngOnInitMETHOD() {
			return getRuleContext(NgOnInitMETHODContext.class,0);
		}
		public NgOnInitMethodStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNgOnInitMethodStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNgOnInitMethodStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNgOnInitMethodStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignmentStatementContext extends ClassBodyStatementContext {
		public VariableAssignContext variableAssign() {
			return getRuleContext(VariableAssignContext.class,0);
		}
		public VariableAssignmentStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVariableAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVariableAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVariableAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationStatementContext extends ClassBodyStatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprOneStatementContext extends ClassBodyStatementContext {
		public ArrayExpression1Context arrayExpression1() {
			return getRuleContext(ArrayExpression1Context.class,0);
		}
		public ArrayExprOneStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrayExprOneStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrayExprOneStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrayExprOneStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationStatementContext extends ClassBodyStatementContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ConstructorDeclarationStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterConstructorDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitConstructorDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitConstructorDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SignalDeclarationStatementContext extends ClassBodyStatementContext {
		public SignalDeclarationContext signalDeclaration() {
			return getRuleContext(SignalDeclarationContext.class,0);
		}
		public SignalDeclarationStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSignalDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSignalDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSignalDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprTwoStatementContext extends ClassBodyStatementContext {
		public ArrayExpression2Context arrayExpression2() {
			return getRuleContext(ArrayExpression2Context.class,0);
		}
		public ArrayExprTwoStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrayExprTwoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrayExprTwoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrayExprTwoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyStatementContext classBodyStatement() throws RecognitionException {
		ClassBodyStatementContext _localctx = new ClassBodyStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classBodyStatement);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new VariableAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				variableAssign();
				}
				break;
			case 2:
				_localctx = new VoidMethodDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				methodvoid();
				}
				break;
			case 3:
				_localctx = new VariableDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				variableDeclaration();
				}
				break;
			case 4:
				_localctx = new ArrayExprOneStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				arrayExpression1();
				}
				break;
			case 5:
				_localctx = new ArrayExprTwoStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				arrayExpression2();
				}
				break;
			case 6:
				_localctx = new TypedMethodDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(155);
				methodDeclaration();
				}
				break;
			case 7:
				_localctx = new ConstructorDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(156);
				constructorDeclaration();
				}
				break;
			case 8:
				_localctx = new SignalDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(157);
				signalDeclaration();
				}
				break;
			case 9:
				_localctx = new NgOnInitMethodStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(158);
				ngOnInitMETHOD();
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
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Parsergrammar.IMPORT, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public List<ImportBodyContext> importBody() {
			return getRuleContexts(ImportBodyContext.class);
		}
		public ImportBodyContext importBody(int i) {
			return getRuleContext(ImportBodyContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode FROM() { return getToken(Parsergrammar.FROM, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(IMPORT);
			setState(162);
			match(LBRACE);
			setState(163);
			importBody();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(164);
				match(COMMA);
				setState(165);
				importBody();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(RBRACE);
			setState(172);
			match(FROM);
			{
			setState(173);
			match(STRING_LITERAL);
			}
			setState(174);
			match(SEMICOLON);
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
	public static class ImportBodyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode CROISNN() { return getToken(Parsergrammar.CROISNN, 0); }
		public TerminalNode COMPONENT() { return getToken(Parsergrammar.COMPONENT, 0); }
		public TerminalNode INJECTABLE() { return getToken(Parsergrammar.INJECTABLE, 0); }
		public ImportBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImportBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImportBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImportBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportBodyContext importBody() throws RecognitionException {
		ImportBodyContext _localctx = new ImportBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796122382336L) != 0)) ) {
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
	public static class ComponentDecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Parsergrammar.AT, 0); }
		public TerminalNode COMPONENT() { return getToken(Parsergrammar.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public ComponentPropertiesContext componentProperties() {
			return getRuleContext(ComponentPropertiesContext.class,0);
		}
		public ComponentDecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDecorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterComponentDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitComponentDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitComponentDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDecoratorContext componentDecorator() throws RecognitionException {
		ComponentDecoratorContext _localctx = new ComponentDecoratorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_componentDecorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(AT);
			setState(179);
			match(COMPONENT);
			setState(180);
			match(LPAREN);
			setState(181);
			match(LBRACE);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6146L) != 0)) {
				{
				setState(182);
				componentProperties();
				}
			}

			setState(185);
			match(RBRACE);
			setState(186);
			match(RPAREN);
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
	public static class ComponentPropertiesContext extends ParserRuleContext {
		public TemplateurlContext templateurl() {
			return getRuleContext(TemplateurlContext.class,0);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public StyleurlContext styleurl() {
			return getRuleContext(StyleurlContext.class,0);
		}
		public ComponentPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterComponentProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitComponentProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitComponentProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertiesContext componentProperties() throws RecognitionException {
		ComponentPropertiesContext _localctx = new ComponentPropertiesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_componentProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELECTOR) {
				{
				setState(188);
				selector();
				setState(189);
				match(COMMA);
				}
			}

			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTS) {
				{
				setState(193);
				imports();
				setState(194);
				match(COMMA);
				}
			}

			setState(198);
			templateurl();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STYLEURL) {
				{
				setState(199);
				styleurl();
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
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(Parsergrammar.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(SELECTOR);
			setState(203);
			match(COLON);
			setState(204);
			match(STRING_LITERAL);
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
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(Parsergrammar.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(Parsergrammar.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(Parsergrammar.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> CROISNN() { return getTokens(Parsergrammar.CROISNN); }
		public TerminalNode CROISNN(int i) {
			return getToken(Parsergrammar.CROISNN, i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_imports);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(IMPORTS);
			setState(207);
			match(COLON);
			setState(208);
			match(LBRACKET);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CROISNN || _la==IDENTIFIER) {
				{
				setState(209);
				_la = _input.LA(1);
				if ( !(_la==CROISNN || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(212);
					match(COMMA);
					setState(213);
					_la = _input.LA(1);
					if ( !(_la==CROISNN || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(219);
			match(RBRACKET);
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
	public static class StyleurlContext extends ParserRuleContext {
		public TerminalNode STYLEURL() { return getToken(Parsergrammar.STYLEURL, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public StyleurlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleurl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterStyleurl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitStyleurl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitStyleurl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleurlContext styleurl() throws RecognitionException {
		StyleurlContext _localctx = new StyleurlContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_styleurl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(STYLEURL);
			setState(222);
			match(COLON);
			setState(223);
			match(STRING_LITERAL);
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
	public static class TemplateurlContext extends ParserRuleContext {
		public TerminalNode TEMPLATEURL() { return getToken(Parsergrammar.TEMPLATEURL, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public TerminalNode COMMA() { return getToken(Parsergrammar.COMMA, 0); }
		public TemplateurlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateurl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTemplateurl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTemplateurl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTemplateurl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateurlContext templateurl() throws RecognitionException {
		TemplateurlContext _localctx = new TemplateurlContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_templateurl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(TEMPLATEURL);
			setState(226);
			match(COLON);
			setState(227);
			match(STRING_LITERAL);
			setState(228);
			match(COMMA);
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
	public static class InjectableDecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Parsergrammar.AT, 0); }
		public TerminalNode INJECTABLE() { return getToken(Parsergrammar.INJECTABLE, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public ProvidedinContext providedin() {
			return getRuleContext(ProvidedinContext.class,0);
		}
		public InjectableDecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectableDecorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterInjectableDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitInjectableDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitInjectableDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectableDecoratorContext injectableDecorator() throws RecognitionException {
		InjectableDecoratorContext _localctx = new InjectableDecoratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_injectableDecorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(AT);
			setState(231);
			match(INJECTABLE);
			setState(232);
			match(LPAREN);
			setState(233);
			match(LBRACE);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROVIDEDIN) {
				{
				setState(234);
				providedin();
				}
			}

			setState(237);
			match(RBRACE);
			setState(238);
			match(RPAREN);
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
	public static class ProvidedinContext extends ParserRuleContext {
		public TerminalNode PROVIDEDIN() { return getToken(Parsergrammar.PROVIDEDIN, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public TerminalNode COMMA() { return getToken(Parsergrammar.COMMA, 0); }
		public ProvidedinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_providedin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterProvidedin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitProvidedin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitProvidedin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProvidedinContext providedin() throws RecognitionException {
		ProvidedinContext _localctx = new ProvidedinContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_providedin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(PROVIDEDIN);
			setState(241);
			match(COLON);
			setState(242);
			match(STRING_LITERAL);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(243);
				match(COMMA);
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
	public static class SignatureContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode ACCESS() { return getToken(Parsergrammar.ACCESS, 0); }
		public TerminalNode STATIC() { return getToken(Parsergrammar.STATIC, 0); }
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS) {
				{
				setState(246);
				match(ACCESS);
				}
			}

			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(249);
				match(STATIC);
				}
			}

			setState(252);
			match(IDENTIFIER);
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
	public static class ValuesContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(Parsergrammar.NULL, 0); }
		public TerminalNode NUMBER() { return getToken(Parsergrammar.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(Parsergrammar.BOOLEAN, 0); }
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 52776558526464L) != 0)) ) {
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
	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(Parsergrammar.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Parsergrammar.COLON, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(Parsergrammar.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(Parsergrammar.TYPE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(IDENTIFIER);
			setState(257);
			match(COLON);
			setState(258);
			match(TYPE);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(259);
				match(COMMA);
				setState(260);
				match(IDENTIFIER);
				setState(261);
				match(COLON);
				setState(262);
				match(TYPE);
				}
				}
				setState(267);
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			signature();
			setState(269);
			match(LPAREN);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(270);
				parameters();
				}
			}

			setState(273);
			match(RPAREN);
			setState(274);
			match(LBRACE);
			setState(275);
			methodBody();
			setState(276);
			match(RBRACE);
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
	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Parsergrammar.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode THIS() { return getToken(Parsergrammar.THIS, 0); }
		public TerminalNode DOT() { return getToken(Parsergrammar.DOT, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(RETURN);
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case IDENTIFIER:
				{
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(279);
					match(THIS);
					setState(280);
					match(DOT);
					}
				}

				setState(283);
				match(IDENTIFIER);
				}
				break;
			case NULL:
			case BOOLEAN:
			case NUMBER:
			case STRING_LITERAL:
				{
				setState(284);
				values();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(287);
			match(SEMICOLON);
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
	public static class ObjectExpressionContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(Parsergrammar.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Parsergrammar.COLON, i);
		}
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ObjectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterObjectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitObjectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitObjectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectExpressionContext objectExpression() throws RecognitionException {
		ObjectExpressionContext _localctx = new ObjectExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_objectExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(LBRACE);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(290);
				match(IDENTIFIER);
				setState(291);
				match(COLON);
				setState(292);
				values();
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(293);
					match(COMMA);
					}
				}

				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			match(RBRACE);
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(302);
				match(COMMA);
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
	public static class ArrayExpression1Context extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public TerminalNode LBRACKET() { return getToken(Parsergrammar.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(Parsergrammar.RBRACKET, 0); }
		public List<Arraybody1Context> arraybody1() {
			return getRuleContexts(Arraybody1Context.class);
		}
		public Arraybody1Context arraybody1(int i) {
			return getRuleContext(Arraybody1Context.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public ArrayExpression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrayExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrayExpression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrayExpression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpression1Context arrayExpression1() throws RecognitionException {
		ArrayExpression1Context _localctx = new ArrayExpression1Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayExpression1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			signature();
			setState(306);
			match(ASSIGN);
			setState(307);
			match(LBRACKET);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52776591687680L) != 0)) {
				{
				{
				setState(308);
				arraybody1();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			match(RBRACKET);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(315);
				match(SEMICOLON);
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
	public static class Arraybody1Context extends ParserRuleContext {
		public ObjectExpressionContext objectExpression() {
			return getRuleContext(ObjectExpressionContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(Parsergrammar.NUMBER, 0); }
		public TerminalNode COMMA() { return getToken(Parsergrammar.COMMA, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public Arraybody1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraybody1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArraybody1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArraybody1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArraybody1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arraybody1Context arraybody1() throws RecognitionException {
		Arraybody1Context _localctx = new Arraybody1Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_arraybody1);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				objectExpression();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(NUMBER);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(320);
					match(COMMA);
					}
				}

				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(STRING_LITERAL);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(324);
					match(COMMA);
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
	public static class ArrayExpression2Context extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode TYPE() { return getToken(Parsergrammar.TYPE, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(Parsergrammar.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Parsergrammar.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Parsergrammar.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Parsergrammar.RBRACKET, i);
		}
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public List<Arraybody2Context> arraybody2() {
			return getRuleContexts(Arraybody2Context.class);
		}
		public Arraybody2Context arraybody2(int i) {
			return getRuleContext(Arraybody2Context.class,i);
		}
		public ArrayExpression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrayExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrayExpression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrayExpression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpression2Context arrayExpression2() throws RecognitionException {
		ArrayExpression2Context _localctx = new ArrayExpression2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayExpression2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			signature();
			setState(330);
			match(COLON);
			setState(331);
			match(TYPE);
			setState(332);
			match(LBRACKET);
			setState(333);
			match(RBRACKET);
			setState(334);
			match(ASSIGN);
			setState(335);
			match(LBRACKET);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACE) {
				{
				{
				setState(336);
				arraybody2();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(RBRACKET);
			setState(343);
			match(SEMICOLON);
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
	public static class Arraybody2Context extends ParserRuleContext {
		public ObjectExpressionContext objectExpression() {
			return getRuleContext(ObjectExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public TerminalNode NUMBER() { return getToken(Parsergrammar.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public Arraybody2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraybody2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArraybody2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArraybody2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArraybody2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arraybody2Context arraybody2() throws RecognitionException {
		Arraybody2Context _localctx = new Arraybody2Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_arraybody2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			objectExpression();
			setState(346);
			match(COMMA);
			setState(347);
			match(NUMBER);
			setState(348);
			match(COMMA);
			setState(349);
			match(STRING_LITERAL);
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
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(Parsergrammar.CONSTRUCTOR, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode ACCESS() { return getToken(Parsergrammar.ACCESS, 0); }
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(CONSTRUCTOR);
			setState(352);
			match(LPAREN);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS || _la==IDENTIFIER) {
				{
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ACCESS) {
					{
					setState(353);
					match(ACCESS);
					}
				}

				setState(356);
				match(IDENTIFIER);
				setState(357);
				match(COLON);
				setState(358);
				match(IDENTIFIER);
				}
			}

			setState(361);
			match(RPAREN);
			setState(362);
			match(LBRACE);
			setState(363);
			match(RBRACE);
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
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode TYPE() { return getToken(Parsergrammar.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			signature();
			setState(366);
			match(COLON);
			setState(367);
			match(TYPE);
			setState(368);
			match(ASSIGN);
			setState(369);
			values();
			setState(370);
			match(SEMICOLON);
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
	public static class VariableAssignContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public VariableAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVariableAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVariableAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVariableAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignContext variableAssign() throws RecognitionException {
		VariableAssignContext _localctx = new VariableAssignContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(IDENTIFIER);
			setState(373);
			match(ASSIGN);
			setState(374);
			values();
			setState(375);
			match(SEMICOLON);
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
	public static class MethodvoidContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode VOIDTYPE() { return getToken(Parsergrammar.VOIDTYPE, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public MethodvoidbodyContext methodvoidbody() {
			return getRuleContext(MethodvoidbodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MethodvoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodvoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodvoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodvoidContext methodvoid() throws RecognitionException {
		MethodvoidContext _localctx = new MethodvoidContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodvoid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			signature();
			setState(378);
			match(LPAREN);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(379);
				parameters();
				}
			}

			setState(382);
			match(RPAREN);
			setState(383);
			match(COLON);
			setState(384);
			match(VOIDTYPE);
			setState(385);
			match(LBRACE);
			setState(386);
			methodvoidbody();
			setState(387);
			match(RBRACE);
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
	public static class MethodvoidbodyContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public List<TerminalNode> THIS() { return getTokens(Parsergrammar.THIS); }
		public TerminalNode THIS(int i) {
			return getToken(Parsergrammar.THIS, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Parsergrammar.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parsergrammar.DOT, i);
		}
		public MethodcallContext methodcall() {
			return getRuleContext(MethodcallContext.class,0);
		}
		public MethodvoidbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodvoidbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodvoidbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodvoidbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodvoidbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodvoidbodyContext methodvoidbody() throws RecognitionException {
		MethodvoidbodyContext _localctx = new MethodvoidbodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodvoidbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(389);
				match(THIS);
				setState(390);
				match(DOT);
				}
			}

			setState(393);
			match(IDENTIFIER);
			setState(394);
			match(ASSIGN);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(395);
				match(THIS);
				setState(396);
				match(DOT);
				}
			}

			setState(399);
			match(IDENTIFIER);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(400);
				match(DOT);
				setState(401);
				methodcall();
				}
			}

			setState(404);
			match(SEMICOLON);
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
	public static class MethodcallContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public MethodcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodcallContext methodcall() throws RecognitionException {
		MethodcallContext _localctx = new MethodcallContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_methodcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(IDENTIFIER);
			setState(407);
			match(LPAREN);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(408);
				match(IDENTIFIER);
				}
			}

			setState(411);
			match(RPAREN);
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
	public static class NgOnInitMETHODContext extends ParserRuleContext {
		public TerminalNode NGONINIT() { return getToken(Parsergrammar.NGONINIT, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode VOIDTYPE() { return getToken(Parsergrammar.VOIDTYPE, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public MethodvoidbodyContext methodvoidbody() {
			return getRuleContext(MethodvoidbodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode ACCESS() { return getToken(Parsergrammar.ACCESS, 0); }
		public NgOnInitMETHODContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngOnInitMETHOD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNgOnInitMETHOD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNgOnInitMETHOD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNgOnInitMETHOD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgOnInitMETHODContext ngOnInitMETHOD() throws RecognitionException {
		NgOnInitMETHODContext _localctx = new NgOnInitMETHODContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ngOnInitMETHOD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS) {
				{
				setState(413);
				match(ACCESS);
				}
			}

			setState(416);
			match(NGONINIT);
			setState(417);
			match(LPAREN);
			setState(418);
			match(RPAREN);
			setState(419);
			match(COLON);
			setState(420);
			match(VOIDTYPE);
			setState(421);
			match(LBRACE);
			setState(422);
			methodvoidbody();
			setState(423);
			match(RBRACE);
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
	public static class SignalDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public TerminalNode CROISNN() { return getToken(Parsergrammar.CROISNN, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public SignalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSignalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSignalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSignalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignalDeclarationContext signalDeclaration() throws RecognitionException {
		SignalDeclarationContext _localctx = new SignalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_signalDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(IDENTIFIER);
			setState(426);
			match(ASSIGN);
			setState(427);
			match(CROISNN);
			setState(428);
			match(LPAREN);
			setState(429);
			match(STRING_LITERAL);
			setState(430);
			match(RPAREN);
			setState(431);
			match(SEMICOLON);
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
	public static class CssDocumentContext extends ParserRuleContext {
		public List<RuleSetContext> ruleSet() {
			return getRuleContexts(RuleSetContext.class);
		}
		public RuleSetContext ruleSet(int i) {
			return getRuleContext(RuleSetContext.class,i);
		}
		public CssDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterCssDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitCssDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitCssDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDocumentContext cssDocument() throws RecognitionException {
		CssDocumentContext _localctx = new CssDocumentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cssDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4569845202944L) != 0)) {
				{
				{
				setState(433);
				ruleSet();
				}
				}
				setState(438);
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
	public static class SelectorincssContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(Parsergrammar.DOT, 0); }
		public TerminalNode HASH() { return getToken(Parsergrammar.HASH, 0); }
		public TerminalNode TAGSFORCSS() { return getToken(Parsergrammar.TAGSFORCSS, 0); }
		public SelectorincssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorincss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSelectorincss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSelectorincss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSelectorincss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorincssContext selectorincss() throws RecognitionException {
		SelectorincssContext _localctx = new SelectorincssContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_selectorincss);
		int _la;
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
			case HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				_la = _input.LA(1);
				if ( !(_la==DOT || _la==HASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(440);
				match(IDENTIFIER);
				}
				break;
			case TAGSFORCSS:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				match(TAGSFORCSS);
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
	public static class RuleSetStartContext extends ParserRuleContext {
		public SelectorincssContext first;
		public SelectorincssContext selectorincss() {
			return getRuleContext(SelectorincssContext.class,0);
		}
		public List<TerminalNode> TAGSFORCSS() { return getTokens(Parsergrammar.TAGSFORCSS); }
		public TerminalNode TAGSFORCSS(int i) {
			return getToken(Parsergrammar.TAGSFORCSS, i);
		}
		public List<TerminalNode> WS() { return getTokens(Parsergrammar.WS); }
		public TerminalNode WS(int i) {
			return getToken(Parsergrammar.WS, i);
		}
		public RuleSetStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSetStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterRuleSetStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitRuleSetStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitRuleSetStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetStartContext ruleSetStart() throws RecognitionException {
		RuleSetStartContext _localctx = new RuleSetStartContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ruleSetStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			((RuleSetStartContext)_localctx).first = selectorincss();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAGSFORCSS || _la==WS) {
				{
				{
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(445);
					match(WS);
					}
					}
					setState(450);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(451);
				match(TAGSFORCSS);
				}
				}
				setState(456);
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
	public static class RuleSetContext extends ParserRuleContext {
		public RuleSetStartContext ruleSetStart() {
			return getRuleContext(RuleSetStartContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public RuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterRuleSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitRuleSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitRuleSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ruleSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			ruleSetStart();
			setState(458);
			match(LBRACE);
			setState(459);
			declarationList();
			setState(460);
			match(RBRACE);
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
	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Parsergrammar.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parsergrammar.SEMICOLON, i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			declaration();
			setState(467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(463);
					match(SEMICOLON);
					setState(464);
					declaration();
					}
					} 
				}
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(470);
				match(SEMICOLON);
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
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode PROPERTY_NAME() { return getToken(Parsergrammar.PROPERTY_NAME, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(PROPERTY_NAME);
			setState(474);
			match(COLON);
			setState(475);
			value();
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 99505802313728L) != 0)) {
					{
					{
					setState(476);
					value();
					}
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(Parsergrammar.NUMBER, 0); }
		public TerminalNode UNIT() { return getToken(Parsergrammar.UNIT, 0); }
		public TerminalNode COLOR() { return getToken(Parsergrammar.COLOR, 0); }
		public TerminalNode STRING() { return getToken(Parsergrammar.STRING, 0); }
		public TerminalNode VALUE_KEYWORD() { return getToken(Parsergrammar.VALUE_KEYWORD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_value);
		int _la;
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(NUMBER);
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(485);
					match(UNIT);
					}
				}

				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(COLOR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
				match(STRING);
				}
				break;
			case VALUE_KEYWORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(490);
				match(VALUE_KEYWORD);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(491);
				match(IDENTIFIER);
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
	public static class HtmlDocumentContext extends ParserRuleContext {
		public List<ScriptletOrSeaWsContext> scriptletOrSeaWs() {
			return getRuleContexts(ScriptletOrSeaWsContext.class);
		}
		public ScriptletOrSeaWsContext scriptletOrSeaWs(int i) {
			return getRuleContext(ScriptletOrSeaWsContext.class,i);
		}
		public TerminalNode XML() { return getToken(Parsergrammar.XML, 0); }
		public TerminalNode DTD() { return getToken(Parsergrammar.DTD, 0); }
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_htmlDocument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(494);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XML) {
				{
				setState(500);
				match(XML);
				}
			}

			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(503);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(509);
				match(DTD);
				}
			}

			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(512);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 327L) != 0)) {
				{
				{
				setState(518);
				htmlElements();
				}
				}
				setState(523);
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
	public static class ScriptletOrSeaWsContext extends ParserRuleContext {
		public TerminalNode SCRIPTLET() { return getToken(Parsergrammar.SCRIPTLET, 0); }
		public TerminalNode WS() { return getToken(Parsergrammar.WS, 0); }
		public ScriptletOrSeaWsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptletOrSeaWs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterScriptletOrSeaWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitScriptletOrSeaWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitScriptletOrSeaWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptletOrSeaWsContext scriptletOrSeaWs() throws RecognitionException {
		ScriptletOrSeaWsContext _localctx = new ScriptletOrSeaWsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_scriptletOrSeaWs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_la = _input.LA(1);
			if ( !(_la==WS || _la==SCRIPTLET) ) {
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
	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public List<HtmlCommentContext> htmlComment() {
			return getRuleContexts(HtmlCommentContext.class);
		}
		public HtmlCommentContext htmlComment(int i) {
			return getRuleContext(HtmlCommentContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_htmlElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HTML_COMMENT || _la==HTML_CONDITIONAL_COMMENT) {
				{
				{
				setState(526);
				htmlComment();
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(532);
			htmlElement();
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(533);
					htmlComment();
					}
					} 
				}
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoEndTagElementContext extends HtmlElementContext {
		public NoEndTagContext noEndTag() {
			return getRuleContext(NoEndTagContext.class,0);
		}
		public NoEndTagElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNoEndTagElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNoEndTagElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNoEndTagElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalTagElementContext extends HtmlElementContext {
		public NormalTagContext normalTag() {
			return getRuleContext(NormalTagContext.class,0);
		}
		public NormalTagElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNormalTagElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNormalTagElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNormalTagElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationElementContext extends HtmlElementContext {
		public TerminalNode INTERPOLATION() { return getToken(Parsergrammar.INTERPOLATION, 0); }
		public InterpolationElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterInterpolationElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitInterpolationElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitInterpolationElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TsTagElementContext extends HtmlElementContext {
		public TsTagContext tsTag() {
			return getRuleContext(TsTagContext.class,0);
		}
		public TsTagElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTsTagElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTsTagElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTsTagElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScriptletElementContext extends HtmlElementContext {
		public TerminalNode SCRIPTLET() { return getToken(Parsergrammar.SCRIPTLET, 0); }
		public ScriptletElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterScriptletElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitScriptletElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitScriptletElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_htmlElement);
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new TsTagElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				tsTag();
				}
				break;
			case 2:
				_localctx = new NoEndTagElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				noEndTag();
				}
				break;
			case 3:
				_localctx = new NormalTagElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				normalTag();
				}
				break;
			case 4:
				_localctx = new ScriptletElementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
				match(SCRIPTLET);
				}
				break;
			case 5:
				_localctx = new InterpolationElementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(543);
				match(INTERPOLATION);
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
	public static class TsTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(Parsergrammar.TAG_OPEN, 0); }
		public TerminalNode TAG_NAME() { return getToken(Parsergrammar.TAG_NAME, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(Parsergrammar.TAG_SLASH_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public TsTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTsTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTsTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTsTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsTagContext tsTag() throws RecognitionException {
		TsTagContext _localctx = new TsTagContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tsTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(TAG_OPEN);
			setState(547);
			match(TAG_NAME);
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 15L) != 0)) {
				{
				{
				setState(548);
				htmlAttribute();
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(554);
			match(TAG_SLASH_CLOSE);
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
	public static class NoEndTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(Parsergrammar.TAG_OPEN, 0); }
		public TerminalNode TAGS_VOID() { return getToken(Parsergrammar.TAGS_VOID, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(Parsergrammar.TAG_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public NoEndTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noEndTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNoEndTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNoEndTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNoEndTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoEndTagContext noEndTag() throws RecognitionException {
		NoEndTagContext _localctx = new NoEndTagContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_noEndTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(TAG_OPEN);
			setState(557);
			match(TAGS_VOID);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 15L) != 0)) {
				{
				{
				setState(558);
				htmlAttribute();
				}
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(564);
			match(TAG_CLOSE);
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
	public static class NormalTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(Parsergrammar.TAG_OPEN, 0); }
		public List<TerminalNode> TAGS() { return getTokens(Parsergrammar.TAGS); }
		public TerminalNode TAGS(int i) {
			return getToken(Parsergrammar.TAGS, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(Parsergrammar.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(Parsergrammar.TAG_CLOSE, i);
		}
		public TerminalNode TAG_OPEN_SLASH() { return getToken(Parsergrammar.TAG_OPEN_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public NormalTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNormalTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNormalTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNormalTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalTagContext normalTag() throws RecognitionException {
		NormalTagContext _localctx = new NormalTagContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_normalTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(TAG_OPEN);
			setState(567);
			match(TAGS);
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 15L) != 0)) {
				{
				{
				setState(568);
				htmlAttribute();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(574);
			match(TAG_CLOSE);
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(575);
				htmlContent();
				}
				break;
			}
			setState(578);
			match(TAG_OPEN_SLASH);
			setState(579);
			match(TAGS);
			setState(580);
			match(TAG_CLOSE);
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
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlContentStatementContext> htmlContentStatement() {
			return getRuleContexts(HtmlContentStatementContext.class);
		}
		public HtmlContentStatementContext htmlContentStatement(int i) {
			return getRuleContext(HtmlContentStatementContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_htmlContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & 80232845313L) != 0)) {
				{
				{
				setState(582);
				htmlContentStatement();
				}
				}
				setState(587);
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
	public static class HtmlContentStatementContext extends ParserRuleContext {
		public HtmlContentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContentStatement; }
	 
		public HtmlContentStatementContext() { }
		public void copyFrom(HtmlContentStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlColonStatementContext extends HtmlContentStatementContext {
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public HtmlColonStatementContext(HtmlContentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlColonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlColonStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlColonStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlScriptletStatementContext extends HtmlContentStatementContext {
		public TerminalNode SCRIPTLET() { return getToken(Parsergrammar.SCRIPTLET, 0); }
		public HtmlScriptletStatementContext(HtmlContentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlScriptletStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlScriptletStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlScriptletStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentStatementContext extends HtmlContentStatementContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public HtmlCommentStatementContext(HtmlContentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlCommentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlCommentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlCommentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementStatementContext extends HtmlContentStatementContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlElementStatementContext(HtmlContentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlElementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlElementStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlElementStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCDataStatementContext extends HtmlContentStatementContext {
		public TerminalNode CDATA() { return getToken(Parsergrammar.CDATA, 0); }
		public HtmlCDataStatementContext(HtmlContentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlCDataStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlCDataStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlCDataStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCharDataStatementContext extends HtmlContentStatementContext {
		public HtmlChardataContext htmlChardata() {
			return getRuleContext(HtmlChardataContext.class,0);
		}
		public HtmlCharDataStatementContext(HtmlContentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlCharDataStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlCharDataStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlCharDataStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlIdentifierStatementContext extends HtmlContentStatementContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public HtmlIdentifierStatementContext(HtmlContentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlIdentifierStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlIdentifierStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlIdentifierStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentStatementContext htmlContentStatement() throws RecognitionException {
		HtmlContentStatementContext _localctx = new HtmlContentStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_htmlContentStatement);
		try {
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new HtmlCharDataStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				htmlChardata();
				}
				break;
			case 2:
				_localctx = new HtmlElementStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				htmlElement();
				}
				break;
			case 3:
				_localctx = new HtmlCDataStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				match(CDATA);
				}
				break;
			case 4:
				_localctx = new HtmlCommentStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				htmlComment();
				}
				break;
			case 5:
				_localctx = new HtmlScriptletStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(592);
				match(SCRIPTLET);
				}
				break;
			case 6:
				_localctx = new HtmlIdentifierStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(593);
				match(IDENTIFIER);
				}
				break;
			case 7:
				_localctx = new HtmlColonStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(594);
				match(COLON);
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
	public static class HtmlChardataContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(Parsergrammar.HTML_TEXT, 0); }
		public TerminalNode WS() { return getToken(Parsergrammar.WS, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_la = _input.LA(1);
			if ( !(_la==WS || _la==HTML_TEXT) ) {
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
	public static class TagAttContext extends ParserRuleContext {
		public TerminalNode TAG_EQUALS() { return getToken(Parsergrammar.TAG_EQUALS, 0); }
		public TerminalNode METHOD_CALL_VALUE() { return getToken(Parsergrammar.METHOD_CALL_VALUE, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(Parsergrammar.ATTVALUE_VALUE, 0); }
		public TagAttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagAtt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTagAtt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTagAtt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTagAtt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagAttContext tagAtt() throws RecognitionException {
		TagAttContext _localctx = new TagAttContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_tagAtt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(TAG_EQUALS);
			setState(600);
			_la = _input.LA(1);
			if ( !(_la==METHOD_CALL_VALUE || _la==ATTVALUE_VALUE) ) {
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
	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
	 
		public HtmlAttributeContext() { }
		public void copyFrom(HtmlAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventBindingContext extends HtmlAttributeContext {
		public TerminalNode EVENT_BINDING() { return getToken(Parsergrammar.EVENT_BINDING, 0); }
		public TagAttContext tagAtt() {
			return getRuleContext(TagAttContext.class,0);
		}
		public EventBindingContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterEventBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitEventBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructuralDirectiveAttributeContext extends HtmlAttributeContext {
		public TerminalNode STRUCTURAL_DIRECTIVE() { return getToken(Parsergrammar.STRUCTURAL_DIRECTIVE, 0); }
		public TagAttContext tagAtt() {
			return getRuleContext(TagAttContext.class,0);
		}
		public StructuralDirectiveAttributeContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterStructuralDirectiveAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitStructuralDirectiveAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitStructuralDirectiveAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeBindingContext extends HtmlAttributeContext {
		public TerminalNode ATTRIBUTE_BINDING() { return getToken(Parsergrammar.ATTRIBUTE_BINDING, 0); }
		public TagAttContext tagAtt() {
			return getRuleContext(TagAttContext.class,0);
		}
		public AttributeBindingContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterAttributeBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitAttributeBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitAttributeBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagNameAttributeContext extends HtmlAttributeContext {
		public TerminalNode TAG_NAME() { return getToken(Parsergrammar.TAG_NAME, 0); }
		public TagAttContext tagAtt() {
			return getRuleContext(TagAttContext.class,0);
		}
		public TagNameAttributeContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTagNameAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTagNameAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTagNameAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_htmlAttribute);
		int _la;
		try {
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCTURAL_DIRECTIVE:
				_localctx = new StructuralDirectiveAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				match(STRUCTURAL_DIRECTIVE);
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(603);
					tagAtt();
					}
				}

				}
				break;
			case ATTRIBUTE_BINDING:
				_localctx = new AttributeBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				match(ATTRIBUTE_BINDING);
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(607);
					tagAtt();
					}
				}

				}
				break;
			case EVENT_BINDING:
				_localctx = new EventBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(610);
				match(EVENT_BINDING);
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(611);
					tagAtt();
					}
				}

				}
				break;
			case TAG_NAME:
				_localctx = new TagNameAttributeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
				match(TAG_NAME);
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(615);
					tagAtt();
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
	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public TerminalNode WS() { return getToken(Parsergrammar.WS, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_htmlMisc);
		try {
			setState(622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				htmlComment();
				}
				break;
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				match(WS);
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
	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(Parsergrammar.HTML_COMMENT, 0); }
		public TerminalNode HTML_CONDITIONAL_COMMENT() { return getToken(Parsergrammar.HTML_CONDITIONAL_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_la = _input.LA(1);
			if ( !(_la==HTML_COMMENT || _la==HTML_CONDITIONAL_COMMENT) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001V\u0273\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001t\b"+
		"\u0001\u000b\u0001\f\u0001u\u0001\u0001\u0001\u0001\u0003\u0001z\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u0082\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u008c\b\u0003"+
		"\n\u0003\f\u0003\u008f\t\u0003\u0001\u0004\u0005\u0004\u0092\b\u0004\n"+
		"\u0004\f\u0004\u0095\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00a0\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00a7\b\u0006\n\u0006\f\u0006\u00aa\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b8\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00c0\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00c5\b\t\u0001\t\u0001\t\u0003\t\u00c9\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00d3\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00d7\b\u000b"+
		"\n\u000b\f\u000b\u00da\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ec\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00f5\b\u000f\u0001\u0010\u0003\u0010\u00f8\b\u0010"+
		"\u0001\u0010\u0003\u0010\u00fb\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0108\b\u0012\n\u0012\f\u0012\u010b"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0110\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u011a\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u011e\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0127\b\u0015\u0005\u0015"+
		"\u0129\b\u0015\n\u0015\f\u0015\u012c\t\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0130\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u0136\b\u0016\n\u0016\f\u0016\u0139\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u013d\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0142\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0146\b\u0017\u0003"+
		"\u0017\u0148\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0152\b\u0018\n"+
		"\u0018\f\u0018\u0155\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0163\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0168\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u017d"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u0188\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u018e\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0193\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u019a\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0003 \u019f\b \u0001 \u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0005\"\u01b3\b\"\n\"\f\"\u01b6\t\"\u0001"+
		"#\u0001#\u0001#\u0003#\u01bb\b#\u0001$\u0001$\u0005$\u01bf\b$\n$\f$\u01c2"+
		"\t$\u0001$\u0005$\u01c5\b$\n$\f$\u01c8\t$\u0001%\u0001%\u0001%\u0001%"+
		"\u0001%\u0001&\u0001&\u0001&\u0005&\u01d2\b&\n&\f&\u01d5\t&\u0001&\u0003"+
		"&\u01d8\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u01de\b\'\n\'\f\'\u01e1"+
		"\t\'\u0003\'\u01e3\b\'\u0001(\u0001(\u0003(\u01e7\b(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u01ed\b(\u0001)\u0005)\u01f0\b)\n)\f)\u01f3\t)\u0001)"+
		"\u0003)\u01f6\b)\u0001)\u0005)\u01f9\b)\n)\f)\u01fc\t)\u0001)\u0003)\u01ff"+
		"\b)\u0001)\u0005)\u0202\b)\n)\f)\u0205\t)\u0001)\u0005)\u0208\b)\n)\f"+
		")\u020b\t)\u0001*\u0001*\u0001+\u0005+\u0210\b+\n+\f+\u0213\t+\u0001+"+
		"\u0001+\u0005+\u0217\b+\n+\f+\u021a\t+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u0221\b,\u0001-\u0001-\u0001-\u0005-\u0226\b-\n-\f-\u0229\t-"+
		"\u0001-\u0001-\u0001.\u0001.\u0001.\u0005.\u0230\b.\n.\f.\u0233\t.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0005/\u023a\b/\n/\f/\u023d\t/\u0001/\u0001"+
		"/\u0003/\u0241\b/\u0001/\u0001/\u0001/\u0001/\u00010\u00050\u0248\b0\n"+
		"0\f0\u024b\t0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00031"+
		"\u0254\b1\u00012\u00012\u00013\u00013\u00013\u00014\u00014\u00034\u025d"+
		"\b4\u00014\u00014\u00034\u0261\b4\u00014\u00014\u00034\u0265\b4\u0001"+
		"4\u00014\u00034\u0269\b4\u00034\u026b\b4\u00015\u00015\u00035\u026f\b"+
		"5\u00016\u00016\u00016\u0001\u00d8\u00007\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjl\u0000\b\u0002\u0000\u0016\u0016++\u0002\u0000"+
		"\u0016\u0018++\u0002\u0000\u0011\u0012,-\u0002\u0000##%%\u0002\u00005"+
		"5>>\u0002\u000055CC\u0001\u0000NO\u0001\u00009:\u0296\u0000n\u0001\u0000"+
		"\u0000\u0000\u0002s\u0001\u0000\u0000\u0000\u0004}\u0001\u0000\u0000\u0000"+
		"\u0006\u0087\u0001\u0000\u0000\u0000\b\u0093\u0001\u0000\u0000\u0000\n"+
		"\u009f\u0001\u0000\u0000\u0000\f\u00a1\u0001\u0000\u0000\u0000\u000e\u00b0"+
		"\u0001\u0000\u0000\u0000\u0010\u00b2\u0001\u0000\u0000\u0000\u0012\u00bf"+
		"\u0001\u0000\u0000\u0000\u0014\u00ca\u0001\u0000\u0000\u0000\u0016\u00ce"+
		"\u0001\u0000\u0000\u0000\u0018\u00dd\u0001\u0000\u0000\u0000\u001a\u00e1"+
		"\u0001\u0000\u0000\u0000\u001c\u00e6\u0001\u0000\u0000\u0000\u001e\u00f0"+
		"\u0001\u0000\u0000\u0000 \u00f7\u0001\u0000\u0000\u0000\"\u00fe\u0001"+
		"\u0000\u0000\u0000$\u0100\u0001\u0000\u0000\u0000&\u010c\u0001\u0000\u0000"+
		"\u0000(\u0116\u0001\u0000\u0000\u0000*\u0121\u0001\u0000\u0000\u0000,"+
		"\u0131\u0001\u0000\u0000\u0000.\u0147\u0001\u0000\u0000\u00000\u0149\u0001"+
		"\u0000\u0000\u00002\u0159\u0001\u0000\u0000\u00004\u015f\u0001\u0000\u0000"+
		"\u00006\u016d\u0001\u0000\u0000\u00008\u0174\u0001\u0000\u0000\u0000:"+
		"\u0179\u0001\u0000\u0000\u0000<\u0187\u0001\u0000\u0000\u0000>\u0196\u0001"+
		"\u0000\u0000\u0000@\u019e\u0001\u0000\u0000\u0000B\u01a9\u0001\u0000\u0000"+
		"\u0000D\u01b4\u0001\u0000\u0000\u0000F\u01ba\u0001\u0000\u0000\u0000H"+
		"\u01bc\u0001\u0000\u0000\u0000J\u01c9\u0001\u0000\u0000\u0000L\u01ce\u0001"+
		"\u0000\u0000\u0000N\u01d9\u0001\u0000\u0000\u0000P\u01ec\u0001\u0000\u0000"+
		"\u0000R\u01f1\u0001\u0000\u0000\u0000T\u020c\u0001\u0000\u0000\u0000V"+
		"\u0211\u0001\u0000\u0000\u0000X\u0220\u0001\u0000\u0000\u0000Z\u0222\u0001"+
		"\u0000\u0000\u0000\\\u022c\u0001\u0000\u0000\u0000^\u0236\u0001\u0000"+
		"\u0000\u0000`\u0249\u0001\u0000\u0000\u0000b\u0253\u0001\u0000\u0000\u0000"+
		"d\u0255\u0001\u0000\u0000\u0000f\u0257\u0001\u0000\u0000\u0000h\u026a"+
		"\u0001\u0000\u0000\u0000j\u026e\u0001\u0000\u0000\u0000l\u0270\u0001\u0000"+
		"\u0000\u0000no\u0003\u0002\u0001\u0000op\u0003R)\u0000pq\u0003D\"\u0000"+
		"q\u0001\u0001\u0000\u0000\u0000rt\u0003\f\u0006\u0000sr\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vy\u0001\u0000\u0000\u0000wz\u0003\u0010\b\u0000xz\u0003\u001c"+
		"\u000e\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0003\u0004\u0002\u0000"+
		"|\u0003\u0001\u0000\u0000\u0000}~\u0005\u0003\u0000\u0000~\u007f\u0005"+
		"\u0005\u0000\u0000\u007f\u0081\u0005+\u0000\u0000\u0080\u0082\u0003\u0006"+
		"\u0003\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0019"+
		"\u0000\u0000\u0084\u0085\u0003\b\u0004\u0000\u0085\u0086\u0005\u001a\u0000"+
		"\u0000\u0086\u0005\u0001\u0000\u0000\u0000\u0087\u0088\u0005\t\u0000\u0000"+
		"\u0088\u008d\u0007\u0000\u0000\u0000\u0089\u008a\u0005 \u0000\u0000\u008a"+
		"\u008c\u0007\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c"+
		"\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u0007\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u0090\u0092\u0003\n\u0005\u0000\u0091\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\t\u0001"+
		"\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u00a0\u0003"+
		"8\u001c\u0000\u0097\u00a0\u0003:\u001d\u0000\u0098\u00a0\u00036\u001b"+
		"\u0000\u0099\u00a0\u0003,\u0016\u0000\u009a\u00a0\u00030\u0018\u0000\u009b"+
		"\u00a0\u0003&\u0013\u0000\u009c\u00a0\u00034\u001a\u0000\u009d\u00a0\u0003"+
		"B!\u0000\u009e\u00a0\u0003@ \u0000\u009f\u0096\u0001\u0000\u0000\u0000"+
		"\u009f\u0097\u0001\u0000\u0000\u0000\u009f\u0098\u0001\u0000\u0000\u0000"+
		"\u009f\u0099\u0001\u0000\u0000\u0000\u009f\u009a\u0001\u0000\u0000\u0000"+
		"\u009f\u009b\u0001\u0000\u0000\u0000\u009f\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u000b\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0004\u0000\u0000"+
		"\u00a2\u00a3\u0005\u0019\u0000\u0000\u00a3\u00a8\u0003\u000e\u0007\u0000"+
		"\u00a4\u00a5\u0005 \u0000\u0000\u00a5\u00a7\u0003\u000e\u0007\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005\u001a\u0000\u0000\u00ac\u00ad\u0005\u0002\u0000\u0000\u00ad"+
		"\u00ae\u0005-\u0000\u0000\u00ae\u00af\u0005!\u0000\u0000\u00af\r\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0007\u0001\u0000\u0000\u00b1\u000f\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005\b\u0000\u0000\u00b3\u00b4\u0005\u0017"+
		"\u0000\u0000\u00b4\u00b5\u0005\u001b\u0000\u0000\u00b5\u00b7\u0005\u0019"+
		"\u0000\u0000\u00b6\u00b8\u0003\u0012\t\u0000\u00b7\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005\u001a\u0000\u0000\u00ba\u00bb\u0005\u001c\u0000"+
		"\u0000\u00bb\u0011\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003\u0014\n\u0000"+
		"\u00bd\u00be\u0005 \u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c1\u00c2\u0003\u0016\u000b\u0000\u00c2"+
		"\u00c3\u0005 \u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c8\u0003\u001a\r\u0000\u00c7\u00c9\u0003"+
		"\u0018\f\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u0013\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u000b"+
		"\u0000\u0000\u00cb\u00cc\u0005\u001f\u0000\u0000\u00cc\u00cd\u0005-\u0000"+
		"\u0000\u00cd\u0015\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0001\u0000"+
		"\u0000\u00cf\u00d0\u0005\u001f\u0000\u0000\u00d0\u00d2\u0005\u001d\u0000"+
		"\u0000\u00d1\u00d3\u0007\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0005 \u0000\u0000\u00d5\u00d7\u0007\u0000\u0000\u0000"+
		"\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0005\u001e\u0000\u0000\u00dc\u0017\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0005\r\u0000\u0000\u00de\u00df\u0005\u001f\u0000\u0000\u00df"+
		"\u00e0\u0005-\u0000\u0000\u00e0\u0019\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0005\f\u0000\u0000\u00e2\u00e3\u0005\u001f\u0000\u0000\u00e3\u00e4\u0005"+
		"-\u0000\u0000\u00e4\u00e5\u0005 \u0000\u0000\u00e5\u001b\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0005\b\u0000\u0000\u00e7\u00e8\u0005\u0018\u0000\u0000"+
		"\u00e8\u00e9\u0005\u001b\u0000\u0000\u00e9\u00eb\u0005\u0019\u0000\u0000"+
		"\u00ea\u00ec\u0003\u001e\u000f\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0005\u001a\u0000\u0000\u00ee\u00ef\u0005\u001c\u0000\u0000"+
		"\u00ef\u001d\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u000f\u0000\u0000"+
		"\u00f1\u00f2\u0005\u001f\u0000\u0000\u00f2\u00f4\u0005-\u0000\u0000\u00f3"+
		"\u00f5\u0005 \u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f5\u001f\u0001\u0000\u0000\u0000\u00f6\u00f8"+
		"\u0005\u0015\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00fb"+
		"\u0005\u0014\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0005+\u0000\u0000\u00fd!\u0001\u0000\u0000\u0000\u00fe\u00ff\u0007\u0002"+
		"\u0000\u0000\u00ff#\u0001\u0000\u0000\u0000\u0100\u0101\u0005+\u0000\u0000"+
		"\u0101\u0102\u0005\u001f\u0000\u0000\u0102\u0109\u0005\u0013\u0000\u0000"+
		"\u0103\u0104\u0005 \u0000\u0000\u0104\u0105\u0005+\u0000\u0000\u0105\u0106"+
		"\u0005\u001f\u0000\u0000\u0106\u0108\u0005\u0013\u0000\u0000\u0107\u0103"+
		"\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a%\u0001"+
		"\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010d\u0003"+
		" \u0010\u0000\u010d\u010f\u0005\u001b\u0000\u0000\u010e\u0110\u0003$\u0012"+
		"\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u001c\u0000"+
		"\u0000\u0112\u0113\u0005\u0019\u0000\u0000\u0113\u0114\u0003(\u0014\u0000"+
		"\u0114\u0115\u0005\u001a\u0000\u0000\u0115\'\u0001\u0000\u0000\u0000\u0116"+
		"\u011d\u0005\u0007\u0000\u0000\u0117\u0118\u0005$\u0000\u0000\u0118\u011a"+
		"\u0005#\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011e\u0005"+
		"+\u0000\u0000\u011c\u011e\u0003\"\u0011\u0000\u011d\u0119\u0001\u0000"+
		"\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0005!\u0000\u0000\u0120)\u0001\u0000\u0000\u0000"+
		"\u0121\u012a\u0005\u0019\u0000\u0000\u0122\u0123\u0005+\u0000\u0000\u0123"+
		"\u0124\u0005\u001f\u0000\u0000\u0124\u0126\u0003\"\u0011\u0000\u0125\u0127"+
		"\u0005 \u0000\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001"+
		"\u0000\u0000\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128\u0122\u0001"+
		"\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012d\u0001"+
		"\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u012f\u0005"+
		"\u001a\u0000\u0000\u012e\u0130\u0005 \u0000\u0000\u012f\u012e\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130+\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0003 \u0010\u0000\u0132\u0133\u0005\"\u0000\u0000"+
		"\u0133\u0137\u0005\u001d\u0000\u0000\u0134\u0136\u0003.\u0017\u0000\u0135"+
		"\u0134\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137"+
		"\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138"+
		"\u013a\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a"+
		"\u013c\u0005\u001e\u0000\u0000\u013b\u013d\u0005!\u0000\u0000\u013c\u013b"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d-\u0001"+
		"\u0000\u0000\u0000\u013e\u0148\u0003*\u0015\u0000\u013f\u0141\u0005,\u0000"+
		"\u0000\u0140\u0142\u0005 \u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000"+
		"\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0148\u0001\u0000\u0000\u0000"+
		"\u0143\u0145\u0005-\u0000\u0000\u0144\u0146\u0005 \u0000\u0000\u0145\u0144"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148"+
		"\u0001\u0000\u0000\u0000\u0147\u013e\u0001\u0000\u0000\u0000\u0147\u013f"+
		"\u0001\u0000\u0000\u0000\u0147\u0143\u0001\u0000\u0000\u0000\u0148/\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0003 \u0010\u0000\u014a\u014b\u0005\u001f"+
		"\u0000\u0000\u014b\u014c\u0005\u0013\u0000\u0000\u014c\u014d\u0005\u001d"+
		"\u0000\u0000\u014d\u014e\u0005\u001e\u0000\u0000\u014e\u014f\u0005\"\u0000"+
		"\u0000\u014f\u0153\u0005\u001d\u0000\u0000\u0150\u0152\u00032\u0019\u0000"+
		"\u0151\u0150\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000"+
		"\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000"+
		"\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0005\u001e\u0000\u0000\u0157\u0158\u0005!\u0000\u0000\u0158"+
		"1\u0001\u0000\u0000\u0000\u0159\u015a\u0003*\u0015\u0000\u015a\u015b\u0005"+
		" \u0000\u0000\u015b\u015c\u0005,\u0000\u0000\u015c\u015d\u0005 \u0000"+
		"\u0000\u015d\u015e\u0005-\u0000\u0000\u015e3\u0001\u0000\u0000\u0000\u015f"+
		"\u0160\u0005\u0006\u0000\u0000\u0160\u0167\u0005\u001b\u0000\u0000\u0161"+
		"\u0163\u0005\u0015\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0162"+
		"\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0005+\u0000\u0000\u0165\u0166\u0005\u001f\u0000\u0000\u0166\u0168"+
		"\u0005+\u0000\u0000\u0167\u0162\u0001\u0000\u0000\u0000\u0167\u0168\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0005"+
		"\u001c\u0000\u0000\u016a\u016b\u0005\u0019\u0000\u0000\u016b\u016c\u0005"+
		"\u001a\u0000\u0000\u016c5\u0001\u0000\u0000\u0000\u016d\u016e\u0003 \u0010"+
		"\u0000\u016e\u016f\u0005\u001f\u0000\u0000\u016f\u0170\u0005\u0013\u0000"+
		"\u0000\u0170\u0171\u0005\"\u0000\u0000\u0171\u0172\u0003\"\u0011\u0000"+
		"\u0172\u0173\u0005!\u0000\u0000\u01737\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0005+\u0000\u0000\u0175\u0176\u0005\"\u0000\u0000\u0176\u0177\u0003"+
		"\"\u0011\u0000\u0177\u0178\u0005!\u0000\u0000\u01789\u0001\u0000\u0000"+
		"\u0000\u0179\u017a\u0003 \u0010\u0000\u017a\u017c\u0005\u001b\u0000\u0000"+
		"\u017b\u017d\u0003$\u0012\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0005\u001c\u0000\u0000\u017f\u0180\u0005\u001f\u0000\u0000\u0180"+
		"\u0181\u0005\u0010\u0000\u0000\u0181\u0182\u0005\u0019\u0000\u0000\u0182"+
		"\u0183\u0003<\u001e\u0000\u0183\u0184\u0005\u001a\u0000\u0000\u0184;\u0001"+
		"\u0000\u0000\u0000\u0185\u0186\u0005$\u0000\u0000\u0186\u0188\u0005#\u0000"+
		"\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0005+\u0000\u0000"+
		"\u018a\u018d\u0005\"\u0000\u0000\u018b\u018c\u0005$\u0000\u0000\u018c"+
		"\u018e\u0005#\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0192"+
		"\u0005+\u0000\u0000\u0190\u0191\u0005#\u0000\u0000\u0191\u0193\u0003>"+
		"\u001f\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0005!\u0000"+
		"\u0000\u0195=\u0001\u0000\u0000\u0000\u0196\u0197\u0005+\u0000\u0000\u0197"+
		"\u0199\u0005\u001b\u0000\u0000\u0198\u019a\u0005+\u0000\u0000\u0199\u0198"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b"+
		"\u0001\u0000\u0000\u0000\u019b\u019c\u0005\u001c\u0000\u0000\u019c?\u0001"+
		"\u0000\u0000\u0000\u019d\u019f\u0005\u0015\u0000\u0000\u019e\u019d\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0005\n\u0000\u0000\u01a1\u01a2\u0005\u001b"+
		"\u0000\u0000\u01a2\u01a3\u0005\u001c\u0000\u0000\u01a3\u01a4\u0005\u001f"+
		"\u0000\u0000\u01a4\u01a5\u0005\u0010\u0000\u0000\u01a5\u01a6\u0005\u0019"+
		"\u0000\u0000\u01a6\u01a7\u0003<\u001e\u0000\u01a7\u01a8\u0005\u001a\u0000"+
		"\u0000\u01a8A\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005+\u0000\u0000\u01aa"+
		"\u01ab\u0005\"\u0000\u0000\u01ab\u01ac\u0005\u0016\u0000\u0000\u01ac\u01ad"+
		"\u0005\u001b\u0000\u0000\u01ad\u01ae\u0005-\u0000\u0000\u01ae\u01af\u0005"+
		"\u001c\u0000\u0000\u01af\u01b0\u0005!\u0000\u0000\u01b0C\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b3\u0003J%\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b5E\u0001\u0000\u0000\u0000\u01b6\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b8\u0007\u0003\u0000\u0000\u01b8\u01bb"+
		"\u0005+\u0000\u0000\u01b9\u01bb\u0005*\u0000\u0000\u01ba\u01b7\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bbG\u0001\u0000\u0000"+
		"\u0000\u01bc\u01c6\u0003F#\u0000\u01bd\u01bf\u00055\u0000\u0000\u01be"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000\u0000\u01c0"+
		"\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c5\u0005*\u0000\u0000\u01c4\u01c0\u0001\u0000\u0000\u0000\u01c5\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c7I\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c9\u01ca\u0003H$\u0000\u01ca\u01cb\u0005\u0019\u0000"+
		"\u0000\u01cb\u01cc\u0003L&\u0000\u01cc\u01cd\u0005\u001a\u0000\u0000\u01cd"+
		"K\u0001\u0000\u0000\u0000\u01ce\u01d3\u0003N\'\u0000\u01cf\u01d0\u0005"+
		"!\u0000\u0000\u01d0\u01d2\u0003N\'\u0000\u01d1\u01cf\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d5\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d8\u0005!\u0000\u0000"+
		"\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000"+
		"\u01d8M\u0001\u0000\u0000\u0000\u01d9\u01da\u0005(\u0000\u0000\u01da\u01db"+
		"\u0005\u001f\u0000\u0000\u01db\u01e2\u0003P(\u0000\u01dc\u01de\u0003P"+
		"(\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000\u01de\u01e1\u0001\u0000\u0000"+
		"\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e3\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000"+
		"\u0000\u01e2\u01df\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e3O\u0001\u0000\u0000\u0000\u01e4\u01e6\u0005,\u0000\u0000\u01e5"+
		"\u01e7\u0005&\u0000\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u0001\u0000\u0000\u0000\u01e7\u01ed\u0001\u0000\u0000\u0000\u01e8\u01ed"+
		"\u0005\'\u0000\u0000\u01e9\u01ed\u0005.\u0000\u0000\u01ea\u01ed\u0005"+
		")\u0000\u0000\u01eb\u01ed\u0005+\u0000\u0000\u01ec\u01e4\u0001\u0000\u0000"+
		"\u0000\u01ec\u01e8\u0001\u0000\u0000\u0000\u01ec\u01e9\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000"+
		"\u0000\u01edQ\u0001\u0000\u0000\u0000\u01ee\u01f0\u0003T*\u0000\u01ef"+
		"\u01ee\u0001\u0000\u0000\u0000\u01f0\u01f3\u0001\u0000\u0000\u0000\u01f1"+
		"\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f6\u0005;\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f5\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f6\u01fa\u0001\u0000\u0000\u0000\u01f7\u01f9"+
		"\u0003T*\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001\u0000"+
		"\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fd\u01ff\u0005=\u0000\u0000\u01fe\u01fd\u0001\u0000\u0000"+
		"\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0203\u0001\u0000\u0000"+
		"\u0000\u0200\u0202\u0003T*\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0202"+
		"\u0205\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0203"+
		"\u0204\u0001\u0000\u0000\u0000\u0204\u0209\u0001\u0000\u0000\u0000\u0205"+
		"\u0203\u0001\u0000\u0000\u0000\u0206\u0208\u0003V+\u0000\u0207\u0206\u0001"+
		"\u0000\u0000\u0000\u0208\u020b\u0001\u0000\u0000\u0000\u0209\u0207\u0001"+
		"\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020aS\u0001\u0000"+
		"\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020c\u020d\u0007\u0004"+
		"\u0000\u0000\u020dU\u0001\u0000\u0000\u0000\u020e\u0210\u0003l6\u0000"+
		"\u020f\u020e\u0001\u0000\u0000\u0000\u0210\u0213\u0001\u0000\u0000\u0000"+
		"\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000"+
		"\u0212\u0214\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000"+
		"\u0214\u0218\u0003X,\u0000\u0215\u0217\u0003l6\u0000\u0216\u0215\u0001"+
		"\u0000\u0000\u0000\u0217\u021a\u0001\u0000\u0000\u0000\u0218\u0216\u0001"+
		"\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219W\u0001\u0000"+
		"\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021b\u0221\u0003Z-\u0000"+
		"\u021c\u0221\u0003\\.\u0000\u021d\u0221\u0003^/\u0000\u021e\u0221\u0005"+
		">\u0000\u0000\u021f\u0221\u00058\u0000\u0000\u0220\u021b\u0001\u0000\u0000"+
		"\u0000\u0220\u021c\u0001\u0000\u0000\u0000\u0220\u021d\u0001\u0000\u0000"+
		"\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220\u021f\u0001\u0000\u0000"+
		"\u0000\u0221Y\u0001\u0000\u0000\u0000\u0222\u0223\u0005@\u0000\u0000\u0223"+
		"\u0227\u0005G\u0000\u0000\u0224\u0226\u0003h4\u0000\u0225\u0224\u0001"+
		"\u0000\u0000\u0000\u0226\u0229\u0001\u0000\u0000\u0000\u0227\u0225\u0001"+
		"\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u022a\u0001"+
		"\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u022a\u022b\u0005"+
		"E\u0000\u0000\u022b[\u0001\u0000\u0000\u0000\u022c\u022d\u0005@\u0000"+
		"\u0000\u022d\u0231\u0005B\u0000\u0000\u022e\u0230\u0003h4\u0000\u022f"+
		"\u022e\u0001\u0000\u0000\u0000\u0230\u0233\u0001\u0000\u0000\u0000\u0231"+
		"\u022f\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232"+
		"\u0234\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0234"+
		"\u0235\u0005D\u0000\u0000\u0235]\u0001\u0000\u0000\u0000\u0236\u0237\u0005"+
		"@\u0000\u0000\u0237\u023b\u0005A\u0000\u0000\u0238\u023a\u0003h4\u0000"+
		"\u0239\u0238\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000"+
		"\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000"+
		"\u023c\u023e\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000"+
		"\u023e\u0240\u0005D\u0000\u0000\u023f\u0241\u0003`0\u0000\u0240\u023f"+
		"\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241\u0242"+
		"\u0001\u0000\u0000\u0000\u0242\u0243\u0005?\u0000\u0000\u0243\u0244\u0005"+
		"A\u0000\u0000\u0244\u0245\u0005D\u0000\u0000\u0245_\u0001\u0000\u0000"+
		"\u0000\u0246\u0248\u0003b1\u0000\u0247\u0246\u0001\u0000\u0000\u0000\u0248"+
		"\u024b\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u0249"+
		"\u024a\u0001\u0000\u0000\u0000\u024aa\u0001\u0000\u0000\u0000\u024b\u0249"+
		"\u0001\u0000\u0000\u0000\u024c\u0254\u0003d2\u0000\u024d\u0254\u0003X"+
		",\u0000\u024e\u0254\u0005<\u0000\u0000\u024f\u0254\u0003l6\u0000\u0250"+
		"\u0254\u0005>\u0000\u0000\u0251\u0254\u0005+\u0000\u0000\u0252\u0254\u0005"+
		"\u001f\u0000\u0000\u0253\u024c\u0001\u0000\u0000\u0000\u0253\u024d\u0001"+
		"\u0000\u0000\u0000\u0253\u024e\u0001\u0000\u0000\u0000\u0253\u024f\u0001"+
		"\u0000\u0000\u0000\u0253\u0250\u0001\u0000\u0000\u0000\u0253\u0251\u0001"+
		"\u0000\u0000\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0254c\u0001\u0000"+
		"\u0000\u0000\u0255\u0256\u0007\u0005\u0000\u0000\u0256e\u0001\u0000\u0000"+
		"\u0000\u0257\u0258\u0005F\u0000\u0000\u0258\u0259\u0007\u0006\u0000\u0000"+
		"\u0259g\u0001\u0000\u0000\u0000\u025a\u025c\u0005H\u0000\u0000\u025b\u025d"+
		"\u0003f3\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000"+
		"\u0000\u0000\u025d\u026b\u0001\u0000\u0000\u0000\u025e\u0260\u0005I\u0000"+
		"\u0000\u025f\u0261\u0003f3\u0000\u0260\u025f\u0001\u0000\u0000\u0000\u0260"+
		"\u0261\u0001\u0000\u0000\u0000\u0261\u026b\u0001\u0000\u0000\u0000\u0262"+
		"\u0264\u0005J\u0000\u0000\u0263\u0265\u0003f3\u0000\u0264\u0263\u0001"+
		"\u0000\u0000\u0000\u0264\u0265\u0001\u0000\u0000\u0000\u0265\u026b\u0001"+
		"\u0000\u0000\u0000\u0266\u0268\u0005G\u0000\u0000\u0267\u0269\u0003f3"+
		"\u0000\u0268\u0267\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000"+
		"\u0000\u0269\u026b\u0001\u0000\u0000\u0000\u026a\u025a\u0001\u0000\u0000"+
		"\u0000\u026a\u025e\u0001\u0000\u0000\u0000\u026a\u0262\u0001\u0000\u0000"+
		"\u0000\u026a\u0266\u0001\u0000\u0000\u0000\u026bi\u0001\u0000\u0000\u0000"+
		"\u026c\u026f\u0003l6\u0000\u026d\u026f\u00055\u0000\u0000\u026e\u026c"+
		"\u0001\u0000\u0000\u0000\u026e\u026d\u0001\u0000\u0000\u0000\u026fk\u0001"+
		"\u0000\u0000\u0000\u0270\u0271\u0007\u0007\u0000\u0000\u0271m\u0001\u0000"+
		"\u0000\u0000Euy\u0081\u008d\u0093\u009f\u00a8\u00b7\u00bf\u00c4\u00c8"+
		"\u00d2\u00d8\u00eb\u00f4\u00f7\u00fa\u0109\u010f\u0119\u011d\u0126\u012a"+
		"\u012f\u0137\u013c\u0141\u0145\u0147\u0153\u0162\u0167\u017c\u0187\u018d"+
		"\u0192\u0199\u019e\u01b4\u01ba\u01c0\u01c6\u01d3\u01d7\u01df\u01e2\u01e6"+
		"\u01ec\u01f1\u01f5\u01fa\u01fe\u0203\u0209\u0211\u0218\u0220\u0227\u0231"+
		"\u023b\u0240\u0249\u0253\u025c\u0260\u0264\u0268\u026a\u026e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}