// Generated from ./src/Cpp.g4 by ANTLR 4.13.1

import java.lang.Math;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CppParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOLATILE=1, CONTINUE=2, TYPEDEF=3, STRUCT=4, STATIC=5, DOUBLE=6, INLINE=7, 
		RETURN=8, FLOAT=9, CLASS=10, WHILE=11, CONST=12, BREAK=13, AUTO=14, VOID=15, 
		CHAR=16, LONG=17, GOTO=18, ELSE=19, INT=20, FOR=21, DO=22, IF=23, LITERAL=24, 
		VALID_NAME=25, NUMBER=26, INCR=27, DECR=28, ARROW=29, NE=30, PLUSA=31, 
		MUNUSA=32, MULTA=33, DIVA=34, MODA=35, NGR=36, NLS=37, AND=38, OR=39, 
		EQ=40, MULT=41, NOT=42, DIV=43, MOD=44, PLUS=45, MINUS=46, GR=47, LS=48, 
		ASSING=49, AMPER=50, ZAP=51, PZAP=52, LPAREL=53, RPAREL=54, LBOX=55, RBOX=56, 
		LFIGURE=57, RFIGURE=58, DOT=59, SPACE=60;
	public static final int
		RULE_program = 0, RULE_outer_statement_list = 1, RULE_outer_statement = 2, 
		RULE_function_statement = 3, RULE_statement_list = 4, RULE_statement = 5, 
		RULE_selection_statement = 6, RULE_block_statement = 7, RULE_expression_statement = 8, 
		RULE_iteration_statement = 9, RULE_jump_statement = 10, RULE_declaration_statement = 11, 
		RULE_init_declarator_list = 12, RULE_init_declarator = 13, RULE_declarator = 14, 
		RULE_direct_declarator = 15, RULE_parameter_list = 16, RULE_parameter_declaration = 17, 
		RULE_initializer = 18, RULE_initializer_list = 19, RULE_pointer = 20, 
		RULE_type_qualifier_list = 21, RULE_declaration_specifiers = 22, RULE_type_qualifier = 23, 
		RULE_function_specifier = 24, RULE_type_specifier = 25, RULE_storage_class_specifier = 26, 
		RULE_expression = 27, RULE_assigment_expression = 28, RULE_logical_or_expression = 29, 
		RULE_logical_and_expression = 30, RULE_equality_expression = 31, RULE_relational_expression = 32, 
		RULE_additive_expression = 33, RULE_multiplicative_expression = 34, RULE_unary_expression = 35, 
		RULE_postfix_expression = 36, RULE_primary_expression = 37, RULE_constant = 38, 
		RULE_floating_constant = 39, RULE_character_constant = 40, RULE_integer_constant = 41, 
		RULE_identifier = 42, RULE_argument_expression_list = 43, RULE_argument_expression = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "outer_statement_list", "outer_statement", "function_statement", 
			"statement_list", "statement", "selection_statement", "block_statement", 
			"expression_statement", "iteration_statement", "jump_statement", "declaration_statement", 
			"init_declarator_list", "init_declarator", "declarator", "direct_declarator", 
			"parameter_list", "parameter_declaration", "initializer", "initializer_list", 
			"pointer", "type_qualifier_list", "declaration_specifiers", "type_qualifier", 
			"function_specifier", "type_specifier", "storage_class_specifier", "expression", 
			"assigment_expression", "logical_or_expression", "logical_and_expression", 
			"equality_expression", "relational_expression", "additive_expression", 
			"multiplicative_expression", "unary_expression", "postfix_expression", 
			"primary_expression", "constant", "floating_constant", "character_constant", 
			"integer_constant", "identifier", "argument_expression_list", "argument_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'volatile'", "'continue'", "'typedef'", "'struct'", "'static'", 
			"'double'", "'inline'", "'return'", "'float'", "'class'", "'while'", 
			"'const'", "'break'", "'auto'", "'void'", "'char'", "'long'", "'goto'", 
			"'else'", "'int'", "'for'", "'do'", "'if'", null, null, null, "'++'", 
			"'--'", "'->'", "'!='", "'+='", "'-='", "'*='", "'/='", "'%='", "'<='", 
			"'>='", "'&&'", "'||'", "'=='", "'*'", "'!'", "'/'", "'%'", "'+'", "'-'", 
			"'>'", "'<'", "'='", "'&'", "','", "';'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VOLATILE", "CONTINUE", "TYPEDEF", "STRUCT", "STATIC", "DOUBLE", 
			"INLINE", "RETURN", "FLOAT", "CLASS", "WHILE", "CONST", "BREAK", "AUTO", 
			"VOID", "CHAR", "LONG", "GOTO", "ELSE", "INT", "FOR", "DO", "IF", "LITERAL", 
			"VALID_NAME", "NUMBER", "INCR", "DECR", "ARROW", "NE", "PLUSA", "MUNUSA", 
			"MULTA", "DIVA", "MODA", "NGR", "NLS", "AND", "OR", "EQ", "MULT", "NOT", 
			"DIV", "MOD", "PLUS", "MINUS", "GR", "LS", "ASSING", "AMPER", "ZAP", 
			"PZAP", "LPAREL", "RPAREL", "LBOX", "RBOX", "LFIGURE", "RFIGURE", "DOT", 
			"SPACE"
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
	public String getGrammarFileName() { return "Cpp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CppParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public String code;
		public Outer_statement_listContext outer_statement_list;
		public Outer_statement_listContext outer_statement_list() {
			return getRuleContext(Outer_statement_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CppParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			((ProgramContext)_localctx).outer_statement_list = outer_statement_list(0);
			 ((ProgramContext)_localctx).code =  ((ProgramContext)_localctx).outer_statement_list.code; 
			setState(92);
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
	public static class Outer_statement_listContext extends ParserRuleContext {
		public int indent;
		public String code;
		public Outer_statementContext outer_statement;
		public Outer_statement_listContext outer_statement_list;
		public Outer_statementContext outer_statement() {
			return getRuleContext(Outer_statementContext.class,0);
		}
		public Outer_statement_listContext outer_statement_list() {
			return getRuleContext(Outer_statement_listContext.class,0);
		}
		public Outer_statement_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Outer_statement_listContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_outer_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterOuter_statement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitOuter_statement_list(this);
		}
	}

	public final Outer_statement_listContext outer_statement_list(int indent) throws RecognitionException {
		Outer_statement_listContext _localctx = new Outer_statement_listContext(_ctx, getState(), indent);
		enterRule(_localctx, 2, RULE_outer_statement_list);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				((Outer_statement_listContext)_localctx).outer_statement = outer_statement(indent);
				 ((Outer_statement_listContext)_localctx).code =  ((Outer_statement_listContext)_localctx).outer_statement.code + '\n'; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				((Outer_statement_listContext)_localctx).outer_statement = outer_statement(indent);
				setState(98);
				((Outer_statement_listContext)_localctx).outer_statement_list = outer_statement_list(indent);
				 ((Outer_statement_listContext)_localctx).code =  ((Outer_statement_listContext)_localctx).outer_statement.code + '\n' + ((Outer_statement_listContext)_localctx).outer_statement_list.code; 
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
	public static class Outer_statementContext extends ParserRuleContext {
		public int indent;
		public String code;
		public Declaration_statementContext declaration_statement;
		public Function_statementContext function_statement;
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public Function_statementContext function_statement() {
			return getRuleContext(Function_statementContext.class,0);
		}
		public Outer_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Outer_statementContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_outer_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterOuter_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitOuter_statement(this);
		}
	}

	public final Outer_statementContext outer_statement(int indent) throws RecognitionException {
		Outer_statementContext _localctx = new Outer_statementContext(_ctx, getState(), indent);
		enterRule(_localctx, 4, RULE_outer_statement);

		        String TAB = "  ".repeat(_localctx.indent);
		    
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				((Outer_statementContext)_localctx).declaration_statement = declaration_statement(indent);
				 ((Outer_statementContext)_localctx).code =  TAB + ((Outer_statementContext)_localctx).declaration_statement.code + ";"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				((Outer_statementContext)_localctx).function_statement = function_statement(indent);
				 ((Outer_statementContext)_localctx).code =  ((Outer_statementContext)_localctx).function_statement.code; 
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
	public static class Function_statementContext extends ParserRuleContext {
		public int indent;
		public String code;
		public Declaration_specifiersContext declaration_specifiers;
		public DeclaratorContext declarator;
		public Statement_listContext statement_list;
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode LFIGURE() { return getToken(CppParser.LFIGURE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RFIGURE() { return getToken(CppParser.RFIGURE, 0); }
		public Function_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Function_statementContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_function_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterFunction_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitFunction_statement(this);
		}
	}

	public final Function_statementContext function_statement(int indent) throws RecognitionException {
		Function_statementContext _localctx = new Function_statementContext(_ctx, getState(), indent);
		enterRule(_localctx, 6, RULE_function_statement);

		        String TAB = "  ".repeat(_localctx.indent);
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			((Function_statementContext)_localctx).declaration_specifiers = declaration_specifiers(indent);
			setState(112);
			((Function_statementContext)_localctx).declarator = declarator(indent);
			setState(113);
			match(LFIGURE);
			setState(114);
			((Function_statementContext)_localctx).statement_list = statement_list(indent + 1);
			setState(115);
			match(RFIGURE);

			            ((Function_statementContext)_localctx).code =  TAB + ((Function_statementContext)_localctx).declaration_specifiers.code + ' ' + ((Function_statementContext)_localctx).declarator.code + " {\n" + ((Function_statementContext)_localctx).statement_list.code + TAB + '}';
			        
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
	public static class Statement_listContext extends ParserRuleContext {
		public int indent;
		public String code;
		public StatementContext statement;
		public Statement_listContext statement_list;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Statement_listContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list(int indent) throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState(), indent);
		enterRule(_localctx, 8, RULE_statement_list);

		        ((Statement_listContext)_localctx).code =  "";
		    
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 158864037587189758L) != 0)) {
					{
					setState(118);
					((Statement_listContext)_localctx).statement = statement(indent, false);
					 ((Statement_listContext)_localctx).code =  ((Statement_listContext)_localctx).statement.code + "\n"; 
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				((Statement_listContext)_localctx).statement = statement(indent, false);
				setState(124);
				((Statement_listContext)_localctx).statement_list = statement_list(indent);
				 ((Statement_listContext)_localctx).code =  ((Statement_listContext)_localctx).statement.code + "\n" + ((Statement_listContext)_localctx).statement_list.code; 
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
	public static class StatementContext extends ParserRuleContext {
		public int indent;
		public boolean leftShift;
		public String code;
		public Expression_statementContext expression_statement;
		public Declaration_statementContext declaration_statement;
		public Selection_statementContext selection_statement;
		public Iteration_statementContext iteration_statement;
		public Jump_statementContext jump_statement;
		public Block_statementContext block_statement;
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public TerminalNode PZAP() { return getToken(CppParser.PZAP, 0); }
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, int indent, boolean leftShift) {
			super(parent, invokingState);
			this.indent = indent;
			this.leftShift = leftShift;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement(int indent,boolean leftShift) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), indent, leftShift);
		enterRule(_localctx, 10, RULE_statement);

		        String TAB = "  ".repeat(_localctx.indent);
		    
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				((StatementContext)_localctx).expression_statement = expression_statement();
				 ((StatementContext)_localctx).code =  TAB + ((StatementContext)_localctx).expression_statement.code + ";"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				((StatementContext)_localctx).declaration_statement = declaration_statement(indent);
				 ((StatementContext)_localctx).code =  TAB + ((StatementContext)_localctx).declaration_statement.code + ";"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				((StatementContext)_localctx).selection_statement = selection_statement(indent);
				 ((StatementContext)_localctx).code =  ((StatementContext)_localctx).selection_statement.code; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				((StatementContext)_localctx).iteration_statement = iteration_statement(indent);
				 ((StatementContext)_localctx).code =  ((StatementContext)_localctx).iteration_statement.code; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				((StatementContext)_localctx).jump_statement = jump_statement();
				setState(142);
				match(PZAP);
				 ((StatementContext)_localctx).code =  TAB + ((StatementContext)_localctx).jump_statement.code + ";"; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				((StatementContext)_localctx).block_statement = block_statement(indent, leftShift);
				 ((StatementContext)_localctx).code =  ((StatementContext)_localctx).block_statement.code; 
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
	public static class Selection_statementContext extends ParserRuleContext {
		public int indent;
		public String code;
		public ExpressionContext expression;
		public StatementContext statement;
		public StatementContext yes;
		public StatementContext no;
		public TerminalNode IF() { return getToken(CppParser.IF, 0); }
		public TerminalNode LPAREL() { return getToken(CppParser.LPAREL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREL() { return getToken(CppParser.RPAREL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CppParser.ELSE, 0); }
		public Selection_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Selection_statementContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitSelection_statement(this);
		}
	}

	public final Selection_statementContext selection_statement(int indent) throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState(), indent);
		enterRule(_localctx, 12, RULE_selection_statement);

		        String TAB = "  ".repeat(_localctx.indent);
		    
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(IF);
				setState(151);
				match(LPAREL);
				setState(152);
				((Selection_statementContext)_localctx).expression = expression();
				setState(153);
				match(RPAREL);
				setState(154);
				((Selection_statementContext)_localctx).statement = statement(indent + 1, true);
				 ((Selection_statementContext)_localctx).code =  TAB + "if (" + ((Selection_statementContext)_localctx).expression.code + ")\n" + ((Selection_statementContext)_localctx).statement.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(IF);
				setState(158);
				match(LPAREL);
				setState(159);
				((Selection_statementContext)_localctx).expression = expression();
				setState(160);
				match(RPAREL);
				setState(161);
				((Selection_statementContext)_localctx).yes = statement(indent + 1, true);
				setState(162);
				match(ELSE);
				setState(163);
				((Selection_statementContext)_localctx).no = statement(indent + 1, true);
				 ((Selection_statementContext)_localctx).code =  TAB + "if (" + ((Selection_statementContext)_localctx).expression.code + ")\n" + ((Selection_statementContext)_localctx).yes.code + "\n" +TAB + "else\n" + ((Selection_statementContext)_localctx).no.code; 
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
	public static class Block_statementContext extends ParserRuleContext {
		public int indent;
		public boolean leftShift;
		public String code;
		public Statement_listContext statement_list;
		public TerminalNode LFIGURE() { return getToken(CppParser.LFIGURE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RFIGURE() { return getToken(CppParser.RFIGURE, 0); }
		public Block_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Block_statementContext(ParserRuleContext parent, int invokingState, int indent, boolean leftShift) {
			super(parent, invokingState);
			this.indent = indent;
			this.leftShift = leftShift;
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitBlock_statement(this);
		}
	}

	public final Block_statementContext block_statement(int indent,boolean leftShift) throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState(), indent, leftShift);
		enterRule(_localctx, 14, RULE_block_statement);

		        if (_localctx.leftShift) {
		            --_localctx.indent;
		        }
		        String TAB = "  ".repeat(_localctx.indent);
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(LFIGURE);
			setState(169);
			((Block_statementContext)_localctx).statement_list = statement_list(_localctx.indent + 1);
			setState(170);
			match(RFIGURE);
			 ((Block_statementContext)_localctx).code =  TAB + "{\n" + ((Block_statementContext)_localctx).statement_list.code + TAB + "}"; 
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
	public static class Expression_statementContext extends ParserRuleContext {
		public String code;
		public ExpressionContext expression;
		public TerminalNode PZAP() { return getToken(CppParser.PZAP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitExpression_statement(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression_statement);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PZAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(PZAP);
				 ((Expression_statementContext)_localctx).code =  ";"; 
				}
				break;
			case LITERAL:
			case VALID_NAME:
			case NUMBER:
			case INCR:
			case DECR:
			case MULT:
			case NOT:
			case PLUS:
			case MINUS:
			case AMPER:
			case LPAREL:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				((Expression_statementContext)_localctx).expression = expression();
				setState(176);
				match(PZAP);
				 ((Expression_statementContext)_localctx).code =  ((Expression_statementContext)_localctx).expression.code; 
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
	public static class Iteration_statementContext extends ParserRuleContext {
		public int indent;
		public String code;
		public ExpressionContext expression;
		public StatementContext statement;
		public ExpressionContext expr1;
		public ExpressionContext expr2;
		public ExpressionContext expr3;
		public TerminalNode WHILE() { return getToken(CppParser.WHILE, 0); }
		public TerminalNode LPAREL() { return getToken(CppParser.LPAREL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREL() { return getToken(CppParser.RPAREL, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode DO() { return getToken(CppParser.DO, 0); }
		public List<TerminalNode> PZAP() { return getTokens(CppParser.PZAP); }
		public TerminalNode PZAP(int i) {
			return getToken(CppParser.PZAP, i);
		}
		public TerminalNode FOR() { return getToken(CppParser.FOR, 0); }
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Iteration_statementContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitIteration_statement(this);
		}
	}

	public final Iteration_statementContext iteration_statement(int indent) throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState(), indent);
		enterRule(_localctx, 18, RULE_iteration_statement);

		        ((Iteration_statementContext)_localctx).code =  "";
		        String TAB = "  ".repeat(_localctx.indent);
		    
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(WHILE);
				setState(182);
				match(LPAREL);
				setState(183);
				((Iteration_statementContext)_localctx).expression = expression();
				setState(184);
				match(RPAREL);
				setState(185);
				((Iteration_statementContext)_localctx).statement = statement(indent + 1, true);
				 ((Iteration_statementContext)_localctx).code =  TAB + "while (" + ((Iteration_statementContext)_localctx).expression.code + ")\n" + ((Iteration_statementContext)_localctx).statement.code; 
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(DO);
				setState(189);
				((Iteration_statementContext)_localctx).statement = statement(indent + 1, true);
				setState(190);
				match(WHILE);
				setState(191);
				match(LPAREL);
				setState(192);
				((Iteration_statementContext)_localctx).expression = expression();
				setState(193);
				match(RPAREL);
				setState(194);
				match(PZAP);
				 ((Iteration_statementContext)_localctx).code =  TAB + "do\n" + ((Iteration_statementContext)_localctx).statement.code + "while (" + ((Iteration_statementContext)_localctx).expression.code + ");"; 
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(FOR);
				setState(198);
				match(LPAREL);
				 _localctx.code += TAB + "for ("; 
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10245249867710464L) != 0)) {
					{
					setState(200);
					((Iteration_statementContext)_localctx).expr1 = expression();
					 _localctx.code += ((Iteration_statementContext)_localctx).expr1.code; 
					}
				}

				setState(205);
				match(PZAP);
				 _localctx.code += "; "; 
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10245249867710464L) != 0)) {
					{
					setState(207);
					((Iteration_statementContext)_localctx).expr2 = expression();
					 _localctx.code += ((Iteration_statementContext)_localctx).expr2.code; 
					}
				}

				setState(212);
				match(PZAP);
				 _localctx.code += "; "; 
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10245249867710464L) != 0)) {
					{
					setState(214);
					((Iteration_statementContext)_localctx).expr3 = expression();
					 _localctx.code += ((Iteration_statementContext)_localctx).expr3.code; 
					}
				}

				setState(219);
				match(RPAREL);
				setState(220);
				((Iteration_statementContext)_localctx).statement = statement(indent + 1, true);
				 _localctx.code += ")\n" + ((Iteration_statementContext)_localctx).statement.code; 
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
	public static class Jump_statementContext extends ParserRuleContext {
		public String code;
		public IdentifierContext identifier;
		public ExpressionContext expression;
		public TerminalNode GOTO() { return getToken(CppParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(CppParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(CppParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(CppParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitJump_statement(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jump_statement);

		        ((Jump_statementContext)_localctx).code =  "";
		    
		int _la;
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(GOTO);
				setState(226);
				((Jump_statementContext)_localctx).identifier = identifier();
				 ((Jump_statementContext)_localctx).code =  "goto " + ((Jump_statementContext)_localctx).identifier.code; 
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(CONTINUE);
				 ((Jump_statementContext)_localctx).code =  "continue"; 
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(BREAK);
				 ((Jump_statementContext)_localctx).code =  "break"; 
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(RETURN);
				 _localctx.code += "return"; 
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10245249867710464L) != 0)) {
					{
					setState(235);
					((Jump_statementContext)_localctx).expression = expression();
					 _localctx.code += " " + ((Jump_statementContext)_localctx).expression.code; 
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
	public static class Declaration_statementContext extends ParserRuleContext {
		public int indent;
		public String code;
		public Declaration_specifiersContext declaration_specifiers;
		public Init_declarator_listContext init_declarator_list;
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public TerminalNode PZAP() { return getToken(CppParser.PZAP, 0); }
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public Declaration_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Declaration_statementContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_declaration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterDeclaration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitDeclaration_statement(this);
		}
	}

	public final Declaration_statementContext declaration_statement(int indent) throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState(), indent);
		enterRule(_localctx, 22, RULE_declaration_statement);

		        ((Declaration_statementContext)_localctx).code =  "";
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			((Declaration_statementContext)_localctx).declaration_specifiers = declaration_specifiers(indent);
			 _localctx.code += ((Declaration_statementContext)_localctx).declaration_specifiers.code; 
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALID_NAME || _la==MULT) {
				{
				setState(244);
				((Declaration_statementContext)_localctx).init_declarator_list = init_declarator_list(indent);
				 _localctx.code += " " + ((Declaration_statementContext)_localctx).init_declarator_list.code; 
				}
			}

			setState(249);
			match(PZAP);
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
	public static class Init_declarator_listContext extends ParserRuleContext {
		public int indent;
		public String code;
		public Init_declaratorContext init_declarator;
		public Init_declarator_listContext init_declarator_list;
		public Init_declaratorContext init_declarator() {
			return getRuleContext(Init_declaratorContext.class,0);
		}
		public TerminalNode ZAP() { return getToken(CppParser.ZAP, 0); }
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitInit_declarator_list(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list(int indent) throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState(), indent);
		enterRule(_localctx, 24, RULE_init_declarator_list);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				((Init_declarator_listContext)_localctx).init_declarator = init_declarator(indent);
				 ((Init_declarator_listContext)_localctx).code =  ((Init_declarator_listContext)_localctx).init_declarator.code ; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				((Init_declarator_listContext)_localctx).init_declarator = init_declarator(indent);
				setState(255);
				match(ZAP);
				setState(256);
				((Init_declarator_listContext)_localctx).init_declarator_list = init_declarator_list(indent);
				 ((Init_declarator_listContext)_localctx).code =  ((Init_declarator_listContext)_localctx).init_declarator.code + ", " + ((Init_declarator_listContext)_localctx).init_declarator_list.code ; 
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
	public static class Init_declaratorContext extends ParserRuleContext {
		public int indent;
		public String code;
		public DeclaratorContext declarator;
		public InitializerContext initializer;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode ASSING() { return getToken(CppParser.ASSING, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Init_declaratorContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterInit_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitInit_declarator(this);
		}
	}

	public final Init_declaratorContext init_declarator(int indent) throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState(), indent);
		enterRule(_localctx, 26, RULE_init_declarator);

		        ((Init_declaratorContext)_localctx).code =  "";
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			((Init_declaratorContext)_localctx).declarator = declarator(indent);
			 _localctx.code += ((Init_declaratorContext)_localctx).declarator.code; 
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSING) {
				{
				setState(263);
				match(ASSING);
				setState(264);
				((Init_declaratorContext)_localctx).initializer = initializer();
				 _localctx.code += " = " + ((Init_declaratorContext)_localctx).initializer.code; 
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
	public static class DeclaratorContext extends ParserRuleContext {
		public int indent;
		public String code;
		public PointerContext pointer;
		public Direct_declaratorContext direct_declarator;
		public Direct_declaratorContext direct_declarator() {
			return getRuleContext(Direct_declaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DeclaratorContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator(int indent) throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState(), indent);
		enterRule(_localctx, 28, RULE_declarator);

		        ((DeclaratorContext)_localctx).code =  "";
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULT) {
				{
				setState(269);
				((DeclaratorContext)_localctx).pointer = pointer();
				 _localctx.code += ((DeclaratorContext)_localctx).pointer.code; 
				}
			}

			setState(274);
			((DeclaratorContext)_localctx).direct_declarator = direct_declarator(indent);
			 _localctx.code += ((DeclaratorContext)_localctx).direct_declarator.code; 
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
	public static class Direct_declaratorContext extends ParserRuleContext {
		public int indent;
		public String code;
		public IdentifierContext identifier;
		public Parameter_listContext parameter_list;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREL() { return getToken(CppParser.LPAREL, 0); }
		public TerminalNode RPAREL() { return getToken(CppParser.RPAREL, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Direct_declaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Direct_declaratorContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_direct_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterDirect_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitDirect_declarator(this);
		}
	}

	public final Direct_declaratorContext direct_declarator(int indent) throws RecognitionException {
		Direct_declaratorContext _localctx = new Direct_declaratorContext(_ctx, getState(), indent);
		enterRule(_localctx, 30, RULE_direct_declarator);

		        ((Direct_declaratorContext)_localctx).code =  "";
		    
		int _la;
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				((Direct_declaratorContext)_localctx).identifier = identifier();
				 ((Direct_declaratorContext)_localctx).code =  ((Direct_declaratorContext)_localctx).identifier.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				((Direct_declaratorContext)_localctx).identifier = identifier();
				setState(281);
				match(LPAREL);
				 _localctx.code += ((Direct_declaratorContext)_localctx).identifier.code + "("; 
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34854650L) != 0)) {
					{
					setState(283);
					((Direct_declaratorContext)_localctx).parameter_list = parameter_list(indent);
					 _localctx.code += ((Direct_declaratorContext)_localctx).parameter_list.code; 
					}
				}

				setState(288);
				match(RPAREL);
				 _localctx.code += ")"; 
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
	public static class Parameter_listContext extends ParserRuleContext {
		public int indent;
		public String code;
		public Parameter_declarationContext parameter_declaration;
		public Parameter_listContext parameter_list;
		public Parameter_declarationContext parameter_declaration() {
			return getRuleContext(Parameter_declarationContext.class,0);
		}
		public TerminalNode ZAP() { return getToken(CppParser.ZAP, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Parameter_listContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list(int indent) throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState(), indent);
		enterRule(_localctx, 32, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			((Parameter_listContext)_localctx).parameter_declaration = parameter_declaration(indent);
			 ((Parameter_listContext)_localctx).code =  ((Parameter_listContext)_localctx).parameter_declaration.code; 
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ZAP) {
				{
				setState(295);
				match(ZAP);
				setState(296);
				((Parameter_listContext)_localctx).parameter_list = parameter_list(indent);
				 _localctx.code += ", " + ((Parameter_listContext)_localctx).parameter_list.code; 
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
	public static class Parameter_declarationContext extends ParserRuleContext {
		public int indent;
		public String code;
		public Declaration_specifiersContext declaration_specifiers;
		public DeclaratorContext declarator;
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterParameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitParameter_declaration(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration(int indent) throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState(), indent);
		enterRule(_localctx, 34, RULE_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			((Parameter_declarationContext)_localctx).declaration_specifiers = declaration_specifiers(indent);
			setState(302);
			((Parameter_declarationContext)_localctx).declarator = declarator(indent);
			 ((Parameter_declarationContext)_localctx).code =  ((Parameter_declarationContext)_localctx).declaration_specifiers.code + " " + ((Parameter_declarationContext)_localctx).declarator.code; 
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
	public static class InitializerContext extends ParserRuleContext {
		public String code;
		public Assigment_expressionContext assigment_expression;
		public Initializer_listContext initializer_list;
		public Assigment_expressionContext assigment_expression() {
			return getRuleContext(Assigment_expressionContext.class,0);
		}
		public TerminalNode LFIGURE() { return getToken(CppParser.LFIGURE, 0); }
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public TerminalNode RFIGURE() { return getToken(CppParser.RFIGURE, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_initializer);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case VALID_NAME:
			case NUMBER:
			case INCR:
			case DECR:
			case MULT:
			case NOT:
			case PLUS:
			case MINUS:
			case AMPER:
			case LPAREL:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				((InitializerContext)_localctx).assigment_expression = assigment_expression();
				 ((InitializerContext)_localctx).code =  ((InitializerContext)_localctx).assigment_expression.code; 
				}
				break;
			case LFIGURE:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(LFIGURE);
				setState(309);
				((InitializerContext)_localctx).initializer_list = initializer_list();
				setState(310);
				match(RFIGURE);
				 ((InitializerContext)_localctx).code =  "{ " + ((InitializerContext)_localctx).initializer_list.code + " }"; 
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
	public static class Initializer_listContext extends ParserRuleContext {
		public String code;
		public InitializerContext initializer;
		public Initializer_listContext initializer_list;
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TerminalNode ZAP() { return getToken(CppParser.ZAP, 0); }
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitInitializer_list(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_initializer_list);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				((Initializer_listContext)_localctx).initializer = initializer();
				 ((Initializer_listContext)_localctx).code =  ((Initializer_listContext)_localctx).initializer.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				((Initializer_listContext)_localctx).initializer = initializer();
				setState(319);
				match(ZAP);
				setState(320);
				((Initializer_listContext)_localctx).initializer_list = initializer_list();
				 ((Initializer_listContext)_localctx).code =  ((Initializer_listContext)_localctx).initializer.code + ", " + ((Initializer_listContext)_localctx).initializer_list.code; 
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
	public static class PointerContext extends ParserRuleContext {
		public String code;
		public Type_qualifier_listContext type_qualifier_list;
		public PointerContext pointer;
		public TerminalNode MULT() { return getToken(CppParser.MULT, 0); }
		public Type_qualifier_listContext type_qualifier_list() {
			return getRuleContext(Type_qualifier_listContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitPointer(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(MULT);
			 ((PointerContext)_localctx).code =  "*"; 
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VOLATILE || _la==CONST) {
				{
				setState(327);
				((PointerContext)_localctx).type_qualifier_list = type_qualifier_list();
				 _localctx.code += ((PointerContext)_localctx).type_qualifier_list.code + " "; 
				}
			}

			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULT) {
				{
				setState(332);
				((PointerContext)_localctx).pointer = pointer();
				 _localctx.code += ((PointerContext)_localctx).pointer.code; 
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
	public static class Type_qualifier_listContext extends ParserRuleContext {
		public String code;
		public Type_qualifierContext type_qualifier;
		public Type_qualifier_listContext type_qualifier_list;
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public Type_qualifier_listContext type_qualifier_list() {
			return getRuleContext(Type_qualifier_listContext.class,0);
		}
		public Type_qualifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterType_qualifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitType_qualifier_list(this);
		}
	}

	public final Type_qualifier_listContext type_qualifier_list() throws RecognitionException {
		Type_qualifier_listContext _localctx = new Type_qualifier_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type_qualifier_list);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				((Type_qualifier_listContext)_localctx).type_qualifier = type_qualifier();
				 ((Type_qualifier_listContext)_localctx).code =  ((Type_qualifier_listContext)_localctx).type_qualifier.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				((Type_qualifier_listContext)_localctx).type_qualifier = type_qualifier();
				setState(341);
				((Type_qualifier_listContext)_localctx).type_qualifier_list = type_qualifier_list();
				 ((Type_qualifier_listContext)_localctx).code =  ((Type_qualifier_listContext)_localctx).type_qualifier.code + ((Type_qualifier_listContext)_localctx).type_qualifier_list.code; 
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
	public static class Declaration_specifiersContext extends ParserRuleContext {
		public int indent;
		public String code;
		public Storage_class_specifierContext storage_class_specifier;
		public Declaration_specifiersContext declaration_specifiers;
		public Type_specifierContext type_specifier;
		public Type_qualifierContext type_qualifier;
		public Function_specifierContext function_specifier;
		public Storage_class_specifierContext storage_class_specifier() {
			return getRuleContext(Storage_class_specifierContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public Function_specifierContext function_specifier() {
			return getRuleContext(Function_specifierContext.class,0);
		}
		public Declaration_specifiersContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Declaration_specifiersContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterDeclaration_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitDeclaration_specifiers(this);
		}
	}

	public final Declaration_specifiersContext declaration_specifiers(int indent) throws RecognitionException {
		Declaration_specifiersContext _localctx = new Declaration_specifiersContext(_ctx, getState(), indent);
		enterRule(_localctx, 44, RULE_declaration_specifiers);
		int _la;
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEDEF:
			case STATIC:
			case AUTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				((Declaration_specifiersContext)_localctx).storage_class_specifier = storage_class_specifier();
				setState(347);
				((Declaration_specifiersContext)_localctx).declaration_specifiers = declaration_specifiers(indent);
				 ((Declaration_specifiersContext)_localctx).code =  ((Declaration_specifiersContext)_localctx).storage_class_specifier.code + " " + ((Declaration_specifiersContext)_localctx).declaration_specifiers.code; 
				}
				break;
			case STRUCT:
			case DOUBLE:
			case FLOAT:
			case CLASS:
			case VOID:
			case CHAR:
			case LONG:
			case INT:
			case VALID_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				((Declaration_specifiersContext)_localctx).type_specifier = type_specifier(indent);
				 ((Declaration_specifiersContext)_localctx).code =  ((Declaration_specifiersContext)_localctx).type_specifier.code; 
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VOLATILE || _la==CONST) {
					{
					setState(352);
					((Declaration_specifiersContext)_localctx).type_qualifier = type_qualifier();
					 _localctx.code += " " + ((Declaration_specifiersContext)_localctx).type_qualifier.code; 
					}
				}

				}
				break;
			case VOLATILE:
			case CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				((Declaration_specifiersContext)_localctx).type_qualifier = type_qualifier();
				 ((Declaration_specifiersContext)_localctx).code =  ((Declaration_specifiersContext)_localctx).type_qualifier.code; 
				}
				break;
			case INLINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				((Declaration_specifiersContext)_localctx).function_specifier = function_specifier();
				 ((Declaration_specifiersContext)_localctx).code =  ((Declaration_specifiersContext)_localctx).function_specifier.code; 
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
	public static class Type_qualifierContext extends ParserRuleContext {
		public String code;
		public Token CONST;
		public Token VOLATILE;
		public TerminalNode CONST() { return getToken(CppParser.CONST, 0); }
		public TerminalNode VOLATILE() { return getToken(CppParser.VOLATILE, 0); }
		public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterType_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitType_qualifier(this);
		}
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type_qualifier);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				((Type_qualifierContext)_localctx).CONST = match(CONST);
				 ((Type_qualifierContext)_localctx).code =  (((Type_qualifierContext)_localctx).CONST!=null?((Type_qualifierContext)_localctx).CONST.getText():null); 
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				((Type_qualifierContext)_localctx).VOLATILE = match(VOLATILE);
				 ((Type_qualifierContext)_localctx).code =  (((Type_qualifierContext)_localctx).VOLATILE!=null?((Type_qualifierContext)_localctx).VOLATILE.getText():null); 
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
	public static class Function_specifierContext extends ParserRuleContext {
		public String code;
		public Token INLINE;
		public TerminalNode INLINE() { return getToken(CppParser.INLINE, 0); }
		public Function_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterFunction_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitFunction_specifier(this);
		}
	}

	public final Function_specifierContext function_specifier() throws RecognitionException {
		Function_specifierContext _localctx = new Function_specifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			((Function_specifierContext)_localctx).INLINE = match(INLINE);
			 ((Function_specifierContext)_localctx).code =  (((Function_specifierContext)_localctx).INLINE!=null?((Function_specifierContext)_localctx).INLINE.getText():null); 
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
	public static class Type_specifierContext extends ParserRuleContext {
		public int indent;
		public String code;
		public Token base_type;
		public Token VALID_NAME;
		public Token struct_class;
		public Outer_statement_listContext outer_statement_list;
		public TerminalNode VOID() { return getToken(CppParser.VOID, 0); }
		public TerminalNode CHAR() { return getToken(CppParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(CppParser.INT, 0); }
		public TerminalNode LONG() { return getToken(CppParser.LONG, 0); }
		public TerminalNode DOUBLE() { return getToken(CppParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(CppParser.FLOAT, 0); }
		public TerminalNode VALID_NAME() { return getToken(CppParser.VALID_NAME, 0); }
		public TerminalNode LFIGURE() { return getToken(CppParser.LFIGURE, 0); }
		public Outer_statement_listContext outer_statement_list() {
			return getRuleContext(Outer_statement_listContext.class,0);
		}
		public TerminalNode RFIGURE() { return getToken(CppParser.RFIGURE, 0); }
		public TerminalNode STRUCT() { return getToken(CppParser.STRUCT, 0); }
		public TerminalNode CLASS() { return getToken(CppParser.CLASS, 0); }
		public Type_specifierContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Type_specifierContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitType_specifier(this);
		}
	}

	public final Type_specifierContext type_specifier(int indent) throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState(), indent);
		enterRule(_localctx, 50, RULE_type_specifier);

		        String TAB = "  ".repeat(_localctx.indent);
		    
		int _la;
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
			case FLOAT:
			case VOID:
			case CHAR:
			case LONG:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				((Type_specifierContext)_localctx).base_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1278528L) != 0)) ) {
					((Type_specifierContext)_localctx).base_type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 ((Type_specifierContext)_localctx).code =  (((Type_specifierContext)_localctx).base_type!=null?((Type_specifierContext)_localctx).base_type.getText():null); 
				}
				break;
			case VALID_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				((Type_specifierContext)_localctx).VALID_NAME = match(VALID_NAME);
				 ((Type_specifierContext)_localctx).code =  (((Type_specifierContext)_localctx).VALID_NAME!=null?((Type_specifierContext)_localctx).VALID_NAME.getText():null); 
				}
				break;
			case STRUCT:
			case CLASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				((Type_specifierContext)_localctx).struct_class = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STRUCT || _la==CLASS) ) {
					((Type_specifierContext)_localctx).struct_class = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 ((Type_specifierContext)_localctx).code =  (((Type_specifierContext)_localctx).struct_class!=null?((Type_specifierContext)_localctx).struct_class.getText():null); 
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALID_NAME) {
					{
					setState(380);
					((Type_specifierContext)_localctx).VALID_NAME = match(VALID_NAME);
					 _localctx.code += " " + (((Type_specifierContext)_localctx).VALID_NAME!=null?((Type_specifierContext)_localctx).VALID_NAME.getText():null); 
					}
				}

				setState(384);
				match(LFIGURE);
				setState(385);
				((Type_specifierContext)_localctx).outer_statement_list = outer_statement_list(indent + 1);
				setState(386);
				match(RFIGURE);
				 _localctx.code += " {\n" + ((Type_specifierContext)_localctx).outer_statement_list.code + TAB + "}"; 
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
	public static class Storage_class_specifierContext extends ParserRuleContext {
		public String code;
		public Token specifier;
		public TerminalNode AUTO() { return getToken(CppParser.AUTO, 0); }
		public TerminalNode STATIC() { return getToken(CppParser.STATIC, 0); }
		public TerminalNode TYPEDEF() { return getToken(CppParser.TYPEDEF, 0); }
		public Storage_class_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_class_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterStorage_class_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitStorage_class_specifier(this);
		}
	}

	public final Storage_class_specifierContext storage_class_specifier() throws RecognitionException {
		Storage_class_specifierContext _localctx = new Storage_class_specifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_storage_class_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			((Storage_class_specifierContext)_localctx).specifier = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16424L) != 0)) ) {
				((Storage_class_specifierContext)_localctx).specifier = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 ((Storage_class_specifierContext)_localctx).code =  (((Storage_class_specifierContext)_localctx).specifier!=null?((Storage_class_specifierContext)_localctx).specifier.getText():null); 
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
	public static class ExpressionContext extends ParserRuleContext {
		public String code;
		public Assigment_expressionContext assigment_expression;
		public Assigment_expressionContext assigment_expression() {
			return getRuleContext(Assigment_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			((ExpressionContext)_localctx).assigment_expression = assigment_expression();
			 ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).assigment_expression.code; 
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
	public static class Assigment_expressionContext extends ParserRuleContext {
		public String code;
		public Logical_or_expressionContext logical_or_expression;
		public Unary_expressionContext ue;
		public Token ASSING;
		public Assigment_expressionContext ae;
		public Token PLUSA;
		public Token MUNUSA;
		public Token MULTA;
		public Token DIVA;
		public Token MODA;
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public TerminalNode ASSING() { return getToken(CppParser.ASSING, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Assigment_expressionContext assigment_expression() {
			return getRuleContext(Assigment_expressionContext.class,0);
		}
		public TerminalNode PLUSA() { return getToken(CppParser.PLUSA, 0); }
		public TerminalNode MUNUSA() { return getToken(CppParser.MUNUSA, 0); }
		public TerminalNode MULTA() { return getToken(CppParser.MULTA, 0); }
		public TerminalNode DIVA() { return getToken(CppParser.DIVA, 0); }
		public TerminalNode MODA() { return getToken(CppParser.MODA, 0); }
		public Assigment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAssigment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAssigment_expression(this);
		}
	}

	public final Assigment_expressionContext assigment_expression() throws RecognitionException {
		Assigment_expressionContext _localctx = new Assigment_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assigment_expression);
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				((Assigment_expressionContext)_localctx).logical_or_expression = logical_or_expression(0);
				 ((Assigment_expressionContext)_localctx).code =  ((Assigment_expressionContext)_localctx).logical_or_expression.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				((Assigment_expressionContext)_localctx).ue = unary_expression();
				setState(401);
				((Assigment_expressionContext)_localctx).ASSING = match(ASSING);
				setState(402);
				((Assigment_expressionContext)_localctx).ae = assigment_expression();
				 ((Assigment_expressionContext)_localctx).code =  ((Assigment_expressionContext)_localctx).ue.code + " " + (((Assigment_expressionContext)_localctx).ASSING!=null?((Assigment_expressionContext)_localctx).ASSING.getText():null) + " " + ((Assigment_expressionContext)_localctx).ae.code; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				((Assigment_expressionContext)_localctx).ue = unary_expression();
				setState(406);
				((Assigment_expressionContext)_localctx).PLUSA = match(PLUSA);
				setState(407);
				((Assigment_expressionContext)_localctx).ae = assigment_expression();
				 ((Assigment_expressionContext)_localctx).code =  ((Assigment_expressionContext)_localctx).ue.code + " " + (((Assigment_expressionContext)_localctx).PLUSA!=null?((Assigment_expressionContext)_localctx).PLUSA.getText():null) + " " + ((Assigment_expressionContext)_localctx).ae.code; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				((Assigment_expressionContext)_localctx).ue = unary_expression();
				setState(411);
				((Assigment_expressionContext)_localctx).MUNUSA = match(MUNUSA);
				setState(412);
				((Assigment_expressionContext)_localctx).ae = assigment_expression();
				 ((Assigment_expressionContext)_localctx).code =  ((Assigment_expressionContext)_localctx).ue.code + " " + (((Assigment_expressionContext)_localctx).MUNUSA!=null?((Assigment_expressionContext)_localctx).MUNUSA.getText():null) + " " + ((Assigment_expressionContext)_localctx).ae.code; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(415);
				((Assigment_expressionContext)_localctx).ue = unary_expression();
				setState(416);
				((Assigment_expressionContext)_localctx).MULTA = match(MULTA);
				setState(417);
				((Assigment_expressionContext)_localctx).ae = assigment_expression();
				 ((Assigment_expressionContext)_localctx).code =  ((Assigment_expressionContext)_localctx).ue.code + " " + (((Assigment_expressionContext)_localctx).MULTA!=null?((Assigment_expressionContext)_localctx).MULTA.getText():null) + " " + ((Assigment_expressionContext)_localctx).ae.code; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(420);
				((Assigment_expressionContext)_localctx).ue = unary_expression();
				setState(421);
				((Assigment_expressionContext)_localctx).DIVA = match(DIVA);
				setState(422);
				((Assigment_expressionContext)_localctx).ae = assigment_expression();
				 ((Assigment_expressionContext)_localctx).code =  ((Assigment_expressionContext)_localctx).ue.code + " " + (((Assigment_expressionContext)_localctx).DIVA!=null?((Assigment_expressionContext)_localctx).DIVA.getText():null) + " " + ((Assigment_expressionContext)_localctx).ae.code; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(425);
				((Assigment_expressionContext)_localctx).ue = unary_expression();
				setState(426);
				((Assigment_expressionContext)_localctx).MODA = match(MODA);
				setState(427);
				((Assigment_expressionContext)_localctx).ae = assigment_expression();
				 ((Assigment_expressionContext)_localctx).code =  ((Assigment_expressionContext)_localctx).ue.code + " " + (((Assigment_expressionContext)_localctx).MODA!=null?((Assigment_expressionContext)_localctx).MODA.getText():null) + " " + ((Assigment_expressionContext)_localctx).ae.code; 
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
	public static class Logical_or_expressionContext extends ParserRuleContext {
		public String code;
		public Logical_or_expressionContext le1;
		public Logical_and_expressionContext logical_and_expression;
		public Token OR;
		public Logical_and_expressionContext le2;
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(CppParser.OR, 0); }
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterLogical_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitLogical_or_expression(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		return logical_or_expression(0);
	}

	private Logical_or_expressionContext logical_or_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, _parentState);
		Logical_or_expressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_logical_or_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(433);
			((Logical_or_expressionContext)_localctx).logical_and_expression = logical_and_expression(0);
			 ((Logical_or_expressionContext)_localctx).code =  ((Logical_or_expressionContext)_localctx).logical_and_expression.code; 
			}
			_ctx.stop = _input.LT(-1);
			setState(443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_or_expressionContext(_parentctx, _parentState);
					_localctx.le1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logical_or_expression);
					setState(436);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(437);
					((Logical_or_expressionContext)_localctx).OR = match(OR);
					setState(438);
					((Logical_or_expressionContext)_localctx).le2 = ((Logical_or_expressionContext)_localctx).logical_and_expression = logical_and_expression(0);
					 ((Logical_or_expressionContext)_localctx).code =  ((Logical_or_expressionContext)_localctx).le1.code + " " + (((Logical_or_expressionContext)_localctx).OR!=null?((Logical_or_expressionContext)_localctx).OR.getText():null) + " " + ((Logical_or_expressionContext)_localctx).le2.code; 
					}
					} 
				}
				setState(445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
	public static class Logical_and_expressionContext extends ParserRuleContext {
		public String code;
		public Logical_and_expressionContext le1;
		public Equality_expressionContext equality_expression;
		public Token AND;
		public Equality_expressionContext le2;
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(CppParser.AND, 0); }
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterLogical_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitLogical_and_expression(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		return logical_and_expression(0);
	}

	private Logical_and_expressionContext logical_and_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, _parentState);
		Logical_and_expressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_logical_and_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(447);
			((Logical_and_expressionContext)_localctx).equality_expression = equality_expression();
			 ((Logical_and_expressionContext)_localctx).code =  ((Logical_and_expressionContext)_localctx).equality_expression.code; 
			}
			_ctx.stop = _input.LT(-1);
			setState(457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_and_expressionContext(_parentctx, _parentState);
					_localctx.le1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logical_and_expression);
					setState(450);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(451);
					((Logical_and_expressionContext)_localctx).AND = match(AND);
					setState(452);
					((Logical_and_expressionContext)_localctx).le2 = ((Logical_and_expressionContext)_localctx).equality_expression = equality_expression();
					 ((Logical_and_expressionContext)_localctx).code =  ((Logical_and_expressionContext)_localctx).le1.code + " " + (((Logical_and_expressionContext)_localctx).AND!=null?((Logical_and_expressionContext)_localctx).AND.getText():null) + " " + ((Logical_and_expressionContext)_localctx).le2.code; 
					}
					} 
				}
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
	public static class Equality_expressionContext extends ParserRuleContext {
		public String code;
		public Relational_expressionContext relational_expression;
		public Relational_expressionContext re;
		public Token EQ;
		public Equality_expressionContext ee;
		public Token NE;
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CppParser.EQ, 0); }
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public TerminalNode NE() { return getToken(CppParser.NE, 0); }
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitEquality_expression(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_equality_expression);
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				((Equality_expressionContext)_localctx).relational_expression = relational_expression();
				 ((Equality_expressionContext)_localctx).code =  ((Equality_expressionContext)_localctx).relational_expression.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				((Equality_expressionContext)_localctx).re = relational_expression();
				setState(464);
				((Equality_expressionContext)_localctx).EQ = match(EQ);
				setState(465);
				((Equality_expressionContext)_localctx).ee = equality_expression();
				 ((Equality_expressionContext)_localctx).code =  ((Equality_expressionContext)_localctx).re.code + " " + (((Equality_expressionContext)_localctx).EQ!=null?((Equality_expressionContext)_localctx).EQ.getText():null) + " " + ((Equality_expressionContext)_localctx).ee.code; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				((Equality_expressionContext)_localctx).re = relational_expression();
				setState(469);
				((Equality_expressionContext)_localctx).NE = match(NE);
				setState(470);
				((Equality_expressionContext)_localctx).ee = equality_expression();
				 ((Equality_expressionContext)_localctx).code =  ((Equality_expressionContext)_localctx).re.code + " " + (((Equality_expressionContext)_localctx).NE!=null?((Equality_expressionContext)_localctx).NE.getText():null) + " " + ((Equality_expressionContext)_localctx).ee.code; 
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
	public static class Relational_expressionContext extends ParserRuleContext {
		public String code;
		public Additive_expressionContext additive_expression;
		public Additive_expressionContext ae;
		public Token GR;
		public Relational_expressionContext re;
		public Token LS;
		public Token NGR;
		public Token NLS;
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public TerminalNode GR() { return getToken(CppParser.GR, 0); }
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public TerminalNode LS() { return getToken(CppParser.LS, 0); }
		public TerminalNode NGR() { return getToken(CppParser.NGR, 0); }
		public TerminalNode NLS() { return getToken(CppParser.NLS, 0); }
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_relational_expression);
		try {
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				((Relational_expressionContext)_localctx).additive_expression = additive_expression();
				 ((Relational_expressionContext)_localctx).code =  ((Relational_expressionContext)_localctx).additive_expression.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				((Relational_expressionContext)_localctx).ae = additive_expression();
				setState(479);
				((Relational_expressionContext)_localctx).GR = match(GR);
				setState(480);
				((Relational_expressionContext)_localctx).re = relational_expression();
				 ((Relational_expressionContext)_localctx).code =  ((Relational_expressionContext)_localctx).ae.code + " " + (((Relational_expressionContext)_localctx).GR!=null?((Relational_expressionContext)_localctx).GR.getText():null) + " " + ((Relational_expressionContext)_localctx).re.code; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				((Relational_expressionContext)_localctx).ae = additive_expression();
				setState(484);
				((Relational_expressionContext)_localctx).LS = match(LS);
				setState(485);
				((Relational_expressionContext)_localctx).re = relational_expression();
				 ((Relational_expressionContext)_localctx).code =  ((Relational_expressionContext)_localctx).ae.code + " " + (((Relational_expressionContext)_localctx).LS!=null?((Relational_expressionContext)_localctx).LS.getText():null) + " " + ((Relational_expressionContext)_localctx).re.code; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				((Relational_expressionContext)_localctx).ae = additive_expression();
				setState(489);
				((Relational_expressionContext)_localctx).NGR = match(NGR);
				setState(490);
				((Relational_expressionContext)_localctx).re = relational_expression();
				 ((Relational_expressionContext)_localctx).code =  ((Relational_expressionContext)_localctx).ae.code + " " + (((Relational_expressionContext)_localctx).NGR!=null?((Relational_expressionContext)_localctx).NGR.getText():null) + " " + ((Relational_expressionContext)_localctx).re.code; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(493);
				((Relational_expressionContext)_localctx).ae = additive_expression();
				setState(494);
				((Relational_expressionContext)_localctx).NLS = match(NLS);
				setState(495);
				((Relational_expressionContext)_localctx).re = relational_expression();
				 ((Relational_expressionContext)_localctx).code =  ((Relational_expressionContext)_localctx).ae.code + " " + (((Relational_expressionContext)_localctx).NLS!=null?((Relational_expressionContext)_localctx).NLS.getText():null) + " " + ((Relational_expressionContext)_localctx).re.code; 
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
	public static class Additive_expressionContext extends ParserRuleContext {
		public String code;
		public Multiplicative_expressionContext me;
		public Token PLUS;
		public Additive_expressionContext ae;
		public Token MINUS;
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CppParser.PLUS, 0); }
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CppParser.MINUS, 0); }
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitAdditive_expression(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_additive_expression);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				((Additive_expressionContext)_localctx).me = multiplicative_expression();
				 ((Additive_expressionContext)_localctx).code =  ((Additive_expressionContext)_localctx).me.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				((Additive_expressionContext)_localctx).me = multiplicative_expression();
				setState(504);
				((Additive_expressionContext)_localctx).PLUS = match(PLUS);
				setState(505);
				((Additive_expressionContext)_localctx).ae = additive_expression();
				 ((Additive_expressionContext)_localctx).code =  ((Additive_expressionContext)_localctx).me.code + " " + (((Additive_expressionContext)_localctx).PLUS!=null?((Additive_expressionContext)_localctx).PLUS.getText():null) + " " + ((Additive_expressionContext)_localctx).ae.code; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				((Additive_expressionContext)_localctx).me = multiplicative_expression();
				setState(509);
				((Additive_expressionContext)_localctx).MINUS = match(MINUS);
				setState(510);
				((Additive_expressionContext)_localctx).ae = additive_expression();
				 ((Additive_expressionContext)_localctx).code =  ((Additive_expressionContext)_localctx).me.code + " " + (((Additive_expressionContext)_localctx).MINUS!=null?((Additive_expressionContext)_localctx).MINUS.getText():null) + " " + ((Additive_expressionContext)_localctx).ae.code; 
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
	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public String code;
		public Unary_expressionContext ue;
		public Token MULT;
		public Multiplicative_expressionContext me;
		public Token DIV;
		public Token MOD;
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode MULT() { return getToken(CppParser.MULT, 0); }
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public TerminalNode DIV() { return getToken(CppParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CppParser.MOD, 0); }
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multiplicative_expression);
		try {
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				((Multiplicative_expressionContext)_localctx).ue = unary_expression();
				 ((Multiplicative_expressionContext)_localctx).code =  ((Multiplicative_expressionContext)_localctx).ue.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				((Multiplicative_expressionContext)_localctx).ue = unary_expression();
				setState(519);
				((Multiplicative_expressionContext)_localctx).MULT = match(MULT);
				setState(520);
				((Multiplicative_expressionContext)_localctx).me = multiplicative_expression();
				 ((Multiplicative_expressionContext)_localctx).code =  ((Multiplicative_expressionContext)_localctx).ue.code + " " + (((Multiplicative_expressionContext)_localctx).MULT!=null?((Multiplicative_expressionContext)_localctx).MULT.getText():null) + " " + ((Multiplicative_expressionContext)_localctx).me.code; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
				((Multiplicative_expressionContext)_localctx).ue = unary_expression();
				setState(524);
				((Multiplicative_expressionContext)_localctx).DIV = match(DIV);
				setState(525);
				((Multiplicative_expressionContext)_localctx).me = multiplicative_expression();
				 ((Multiplicative_expressionContext)_localctx).code =  ((Multiplicative_expressionContext)_localctx).ue.code + " " + (((Multiplicative_expressionContext)_localctx).DIV!=null?((Multiplicative_expressionContext)_localctx).DIV.getText():null) + " " + ((Multiplicative_expressionContext)_localctx).me.code; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(528);
				((Multiplicative_expressionContext)_localctx).ue = unary_expression();
				setState(529);
				((Multiplicative_expressionContext)_localctx).MOD = match(MOD);
				setState(530);
				((Multiplicative_expressionContext)_localctx).me = multiplicative_expression();
				 ((Multiplicative_expressionContext)_localctx).code =  ((Multiplicative_expressionContext)_localctx).ue.code + " " + (((Multiplicative_expressionContext)_localctx).MOD!=null?((Multiplicative_expressionContext)_localctx).MOD.getText():null) + " " + ((Multiplicative_expressionContext)_localctx).me.code; 
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
	public static class Unary_expressionContext extends ParserRuleContext {
		public String code;
		public Postfix_expressionContext postfix_expression;
		public Token INCR;
		public Unary_expressionContext unary_expression;
		public Token DECR;
		public Token NOT;
		public Token pref;
		public Multiplicative_expressionContext me;
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode INCR() { return getToken(CppParser.INCR, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode DECR() { return getToken(CppParser.DECR, 0); }
		public TerminalNode NOT() { return getToken(CppParser.NOT, 0); }
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CppParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CppParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(CppParser.MULT, 0); }
		public TerminalNode AMPER() { return getToken(CppParser.AMPER, 0); }
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unary_expression);
		int _la;
		try {
			setState(554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case VALID_NAME:
			case NUMBER:
			case LPAREL:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				((Unary_expressionContext)_localctx).postfix_expression = postfix_expression(0);
				 ((Unary_expressionContext)_localctx).code =  ((Unary_expressionContext)_localctx).postfix_expression.code; 
				}
				break;
			case INCR:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				((Unary_expressionContext)_localctx).INCR = match(INCR);
				setState(539);
				((Unary_expressionContext)_localctx).unary_expression = unary_expression();
				 ((Unary_expressionContext)_localctx).code =  (((Unary_expressionContext)_localctx).INCR!=null?((Unary_expressionContext)_localctx).INCR.getText():null) + ((Unary_expressionContext)_localctx).unary_expression.code; 
				}
				break;
			case DECR:
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
				((Unary_expressionContext)_localctx).DECR = match(DECR);
				setState(543);
				((Unary_expressionContext)_localctx).unary_expression = unary_expression();
				 ((Unary_expressionContext)_localctx).code =  (((Unary_expressionContext)_localctx).DECR!=null?((Unary_expressionContext)_localctx).DECR.getText():null) + ((Unary_expressionContext)_localctx).unary_expression.code; 
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(546);
				((Unary_expressionContext)_localctx).NOT = match(NOT);
				setState(547);
				((Unary_expressionContext)_localctx).unary_expression = unary_expression();
				 ((Unary_expressionContext)_localctx).code =  (((Unary_expressionContext)_localctx).NOT!=null?((Unary_expressionContext)_localctx).NOT.getText():null) + ((Unary_expressionContext)_localctx).unary_expression.code; 
				}
				break;
			case MULT:
			case PLUS:
			case MINUS:
			case AMPER:
				enterOuterAlt(_localctx, 5);
				{
				setState(550);
				((Unary_expressionContext)_localctx).pref = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1233652046364672L) != 0)) ) {
					((Unary_expressionContext)_localctx).pref = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(551);
				((Unary_expressionContext)_localctx).me = multiplicative_expression();
				 ((Unary_expressionContext)_localctx).code =  (((Unary_expressionContext)_localctx).pref!=null?((Unary_expressionContext)_localctx).pref.getText():null) + ((Unary_expressionContext)_localctx).me.code; 
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
	public static class Postfix_expressionContext extends ParserRuleContext {
		public String code;
		public Postfix_expressionContext pe;
		public Primary_expressionContext primary_expression;
		public Token LBOX;
		public ExpressionContext expression;
		public Token RBOX;
		public Token LPAREL;
		public Argument_expression_listContext ael;
		public Token RPAREL;
		public Token DOT;
		public IdentifierContext identifier;
		public Token ARROW;
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode LBOX() { return getToken(CppParser.LBOX, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBOX() { return getToken(CppParser.RBOX, 0); }
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode LPAREL() { return getToken(CppParser.LPAREL, 0); }
		public TerminalNode RPAREL() { return getToken(CppParser.RPAREL, 0); }
		public Argument_expression_listContext argument_expression_list() {
			return getRuleContext(Argument_expression_listContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CppParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(CppParser.ARROW, 0); }
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitPostfix_expression(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		return postfix_expression(0);
	}

	private Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(557);
			((Postfix_expressionContext)_localctx).primary_expression = primary_expression();
			 ((Postfix_expressionContext)_localctx).code =  ((Postfix_expressionContext)_localctx).primary_expression.code; 
			}
			_ctx.stop = _input.LT(-1);
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(586);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						_localctx.pe = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(560);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(561);
						((Postfix_expressionContext)_localctx).LBOX = match(LBOX);
						setState(562);
						((Postfix_expressionContext)_localctx).expression = expression();
						setState(563);
						((Postfix_expressionContext)_localctx).RBOX = match(RBOX);
						 ((Postfix_expressionContext)_localctx).code =  ((Postfix_expressionContext)_localctx).pe.code + (((Postfix_expressionContext)_localctx).LBOX!=null?((Postfix_expressionContext)_localctx).LBOX.getText():null) + ((Postfix_expressionContext)_localctx).expression.code + (((Postfix_expressionContext)_localctx).RBOX!=null?((Postfix_expressionContext)_localctx).RBOX.getText():null); 
						}
						break;
					case 2:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						_localctx.pe = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(566);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(567);
						((Postfix_expressionContext)_localctx).LPAREL = match(LPAREL);
						 ((Postfix_expressionContext)_localctx).code =  ((Postfix_expressionContext)_localctx).pe.code + (((Postfix_expressionContext)_localctx).LPAREL!=null?((Postfix_expressionContext)_localctx).LPAREL.getText():null); 
						setState(572);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10245249867710464L) != 0)) {
							{
							setState(569);
							((Postfix_expressionContext)_localctx).ael = argument_expression_list();
							 _localctx.code += ((Postfix_expressionContext)_localctx).ael.code; 
							}
						}

						setState(574);
						((Postfix_expressionContext)_localctx).RPAREL = match(RPAREL);
						 _localctx.code += (((Postfix_expressionContext)_localctx).RPAREL!=null?((Postfix_expressionContext)_localctx).RPAREL.getText():null); 
						}
						break;
					case 3:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						_localctx.pe = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(576);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(577);
						((Postfix_expressionContext)_localctx).DOT = match(DOT);
						setState(578);
						((Postfix_expressionContext)_localctx).identifier = identifier();
						 ((Postfix_expressionContext)_localctx).code =  ((Postfix_expressionContext)_localctx).pe.code + (((Postfix_expressionContext)_localctx).DOT!=null?((Postfix_expressionContext)_localctx).DOT.getText():null) + ((Postfix_expressionContext)_localctx).identifier.code; 
						}
						break;
					case 4:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState);
						_localctx.pe = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(581);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(582);
						((Postfix_expressionContext)_localctx).ARROW = match(ARROW);
						setState(583);
						((Postfix_expressionContext)_localctx).identifier = identifier();
						 ((Postfix_expressionContext)_localctx).code =  ((Postfix_expressionContext)_localctx).pe.code + (((Postfix_expressionContext)_localctx).ARROW!=null?((Postfix_expressionContext)_localctx).ARROW.getText():null) + ((Postfix_expressionContext)_localctx).identifier.code; 
						}
						break;
					}
					} 
				}
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
	public static class Primary_expressionContext extends ParserRuleContext {
		public String code;
		public IdentifierContext identifier;
		public ConstantContext constant;
		public Token LITERAL;
		public Token LPAREL;
		public ExpressionContext expression;
		public Token RPAREL;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(CppParser.LITERAL, 0); }
		public TerminalNode LPAREL() { return getToken(CppParser.LPAREL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREL() { return getToken(CppParser.RPAREL, 0); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_primary_expression);
		try {
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				((Primary_expressionContext)_localctx).identifier = identifier();
				 ((Primary_expressionContext)_localctx).code =  ((Primary_expressionContext)_localctx).identifier.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				((Primary_expressionContext)_localctx).constant = constant();
				 ((Primary_expressionContext)_localctx).code =  ((Primary_expressionContext)_localctx).constant.code; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(597);
				((Primary_expressionContext)_localctx).LITERAL = match(LITERAL);
				 ((Primary_expressionContext)_localctx).code =  (((Primary_expressionContext)_localctx).LITERAL!=null?((Primary_expressionContext)_localctx).LITERAL.getText():null); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(599);
				((Primary_expressionContext)_localctx).LPAREL = match(LPAREL);
				setState(600);
				((Primary_expressionContext)_localctx).expression = expression();
				setState(601);
				((Primary_expressionContext)_localctx).RPAREL = match(RPAREL);
				 ((Primary_expressionContext)_localctx).code =  (((Primary_expressionContext)_localctx).LPAREL!=null?((Primary_expressionContext)_localctx).LPAREL.getText():null) + ((Primary_expressionContext)_localctx).expression.code + (((Primary_expressionContext)_localctx).RPAREL!=null?((Primary_expressionContext)_localctx).RPAREL.getText():null); 
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
	public static class ConstantContext extends ParserRuleContext {
		public String code;
		public Integer_constantContext integer_constant;
		public Floating_constantContext floating_constant;
		public Character_constantContext character_constant;
		public Integer_constantContext integer_constant() {
			return getRuleContext(Integer_constantContext.class,0);
		}
		public Floating_constantContext floating_constant() {
			return getRuleContext(Floating_constantContext.class,0);
		}
		public Character_constantContext character_constant() {
			return getRuleContext(Character_constantContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_constant);
		try {
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				((ConstantContext)_localctx).integer_constant = integer_constant();
				 ((ConstantContext)_localctx).code =  ((ConstantContext)_localctx).integer_constant.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				((ConstantContext)_localctx).floating_constant = floating_constant();
				 ((ConstantContext)_localctx).code =  ((ConstantContext)_localctx).floating_constant.code; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				((ConstantContext)_localctx).character_constant = character_constant();
				 ((ConstantContext)_localctx).code =  ((ConstantContext)_localctx).character_constant.code; 
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
	public static class Floating_constantContext extends ParserRuleContext {
		public String code;
		public Token NUMBER;
		public Token DOT;
		public List<TerminalNode> NUMBER() { return getTokens(CppParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CppParser.NUMBER, i);
		}
		public TerminalNode DOT() { return getToken(CppParser.DOT, 0); }
		public Floating_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterFloating_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitFloating_constant(this);
		}
	}

	public final Floating_constantContext floating_constant() throws RecognitionException {
		Floating_constantContext _localctx = new Floating_constantContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_floating_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			((Floating_constantContext)_localctx).NUMBER = match(NUMBER);
			setState(618);
			((Floating_constantContext)_localctx).DOT = match(DOT);
			setState(619);
			((Floating_constantContext)_localctx).NUMBER = match(NUMBER);
			 ((Floating_constantContext)_localctx).code =  (((Floating_constantContext)_localctx).NUMBER!=null?((Floating_constantContext)_localctx).NUMBER.getText():null) + (((Floating_constantContext)_localctx).DOT!=null?((Floating_constantContext)_localctx).DOT.getText():null) + (((Floating_constantContext)_localctx).NUMBER!=null?((Floating_constantContext)_localctx).NUMBER.getText():null); 
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
	public static class Character_constantContext extends ParserRuleContext {
		public String code;
		public Token LITERAL;
		public TerminalNode LITERAL() { return getToken(CppParser.LITERAL, 0); }
		public Character_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterCharacter_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitCharacter_constant(this);
		}
	}

	public final Character_constantContext character_constant() throws RecognitionException {
		Character_constantContext _localctx = new Character_constantContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_character_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			((Character_constantContext)_localctx).LITERAL = match(LITERAL);
			 ((Character_constantContext)_localctx).code =  (((Character_constantContext)_localctx).LITERAL!=null?((Character_constantContext)_localctx).LITERAL.getText():null); 
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
	public static class Integer_constantContext extends ParserRuleContext {
		public String code;
		public Token NUMBER;
		public TerminalNode NUMBER() { return getToken(CppParser.NUMBER, 0); }
		public Integer_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterInteger_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitInteger_constant(this);
		}
	}

	public final Integer_constantContext integer_constant() throws RecognitionException {
		Integer_constantContext _localctx = new Integer_constantContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_integer_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			((Integer_constantContext)_localctx).NUMBER = match(NUMBER);
			 ((Integer_constantContext)_localctx).code =  (((Integer_constantContext)_localctx).NUMBER!=null?((Integer_constantContext)_localctx).NUMBER.getText():null); 
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
		public String code;
		public Token VALID_NAME;
		public TerminalNode VALID_NAME() { return getToken(CppParser.VALID_NAME, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			((IdentifierContext)_localctx).VALID_NAME = match(VALID_NAME);
			 ((IdentifierContext)_localctx).code =  (((IdentifierContext)_localctx).VALID_NAME!=null?((IdentifierContext)_localctx).VALID_NAME.getText():null); 
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
	public static class Argument_expression_listContext extends ParserRuleContext {
		public String code;
		public Argument_expressionContext argument_expression;
		public Argument_expressionContext ae;
		public Argument_expression_listContext ael;
		public Argument_expressionContext argument_expression() {
			return getRuleContext(Argument_expressionContext.class,0);
		}
		public TerminalNode ZAP() { return getToken(CppParser.ZAP, 0); }
		public Argument_expression_listContext argument_expression_list() {
			return getRuleContext(Argument_expression_listContext.class,0);
		}
		public Argument_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterArgument_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitArgument_expression_list(this);
		}
	}

	public final Argument_expression_listContext argument_expression_list() throws RecognitionException {
		Argument_expression_listContext _localctx = new Argument_expression_listContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_argument_expression_list);
		try {
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				((Argument_expression_listContext)_localctx).argument_expression = argument_expression();
				 ((Argument_expression_listContext)_localctx).code =  ((Argument_expression_listContext)_localctx).argument_expression.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				((Argument_expression_listContext)_localctx).ae = argument_expression();
				setState(635);
				match(ZAP);
				setState(636);
				((Argument_expression_listContext)_localctx).ael = argument_expression_list();
				 ((Argument_expression_listContext)_localctx).code =  ((Argument_expression_listContext)_localctx).ae.code + ", " + ((Argument_expression_listContext)_localctx).ael.code; 
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
	public static class Argument_expressionContext extends ParserRuleContext {
		public String code;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Argument_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).enterArgument_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppListener ) ((CppListener)listener).exitArgument_expression(this);
		}
	}

	public final Argument_expressionContext argument_expression() throws RecognitionException {
		Argument_expressionContext _localctx = new Argument_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_argument_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			((Argument_expressionContext)_localctx).expression = expression();
			 ((Argument_expressionContext)_localctx).code =  ((Argument_expressionContext)_localctx).expression.code; 
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
		case 29:
			return logical_or_expression_sempred((Logical_or_expressionContext)_localctx, predIndex);
		case 30:
			return logical_and_expression_sempred((Logical_and_expressionContext)_localctx, predIndex);
		case 36:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_or_expression_sempred(Logical_or_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logical_and_expression_sempred(Logical_and_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001<\u0285\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001f\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002n\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004z\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0080\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0095\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a7\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b4\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00cc\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00d3\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00da\b\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00e0\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00ef\b\n\u0003\n\u00f1\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00f8\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0104\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u010c\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0111\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u011f\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0124\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u012c\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u013a\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0144\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u014b\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0150\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0159\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0164\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u016c\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0172\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u017f\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0186\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u01af\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u01ba\b\u001d\n\u001d\f\u001d\u01bd\t\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0005\u001e\u01c8\b\u001e\n\u001e\f\u001e\u01cb\t\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u01da\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01f3\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u0202\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u0216\b\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u022b\b#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u023d\b$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u024b\b$\n$"+
		"\f$\u024e\t$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0003%\u025d\b%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0268\b&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u0280\b+\u0001,\u0001,\u0001,\u0001,\u0000\u0003:<H-\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVX\u0000\u0004\u0004\u0000\u0006\u0006\t\t\u000f"+
		"\u0011\u0014\u0014\u0002\u0000\u0004\u0004\n\n\u0003\u0000\u0003\u0003"+
		"\u0005\u0005\u000e\u000e\u0003\u0000))-.22\u02a1\u0000Z\u0001\u0000\u0000"+
		"\u0000\u0002e\u0001\u0000\u0000\u0000\u0004m\u0001\u0000\u0000\u0000\u0006"+
		"o\u0001\u0000\u0000\u0000\b\u007f\u0001\u0000\u0000\u0000\n\u0094\u0001"+
		"\u0000\u0000\u0000\f\u00a6\u0001\u0000\u0000\u0000\u000e\u00a8\u0001\u0000"+
		"\u0000\u0000\u0010\u00b3\u0001\u0000\u0000\u0000\u0012\u00df\u0001\u0000"+
		"\u0000\u0000\u0014\u00f0\u0001\u0000\u0000\u0000\u0016\u00f2\u0001\u0000"+
		"\u0000\u0000\u0018\u0103\u0001\u0000\u0000\u0000\u001a\u0105\u0001\u0000"+
		"\u0000\u0000\u001c\u0110\u0001\u0000\u0000\u0000\u001e\u0123\u0001\u0000"+
		"\u0000\u0000 \u0125\u0001\u0000\u0000\u0000\"\u012d\u0001\u0000\u0000"+
		"\u0000$\u0139\u0001\u0000\u0000\u0000&\u0143\u0001\u0000\u0000\u0000("+
		"\u0145\u0001\u0000\u0000\u0000*\u0158\u0001\u0000\u0000\u0000,\u016b\u0001"+
		"\u0000\u0000\u0000.\u0171\u0001\u0000\u0000\u00000\u0173\u0001\u0000\u0000"+
		"\u00002\u0185\u0001\u0000\u0000\u00004\u0187\u0001\u0000\u0000\u00006"+
		"\u018a\u0001\u0000\u0000\u00008\u01ae\u0001\u0000\u0000\u0000:\u01b0\u0001"+
		"\u0000\u0000\u0000<\u01be\u0001\u0000\u0000\u0000>\u01d9\u0001\u0000\u0000"+
		"\u0000@\u01f2\u0001\u0000\u0000\u0000B\u0201\u0001\u0000\u0000\u0000D"+
		"\u0215\u0001\u0000\u0000\u0000F\u022a\u0001\u0000\u0000\u0000H\u022c\u0001"+
		"\u0000\u0000\u0000J\u025c\u0001\u0000\u0000\u0000L\u0267\u0001\u0000\u0000"+
		"\u0000N\u0269\u0001\u0000\u0000\u0000P\u026e\u0001\u0000\u0000\u0000R"+
		"\u0271\u0001\u0000\u0000\u0000T\u0274\u0001\u0000\u0000\u0000V\u027f\u0001"+
		"\u0000\u0000\u0000X\u0281\u0001\u0000\u0000\u0000Z[\u0003\u0002\u0001"+
		"\u0000[\\\u0006\u0000\uffff\uffff\u0000\\]\u0005\u0000\u0000\u0001]\u0001"+
		"\u0001\u0000\u0000\u0000^_\u0003\u0004\u0002\u0000_`\u0006\u0001\uffff"+
		"\uffff\u0000`f\u0001\u0000\u0000\u0000ab\u0003\u0004\u0002\u0000bc\u0003"+
		"\u0002\u0001\u0000cd\u0006\u0001\uffff\uffff\u0000df\u0001\u0000\u0000"+
		"\u0000e^\u0001\u0000\u0000\u0000ea\u0001\u0000\u0000\u0000f\u0003\u0001"+
		"\u0000\u0000\u0000gh\u0003\u0016\u000b\u0000hi\u0006\u0002\uffff\uffff"+
		"\u0000in\u0001\u0000\u0000\u0000jk\u0003\u0006\u0003\u0000kl\u0006\u0002"+
		"\uffff\uffff\u0000ln\u0001\u0000\u0000\u0000mg\u0001\u0000\u0000\u0000"+
		"mj\u0001\u0000\u0000\u0000n\u0005\u0001\u0000\u0000\u0000op\u0003,\u0016"+
		"\u0000pq\u0003\u001c\u000e\u0000qr\u00059\u0000\u0000rs\u0003\b\u0004"+
		"\u0000st\u0005:\u0000\u0000tu\u0006\u0003\uffff\uffff\u0000u\u0007\u0001"+
		"\u0000\u0000\u0000vw\u0003\n\u0005\u0000wx\u0006\u0004\uffff\uffff\u0000"+
		"xz\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z\u0080\u0001\u0000\u0000\u0000{|\u0003\n\u0005\u0000|}\u0003\b"+
		"\u0004\u0000}~\u0006\u0004\uffff\uffff\u0000~\u0080\u0001\u0000\u0000"+
		"\u0000\u007fy\u0001\u0000\u0000\u0000\u007f{\u0001\u0000\u0000\u0000\u0080"+
		"\t\u0001\u0000\u0000\u0000\u0081\u0082\u0003\u0010\b\u0000\u0082\u0083"+
		"\u0006\u0005\uffff\uffff\u0000\u0083\u0095\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0003\u0016\u000b\u0000\u0085\u0086\u0006\u0005\uffff\uffff\u0000"+
		"\u0086\u0095\u0001\u0000\u0000\u0000\u0087\u0088\u0003\f\u0006\u0000\u0088"+
		"\u0089\u0006\u0005\uffff\uffff\u0000\u0089\u0095\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0003\u0012\t\u0000\u008b\u008c\u0006\u0005\uffff\uffff\u0000"+
		"\u008c\u0095\u0001\u0000\u0000\u0000\u008d\u008e\u0003\u0014\n\u0000\u008e"+
		"\u008f\u00054\u0000\u0000\u008f\u0090\u0006\u0005\uffff\uffff\u0000\u0090"+
		"\u0095\u0001\u0000\u0000\u0000\u0091\u0092\u0003\u000e\u0007\u0000\u0092"+
		"\u0093\u0006\u0005\uffff\uffff\u0000\u0093\u0095\u0001\u0000\u0000\u0000"+
		"\u0094\u0081\u0001\u0000\u0000\u0000\u0094\u0084\u0001\u0000\u0000\u0000"+
		"\u0094\u0087\u0001\u0000\u0000\u0000\u0094\u008a\u0001\u0000\u0000\u0000"+
		"\u0094\u008d\u0001\u0000\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000"+
		"\u0095\u000b\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0017\u0000\u0000"+
		"\u0097\u0098\u00055\u0000\u0000\u0098\u0099\u00036\u001b\u0000\u0099\u009a"+
		"\u00056\u0000\u0000\u009a\u009b\u0003\n\u0005\u0000\u009b\u009c\u0006"+
		"\u0006\uffff\uffff\u0000\u009c\u00a7\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005\u0017\u0000\u0000\u009e\u009f\u00055\u0000\u0000\u009f\u00a0\u0003"+
		"6\u001b\u0000\u00a0\u00a1\u00056\u0000\u0000\u00a1\u00a2\u0003\n\u0005"+
		"\u0000\u00a2\u00a3\u0005\u0013\u0000\u0000\u00a3\u00a4\u0003\n\u0005\u0000"+
		"\u00a4\u00a5\u0006\u0006\uffff\uffff\u0000\u00a5\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a6\u0096\u0001\u0000\u0000\u0000\u00a6\u009d\u0001\u0000\u0000"+
		"\u0000\u00a7\r\u0001\u0000\u0000\u0000\u00a8\u00a9\u00059\u0000\u0000"+
		"\u00a9\u00aa\u0003\b\u0004\u0000\u00aa\u00ab\u0005:\u0000\u0000\u00ab"+
		"\u00ac\u0006\u0007\uffff\uffff\u0000\u00ac\u000f\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u00054\u0000\u0000\u00ae\u00b4\u0006\b\uffff\uffff\u0000"+
		"\u00af\u00b0\u00036\u001b\u0000\u00b0\u00b1\u00054\u0000\u0000\u00b1\u00b2"+
		"\u0006\b\uffff\uffff\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b3\u00af\u0001\u0000\u0000\u0000\u00b4\u0011"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u000b\u0000\u0000\u00b6\u00b7"+
		"\u00055\u0000\u0000\u00b7\u00b8\u00036\u001b\u0000\u00b8\u00b9\u00056"+
		"\u0000\u0000\u00b9\u00ba\u0003\n\u0005\u0000\u00ba\u00bb\u0006\t\uffff"+
		"\uffff\u0000\u00bb\u00e0\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0016"+
		"\u0000\u0000\u00bd\u00be\u0003\n\u0005\u0000\u00be\u00bf\u0005\u000b\u0000"+
		"\u0000\u00bf\u00c0\u00055\u0000\u0000\u00c0\u00c1\u00036\u001b\u0000\u00c1"+
		"\u00c2\u00056\u0000\u0000\u00c2\u00c3\u00054\u0000\u0000\u00c3\u00c4\u0006"+
		"\t\uffff\uffff\u0000\u00c4\u00e0\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		"\u0015\u0000\u0000\u00c6\u00c7\u00055\u0000\u0000\u00c7\u00cb\u0006\t"+
		"\uffff\uffff\u0000\u00c8\u00c9\u00036\u001b\u0000\u00c9\u00ca\u0006\t"+
		"\uffff\uffff\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u00054\u0000\u0000\u00ce\u00d2\u0006\t"+
		"\uffff\uffff\u0000\u00cf\u00d0\u00036\u001b\u0000\u00d0\u00d1\u0006\t"+
		"\uffff\uffff\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u00054\u0000\u0000\u00d5\u00d9\u0006\t"+
		"\uffff\uffff\u0000\u00d6\u00d7\u00036\u001b\u0000\u00d7\u00d8\u0006\t"+
		"\uffff\uffff\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u00056\u0000\u0000\u00dc\u00dd\u0003\n"+
		"\u0005\u0000\u00dd\u00de\u0006\t\uffff\uffff\u0000\u00de\u00e0\u0001\u0000"+
		"\u0000\u0000\u00df\u00b5\u0001\u0000\u0000\u0000\u00df\u00bc\u0001\u0000"+
		"\u0000\u0000\u00df\u00c5\u0001\u0000\u0000\u0000\u00e0\u0013\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0005\u0012\u0000\u0000\u00e2\u00e3\u0003T*\u0000"+
		"\u00e3\u00e4\u0006\n\uffff\uffff\u0000\u00e4\u00f1\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0005\u0002\u0000\u0000\u00e6\u00f1\u0006\n\uffff\uffff\u0000"+
		"\u00e7\u00e8\u0005\r\u0000\u0000\u00e8\u00f1\u0006\n\uffff\uffff\u0000"+
		"\u00e9\u00ea\u0005\b\u0000\u0000\u00ea\u00ee\u0006\n\uffff\uffff\u0000"+
		"\u00eb\u00ec\u00036\u001b\u0000\u00ec\u00ed\u0006\n\uffff\uffff\u0000"+
		"\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f0\u00e1\u0001\u0000\u0000\u0000\u00f0\u00e5\u0001\u0000\u0000\u0000"+
		"\u00f0\u00e7\u0001\u0000\u0000\u0000\u00f0\u00e9\u0001\u0000\u0000\u0000"+
		"\u00f1\u0015\u0001\u0000\u0000\u0000\u00f2\u00f3\u0003,\u0016\u0000\u00f3"+
		"\u00f7\u0006\u000b\uffff\uffff\u0000\u00f4\u00f5\u0003\u0018\f\u0000\u00f5"+
		"\u00f6\u0006\u000b\uffff\uffff\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u00054\u0000\u0000\u00fa"+
		"\u0017\u0001\u0000\u0000\u0000\u00fb\u00fc\u0003\u001a\r\u0000\u00fc\u00fd"+
		"\u0006\f\uffff\uffff\u0000\u00fd\u0104\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0003\u001a\r\u0000\u00ff\u0100\u00053\u0000\u0000\u0100\u0101\u0003"+
		"\u0018\f\u0000\u0101\u0102\u0006\f\uffff\uffff\u0000\u0102\u0104\u0001"+
		"\u0000\u0000\u0000\u0103\u00fb\u0001\u0000\u0000\u0000\u0103\u00fe\u0001"+
		"\u0000\u0000\u0000\u0104\u0019\u0001\u0000\u0000\u0000\u0105\u0106\u0003"+
		"\u001c\u000e\u0000\u0106\u010b\u0006\r\uffff\uffff\u0000\u0107\u0108\u0005"+
		"1\u0000\u0000\u0108\u0109\u0003$\u0012\u0000\u0109\u010a\u0006\r\uffff"+
		"\uffff\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0107\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u001b\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0003(\u0014\u0000\u010e\u010f\u0006\u000e\uffff"+
		"\uffff\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010d\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0003\u001e\u000f\u0000\u0113\u0114\u0006\u000e"+
		"\uffff\uffff\u0000\u0114\u001d\u0001\u0000\u0000\u0000\u0115\u0116\u0003"+
		"T*\u0000\u0116\u0117\u0006\u000f\uffff\uffff\u0000\u0117\u0124\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0003T*\u0000\u0119\u011a\u00055\u0000\u0000"+
		"\u011a\u011e\u0006\u000f\uffff\uffff\u0000\u011b\u011c\u0003 \u0010\u0000"+
		"\u011c\u011d\u0006\u000f\uffff\uffff\u0000\u011d\u011f\u0001\u0000\u0000"+
		"\u0000\u011e\u011b\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u00056\u0000\u0000"+
		"\u0121\u0122\u0006\u000f\uffff\uffff\u0000\u0122\u0124\u0001\u0000\u0000"+
		"\u0000\u0123\u0115\u0001\u0000\u0000\u0000\u0123\u0118\u0001\u0000\u0000"+
		"\u0000\u0124\u001f\u0001\u0000\u0000\u0000\u0125\u0126\u0003\"\u0011\u0000"+
		"\u0126\u012b\u0006\u0010\uffff\uffff\u0000\u0127\u0128\u00053\u0000\u0000"+
		"\u0128\u0129\u0003 \u0010\u0000\u0129\u012a\u0006\u0010\uffff\uffff\u0000"+
		"\u012a\u012c\u0001\u0000\u0000\u0000\u012b\u0127\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0001\u0000\u0000\u0000\u012c!\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0003,\u0016\u0000\u012e\u012f\u0003\u001c\u000e\u0000\u012f\u0130"+
		"\u0006\u0011\uffff\uffff\u0000\u0130#\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u00038\u001c\u0000\u0132\u0133\u0006\u0012\uffff\uffff\u0000\u0133\u013a"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u00059\u0000\u0000\u0135\u0136\u0003"+
		"&\u0013\u0000\u0136\u0137\u0005:\u0000\u0000\u0137\u0138\u0006\u0012\uffff"+
		"\uffff\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0131\u0001\u0000"+
		"\u0000\u0000\u0139\u0134\u0001\u0000\u0000\u0000\u013a%\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0003$\u0012\u0000\u013c\u013d\u0006\u0013\uffff\uffff"+
		"\u0000\u013d\u0144\u0001\u0000\u0000\u0000\u013e\u013f\u0003$\u0012\u0000"+
		"\u013f\u0140\u00053\u0000\u0000\u0140\u0141\u0003&\u0013\u0000\u0141\u0142"+
		"\u0006\u0013\uffff\uffff\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143"+
		"\u013b\u0001\u0000\u0000\u0000\u0143\u013e\u0001\u0000\u0000\u0000\u0144"+
		"\'\u0001\u0000\u0000\u0000\u0145\u0146\u0005)\u0000\u0000\u0146\u014a"+
		"\u0006\u0014\uffff\uffff\u0000\u0147\u0148\u0003*\u0015\u0000\u0148\u0149"+
		"\u0006\u0014\uffff\uffff\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a"+
		"\u0147\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b"+
		"\u014f\u0001\u0000\u0000\u0000\u014c\u014d\u0003(\u0014\u0000\u014d\u014e"+
		"\u0006\u0014\uffff\uffff\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f"+
		"\u014c\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150"+
		")\u0001\u0000\u0000\u0000\u0151\u0152\u0003.\u0017\u0000\u0152\u0153\u0006"+
		"\u0015\uffff\uffff\u0000\u0153\u0159\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0003.\u0017\u0000\u0155\u0156\u0003*\u0015\u0000\u0156\u0157\u0006\u0015"+
		"\uffff\uffff\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0151\u0001"+
		"\u0000\u0000\u0000\u0158\u0154\u0001\u0000\u0000\u0000\u0159+\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u00034\u001a\u0000\u015b\u015c\u0003,\u0016\u0000"+
		"\u015c\u015d\u0006\u0016\uffff\uffff\u0000\u015d\u016c\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u00032\u0019\u0000\u015f\u0163\u0006\u0016\uffff\uffff"+
		"\u0000\u0160\u0161\u0003.\u0017\u0000\u0161\u0162\u0006\u0016\uffff\uffff"+
		"\u0000\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u0160\u0001\u0000\u0000"+
		"\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u016c\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0003.\u0017\u0000\u0166\u0167\u0006\u0016\uffff\uffff"+
		"\u0000\u0167\u016c\u0001\u0000\u0000\u0000\u0168\u0169\u00030\u0018\u0000"+
		"\u0169\u016a\u0006\u0016\uffff\uffff\u0000\u016a\u016c\u0001\u0000\u0000"+
		"\u0000\u016b\u015a\u0001\u0000\u0000\u0000\u016b\u015e\u0001\u0000\u0000"+
		"\u0000\u016b\u0165\u0001\u0000\u0000\u0000\u016b\u0168\u0001\u0000\u0000"+
		"\u0000\u016c-\u0001\u0000\u0000\u0000\u016d\u016e\u0005\f\u0000\u0000"+
		"\u016e\u0172\u0006\u0017\uffff\uffff\u0000\u016f\u0170\u0005\u0001\u0000"+
		"\u0000\u0170\u0172\u0006\u0017\uffff\uffff\u0000\u0171\u016d\u0001\u0000"+
		"\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172/\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0005\u0007\u0000\u0000\u0174\u0175\u0006\u0018\uffff"+
		"\uffff\u0000\u01751\u0001\u0000\u0000\u0000\u0176\u0177\u0007\u0000\u0000"+
		"\u0000\u0177\u0186\u0006\u0019\uffff\uffff\u0000\u0178\u0179\u0005\u0019"+
		"\u0000\u0000\u0179\u0186\u0006\u0019\uffff\uffff\u0000\u017a\u017b\u0007"+
		"\u0001\u0000\u0000\u017b\u017e\u0006\u0019\uffff\uffff\u0000\u017c\u017d"+
		"\u0005\u0019\u0000\u0000\u017d\u017f\u0006\u0019\uffff\uffff\u0000\u017e"+
		"\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f"+
		"\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u00059\u0000\u0000\u0181\u0182"+
		"\u0003\u0002\u0001\u0000\u0182\u0183\u0005:\u0000\u0000\u0183\u0184\u0006"+
		"\u0019\uffff\uffff\u0000\u0184\u0186\u0001\u0000\u0000\u0000\u0185\u0176"+
		"\u0001\u0000\u0000\u0000\u0185\u0178\u0001\u0000\u0000\u0000\u0185\u017a"+
		"\u0001\u0000\u0000\u0000\u01863\u0001\u0000\u0000\u0000\u0187\u0188\u0007"+
		"\u0002\u0000\u0000\u0188\u0189\u0006\u001a\uffff\uffff\u0000\u01895\u0001"+
		"\u0000\u0000\u0000\u018a\u018b\u00038\u001c\u0000\u018b\u018c\u0006\u001b"+
		"\uffff\uffff\u0000\u018c7\u0001\u0000\u0000\u0000\u018d\u018e\u0003:\u001d"+
		"\u0000\u018e\u018f\u0006\u001c\uffff\uffff\u0000\u018f\u01af\u0001\u0000"+
		"\u0000\u0000\u0190\u0191\u0003F#\u0000\u0191\u0192\u00051\u0000\u0000"+
		"\u0192\u0193\u00038\u001c\u0000\u0193\u0194\u0006\u001c\uffff\uffff\u0000"+
		"\u0194\u01af\u0001\u0000\u0000\u0000\u0195\u0196\u0003F#\u0000\u0196\u0197"+
		"\u0005\u001f\u0000\u0000\u0197\u0198\u00038\u001c\u0000\u0198\u0199\u0006"+
		"\u001c\uffff\uffff\u0000\u0199\u01af\u0001\u0000\u0000\u0000\u019a\u019b"+
		"\u0003F#\u0000\u019b\u019c\u0005 \u0000\u0000\u019c\u019d\u00038\u001c"+
		"\u0000\u019d\u019e\u0006\u001c\uffff\uffff\u0000\u019e\u01af\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u0003F#\u0000\u01a0\u01a1\u0005!\u0000\u0000"+
		"\u01a1\u01a2\u00038\u001c\u0000\u01a2\u01a3\u0006\u001c\uffff\uffff\u0000"+
		"\u01a3\u01af\u0001\u0000\u0000\u0000\u01a4\u01a5\u0003F#\u0000\u01a5\u01a6"+
		"\u0005\"\u0000\u0000\u01a6\u01a7\u00038\u001c\u0000\u01a7\u01a8\u0006"+
		"\u001c\uffff\uffff\u0000\u01a8\u01af\u0001\u0000\u0000\u0000\u01a9\u01aa"+
		"\u0003F#\u0000\u01aa\u01ab\u0005#\u0000\u0000\u01ab\u01ac\u00038\u001c"+
		"\u0000\u01ac\u01ad\u0006\u001c\uffff\uffff\u0000\u01ad\u01af\u0001\u0000"+
		"\u0000\u0000\u01ae\u018d\u0001\u0000\u0000\u0000\u01ae\u0190\u0001\u0000"+
		"\u0000\u0000\u01ae\u0195\u0001\u0000\u0000\u0000\u01ae\u019a\u0001\u0000"+
		"\u0000\u0000\u01ae\u019f\u0001\u0000\u0000\u0000\u01ae\u01a4\u0001\u0000"+
		"\u0000\u0000\u01ae\u01a9\u0001\u0000\u0000\u0000\u01af9\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b1\u0006\u001d\uffff\uffff\u0000\u01b1\u01b2\u0003<\u001e"+
		"\u0000\u01b2\u01b3\u0006\u001d\uffff\uffff\u0000\u01b3\u01bb\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b5\n\u0002\u0000\u0000\u01b5\u01b6\u0005\'\u0000"+
		"\u0000\u01b6\u01b7\u0003<\u001e\u0000\u01b7\u01b8\u0006\u001d\uffff\uffff"+
		"\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01b4\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc;\u0001\u0000\u0000\u0000"+
		"\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01bf\u0006\u001e\uffff\uffff"+
		"\u0000\u01bf\u01c0\u0003>\u001f\u0000\u01c0\u01c1\u0006\u001e\uffff\uffff"+
		"\u0000\u01c1\u01c9\u0001\u0000\u0000\u0000\u01c2\u01c3\n\u0002\u0000\u0000"+
		"\u01c3\u01c4\u0005&\u0000\u0000\u01c4\u01c5\u0003>\u001f\u0000\u01c5\u01c6"+
		"\u0006\u001e\uffff\uffff\u0000\u01c6\u01c8\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c8\u01cb\u0001\u0000\u0000\u0000\u01c9"+
		"\u01c7\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca"+
		"=\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u01cd"+
		"\u0003@ \u0000\u01cd\u01ce\u0006\u001f\uffff\uffff\u0000\u01ce\u01da\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d0\u0003@ \u0000\u01d0\u01d1\u0005(\u0000"+
		"\u0000\u01d1\u01d2\u0003>\u001f\u0000\u01d2\u01d3\u0006\u001f\uffff\uffff"+
		"\u0000\u01d3\u01da\u0001\u0000\u0000\u0000\u01d4\u01d5\u0003@ \u0000\u01d5"+
		"\u01d6\u0005\u001e\u0000\u0000\u01d6\u01d7\u0003>\u001f\u0000\u01d7\u01d8"+
		"\u0006\u001f\uffff\uffff\u0000\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9"+
		"\u01cc\u0001\u0000\u0000\u0000\u01d9\u01cf\u0001\u0000\u0000\u0000\u01d9"+
		"\u01d4\u0001\u0000\u0000\u0000\u01da?\u0001\u0000\u0000\u0000\u01db\u01dc"+
		"\u0003B!\u0000\u01dc\u01dd\u0006 \uffff\uffff\u0000\u01dd\u01f3\u0001"+
		"\u0000\u0000\u0000\u01de\u01df\u0003B!\u0000\u01df\u01e0\u0005/\u0000"+
		"\u0000\u01e0\u01e1\u0003@ \u0000\u01e1\u01e2\u0006 \uffff\uffff\u0000"+
		"\u01e2\u01f3\u0001\u0000\u0000\u0000\u01e3\u01e4\u0003B!\u0000\u01e4\u01e5"+
		"\u00050\u0000\u0000\u01e5\u01e6\u0003@ \u0000\u01e6\u01e7\u0006 \uffff"+
		"\uffff\u0000\u01e7\u01f3\u0001\u0000\u0000\u0000\u01e8\u01e9\u0003B!\u0000"+
		"\u01e9\u01ea\u0005$\u0000\u0000\u01ea\u01eb\u0003@ \u0000\u01eb\u01ec"+
		"\u0006 \uffff\uffff\u0000\u01ec\u01f3\u0001\u0000\u0000\u0000\u01ed\u01ee"+
		"\u0003B!\u0000\u01ee\u01ef\u0005%\u0000\u0000\u01ef\u01f0\u0003@ \u0000"+
		"\u01f0\u01f1\u0006 \uffff\uffff\u0000\u01f1\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f2\u01db\u0001\u0000\u0000\u0000\u01f2\u01de\u0001\u0000\u0000\u0000"+
		"\u01f2\u01e3\u0001\u0000\u0000\u0000\u01f2\u01e8\u0001\u0000\u0000\u0000"+
		"\u01f2\u01ed\u0001\u0000\u0000\u0000\u01f3A\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f5\u0003D\"\u0000\u01f5\u01f6\u0006!\uffff\uffff\u0000\u01f6\u0202"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f8\u0003D\"\u0000\u01f8\u01f9\u0005"+
		"-\u0000\u0000\u01f9\u01fa\u0003B!\u0000\u01fa\u01fb\u0006!\uffff\uffff"+
		"\u0000\u01fb\u0202\u0001\u0000\u0000\u0000\u01fc\u01fd\u0003D\"\u0000"+
		"\u01fd\u01fe\u0005.\u0000\u0000\u01fe\u01ff\u0003B!\u0000\u01ff\u0200"+
		"\u0006!\uffff\uffff\u0000\u0200\u0202\u0001\u0000\u0000\u0000\u0201\u01f4"+
		"\u0001\u0000\u0000\u0000\u0201\u01f7\u0001\u0000\u0000\u0000\u0201\u01fc"+
		"\u0001\u0000\u0000\u0000\u0202C\u0001\u0000\u0000\u0000\u0203\u0204\u0003"+
		"F#\u0000\u0204\u0205\u0006\"\uffff\uffff\u0000\u0205\u0216\u0001\u0000"+
		"\u0000\u0000\u0206\u0207\u0003F#\u0000\u0207\u0208\u0005)\u0000\u0000"+
		"\u0208\u0209\u0003D\"\u0000\u0209\u020a\u0006\"\uffff\uffff\u0000\u020a"+
		"\u0216\u0001\u0000\u0000\u0000\u020b\u020c\u0003F#\u0000\u020c\u020d\u0005"+
		"+\u0000\u0000\u020d\u020e\u0003D\"\u0000\u020e\u020f\u0006\"\uffff\uffff"+
		"\u0000\u020f\u0216\u0001\u0000\u0000\u0000\u0210\u0211\u0003F#\u0000\u0211"+
		"\u0212\u0005,\u0000\u0000\u0212\u0213\u0003D\"\u0000\u0213\u0214\u0006"+
		"\"\uffff\uffff\u0000\u0214\u0216\u0001\u0000\u0000\u0000\u0215\u0203\u0001"+
		"\u0000\u0000\u0000\u0215\u0206\u0001\u0000\u0000\u0000\u0215\u020b\u0001"+
		"\u0000\u0000\u0000\u0215\u0210\u0001\u0000\u0000\u0000\u0216E\u0001\u0000"+
		"\u0000\u0000\u0217\u0218\u0003H$\u0000\u0218\u0219\u0006#\uffff\uffff"+
		"\u0000\u0219\u022b\u0001\u0000\u0000\u0000\u021a\u021b\u0005\u001b\u0000"+
		"\u0000\u021b\u021c\u0003F#\u0000\u021c\u021d\u0006#\uffff\uffff\u0000"+
		"\u021d\u022b\u0001\u0000\u0000\u0000\u021e\u021f\u0005\u001c\u0000\u0000"+
		"\u021f\u0220\u0003F#\u0000\u0220\u0221\u0006#\uffff\uffff\u0000\u0221"+
		"\u022b\u0001\u0000\u0000\u0000\u0222\u0223\u0005*\u0000\u0000\u0223\u0224"+
		"\u0003F#\u0000\u0224\u0225\u0006#\uffff\uffff\u0000\u0225\u022b\u0001"+
		"\u0000\u0000\u0000\u0226\u0227\u0007\u0003\u0000\u0000\u0227\u0228\u0003"+
		"D\"\u0000\u0228\u0229\u0006#\uffff\uffff\u0000\u0229\u022b\u0001\u0000"+
		"\u0000\u0000\u022a\u0217\u0001\u0000\u0000\u0000\u022a\u021a\u0001\u0000"+
		"\u0000\u0000\u022a\u021e\u0001\u0000\u0000\u0000\u022a\u0222\u0001\u0000"+
		"\u0000\u0000\u022a\u0226\u0001\u0000\u0000\u0000\u022bG\u0001\u0000\u0000"+
		"\u0000\u022c\u022d\u0006$\uffff\uffff\u0000\u022d\u022e\u0003J%\u0000"+
		"\u022e\u022f\u0006$\uffff\uffff\u0000\u022f\u024c\u0001\u0000\u0000\u0000"+
		"\u0230\u0231\n\u0004\u0000\u0000\u0231\u0232\u00057\u0000\u0000\u0232"+
		"\u0233\u00036\u001b\u0000\u0233\u0234\u00058\u0000\u0000\u0234\u0235\u0006"+
		"$\uffff\uffff\u0000\u0235\u024b\u0001\u0000\u0000\u0000\u0236\u0237\n"+
		"\u0003\u0000\u0000\u0237\u0238\u00055\u0000\u0000\u0238\u023c\u0006$\uffff"+
		"\uffff\u0000\u0239\u023a\u0003V+\u0000\u023a\u023b\u0006$\uffff\uffff"+
		"\u0000\u023b\u023d\u0001\u0000\u0000\u0000\u023c\u0239\u0001\u0000\u0000"+
		"\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000"+
		"\u0000\u023e\u023f\u00056\u0000\u0000\u023f\u024b\u0006$\uffff\uffff\u0000"+
		"\u0240\u0241\n\u0002\u0000\u0000\u0241\u0242\u0005;\u0000\u0000\u0242"+
		"\u0243\u0003T*\u0000\u0243\u0244\u0006$\uffff\uffff\u0000\u0244\u024b"+
		"\u0001\u0000\u0000\u0000\u0245\u0246\n\u0001\u0000\u0000\u0246\u0247\u0005"+
		"\u001d\u0000\u0000\u0247\u0248\u0003T*\u0000\u0248\u0249\u0006$\uffff"+
		"\uffff\u0000\u0249\u024b\u0001\u0000\u0000\u0000\u024a\u0230\u0001\u0000"+
		"\u0000\u0000\u024a\u0236\u0001\u0000\u0000\u0000\u024a\u0240\u0001\u0000"+
		"\u0000\u0000\u024a\u0245\u0001\u0000\u0000\u0000\u024b\u024e\u0001\u0000"+
		"\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000"+
		"\u0000\u0000\u024dI\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0003T*\u0000\u0250\u0251\u0006%\uffff\uffff\u0000"+
		"\u0251\u025d\u0001\u0000\u0000\u0000\u0252\u0253\u0003L&\u0000\u0253\u0254"+
		"\u0006%\uffff\uffff\u0000\u0254\u025d\u0001\u0000\u0000\u0000\u0255\u0256"+
		"\u0005\u0018\u0000\u0000\u0256\u025d\u0006%\uffff\uffff\u0000\u0257\u0258"+
		"\u00055\u0000\u0000\u0258\u0259\u00036\u001b\u0000\u0259\u025a\u00056"+
		"\u0000\u0000\u025a\u025b\u0006%\uffff\uffff\u0000\u025b\u025d\u0001\u0000"+
		"\u0000\u0000\u025c\u024f\u0001\u0000\u0000\u0000\u025c\u0252\u0001\u0000"+
		"\u0000\u0000\u025c\u0255\u0001\u0000\u0000\u0000\u025c\u0257\u0001\u0000"+
		"\u0000\u0000\u025dK\u0001\u0000\u0000\u0000\u025e\u025f\u0003R)\u0000"+
		"\u025f\u0260\u0006&\uffff\uffff\u0000\u0260\u0268\u0001\u0000\u0000\u0000"+
		"\u0261\u0262\u0003N\'\u0000\u0262\u0263\u0006&\uffff\uffff\u0000\u0263"+
		"\u0268\u0001\u0000\u0000\u0000\u0264\u0265\u0003P(\u0000\u0265\u0266\u0006"+
		"&\uffff\uffff\u0000\u0266\u0268\u0001\u0000\u0000\u0000\u0267\u025e\u0001"+
		"\u0000\u0000\u0000\u0267\u0261\u0001\u0000\u0000\u0000\u0267\u0264\u0001"+
		"\u0000\u0000\u0000\u0268M\u0001\u0000\u0000\u0000\u0269\u026a\u0005\u001a"+
		"\u0000\u0000\u026a\u026b\u0005;\u0000\u0000\u026b\u026c\u0005\u001a\u0000"+
		"\u0000\u026c\u026d\u0006\'\uffff\uffff\u0000\u026dO\u0001\u0000\u0000"+
		"\u0000\u026e\u026f\u0005\u0018\u0000\u0000\u026f\u0270\u0006(\uffff\uffff"+
		"\u0000\u0270Q\u0001\u0000\u0000\u0000\u0271\u0272\u0005\u001a\u0000\u0000"+
		"\u0272\u0273\u0006)\uffff\uffff\u0000\u0273S\u0001\u0000\u0000\u0000\u0274"+
		"\u0275\u0005\u0019\u0000\u0000\u0275\u0276\u0006*\uffff\uffff\u0000\u0276"+
		"U\u0001\u0000\u0000\u0000\u0277\u0278\u0003X,\u0000\u0278\u0279\u0006"+
		"+\uffff\uffff\u0000\u0279\u0280\u0001\u0000\u0000\u0000\u027a\u027b\u0003"+
		"X,\u0000\u027b\u027c\u00053\u0000\u0000\u027c\u027d\u0003V+\u0000\u027d"+
		"\u027e\u0006+\uffff\uffff\u0000\u027e\u0280\u0001\u0000\u0000\u0000\u027f"+
		"\u0277\u0001\u0000\u0000\u0000\u027f\u027a\u0001\u0000\u0000\u0000\u0280"+
		"W\u0001\u0000\u0000\u0000\u0281\u0282\u00036\u001b\u0000\u0282\u0283\u0006"+
		",\uffff\uffff\u0000\u0283Y\u0001\u0000\u0000\u0000,emy\u007f\u0094\u00a6"+
		"\u00b3\u00cb\u00d2\u00d9\u00df\u00ee\u00f0\u00f7\u0103\u010b\u0110\u011e"+
		"\u0123\u012b\u0139\u0143\u014a\u014f\u0158\u0163\u016b\u0171\u017e\u0185"+
		"\u01ae\u01bb\u01c9\u01d9\u01f2\u0201\u0215\u022a\u023c\u024a\u024c\u025c"+
		"\u0267\u027f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}