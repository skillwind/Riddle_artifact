// Generated from jetbrick/template/runtime/parser/grammer/JetTemplateParser.g4 by ANTLR 4.7.1
package jetbrick.template.runtime.parser.grammer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JetTemplateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT_LINE=1, COMMENT_BLOCK=2, TEXT_PLAIN=3, TEXT_CDATA=4, TEXT_CHAR_ESCAPED=5, 
		TEXT_CHAR_SINGLE=6, VALUE_OPEN=7, VALUE_OPEN_ESCAPED=8, DIRECTIVE_OPEN_OPTIONS=9, 
		DIRECTIVE_OPEN_DEFINE=10, DIRECTIVE_OPEN_SET=11, DIRECTIVE_OPEN_IF=12, 
		DIRECTIVE_OPEN_ELSEIF=13, DIRECTIVE_OPEN_FOR=14, DIRECTIVE_OPEN_BREAK=15, 
		DIRECTIVE_OPEN_CONTINUE=16, DIRECTIVE_OPEN_STOP=17, DIRECTIVE_OPEN_RETURN=18, 
		DIRECTIVE_OPEN_INCLUDE=19, DIRECTIVE_OPEN_TAG=20, DIRECTIVE_OPEN_CALL=21, 
		DIRECTIVE_OPEN_MACRO=22, DIRECTIVE_ELSE=23, DIRECTIVE_END=24, DIRECTIVE_BREAK=25, 
		DIRECTIVE_CONTINUE=26, DIRECTIVE_STOP=27, DIRECTIVE_RETURN=28, DIRECTIVE_OPTIONS=29, 
		DIRECTIVE_DEFINE=30, DIRECTIVE_SET=31, DIRECTIVE_IF=32, DIRECTIVE_ELSEIF=33, 
		DIRECTIVE_FOR=34, DIRECTIVE_INCLUDE=35, DIRECTIVE_TAG=36, DIRECTIVE_CALL=37, 
		DIRECTIVE_MACRO=38, TEXT_DIRECTIVE_LIKE=39, WHITESPACE=40, LPAREN=41, 
		RPAREN=42, LBRACK=43, RBRACK=44, LBRACE=45, RBRACE=46, COMMA=47, QUESTION=48, 
		COLON=49, COLON2=50, DOT=51, ASSIGN=52, NULL_AS_DEFAULT=53, IDENTICALLY_EQUAL=54, 
		IDENTICALLY_EQUAL_NOT=55, EQ=56, NE=57, GT=58, LT=59, GE=60, LE=61, AND=62, 
		OR=63, NOT=64, PLUS=65, MINUS=66, MUL=67, DIV=68, MOD=69, BIT_AND=70, 
		BIT_OR=71, BIT_NOT=72, BIT_XOR=73, BIT_SHL=74, BIT_SHR=75, BIT_USHR=76, 
		INSTANCEOF=77, NEW=78, TRUE=79, FALSE=80, NULL=81, IDENTIFIER=82, INTEGER=83, 
		INTEGER_HEX=84, FLOATING_POINT=85, STRING_DOUBLE=86, STRING_SINGLE=87;
	public static final int
		RULE_template = 0, RULE_block = 1, RULE_text = 2, RULE_value = 3, RULE_directive = 4, 
		RULE_directive_options = 5, RULE_directive_options_expression = 6, RULE_directive_define = 7, 
		RULE_directive_define_expression = 8, RULE_directive_set = 9, RULE_directive_set_expression = 10, 
		RULE_directive_if = 11, RULE_directive_elseif = 12, RULE_directive_else = 13, 
		RULE_directive_for = 14, RULE_directive_break = 15, RULE_directive_continue = 16, 
		RULE_directive_stop = 17, RULE_directive_return = 18, RULE_directive_include = 19, 
		RULE_directive_tag = 20, RULE_directive_call = 21, RULE_directive_macro = 22, 
		RULE_directive_macro_arguments = 23, RULE_directive_invalid = 24, RULE_expression = 25, 
		RULE_identifier = 26, RULE_constant = 27, RULE_expression_list = 28, RULE_hash_map_entry = 29, 
		RULE_type = 30;
	public static final String[] ruleNames = {
		"template", "block", "text", "value", "directive", "directive_options", 
		"directive_options_expression", "directive_define", "directive_define_expression", 
		"directive_set", "directive_set_expression", "directive_if", "directive_elseif", 
		"directive_else", "directive_for", "directive_break", "directive_continue", 
		"directive_stop", "directive_return", "directive_include", "directive_tag", 
		"directive_call", "directive_macro", "directive_macro_arguments", "directive_invalid", 
		"expression", "identifier", "constant", "expression_list", "hash_map_entry", 
		"type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'${'", "'$!{'", null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'#break'", "'#continue'", "'#stop'", "'#return'", "'#options'", 
		"'#define'", "'#set'", "'#if'", "'#elseif'", "'#for'", "'#include'", "'#tag'", 
		"'#call'", "'#macro'", null, null, "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "','", "'?'", "':'", "'::'", "'.'", "'='", "'?!'", "'==='", "'!=='", 
		"'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'!'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'~'", "'^'", "'<<'", "'>>'", 
		"'>>>'", "'instanceof'", "'new'", "'true'", "'false'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT_LINE", "COMMENT_BLOCK", "TEXT_PLAIN", "TEXT_CDATA", "TEXT_CHAR_ESCAPED", 
		"TEXT_CHAR_SINGLE", "VALUE_OPEN", "VALUE_OPEN_ESCAPED", "DIRECTIVE_OPEN_OPTIONS", 
		"DIRECTIVE_OPEN_DEFINE", "DIRECTIVE_OPEN_SET", "DIRECTIVE_OPEN_IF", "DIRECTIVE_OPEN_ELSEIF", 
		"DIRECTIVE_OPEN_FOR", "DIRECTIVE_OPEN_BREAK", "DIRECTIVE_OPEN_CONTINUE", 
		"DIRECTIVE_OPEN_STOP", "DIRECTIVE_OPEN_RETURN", "DIRECTIVE_OPEN_INCLUDE", 
		"DIRECTIVE_OPEN_TAG", "DIRECTIVE_OPEN_CALL", "DIRECTIVE_OPEN_MACRO", "DIRECTIVE_ELSE", 
		"DIRECTIVE_END", "DIRECTIVE_BREAK", "DIRECTIVE_CONTINUE", "DIRECTIVE_STOP", 
		"DIRECTIVE_RETURN", "DIRECTIVE_OPTIONS", "DIRECTIVE_DEFINE", "DIRECTIVE_SET", 
		"DIRECTIVE_IF", "DIRECTIVE_ELSEIF", "DIRECTIVE_FOR", "DIRECTIVE_INCLUDE", 
		"DIRECTIVE_TAG", "DIRECTIVE_CALL", "DIRECTIVE_MACRO", "TEXT_DIRECTIVE_LIKE", 
		"WHITESPACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
		"COMMA", "QUESTION", "COLON", "COLON2", "DOT", "ASSIGN", "NULL_AS_DEFAULT", 
		"IDENTICALLY_EQUAL", "IDENTICALLY_EQUAL_NOT", "EQ", "NE", "GT", "LT", 
		"GE", "LE", "AND", "OR", "NOT", "PLUS", "MINUS", "MUL", "DIV", "MOD", 
		"BIT_AND", "BIT_OR", "BIT_NOT", "BIT_XOR", "BIT_SHL", "BIT_SHR", "BIT_USHR", 
		"INSTANCEOF", "NEW", "TRUE", "FALSE", "NULL", "IDENTIFIER", "INTEGER", 
		"INTEGER_HEX", "FLOATING_POINT", "STRING_DOUBLE", "STRING_SINGLE"
	};
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
	public String getGrammarFileName() { return "JetTemplateParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JetTemplateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TemplateContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JetTemplateParser.EOF, 0); }
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			block();
			setState(63);
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

	public static class BlockContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT_PLAIN) | (1L << TEXT_CDATA) | (1L << TEXT_CHAR_ESCAPED) | (1L << TEXT_CHAR_SINGLE) | (1L << VALUE_OPEN) | (1L << VALUE_OPEN_ESCAPED) | (1L << DIRECTIVE_OPEN_OPTIONS) | (1L << DIRECTIVE_OPEN_DEFINE) | (1L << DIRECTIVE_OPEN_SET) | (1L << DIRECTIVE_OPEN_IF) | (1L << DIRECTIVE_OPEN_FOR) | (1L << DIRECTIVE_OPEN_BREAK) | (1L << DIRECTIVE_OPEN_CONTINUE) | (1L << DIRECTIVE_OPEN_STOP) | (1L << DIRECTIVE_OPEN_RETURN) | (1L << DIRECTIVE_OPEN_INCLUDE) | (1L << DIRECTIVE_OPEN_TAG) | (1L << DIRECTIVE_OPEN_CALL) | (1L << DIRECTIVE_OPEN_MACRO) | (1L << DIRECTIVE_BREAK) | (1L << DIRECTIVE_CONTINUE) | (1L << DIRECTIVE_STOP) | (1L << DIRECTIVE_RETURN) | (1L << DIRECTIVE_OPTIONS) | (1L << DIRECTIVE_DEFINE) | (1L << DIRECTIVE_SET) | (1L << DIRECTIVE_IF) | (1L << DIRECTIVE_ELSEIF) | (1L << DIRECTIVE_FOR) | (1L << DIRECTIVE_INCLUDE) | (1L << DIRECTIVE_TAG) | (1L << DIRECTIVE_CALL) | (1L << DIRECTIVE_MACRO) | (1L << TEXT_DIRECTIVE_LIKE))) != 0)) {
				{
				setState(68);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT_PLAIN:
				case TEXT_CDATA:
				case TEXT_CHAR_ESCAPED:
				case TEXT_CHAR_SINGLE:
				case TEXT_DIRECTIVE_LIKE:
					{
					setState(65);
					text();
					}
					break;
				case VALUE_OPEN:
				case VALUE_OPEN_ESCAPED:
					{
					setState(66);
					value();
					}
					break;
				case DIRECTIVE_OPEN_OPTIONS:
				case DIRECTIVE_OPEN_DEFINE:
				case DIRECTIVE_OPEN_SET:
				case DIRECTIVE_OPEN_IF:
				case DIRECTIVE_OPEN_FOR:
				case DIRECTIVE_OPEN_BREAK:
				case DIRECTIVE_OPEN_CONTINUE:
				case DIRECTIVE_OPEN_STOP:
				case DIRECTIVE_OPEN_RETURN:
				case DIRECTIVE_OPEN_INCLUDE:
				case DIRECTIVE_OPEN_TAG:
				case DIRECTIVE_OPEN_CALL:
				case DIRECTIVE_OPEN_MACRO:
				case DIRECTIVE_BREAK:
				case DIRECTIVE_CONTINUE:
				case DIRECTIVE_STOP:
				case DIRECTIVE_RETURN:
				case DIRECTIVE_OPTIONS:
				case DIRECTIVE_DEFINE:
				case DIRECTIVE_SET:
				case DIRECTIVE_IF:
				case DIRECTIVE_ELSEIF:
				case DIRECTIVE_FOR:
				case DIRECTIVE_INCLUDE:
				case DIRECTIVE_TAG:
				case DIRECTIVE_CALL:
				case DIRECTIVE_MACRO:
					{
					setState(67);
					directive();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(72);
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

	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT_PLAIN() { return getToken(JetTemplateParser.TEXT_PLAIN, 0); }
		public TerminalNode TEXT_CDATA() { return getToken(JetTemplateParser.TEXT_CDATA, 0); }
		public TerminalNode TEXT_CHAR_SINGLE() { return getToken(JetTemplateParser.TEXT_CHAR_SINGLE, 0); }
		public TerminalNode TEXT_CHAR_ESCAPED() { return getToken(JetTemplateParser.TEXT_CHAR_ESCAPED, 0); }
		public TerminalNode TEXT_DIRECTIVE_LIKE() { return getToken(JetTemplateParser.TEXT_DIRECTIVE_LIKE, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT_PLAIN) | (1L << TEXT_CDATA) | (1L << TEXT_CHAR_ESCAPED) | (1L << TEXT_CHAR_SINGLE) | (1L << TEXT_DIRECTIVE_LIKE))) != 0)) ) {
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode VALUE_OPEN() { return getToken(JetTemplateParser.VALUE_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VALUE_OPEN_ESCAPED() { return getToken(JetTemplateParser.VALUE_OPEN_ESCAPED, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(VALUE_OPEN);
				setState(76);
				expression(0);
				setState(77);
				match(RBRACE);
				}
				break;
			case VALUE_OPEN_ESCAPED:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(VALUE_OPEN_ESCAPED);
				setState(80);
				expression(0);
				setState(81);
				match(RBRACE);
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

	public static class DirectiveContext extends ParserRuleContext {
		public Directive_optionsContext directive_options() {
			return getRuleContext(Directive_optionsContext.class,0);
		}
		public Directive_defineContext directive_define() {
			return getRuleContext(Directive_defineContext.class,0);
		}
		public Directive_setContext directive_set() {
			return getRuleContext(Directive_setContext.class,0);
		}
		public Directive_ifContext directive_if() {
			return getRuleContext(Directive_ifContext.class,0);
		}
		public Directive_forContext directive_for() {
			return getRuleContext(Directive_forContext.class,0);
		}
		public Directive_breakContext directive_break() {
			return getRuleContext(Directive_breakContext.class,0);
		}
		public Directive_continueContext directive_continue() {
			return getRuleContext(Directive_continueContext.class,0);
		}
		public Directive_stopContext directive_stop() {
			return getRuleContext(Directive_stopContext.class,0);
		}
		public Directive_includeContext directive_include() {
			return getRuleContext(Directive_includeContext.class,0);
		}
		public Directive_returnContext directive_return() {
			return getRuleContext(Directive_returnContext.class,0);
		}
		public Directive_tagContext directive_tag() {
			return getRuleContext(Directive_tagContext.class,0);
		}
		public Directive_callContext directive_call() {
			return getRuleContext(Directive_callContext.class,0);
		}
		public Directive_macroContext directive_macro() {
			return getRuleContext(Directive_macroContext.class,0);
		}
		public Directive_invalidContext directive_invalid() {
			return getRuleContext(Directive_invalidContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_directive);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIRECTIVE_OPEN_OPTIONS:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				directive_options();
				}
				break;
			case DIRECTIVE_OPEN_DEFINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				directive_define();
				}
				break;
			case DIRECTIVE_OPEN_SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				directive_set();
				}
				break;
			case DIRECTIVE_OPEN_IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				directive_if();
				}
				break;
			case DIRECTIVE_OPEN_FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				directive_for();
				}
				break;
			case DIRECTIVE_OPEN_BREAK:
			case DIRECTIVE_BREAK:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				directive_break();
				}
				break;
			case DIRECTIVE_OPEN_CONTINUE:
			case DIRECTIVE_CONTINUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				directive_continue();
				}
				break;
			case DIRECTIVE_OPEN_STOP:
			case DIRECTIVE_STOP:
				enterOuterAlt(_localctx, 8);
				{
				setState(92);
				directive_stop();
				}
				break;
			case DIRECTIVE_OPEN_INCLUDE:
				enterOuterAlt(_localctx, 9);
				{
				setState(93);
				directive_include();
				}
				break;
			case DIRECTIVE_OPEN_RETURN:
			case DIRECTIVE_RETURN:
				enterOuterAlt(_localctx, 10);
				{
				setState(94);
				directive_return();
				}
				break;
			case DIRECTIVE_OPEN_TAG:
				enterOuterAlt(_localctx, 11);
				{
				setState(95);
				directive_tag();
				}
				break;
			case DIRECTIVE_OPEN_CALL:
				enterOuterAlt(_localctx, 12);
				{
				setState(96);
				directive_call();
				}
				break;
			case DIRECTIVE_OPEN_MACRO:
				enterOuterAlt(_localctx, 13);
				{
				setState(97);
				directive_macro();
				}
				break;
			case DIRECTIVE_OPTIONS:
			case DIRECTIVE_DEFINE:
			case DIRECTIVE_SET:
			case DIRECTIVE_IF:
			case DIRECTIVE_ELSEIF:
			case DIRECTIVE_FOR:
			case DIRECTIVE_INCLUDE:
			case DIRECTIVE_TAG:
			case DIRECTIVE_CALL:
			case DIRECTIVE_MACRO:
				enterOuterAlt(_localctx, 14);
				{
				setState(98);
				directive_invalid();
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

	public static class Directive_optionsContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_OPEN_OPTIONS() { return getToken(JetTemplateParser.DIRECTIVE_OPEN_OPTIONS, 0); }
		public List<Directive_options_expressionContext> directive_options_expression() {
			return getRuleContexts(Directive_options_expressionContext.class);
		}
		public Directive_options_expressionContext directive_options_expression(int i) {
			return getRuleContext(Directive_options_expressionContext.class,i);
		}
		public Directive_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_options; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_optionsContext directive_options() throws RecognitionException {
		Directive_optionsContext _localctx = new Directive_optionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_directive_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(DIRECTIVE_OPEN_OPTIONS);
			setState(102);
			directive_options_expression();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(103);
				match(COMMA);
				setState(104);
				directive_options_expression();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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

	public static class Directive_options_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JetTemplateParser.IDENTIFIER, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Directive_options_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_options_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_options_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_options_expressionContext directive_options_expression() throws RecognitionException {
		Directive_options_expressionContext _localctx = new Directive_options_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_directive_options_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(IDENTIFIER);
			setState(113);
			match(ASSIGN);
			setState(114);
			constant();
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

	public static class Directive_defineContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_OPEN_DEFINE() { return getToken(JetTemplateParser.DIRECTIVE_OPEN_DEFINE, 0); }
		public List<Directive_define_expressionContext> directive_define_expression() {
			return getRuleContexts(Directive_define_expressionContext.class);
		}
		public Directive_define_expressionContext directive_define_expression(int i) {
			return getRuleContext(Directive_define_expressionContext.class,i);
		}
		public Directive_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_defineContext directive_define() throws RecognitionException {
		Directive_defineContext _localctx = new Directive_defineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_directive_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(DIRECTIVE_OPEN_DEFINE);
			setState(117);
			directive_define_expression();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(118);
				match(COMMA);
				setState(119);
				directive_define_expression();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
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

	public static class Directive_define_expressionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { 
//			 return getToken(JetTemplateParser.IDENTIFIER, 0); 
			return new TerminalNodeImpl(new org.antlr.v4.runtime.tree.pattern.RuleTagToken("rule1",1)); 
			}
		public Directive_define_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_define_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_define_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_define_expressionContext directive_define_expression() throws RecognitionException {
		Directive_define_expressionContext _localctx = new Directive_define_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_directive_define_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			type();
			setState(128);
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

	public static class Directive_setContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_OPEN_SET() { return getToken(JetTemplateParser.DIRECTIVE_OPEN_SET, 0); }
		public List<Directive_set_expressionContext> directive_set_expression() {
			return getRuleContexts(Directive_set_expressionContext.class);
		}
		public Directive_set_expressionContext directive_set_expression(int i) {
			return getRuleContext(Directive_set_expressionContext.class,i);
		}
		public Directive_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_set; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_setContext directive_set() throws RecognitionException {
		Directive_setContext _localctx = new Directive_setContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_directive_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(DIRECTIVE_OPEN_SET);
			setState(131);
			directive_set_expression();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(132);
				match(COMMA);
				setState(133);
				directive_set_expression();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
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

	public static class Directive_set_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JetTemplateParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Directive_set_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_set_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_set_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_set_expressionContext directive_set_expression() throws RecognitionException {
		Directive_set_expressionContext _localctx = new Directive_set_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_directive_set_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(141);
				type();
				}
				break;
			}
			setState(144);
			match(IDENTIFIER);
			setState(145);
			match(ASSIGN);
			setState(146);
			expression(0);
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

	public static class Directive_ifContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_OPEN_IF() { return getToken(JetTemplateParser.DIRECTIVE_OPEN_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DIRECTIVE_END() { return getToken(JetTemplateParser.DIRECTIVE_END, 0); }
		public Directive_elseifContext directive_elseif() {
			return getRuleContext(Directive_elseifContext.class,0);
		}
		public Directive_elseContext directive_else() {
			return getRuleContext(Directive_elseContext.class,0);
		}
		public Directive_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_if; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_ifContext directive_if() throws RecognitionException {
		Directive_ifContext _localctx = new Directive_ifContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_directive_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(DIRECTIVE_OPEN_IF);
			setState(149);
			expression(0);
			setState(150);
			match(RPAREN);
			setState(151);
			block();
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIRECTIVE_OPEN_ELSEIF:
				{
				setState(152);
				directive_elseif();
				}
				break;
			case DIRECTIVE_ELSE:
				{
				setState(153);
				directive_else();
				}
				break;
			case DIRECTIVE_END:
				break;
			default:
				break;
			}
			setState(156);
			match(DIRECTIVE_END);
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

	public static class Directive_elseifContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_OPEN_ELSEIF() { return getToken(JetTemplateParser.DIRECTIVE_OPEN_ELSEIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Directive_elseifContext directive_elseif() {
			return getRuleContext(Directive_elseifContext.class,0);
		}
		public Directive_elseContext directive_else() {
			return getRuleContext(Directive_elseContext.class,0);
		}
		public Directive_elseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_elseif; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_elseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_elseifContext directive_elseif() throws RecognitionException {
		Directive_elseifContext _localctx = new Directive_elseifContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_directive_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(DIRECTIVE_OPEN_ELSEIF);
			setState(159);
			expression(0);
			setState(160);
			match(RPAREN);
			setState(161);
			block();
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIRECTIVE_OPEN_ELSEIF:
				{
				setState(162);
				directive_elseif();
				}
				break;
			case DIRECTIVE_ELSE:
				{
				setState(163);
				directive_else();
				}
				break;
			case DIRECTIVE_END:
				break;
			default:
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

	public static class Directive_elseContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_ELSE() { return getToken(JetTemplateParser.DIRECTIVE_ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Directive_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_else; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_elseContext directive_else() throws RecognitionException {
		Directive_elseContext _localctx = new Directive_elseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_directive_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(DIRECTIVE_ELSE);
			setState(167);
			block();
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

	public static class Directive_forContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_OPEN_FOR() { return getToken(JetTemplateParser.DIRECTIVE_OPEN_FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JetTemplateParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DIRECTIVE_END() { return getToken(JetTemplateParser.DIRECTIVE_END, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Directive_elseContext directive_else() {
			return getRuleContext(Directive_elseContext.class,0);
		}
		public Directive_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_for; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_forContext directive_for() throws RecognitionException {
		Directive_forContext _localctx = new Directive_forContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_directive_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(DIRECTIVE_OPEN_FOR);
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(170);
				type();
				}
				break;
			}
			setState(173);
			match(IDENTIFIER);
			setState(174);
			match(COLON);
			setState(175);
			expression(0);
			setState(176);
			match(RPAREN);
			setState(177);
			block();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIRECTIVE_ELSE) {
				{
				setState(178);
				directive_else();
				}
			}

			setState(181);
			match(DIRECTIVE_END);
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

	public static class Directive_breakContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_OPEN_BREAK() { return getToken(JetTemplateParser.DIRECTIVE_OPEN_BREAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DIRECTIVE_BREAK() { return getToken(JetTemplateParser.DIRECTIVE_BREAK, 0); }
		public Directive_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_break; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_break(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_breakContext directive_break() throws RecognitionException {
		Directive_breakContext _localctx = new Directive_breakContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_directive_break);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIRECTIVE_OPEN_BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(DIRECTIVE_OPEN_BREAK);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LPAREN - 41)) | (1L << (LBRACK - 41)) | (1L << (LBRACE - 41)) | (1L << (NOT - 41)) | (1L << (PLUS - 41)) | (1L << (MINUS - 41)) | (1L << (BIT_NOT - 41)) | (1L << (NEW - 41)) | (1L << (TRUE - 41)) | (1L << (FALSE - 41)) | (1L << (NULL - 41)) | (1L << (IDENTIFIER - 41)) | (1L << (INTEGER - 41)) | (1L << (INTEGER_HEX - 41)) | (1L << (FLOATING_POINT - 41)) | (1L << (STRING_DOUBLE - 41)) | (1L << (STRING_SINGLE - 41)))) != 0)) {
					{
					setState(184);
					expression(0);
					}
				}

				setState(187);
				match(RPAREN);
				}
				break;
			case DIRECTIVE_BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(DIRECTIVE_BREAK);
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

	public static class Directive_continueContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_OPEN_CONTINUE() { return getToken(JetTemplateParser.DIRECTIVE_OPEN_CONTINUE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DIRECTIVE_CONTINUE() { return getToken(JetTemplateParser.DIRECTIVE_CONTINUE, 0); }
		public Directive_continueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_continue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_continue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_continueContext directive_continue() throws RecognitionException {
		Directive_continueContext _localctx = new Directive_continueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_directive_continue);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIRECTIVE_OPEN_CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(DIRECTIVE_OPEN_CONTINUE);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LPAREN - 41)) | (1L << (LBRACK - 41)) | (1L << (LBRACE - 41)) | (1L << (NOT - 41)) | (1L << (PLUS - 41)) | (1L << (MINUS - 41)) | (1L << (BIT_NOT - 41)) | (1L << (NEW - 41)) | (1L << (TRUE - 41)) | (1L << (FALSE - 41)) | (1L << (NULL - 41)) | (1L << (IDENTIFIER - 41)) | (1L << (INTEGER - 41)) | (1L << (INTEGER_HEX - 41)) | (1L << (FLOATING_POINT - 41)) | (1L << (STRING_DOUBLE - 41)) | (1L << (STRING_SINGLE - 41)))) != 0)) {
					{
					setState(192);
					expression(0);
					}
				}

				setState(195);
				match(RPAREN);
				}
				break;
			case DIRECTIVE_CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(DIRECTIVE_CONTINUE);
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

	public static class Directive_stopContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_OPEN_STOP() { return getToken(JetTemplateParser.DIRECTIVE_OPEN_STOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DIRECTIVE_STOP() { return getToken(JetTemplateParser.DIRECTIVE_STOP, 0); }
		public Directive_stopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_stop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_stop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_stopContext directive_stop() throws RecognitionException {
		Directive_stopContext _localctx = new Directive_stopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_directive_stop);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIRECTIVE_OPEN_STOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(DIRECTIVE_OPEN_STOP);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LPAREN - 41)) | (1L << (LBRACK - 41)) | (1L << (LBRACE - 41)) | (1L << (NOT - 41)) | (1L << (PLUS - 41)) | (1L << (MINUS - 41)) | (1L << (BIT_NOT - 41)) | (1L << (NEW - 41)) | (1L << (TRUE - 41)) | (1L << (FALSE - 41)) | (1L << (NULL - 41)) | (1L << (IDENTIFIER - 41)) | (1L << (INTEGER - 41)) | (1L << (INTEGER_HEX - 41)) | (1L << (FLOATING_POINT - 41)) | (1L << (STRING_DOUBLE - 41)) | (1L << (STRING_SINGLE - 41)))) != 0)) {
					{
					setState(200);
					expression(0);
					}
				}

				setState(203);
				match(RPAREN);
				}
				break;
			case DIRECTIVE_STOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(DIRECTIVE_STOP);
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

	public static class Directive_returnContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_OPEN_RETURN() { return getToken(JetTemplateParser.DIRECTIVE_OPEN_RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DIRECTIVE_RETURN() { return getToken(JetTemplateParser.DIRECTIVE_RETURN, 0); }
		public Directive_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_returnContext directive_return() throws RecognitionException {
		Directive_returnContext _localctx = new Directive_returnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_directive_return);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIRECTIVE_OPEN_RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(DIRECTIVE_OPEN_RETURN);
				setState(208);
				expression(0);
				setState(209);
				match(RPAREN);
				}
				break;
			case DIRECTIVE_RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(DIRECTIVE_RETURN);
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

	public static class Directive_includeContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_OPEN_INCLUDE() { return getToken(JetTemplateParser.DIRECTIVE_OPEN_INCLUDE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Directive_includeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_include; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_include(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_includeContext directive_include() throws RecognitionException {
		Directive_includeContext _localctx = new Directive_includeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_directive_include);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(DIRECTIVE_OPEN_INCLUDE);
			setState(215);
			expression(0);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(216);
				match(COMMA);
				setState(217);
				expression(0);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
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

	public static class Directive_tagContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_OPEN_TAG() { return getToken(JetTemplateParser.DIRECTIVE_OPEN_TAG, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DIRECTIVE_END() { return getToken(JetTemplateParser.DIRECTIVE_END, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Directive_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_tag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_tagContext directive_tag() throws RecognitionException {
		Directive_tagContext _localctx = new Directive_tagContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_directive_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(DIRECTIVE_OPEN_TAG);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LPAREN - 41)) | (1L << (LBRACK - 41)) | (1L << (LBRACE - 41)) | (1L << (NOT - 41)) | (1L << (PLUS - 41)) | (1L << (MINUS - 41)) | (1L << (BIT_NOT - 41)) | (1L << (NEW - 41)) | (1L << (TRUE - 41)) | (1L << (FALSE - 41)) | (1L << (NULL - 41)) | (1L << (IDENTIFIER - 41)) | (1L << (INTEGER - 41)) | (1L << (INTEGER_HEX - 41)) | (1L << (FLOATING_POINT - 41)) | (1L << (STRING_DOUBLE - 41)) | (1L << (STRING_SINGLE - 41)))) != 0)) {
				{
				setState(226);
				expression_list();
				}
			}

			setState(229);
			match(RPAREN);
			setState(230);
			block();
			setState(231);
			match(DIRECTIVE_END);
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

	public static class Directive_callContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_OPEN_CALL() { return getToken(JetTemplateParser.DIRECTIVE_OPEN_CALL, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Directive_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_callContext directive_call() throws RecognitionException {
		Directive_callContext _localctx = new Directive_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_directive_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(DIRECTIVE_OPEN_CALL);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LPAREN - 41)) | (1L << (LBRACK - 41)) | (1L << (LBRACE - 41)) | (1L << (NOT - 41)) | (1L << (PLUS - 41)) | (1L << (MINUS - 41)) | (1L << (BIT_NOT - 41)) | (1L << (NEW - 41)) | (1L << (TRUE - 41)) | (1L << (FALSE - 41)) | (1L << (NULL - 41)) | (1L << (IDENTIFIER - 41)) | (1L << (INTEGER - 41)) | (1L << (INTEGER_HEX - 41)) | (1L << (FLOATING_POINT - 41)) | (1L << (STRING_DOUBLE - 41)) | (1L << (STRING_SINGLE - 41)))) != 0)) {
				{
				setState(234);
				expression_list();
				}
			}

			setState(237);
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

	public static class Directive_macroContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_OPEN_MACRO() { return getToken(JetTemplateParser.DIRECTIVE_OPEN_MACRO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DIRECTIVE_END() { return getToken(JetTemplateParser.DIRECTIVE_END, 0); }
		public Directive_macro_argumentsContext directive_macro_arguments() {
			return getRuleContext(Directive_macro_argumentsContext.class,0);
		}
		public Directive_macroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_macro; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_macro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_macroContext directive_macro() throws RecognitionException {
		Directive_macroContext _localctx = new Directive_macroContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_directive_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(DIRECTIVE_OPEN_MACRO);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(240);
				directive_macro_arguments();
				}
			}

			setState(243);
			match(RPAREN);
			setState(244);
			block();
			setState(245);
			match(DIRECTIVE_END);
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

	public static class Directive_macro_argumentsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JetTemplateParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JetTemplateParser.IDENTIFIER, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Directive_macro_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_macro_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_macro_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_macro_argumentsContext directive_macro_arguments() throws RecognitionException {
		Directive_macro_argumentsContext _localctx = new Directive_macro_argumentsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_directive_macro_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(247);
				type();
				}
				break;
			}
			setState(250);
			match(IDENTIFIER);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(251);
				match(COMMA);
				setState(253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(252);
					type();
					}
					break;
				}
				setState(255);
				match(IDENTIFIER);
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

	public static class Directive_invalidContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_OPTIONS() { return getToken(JetTemplateParser.DIRECTIVE_OPTIONS, 0); }
		public TerminalNode DIRECTIVE_DEFINE() { return getToken(JetTemplateParser.DIRECTIVE_DEFINE, 0); }
		public TerminalNode DIRECTIVE_SET() { return getToken(JetTemplateParser.DIRECTIVE_SET, 0); }
		public TerminalNode DIRECTIVE_IF() { return getToken(JetTemplateParser.DIRECTIVE_IF, 0); }
		public TerminalNode DIRECTIVE_ELSEIF() { return getToken(JetTemplateParser.DIRECTIVE_ELSEIF, 0); }
		public TerminalNode DIRECTIVE_FOR() { return getToken(JetTemplateParser.DIRECTIVE_FOR, 0); }
		public TerminalNode DIRECTIVE_INCLUDE() { return getToken(JetTemplateParser.DIRECTIVE_INCLUDE, 0); }
		public TerminalNode DIRECTIVE_TAG() { return getToken(JetTemplateParser.DIRECTIVE_TAG, 0); }
		public TerminalNode DIRECTIVE_CALL() { return getToken(JetTemplateParser.DIRECTIVE_CALL, 0); }
		public TerminalNode DIRECTIVE_MACRO() { return getToken(JetTemplateParser.DIRECTIVE_MACRO, 0); }
		public Directive_invalidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_invalid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitDirective_invalid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_invalidContext directive_invalid() throws RecognitionException {
		Directive_invalidContext _localctx = new Directive_invalidContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_directive_invalid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIRECTIVE_OPTIONS) | (1L << DIRECTIVE_DEFINE) | (1L << DIRECTIVE_SET) | (1L << DIRECTIVE_IF) | (1L << DIRECTIVE_ELSEIF) | (1L << DIRECTIVE_FOR) | (1L << DIRECTIVE_INCLUDE) | (1L << DIRECTIVE_TAG) | (1L << DIRECTIVE_CALL) | (1L << DIRECTIVE_MACRO))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expression_instanceofContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Expression_instanceofContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_instanceof(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_primaryContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_primaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_primary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_identifierContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Expression_identifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_identifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_ternary_operatorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_ternary_operatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_ternary_operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_functionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(JetTemplateParser.IDENTIFIER, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_functionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_function(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_field_staticContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JetTemplateParser.IDENTIFIER, 0); }
		public Expression_field_staticContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_field_static(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_methodContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JetTemplateParser.IDENTIFIER, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_methodContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_method(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_nullsafe_operatorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_nullsafe_operatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_nullsafe_operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_array_listContext extends ExpressionContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_array_listContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_array_list(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_hash_mapContext extends ExpressionContext {
		public List<Hash_map_entryContext> hash_map_entry() {
			return getRuleContexts(Hash_map_entryContext.class);
		}
		public Hash_map_entryContext hash_map_entry(int i) {
			return getRuleContext(Hash_map_entryContext.class,i);
		}
		public Expression_hash_mapContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_hash_map(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_unary_operatorContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_unary_operatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_unary_operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_new_arrayContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_new_arrayContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_new_array(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_fieldContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JetTemplateParser.IDENTIFIER, 0); }
		public Expression_fieldContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_field(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_index_getContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_index_getContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_index_get(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_method_staticContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JetTemplateParser.IDENTIFIER, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_method_staticContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_method_static(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_constantContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Expression_constantContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_constant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_new_objectContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_new_objectContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_new_object(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_binary_operatorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_binary_operatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_binary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				_localctx = new Expression_primaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(264);
				match(LPAREN);
				setState(265);
				expression(0);
				setState(266);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new Expression_constantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				constant();
				}
				break;
			case 3:
				{
				_localctx = new Expression_identifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				identifier();
				}
				break;
			case 4:
				{
				_localctx = new Expression_array_listContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				match(LBRACK);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LPAREN - 41)) | (1L << (LBRACK - 41)) | (1L << (LBRACE - 41)) | (1L << (NOT - 41)) | (1L << (PLUS - 41)) | (1L << (MINUS - 41)) | (1L << (BIT_NOT - 41)) | (1L << (NEW - 41)) | (1L << (TRUE - 41)) | (1L << (FALSE - 41)) | (1L << (NULL - 41)) | (1L << (IDENTIFIER - 41)) | (1L << (INTEGER - 41)) | (1L << (INTEGER_HEX - 41)) | (1L << (FLOATING_POINT - 41)) | (1L << (STRING_DOUBLE - 41)) | (1L << (STRING_SINGLE - 41)))) != 0)) {
					{
					setState(271);
					expression_list();
					}
				}

				setState(274);
				match(RBRACK);
				}
				break;
			case 5:
				{
				_localctx = new Expression_hash_mapContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275);
				match(LBRACE);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (IDENTIFIER - 82)) | (1L << (STRING_DOUBLE - 82)) | (1L << (STRING_SINGLE - 82)))) != 0)) {
					{
					setState(276);
					hash_map_entry();
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(277);
						match(COMMA);
						setState(278);
						hash_map_entry();
						}
						}
						setState(283);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(286);
				match(RBRACE);
				}
				break;
			case 6:
				{
				_localctx = new Expression_field_staticContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				type();
				setState(288);
				match(COLON2);
				setState(289);
				match(IDENTIFIER);
				}
				break;
			case 7:
				{
				_localctx = new Expression_method_staticContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				type();
				setState(292);
				match(COLON2);
				setState(293);
				match(IDENTIFIER);
				setState(294);
				match(LPAREN);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LPAREN - 41)) | (1L << (LBRACK - 41)) | (1L << (LBRACE - 41)) | (1L << (NOT - 41)) | (1L << (PLUS - 41)) | (1L << (MINUS - 41)) | (1L << (BIT_NOT - 41)) | (1L << (NEW - 41)) | (1L << (TRUE - 41)) | (1L << (FALSE - 41)) | (1L << (NULL - 41)) | (1L << (IDENTIFIER - 41)) | (1L << (INTEGER - 41)) | (1L << (INTEGER_HEX - 41)) | (1L << (FLOATING_POINT - 41)) | (1L << (STRING_DOUBLE - 41)) | (1L << (STRING_SINGLE - 41)))) != 0)) {
					{
					setState(295);
					expression_list();
					}
				}

				setState(298);
				match(RPAREN);
				}
				break;
			case 8:
				{
				_localctx = new Expression_functionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				match(IDENTIFIER);
				setState(301);
				match(LPAREN);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LPAREN - 41)) | (1L << (LBRACK - 41)) | (1L << (LBRACE - 41)) | (1L << (NOT - 41)) | (1L << (PLUS - 41)) | (1L << (MINUS - 41)) | (1L << (BIT_NOT - 41)) | (1L << (NEW - 41)) | (1L << (TRUE - 41)) | (1L << (FALSE - 41)) | (1L << (NULL - 41)) | (1L << (IDENTIFIER - 41)) | (1L << (INTEGER - 41)) | (1L << (INTEGER_HEX - 41)) | (1L << (FLOATING_POINT - 41)) | (1L << (STRING_DOUBLE - 41)) | (1L << (STRING_SINGLE - 41)))) != 0)) {
					{
					setState(302);
					expression_list();
					}
				}

				setState(305);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new Expression_unary_operatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(307);
				expression(18);
				}
				break;
			case 10:
				{
				_localctx = new Expression_unary_operatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(308);
				match(BIT_NOT);
				setState(309);
				expression(17);
				}
				break;
			case 11:
				{
				_localctx = new Expression_unary_operatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(310);
				match(NOT);
				setState(311);
				expression(16);
				}
				break;
			case 12:
				{
				_localctx = new Expression_new_objectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(312);
				match(NEW);
				setState(313);
				type();
				setState(314);
				match(LPAREN);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LPAREN - 41)) | (1L << (LBRACK - 41)) | (1L << (LBRACE - 41)) | (1L << (NOT - 41)) | (1L << (PLUS - 41)) | (1L << (MINUS - 41)) | (1L << (BIT_NOT - 41)) | (1L << (NEW - 41)) | (1L << (TRUE - 41)) | (1L << (FALSE - 41)) | (1L << (NULL - 41)) | (1L << (IDENTIFIER - 41)) | (1L << (INTEGER - 41)) | (1L << (INTEGER_HEX - 41)) | (1L << (FLOATING_POINT - 41)) | (1L << (STRING_DOUBLE - 41)) | (1L << (STRING_SINGLE - 41)))) != 0)) {
					{
					setState(315);
					expression_list();
					}
				}

				setState(318);
				match(RPAREN);
				}
				break;
			case 13:
				{
				_localctx = new Expression_new_arrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(320);
				match(NEW);
				setState(321);
				type();
				setState(326); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(322);
						match(LBRACK);
						setState(323);
						expression(0);
						setState(324);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(328); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(391);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new Expression_nullsafe_operatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(332);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(333);
						match(NULL_AS_DEFAULT);
						setState(334);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new Expression_binary_operatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(335);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(336);
						_la = _input.LA(1);
						if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (MUL - 67)) | (1L << (DIV - 67)) | (1L << (MOD - 67)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(337);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new Expression_binary_operatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(338);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(339);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(340);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new Expression_binary_operatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(341);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(342);
						_la = _input.LA(1);
						if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (BIT_SHL - 74)) | (1L << (BIT_SHR - 74)) | (1L << (BIT_USHR - 74)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(343);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new Expression_binary_operatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(344);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(345);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GE) | (1L << LE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(346);
						expression(10);
						}
						break;
					case 6:
						{
						_localctx = new Expression_binary_operatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(347);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(348);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTICALLY_EQUAL) | (1L << IDENTICALLY_EQUAL_NOT) | (1L << EQ) | (1L << NE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(349);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new Expression_binary_operatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(350);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(351);
						match(BIT_AND);
						setState(352);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new Expression_binary_operatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(353);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(354);
						match(BIT_XOR);
						setState(355);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new Expression_binary_operatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(356);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(357);
						match(BIT_OR);
						setState(358);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new Expression_binary_operatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(359);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(360);
						match(AND);
						setState(361);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new Expression_binary_operatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(362);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(363);
						match(OR);
						setState(364);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new Expression_ternary_operatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(365);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(366);
						match(QUESTION);
						setState(368);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LPAREN - 41)) | (1L << (LBRACK - 41)) | (1L << (LBRACE - 41)) | (1L << (NOT - 41)) | (1L << (PLUS - 41)) | (1L << (MINUS - 41)) | (1L << (BIT_NOT - 41)) | (1L << (NEW - 41)) | (1L << (TRUE - 41)) | (1L << (FALSE - 41)) | (1L << (NULL - 41)) | (1L << (IDENTIFIER - 41)) | (1L << (INTEGER - 41)) | (1L << (INTEGER_HEX - 41)) | (1L << (FLOATING_POINT - 41)) | (1L << (STRING_DOUBLE - 41)) | (1L << (STRING_SINGLE - 41)))) != 0)) {
							{
							setState(367);
							expression(0);
							}
						}

						setState(370);
						match(COLON);
						setState(371);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new Expression_fieldContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(372);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(373);
						match(DOT);
						setState(374);
						match(IDENTIFIER);
						}
						break;
					case 14:
						{
						_localctx = new Expression_methodContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(375);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(376);
						match(DOT);
						setState(377);
						match(IDENTIFIER);
						setState(378);
						match(LPAREN);
						setState(380);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LPAREN - 41)) | (1L << (LBRACK - 41)) | (1L << (LBRACE - 41)) | (1L << (NOT - 41)) | (1L << (PLUS - 41)) | (1L << (MINUS - 41)) | (1L << (BIT_NOT - 41)) | (1L << (NEW - 41)) | (1L << (TRUE - 41)) | (1L << (FALSE - 41)) | (1L << (NULL - 41)) | (1L << (IDENTIFIER - 41)) | (1L << (INTEGER - 41)) | (1L << (INTEGER_HEX - 41)) | (1L << (FLOATING_POINT - 41)) | (1L << (STRING_DOUBLE - 41)) | (1L << (STRING_SINGLE - 41)))) != 0)) {
							{
							setState(379);
							expression_list();
							}
						}

						setState(382);
						match(RPAREN);
						}
						break;
					case 15:
						{
						_localctx = new Expression_index_getContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(383);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(384);
						match(LBRACK);
						setState(385);
						expression(0);
						setState(386);
						match(RBRACK);
						}
						break;
					case 16:
						{
						_localctx = new Expression_instanceofContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(388);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(389);
						match(INSTANCEOF);
						setState(390);
						type();
						}
						break;
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JetTemplateParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode STRING_DOUBLE() { return getToken(JetTemplateParser.STRING_DOUBLE, 0); }
		public TerminalNode STRING_SINGLE() { return getToken(JetTemplateParser.STRING_SINGLE, 0); }
		public TerminalNode INTEGER() { return getToken(JetTemplateParser.INTEGER, 0); }
		public TerminalNode INTEGER_HEX() { return getToken(JetTemplateParser.INTEGER_HEX, 0); }
		public TerminalNode FLOATING_POINT() { return getToken(JetTemplateParser.FLOATING_POINT, 0); }
		public TerminalNode TRUE() { return getToken(JetTemplateParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JetTemplateParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(JetTemplateParser.NULL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (TRUE - 79)) | (1L << (FALSE - 79)) | (1L << (NULL - 79)) | (1L << (INTEGER - 79)) | (1L << (INTEGER_HEX - 79)) | (1L << (FLOATING_POINT - 79)) | (1L << (STRING_DOUBLE - 79)) | (1L << (STRING_SINGLE - 79)))) != 0)) ) {
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

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			expression(0);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(401);
				match(COMMA);
				setState(402);
				expression(0);
				}
				}
				setState(407);
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

	public static class Hash_map_entryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JetTemplateParser.IDENTIFIER, 0); }
		public TerminalNode STRING_DOUBLE() { return getToken(JetTemplateParser.STRING_DOUBLE, 0); }
		public TerminalNode STRING_SINGLE() { return getToken(JetTemplateParser.STRING_SINGLE, 0); }
		public Hash_map_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash_map_entry; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitHash_map_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hash_map_entryContext hash_map_entry() throws RecognitionException {
		Hash_map_entryContext _localctx = new Hash_map_entryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_hash_map_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (IDENTIFIER - 82)) | (1L << (STRING_DOUBLE - 82)) | (1L << (STRING_SINGLE - 82)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(409);
			match(COLON);
			setState(410);
			expression(0);
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

	public static class TypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JetTemplateParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JetTemplateParser.IDENTIFIER, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JetTemplateParserVisitor ) return ((JetTemplateParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(IDENTIFIER);
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(413);
					match(DOT);
					setState(414);
					match(IDENTIFIER);
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(420);
					match(LBRACK);
					setState(421);
					match(RBRACK);
					}
					} 
				}
				setState(426);
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
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 24);
		case 13:
			return precpred(_ctx, 23);
		case 14:
			return precpred(_ctx, 20);
		case 15:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Y\u01ae\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\3\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5V\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6f\n\6\3\7\3\7\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t{\n\t\f\t\16\t~\13\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\7\13\u0089\n\13\f\13\16\13\u008c\13\13\3\13\3"+
		"\13\3\f\5\f\u0091\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009d"+
		"\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a7\n\16\3\17\3\17\3"+
		"\17\3\20\3\20\5\20\u00ae\n\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b6"+
		"\n\20\3\20\3\20\3\21\3\21\5\21\u00bc\n\21\3\21\3\21\5\21\u00c0\n\21\3"+
		"\22\3\22\5\22\u00c4\n\22\3\22\3\22\5\22\u00c8\n\22\3\23\3\23\5\23\u00cc"+
		"\n\23\3\23\3\23\5\23\u00d0\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00d7\n"+
		"\24\3\25\3\25\3\25\3\25\7\25\u00dd\n\25\f\25\16\25\u00e0\13\25\3\25\3"+
		"\25\3\26\3\26\5\26\u00e6\n\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u00ee"+
		"\n\27\3\27\3\27\3\30\3\30\5\30\u00f4\n\30\3\30\3\30\3\30\3\30\3\31\5\31"+
		"\u00fb\n\31\3\31\3\31\3\31\5\31\u0100\n\31\3\31\7\31\u0103\n\31\f\31\16"+
		"\31\u0106\13\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0113\n\33\3\33\3\33\3\33\3\33\3\33\7\33\u011a\n\33\f\33\16\33\u011d"+
		"\13\33\5\33\u011f\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u012b\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u0132\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u013f\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u0149\n\33\r\33\16\33\u014a\5\33\u014d"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0173\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u017f\n\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u018a\n\33\f\33\16\33\u018d\13\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\36\7\36\u0196\n\36\f\36\16\36\u0199\13"+
		"\36\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u01a2\n \f \16 \u01a5\13 \3 \3 \7"+
		" \u01a9\n \f \16 \u01ac\13 \3 \2\3\64!\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>\2\13\4\2\5\b))\3\2\37(\3\2CD\3\2EG\3\2"+
		"LN\3\2<?\3\28;\4\2QSUY\4\2TTXY\2\u01df\2@\3\2\2\2\4H\3\2\2\2\6K\3\2\2"+
		"\2\bU\3\2\2\2\ne\3\2\2\2\fg\3\2\2\2\16r\3\2\2\2\20v\3\2\2\2\22\u0081\3"+
		"\2\2\2\24\u0084\3\2\2\2\26\u0090\3\2\2\2\30\u0096\3\2\2\2\32\u00a0\3\2"+
		"\2\2\34\u00a8\3\2\2\2\36\u00ab\3\2\2\2 \u00bf\3\2\2\2\"\u00c7\3\2\2\2"+
		"$\u00cf\3\2\2\2&\u00d6\3\2\2\2(\u00d8\3\2\2\2*\u00e3\3\2\2\2,\u00eb\3"+
		"\2\2\2.\u00f1\3\2\2\2\60\u00fa\3\2\2\2\62\u0107\3\2\2\2\64\u014c\3\2\2"+
		"\2\66\u018e\3\2\2\28\u0190\3\2\2\2:\u0192\3\2\2\2<\u019a\3\2\2\2>\u019e"+
		"\3\2\2\2@A\5\4\3\2AB\7\2\2\3B\3\3\2\2\2CG\5\6\4\2DG\5\b\5\2EG\5\n\6\2"+
		"FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\5\3\2\2"+
		"\2JH\3\2\2\2KL\t\2\2\2L\7\3\2\2\2MN\7\t\2\2NO\5\64\33\2OP\7\60\2\2PV\3"+
		"\2\2\2QR\7\n\2\2RS\5\64\33\2ST\7\60\2\2TV\3\2\2\2UM\3\2\2\2UQ\3\2\2\2"+
		"V\t\3\2\2\2Wf\5\f\7\2Xf\5\20\t\2Yf\5\24\13\2Zf\5\30\r\2[f\5\36\20\2\\"+
		"f\5 \21\2]f\5\"\22\2^f\5$\23\2_f\5(\25\2`f\5&\24\2af\5*\26\2bf\5,\27\2"+
		"cf\5.\30\2df\5\62\32\2eW\3\2\2\2eX\3\2\2\2eY\3\2\2\2eZ\3\2\2\2e[\3\2\2"+
		"\2e\\\3\2\2\2e]\3\2\2\2e^\3\2\2\2e_\3\2\2\2e`\3\2\2\2ea\3\2\2\2eb\3\2"+
		"\2\2ec\3\2\2\2ed\3\2\2\2f\13\3\2\2\2gh\7\13\2\2hm\5\16\b\2ij\7\61\2\2"+
		"jl\5\16\b\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2"+
		"\2pq\7,\2\2q\r\3\2\2\2rs\7T\2\2st\7\66\2\2tu\58\35\2u\17\3\2\2\2vw\7\f"+
		"\2\2w|\5\22\n\2xy\7\61\2\2y{\5\22\n\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}"+
		"\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7,\2\2\u0080\21\3\2\2\2\u0081"+
		"\u0082\5> \2\u0082\u0083\7T\2\2\u0083\23\3\2\2\2\u0084\u0085\7\r\2\2\u0085"+
		"\u008a\5\26\f\2\u0086\u0087\7\61\2\2\u0087\u0089\5\26\f\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7,\2\2\u008e\25\3\2\2\2"+
		"\u008f\u0091\5> \2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\7T\2\2\u0093\u0094\7\66\2\2\u0094\u0095\5\64\33\2"+
		"\u0095\27\3\2\2\2\u0096\u0097\7\16\2\2\u0097\u0098\5\64\33\2\u0098\u0099"+
		"\7,\2\2\u0099\u009c\5\4\3\2\u009a\u009d\5\32\16\2\u009b\u009d\5\34\17"+
		"\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009f\7\32\2\2\u009f\31\3\2\2\2\u00a0\u00a1\7\17\2\2\u00a1"+
		"\u00a2\5\64\33\2\u00a2\u00a3\7,\2\2\u00a3\u00a6\5\4\3\2\u00a4\u00a7\5"+
		"\32\16\2\u00a5\u00a7\5\34\17\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\33\3\2\2\2\u00a8\u00a9\7\31\2\2\u00a9\u00aa"+
		"\5\4\3\2\u00aa\35\3\2\2\2\u00ab\u00ad\7\20\2\2\u00ac\u00ae\5> \2\u00ad"+
		"\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7T"+
		"\2\2\u00b0\u00b1\7\63\2\2\u00b1\u00b2\5\64\33\2\u00b2\u00b3\7,\2\2\u00b3"+
		"\u00b5\5\4\3\2\u00b4\u00b6\5\34\17\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\32\2\2\u00b8\37\3\2\2\2\u00b9"+
		"\u00bb\7\21\2\2\u00ba\u00bc\5\64\33\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c0\7,\2\2\u00be\u00c0\7\33\2\2\u00bf"+
		"\u00b9\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0!\3\2\2\2\u00c1\u00c3\7\22\2\2"+
		"\u00c2\u00c4\5\64\33\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c8\7,\2\2\u00c6\u00c8\7\34\2\2\u00c7\u00c1\3\2\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8#\3\2\2\2\u00c9\u00cb\7\23\2\2\u00ca\u00cc\5\64\33"+
		"\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d0"+
		"\7,\2\2\u00ce\u00d0\7\35\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"%\3\2\2\2\u00d1\u00d2\7\24\2\2\u00d2\u00d3\5\64\33\2\u00d3\u00d4\7,\2"+
		"\2\u00d4\u00d7\3\2\2\2\u00d5\u00d7\7\36\2\2\u00d6\u00d1\3\2\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\'\3\2\2\2\u00d8\u00d9\7\25\2\2\u00d9\u00de\5\64\33"+
		"\2\u00da\u00db\7\61\2\2\u00db\u00dd\5\64\33\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7,\2\2\u00e2)\3\2\2\2\u00e3\u00e5"+
		"\7\26\2\2\u00e4\u00e6\5:\36\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7,\2\2\u00e8\u00e9\5\4\3\2\u00e9\u00ea"+
		"\7\32\2\2\u00ea+\3\2\2\2\u00eb\u00ed\7\27\2\2\u00ec\u00ee\5:\36\2\u00ed"+
		"\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7,"+
		"\2\2\u00f0-\3\2\2\2\u00f1\u00f3\7\30\2\2\u00f2\u00f4\5\60\31\2\u00f3\u00f2"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7,\2\2\u00f6"+
		"\u00f7\5\4\3\2\u00f7\u00f8\7\32\2\2\u00f8/\3\2\2\2\u00f9\u00fb\5> \2\u00fa"+
		"\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0104\7T"+
		"\2\2\u00fd\u00ff\7\61\2\2\u00fe\u0100\5> \2\u00ff\u00fe\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\7T\2\2\u0102\u00fd\3\2"+
		"\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\61\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\t\3\2\2\u0108\63\3\2\2\2\u0109"+
		"\u010a\b\33\1\2\u010a\u010b\7+\2\2\u010b\u010c\5\64\33\2\u010c\u010d\7"+
		",\2\2\u010d\u014d\3\2\2\2\u010e\u014d\58\35\2\u010f\u014d\5\66\34\2\u0110"+
		"\u0112\7-\2\2\u0111\u0113\5:\36\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u014d\7.\2\2\u0115\u011e\7/\2\2\u0116\u011b"+
		"\5<\37\2\u0117\u0118\7\61\2\2\u0118\u011a\5<\37\2\u0119\u0117\3\2\2\2"+
		"\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011f"+
		"\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0116\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u014d\7\60\2\2\u0121\u0122\5> \2\u0122\u0123\7\64"+
		"\2\2\u0123\u0124\7T\2\2\u0124\u014d\3\2\2\2\u0125\u0126\5> \2\u0126\u0127"+
		"\7\64\2\2\u0127\u0128\7T\2\2\u0128\u012a\7+\2\2\u0129\u012b\5:\36\2\u012a"+
		"\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7,"+
		"\2\2\u012d\u014d\3\2\2\2\u012e\u012f\7T\2\2\u012f\u0131\7+\2\2\u0130\u0132"+
		"\5:\36\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u014d\7,\2\2\u0134\u0135\t\4\2\2\u0135\u014d\5\64\33\24\u0136\u0137\7"+
		"J\2\2\u0137\u014d\5\64\33\23\u0138\u0139\7B\2\2\u0139\u014d\5\64\33\22"+
		"\u013a\u013b\7P\2\2\u013b\u013c\5> \2\u013c\u013e\7+\2\2\u013d\u013f\5"+
		":\36\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0141\7,\2\2\u0141\u014d\3\2\2\2\u0142\u0143\7P\2\2\u0143\u0148\5> \2"+
		"\u0144\u0145\7-\2\2\u0145\u0146\5\64\33\2\u0146\u0147\7.\2\2\u0147\u0149"+
		"\3\2\2\2\u0148\u0144\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u0109\3\2\2\2\u014c\u010e\3\2"+
		"\2\2\u014c\u010f\3\2\2\2\u014c\u0110\3\2\2\2\u014c\u0115\3\2\2\2\u014c"+
		"\u0121\3\2\2\2\u014c\u0125\3\2\2\2\u014c\u012e\3\2\2\2\u014c\u0134\3\2"+
		"\2\2\u014c\u0136\3\2\2\2\u014c\u0138\3\2\2\2\u014c\u013a\3\2\2\2\u014c"+
		"\u0142\3\2\2\2\u014d\u018b\3\2\2\2\u014e\u014f\f\17\2\2\u014f\u0150\7"+
		"\67\2\2\u0150\u018a\5\64\33\20\u0151\u0152\f\16\2\2\u0152\u0153\t\5\2"+
		"\2\u0153\u018a\5\64\33\17\u0154\u0155\f\r\2\2\u0155\u0156\t\4\2\2\u0156"+
		"\u018a\5\64\33\16\u0157\u0158\f\f\2\2\u0158\u0159\t\6\2\2\u0159\u018a"+
		"\5\64\33\r\u015a\u015b\f\13\2\2\u015b\u015c\t\7\2\2\u015c\u018a\5\64\33"+
		"\f\u015d\u015e\f\t\2\2\u015e\u015f\t\b\2\2\u015f\u018a\5\64\33\n\u0160"+
		"\u0161\f\b\2\2\u0161\u0162\7H\2\2\u0162\u018a\5\64\33\t\u0163\u0164\f"+
		"\7\2\2\u0164\u0165\7K\2\2\u0165\u018a\5\64\33\7\u0166\u0167\f\6\2\2\u0167"+
		"\u0168\7I\2\2\u0168\u018a\5\64\33\7\u0169\u016a\f\5\2\2\u016a\u016b\7"+
		"@\2\2\u016b\u018a\5\64\33\6\u016c\u016d\f\4\2\2\u016d\u016e\7A\2\2\u016e"+
		"\u018a\5\64\33\5\u016f\u0170\f\3\2\2\u0170\u0172\7\62\2\2\u0171\u0173"+
		"\5\64\33\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2"+
		"\u0174\u0175\7\63\2\2\u0175\u018a\5\64\33\3\u0176\u0177\f\32\2\2\u0177"+
		"\u0178\7\65\2\2\u0178\u018a\7T\2\2\u0179\u017a\f\31\2\2\u017a\u017b\7"+
		"\65\2\2\u017b\u017c\7T\2\2\u017c\u017e\7+\2\2\u017d\u017f\5:\36\2\u017e"+
		"\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u018a\7,"+
		"\2\2\u0181\u0182\f\26\2\2\u0182\u0183\7-\2\2\u0183\u0184\5\64\33\2\u0184"+
		"\u0185\7.\2\2\u0185\u018a\3\2\2\2\u0186\u0187\f\n\2\2\u0187\u0188\7O\2"+
		"\2\u0188\u018a\5> \2\u0189\u014e\3\2\2\2\u0189\u0151\3\2\2\2\u0189\u0154"+
		"\3\2\2\2\u0189\u0157\3\2\2\2\u0189\u015a\3\2\2\2\u0189\u015d\3\2\2\2\u0189"+
		"\u0160\3\2\2\2\u0189\u0163\3\2\2\2\u0189\u0166\3\2\2\2\u0189\u0169\3\2"+
		"\2\2\u0189\u016c\3\2\2\2\u0189\u016f\3\2\2\2\u0189\u0176\3\2\2\2\u0189"+
		"\u0179\3\2\2\2\u0189\u0181\3\2\2\2\u0189\u0186\3\2\2\2\u018a\u018d\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\65\3\2\2\2\u018d\u018b"+
		"\3\2\2\2\u018e\u018f\7T\2\2\u018f\67\3\2\2\2\u0190\u0191\t\t\2\2\u0191"+
		"9\3\2\2\2\u0192\u0197\5\64\33\2\u0193\u0194\7\61\2\2\u0194\u0196\5\64"+
		"\33\2\u0195\u0193\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198;\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\t\n\2\2"+
		"\u019b\u019c\7\63\2\2\u019c\u019d\5\64\33\2\u019d=\3\2\2\2\u019e\u01a3"+
		"\7T\2\2\u019f\u01a0\7\65\2\2\u01a0\u01a2\7T\2\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01aa\3\2"+
		"\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\7-\2\2\u01a7\u01a9\7.\2\2\u01a8\u01a6"+
		"\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"?\3\2\2\2\u01ac\u01aa\3\2\2\2+FHUem|\u008a\u0090\u009c\u00a6\u00ad\u00b5"+
		"\u00bb\u00bf\u00c3\u00c7\u00cb\u00cf\u00d6\u00de\u00e5\u00ed\u00f3\u00fa"+
		"\u00ff\u0104\u0112\u011b\u011e\u012a\u0131\u013e\u014a\u014c\u0172\u017e"+
		"\u0189\u018b\u0197\u01a3\u01aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}