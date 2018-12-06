// Generated from BusinessRuleParser.g4 by ANTLR 4.7.1

package org.joo.virgo.antlr.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BusinessRuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SET=1, IF=2, THEN=3, ELIF=4, ELSE=5, SEMICOLON=6, WS=7, AND=8, OR=9, NOT=10, 
		IS_EQUALS=11, IS_EQUALS_NOT=12, IS_EMPTY=13, IS_NOT_EMPTY=14, CONTAINS=15, 
		IN=16, MATCHES=17, TRUE=18, FALSE=19, UNDEFINED=20, NULL=21, ANY=22, NONE=23, 
		ALL=24, OF=25, SATISFIES=26, GREATER_THAN=27, GREATER_THAN_EQUALS=28, 
		LESS_THAN=29, LESS_THAN_EQUALS=30, EQUALS=31, NOT_EQUALS=32, DBL_EQUALS=33, 
		PLUS=34, MINUS=35, TIMES=36, DIVIDE=37, MOD=38, POW=39, QUESTION=40, COLON=41, 
		LPAREN=42, RPAREN=43, LBRACE=44, RBRACE=45, COMMA=46, STRING=47, INTEGER=48, 
		DOUBLE=49, INDEX=50, VARIABLE=51;
	public static final int
		RULE_businessRule = 0, RULE_phrase = 1, RULE_actions = 2, RULE_predicate = 3, 
		RULE_expression = 4, RULE_term = 5, RULE_factor = 6, RULE_list = 7;
	public static final String[] ruleNames = {
		"businessRule", "phrase", "actions", "predicate", "expression", "term", 
		"factor", "list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "';'", null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'>'", "'>='", "'<'", "'<='", "'='", "'!='", "'=='", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'?'", "':'", "'('", "')'", 
		"'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SET", "IF", "THEN", "ELIF", "ELSE", "SEMICOLON", "WS", "AND", "OR", 
		"NOT", "IS_EQUALS", "IS_EQUALS_NOT", "IS_EMPTY", "IS_NOT_EMPTY", "CONTAINS", 
		"IN", "MATCHES", "TRUE", "FALSE", "UNDEFINED", "NULL", "ANY", "NONE", 
		"ALL", "OF", "SATISFIES", "GREATER_THAN", "GREATER_THAN_EQUALS", "LESS_THAN", 
		"LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", "DBL_EQUALS", "PLUS", "MINUS", 
		"TIMES", "DIVIDE", "MOD", "POW", "QUESTION", "COLON", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "COMMA", "STRING", "INTEGER", "DOUBLE", "INDEX", "VARIABLE"
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
	public String getGrammarFileName() { return "BusinessRuleParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BusinessRuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BusinessRuleContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public BusinessRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_businessRule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitBusinessRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BusinessRuleContext businessRule() throws RecognitionException {
		BusinessRuleContext _localctx = new BusinessRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_businessRule);
		try {
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				phrase(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				actions(0);
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

	public static class PhraseContext extends ParserRuleContext {
		public PhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrase; }
	 
		public PhraseContext() { }
		public void copyFrom(PhraseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseCtxContext extends PhraseContext {
		public PhraseContext left;
		public PhraseContext right;
		public ActionsContext impositions;
		public TerminalNode ELSE() { return getToken(BusinessRuleParser.ELSE, 0); }
		public List<PhraseContext> phrase() {
			return getRuleContexts(PhraseContext.class);
		}
		public PhraseContext phrase(int i) {
			return getRuleContext(PhraseContext.class,i);
		}
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public ElseCtxContext(PhraseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitElseCtx(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfCtxContext extends PhraseContext {
		public ExpressionContext condition;
		public ActionsContext impositions;
		public TerminalNode IF() { return getToken(BusinessRuleParser.IF, 0); }
		public TerminalNode THEN() { return getToken(BusinessRuleParser.THEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public IfCtxContext(PhraseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitIfCtx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhraseContext phrase() throws RecognitionException {
		return phrase(0);
	}

	private PhraseContext phrase(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PhraseContext _localctx = new PhraseContext(_ctx, _parentState);
		PhraseContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_phrase, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IfCtxContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(21);
			match(IF);
			setState(22);
			((IfCtxContext)_localctx).condition = expression(0);
			setState(23);
			match(THEN);
			setState(24);
			((IfCtxContext)_localctx).impositions = actions(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(32);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ElseCtxContext(new PhraseContext(_parentctx, _parentState));
						((ElseCtxContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_phrase);
						setState(26);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(27);
						match(ELSE);
						setState(28);
						((ElseCtxContext)_localctx).right = phrase(3);
						}
						break;
					case 2:
						{
						_localctx = new ElseCtxContext(new PhraseContext(_parentctx, _parentState));
						((ElseCtxContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_phrase);
						setState(29);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(30);
						match(ELSE);
						setState(31);
						((ElseCtxContext)_localctx).impositions = actions(0);
						}
						break;
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class ActionsContext extends ParserRuleContext {
		public ActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actions; }
	 
		public ActionsContext() { }
		public void copyFrom(ActionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignCtxContext extends ActionsContext {
		public Token variable;
		public ExpressionContext value;
		public TerminalNode SET() { return getToken(BusinessRuleParser.SET, 0); }
		public TerminalNode EQUALS() { return getToken(BusinessRuleParser.EQUALS, 0); }
		public TerminalNode VARIABLE() { return getToken(BusinessRuleParser.VARIABLE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignCtxContext(ActionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitAssignCtx(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NestedActionCtxContext extends ActionsContext {
		public ActionsContext nested;
		public TerminalNode LBRACE() { return getToken(BusinessRuleParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BusinessRuleParser.RBRACE, 0); }
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public NestedActionCtxContext(ActionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitNestedActionCtx(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NestedPhraseCtxContext extends ActionsContext {
		public PhraseContext nested;
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public NestedPhraseCtxContext(ActionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitNestedPhraseCtx(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiActionsCtxContext extends ActionsContext {
		public ActionsContext left;
		public ActionsContext right;
		public TerminalNode SEMICOLON() { return getToken(BusinessRuleParser.SEMICOLON, 0); }
		public List<ActionsContext> actions() {
			return getRuleContexts(ActionsContext.class);
		}
		public ActionsContext actions(int i) {
			return getRuleContext(ActionsContext.class,i);
		}
		public MultiActionsCtxContext(ActionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitMultiActionsCtx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionsContext actions() throws RecognitionException {
		return actions(0);
	}

	private ActionsContext actions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ActionsContext _localctx = new ActionsContext(_ctx, _parentState);
		ActionsContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_actions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				_localctx = new AssignCtxContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(38);
				match(SET);
				setState(39);
				((AssignCtxContext)_localctx).variable = match(VARIABLE);
				setState(40);
				match(EQUALS);
				setState(41);
				((AssignCtxContext)_localctx).value = expression(0);
				}
				break;
			case IF:
				{
				_localctx = new NestedPhraseCtxContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				((NestedPhraseCtxContext)_localctx).nested = phrase(0);
				}
				break;
			case LBRACE:
				{
				_localctx = new NestedActionCtxContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(LBRACE);
				setState(44);
				((NestedActionCtxContext)_localctx).nested = actions(0);
				setState(45);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(54);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MultiActionsCtxContext(new ActionsContext(_parentctx, _parentState));
						((MultiActionsCtxContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_actions);
						setState(49);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(50);
						match(SEMICOLON);
						setState(51);
						((MultiActionsCtxContext)_localctx).right = actions(5);
						}
						break;
					case 2:
						{
						_localctx = new MultiActionsCtxContext(new ActionsContext(_parentctx, _parentState));
						((MultiActionsCtxContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_actions);
						setState(52);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(53);
						match(SEMICOLON);
						}
						break;
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class PredicateContext extends ParserRuleContext {
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionExprContext extends PredicateContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionExprContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitExpressionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_predicate);
		try {
			_localctx = new ExpressionExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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
	public static class NotExprContext extends ExpressionContext {
		public ExpressionContext inner;
		public TerminalNode NOT() { return getToken(BusinessRuleParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermExprContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitTermExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListMatchingExprContext extends ExpressionContext {
		public Token op;
		public Token indexName;
		public Token listName;
		public ExpressionContext condition;
		public TerminalNode IN() { return getToken(BusinessRuleParser.IN, 0); }
		public TerminalNode SATISFIES() { return getToken(BusinessRuleParser.SATISFIES, 0); }
		public TerminalNode ANY() { return getToken(BusinessRuleParser.ANY, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(BusinessRuleParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(BusinessRuleParser.VARIABLE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NONE() { return getToken(BusinessRuleParser.NONE, 0); }
		public TerminalNode ALL() { return getToken(BusinessRuleParser.ALL, 0); }
		public ListMatchingExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitListMatchingExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode OR() { return getToken(BusinessRuleParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExprContext extends ExpressionContext {
		public ExpressionContext main;
		public FactorContext left;
		public FactorContext right;
		public TerminalNode QUESTION() { return getToken(BusinessRuleParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(BusinessRuleParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public ConditionalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitConditionalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode AND() { return getToken(BusinessRuleParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitAndExpr(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(62);
				match(NOT);
				setState(63);
				((NotExprContext)_localctx).inner = expression(8);
				}
				break;
			case TRUE:
			case FALSE:
			case UNDEFINED:
			case NULL:
			case LPAREN:
			case LBRACE:
			case STRING:
			case INTEGER:
			case DOUBLE:
			case VARIABLE:
				{
				_localctx = new TermExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				term();
				}
				break;
			case ANY:
				{
				_localctx = new ListMatchingExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				((ListMatchingExprContext)_localctx).op = match(ANY);
				setState(66);
				((ListMatchingExprContext)_localctx).indexName = match(VARIABLE);
				setState(67);
				match(IN);
				setState(68);
				((ListMatchingExprContext)_localctx).listName = match(VARIABLE);
				setState(69);
				match(SATISFIES);
				setState(70);
				((ListMatchingExprContext)_localctx).condition = expression(3);
				}
				break;
			case NONE:
				{
				_localctx = new ListMatchingExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				((ListMatchingExprContext)_localctx).op = match(NONE);
				setState(72);
				((ListMatchingExprContext)_localctx).indexName = match(VARIABLE);
				setState(73);
				match(IN);
				setState(74);
				((ListMatchingExprContext)_localctx).listName = match(VARIABLE);
				setState(75);
				match(SATISFIES);
				setState(76);
				((ListMatchingExprContext)_localctx).condition = expression(2);
				}
				break;
			case ALL:
				{
				_localctx = new ListMatchingExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				((ListMatchingExprContext)_localctx).op = match(ALL);
				setState(78);
				((ListMatchingExprContext)_localctx).indexName = match(VARIABLE);
				setState(79);
				match(IN);
				setState(80);
				((ListMatchingExprContext)_localctx).listName = match(VARIABLE);
				setState(81);
				match(SATISFIES);
				setState(82);
				((ListMatchingExprContext)_localctx).condition = expression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						((AndExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(85);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(86);
						match(AND);
						setState(87);
						((AndExprContext)_localctx).right = expression(8);
						}
						break;
					case 2:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						((OrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(89);
						match(OR);
						setState(90);
						((OrExprContext)_localctx).right = expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ConditionalExprContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExprContext)_localctx).main = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(91);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(92);
						match(QUESTION);
						setState(93);
						((ConditionalExprContext)_localctx).left = factor(0);
						setState(94);
						match(COLON);
						setState(95);
						((ConditionalExprContext)_localctx).right = factor(0);
						}
						break;
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyExprContext extends TermContext {
		public FactorContext left;
		public Token op;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode IS_EMPTY() { return getToken(BusinessRuleParser.IS_EMPTY, 0); }
		public TerminalNode IS_NOT_EMPTY() { return getToken(BusinessRuleParser.IS_NOT_EMPTY, 0); }
		public EmptyExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitEmptyExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InExprContext extends TermContext {
		public FactorContext left;
		public Token op;
		public FactorContext right;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode IN() { return getToken(BusinessRuleParser.IN, 0); }
		public InExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitInExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualExprContext extends TermContext {
		public FactorContext left;
		public Token op;
		public FactorContext right;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode NOT_EQUALS() { return getToken(BusinessRuleParser.NOT_EQUALS, 0); }
		public TerminalNode IS_EQUALS_NOT() { return getToken(BusinessRuleParser.IS_EQUALS_NOT, 0); }
		public NotEqualExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitNotEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatchesExprContext extends TermContext {
		public FactorContext left;
		public Token op;
		public FactorContext right;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode MATCHES() { return getToken(BusinessRuleParser.MATCHES, 0); }
		public MatchesExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitMatchesExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainsExprContext extends TermContext {
		public FactorContext left;
		public Token op;
		public FactorContext right;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode CONTAINS() { return getToken(BusinessRuleParser.CONTAINS, 0); }
		public ContainsExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitContainsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorExprContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitFactorExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareExprContext extends TermContext {
		public FactorContext left;
		public Token op;
		public FactorContext right;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(BusinessRuleParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_EQUALS() { return getToken(BusinessRuleParser.GREATER_THAN_EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(BusinessRuleParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_EQUALS() { return getToken(BusinessRuleParser.LESS_THAN_EQUALS, 0); }
		public CompareExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualExprContext extends TermContext {
		public FactorContext left;
		public Token op;
		public FactorContext right;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(BusinessRuleParser.EQUALS, 0); }
		public TerminalNode DBL_EQUALS() { return getToken(BusinessRuleParser.DBL_EQUALS, 0); }
		public TerminalNode IS_EQUALS() { return getToken(BusinessRuleParser.IS_EQUALS, 0); }
		public EqualExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_term);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				((CompareExprContext)_localctx).left = factor(0);
				setState(103);
				((CompareExprContext)_localctx).op = match(GREATER_THAN);
				setState(104);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 2:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				((CompareExprContext)_localctx).left = factor(0);
				setState(107);
				((CompareExprContext)_localctx).op = match(GREATER_THAN_EQUALS);
				setState(108);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 3:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				((CompareExprContext)_localctx).left = factor(0);
				setState(111);
				((CompareExprContext)_localctx).op = match(LESS_THAN);
				setState(112);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 4:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				((CompareExprContext)_localctx).left = factor(0);
				setState(115);
				((CompareExprContext)_localctx).op = match(LESS_THAN_EQUALS);
				setState(116);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 5:
				_localctx = new EqualExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				((EqualExprContext)_localctx).left = factor(0);
				setState(119);
				((EqualExprContext)_localctx).op = match(EQUALS);
				setState(120);
				((EqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 6:
				_localctx = new EqualExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				((EqualExprContext)_localctx).left = factor(0);
				setState(123);
				((EqualExprContext)_localctx).op = match(DBL_EQUALS);
				setState(124);
				((EqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 7:
				_localctx = new NotEqualExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				((NotEqualExprContext)_localctx).left = factor(0);
				setState(127);
				((NotEqualExprContext)_localctx).op = match(NOT_EQUALS);
				setState(128);
				((NotEqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 8:
				_localctx = new NotEqualExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(130);
				((NotEqualExprContext)_localctx).left = factor(0);
				setState(131);
				((NotEqualExprContext)_localctx).op = match(IS_EQUALS_NOT);
				setState(132);
				((NotEqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 9:
				_localctx = new EqualExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(134);
				((EqualExprContext)_localctx).left = factor(0);
				setState(135);
				((EqualExprContext)_localctx).op = match(IS_EQUALS);
				setState(136);
				((EqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 10:
				_localctx = new EmptyExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(138);
				((EmptyExprContext)_localctx).left = factor(0);
				setState(139);
				((EmptyExprContext)_localctx).op = match(IS_EMPTY);
				}
				break;
			case 11:
				_localctx = new EmptyExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(141);
				((EmptyExprContext)_localctx).left = factor(0);
				setState(142);
				((EmptyExprContext)_localctx).op = match(IS_NOT_EMPTY);
				}
				break;
			case 12:
				_localctx = new ContainsExprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(144);
				((ContainsExprContext)_localctx).left = factor(0);
				setState(145);
				((ContainsExprContext)_localctx).op = match(CONTAINS);
				setState(146);
				((ContainsExprContext)_localctx).right = factor(0);
				}
				break;
			case 13:
				_localctx = new MatchesExprContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(148);
				((MatchesExprContext)_localctx).left = factor(0);
				setState(149);
				((MatchesExprContext)_localctx).op = match(MATCHES);
				setState(150);
				((MatchesExprContext)_localctx).right = factor(0);
				}
				break;
			case 14:
				_localctx = new FactorExprContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(152);
				factor(0);
				}
				break;
			case 15:
				_localctx = new InExprContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(153);
				((InExprContext)_localctx).left = factor(0);
				setState(154);
				((InExprContext)_localctx).op = match(IN);
				setState(155);
				((InExprContext)_localctx).right = factor(0);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringExprContext extends FactorContext {
		public TerminalNode STRING() { return getToken(BusinessRuleParser.STRING, 0); }
		public StringExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableExprContext extends FactorContext {
		public TerminalNode VARIABLE() { return getToken(BusinessRuleParser.VARIABLE, 0); }
		public VariableExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitVariableExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullExprContext extends FactorContext {
		public TerminalNode UNDEFINED() { return getToken(BusinessRuleParser.UNDEFINED, 0); }
		public TerminalNode NULL() { return getToken(BusinessRuleParser.NULL, 0); }
		public NullExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitNullExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathExprContext extends FactorContext {
		public FactorContext left;
		public Token op;
		public FactorContext right;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode POW() { return getToken(BusinessRuleParser.POW, 0); }
		public TerminalNode TIMES() { return getToken(BusinessRuleParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(BusinessRuleParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(BusinessRuleParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BusinessRuleParser.MINUS, 0); }
		public TerminalNode MOD() { return getToken(BusinessRuleParser.MOD, 0); }
		public MathExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitMathExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WrapListExprContext extends FactorContext {
		public ListContext item;
		public TerminalNode LBRACE() { return getToken(BusinessRuleParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BusinessRuleParser.RBRACE, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public WrapListExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitWrapListExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExprContext extends FactorContext {
		public TerminalNode DOUBLE() { return getToken(BusinessRuleParser.DOUBLE, 0); }
		public TerminalNode INTEGER() { return getToken(BusinessRuleParser.INTEGER, 0); }
		public NumberExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanExprContext extends FactorContext {
		public TerminalNode TRUE() { return getToken(BusinessRuleParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BusinessRuleParser.FALSE, 0); }
		public BooleanExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends FactorContext {
		public TerminalNode LPAREN() { return getToken(BusinessRuleParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BusinessRuleParser.RPAREN, 0); }
		public ParenExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionExprContext extends FactorContext {
		public Token name;
		public ListContext inner;
		public TerminalNode LPAREN() { return getToken(BusinessRuleParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BusinessRuleParser.RPAREN, 0); }
		public TerminalNode VARIABLE() { return getToken(BusinessRuleParser.VARIABLE, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public FunctionExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		return factor(0);
	}

	private FactorContext factor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FactorContext _localctx = new FactorContext(_ctx, _parentState);
		FactorContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(160);
				match(DOUBLE);
				}
				break;
			case 2:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(INTEGER);
				}
				break;
			case 3:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(TRUE);
				}
				break;
			case 5:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(FALSE);
				}
				break;
			case 6:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(UNDEFINED);
				}
				break;
			case 7:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(NULL);
				}
				break;
			case 8:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(VARIABLE);
				}
				break;
			case 9:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(LPAREN);
				setState(169);
				expression(0);
				setState(170);
				match(RPAREN);
				}
				break;
			case 10:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				((FunctionExprContext)_localctx).name = match(VARIABLE);
				setState(173);
				match(LPAREN);
				setState(174);
				((FunctionExprContext)_localctx).inner = list(0);
				setState(175);
				match(RPAREN);
				}
				break;
			case 11:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				((FunctionExprContext)_localctx).name = match(VARIABLE);
				setState(178);
				match(LPAREN);
				setState(179);
				match(RPAREN);
				}
				break;
			case 12:
				{
				_localctx = new WrapListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(LBRACE);
				setState(181);
				((WrapListExprContext)_localctx).item = list(0);
				setState(182);
				match(RBRACE);
				}
				break;
			case 13:
				{
				_localctx = new WrapListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(LBRACE);
				setState(185);
				match(RBRACE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(188);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(189);
						((MathExprContext)_localctx).op = match(POW);
						setState(190);
						((MathExprContext)_localctx).right = factor(9);
						}
						break;
					case 2:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(191);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(192);
						((MathExprContext)_localctx).op = match(TIMES);
						setState(193);
						((MathExprContext)_localctx).right = factor(8);
						}
						break;
					case 3:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(194);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(195);
						((MathExprContext)_localctx).op = match(DIVIDE);
						setState(196);
						((MathExprContext)_localctx).right = factor(7);
						}
						break;
					case 4:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(197);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(198);
						((MathExprContext)_localctx).op = match(PLUS);
						setState(199);
						((MathExprContext)_localctx).right = factor(6);
						}
						break;
					case 5:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(200);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(201);
						((MathExprContext)_localctx).op = match(MINUS);
						setState(202);
						((MathExprContext)_localctx).right = factor(5);
						}
						break;
					case 6:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(203);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(204);
						((MathExprContext)_localctx).op = match(MOD);
						setState(205);
						((MathExprContext)_localctx).right = factor(4);
						}
						break;
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ListContext extends ParserRuleContext {
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	 
		public ListContext() { }
		public void copyFrom(ListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListFactorExprContext extends ListContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ListFactorExprContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitListFactorExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListCommaExprContext extends ListContext {
		public ListContext left;
		public ListContext right;
		public TerminalNode COMMA() { return getToken(BusinessRuleParser.COMMA, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public ListCommaExprContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BusinessRuleParserVisitor ) return ((BusinessRuleParserVisitor<? extends T>)visitor).visitListCommaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		return list(0);
	}

	private ListContext list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListContext _localctx = new ListContext(_ctx, _parentState);
		ListContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ListFactorExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(212);
			factor(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListCommaExprContext(new ListContext(_parentctx, _parentState));
					((ListCommaExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_list);
					setState(214);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(215);
					match(COMMA);
					setState(216);
					((ListCommaExprContext)_localctx).right = list(2);
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return phrase_sempred((PhraseContext)_localctx, predIndex);
		case 2:
			return actions_sempred((ActionsContext)_localctx, predIndex);
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 6:
			return factor_sempred((FactorContext)_localctx, predIndex);
		case 7:
			return list_sempred((ListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean phrase_sempred(PhraseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean actions_sempred(ActionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean factor_sempred(FactorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean list_sempred(ListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u00e1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\5\2\25"+
		"\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3\16\3"+
		"&\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6V\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6d\n\6\f\6\16\6g\13\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00a0\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00bd"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\b\u00d1\n\b\f\b\16\b\u00d4\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00dc"+
		"\n\t\f\t\16\t\u00df\13\t\3\t\2\7\4\6\n\16\20\n\2\4\6\b\n\f\16\20\2\2\2"+
		"\u0107\2\24\3\2\2\2\4\26\3\2\2\2\6\61\3\2\2\2\b=\3\2\2\2\nU\3\2\2\2\f"+
		"\u009f\3\2\2\2\16\u00bc\3\2\2\2\20\u00d5\3\2\2\2\22\25\5\4\3\2\23\25\5"+
		"\6\4\2\24\22\3\2\2\2\24\23\3\2\2\2\25\3\3\2\2\2\26\27\b\3\1\2\27\30\7"+
		"\4\2\2\30\31\5\n\6\2\31\32\7\5\2\2\32\33\5\6\4\2\33$\3\2\2\2\34\35\f\4"+
		"\2\2\35\36\7\7\2\2\36#\5\4\3\5\37 \f\3\2\2 !\7\7\2\2!#\5\6\4\2\"\34\3"+
		"\2\2\2\"\37\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\5\3\2\2\2&$\3\2\2"+
		"\2\'(\b\4\1\2()\7\3\2\2)*\7\65\2\2*+\7!\2\2+\62\5\n\6\2,\62\5\4\3\2-."+
		"\7.\2\2./\5\6\4\2/\60\7/\2\2\60\62\3\2\2\2\61\'\3\2\2\2\61,\3\2\2\2\61"+
		"-\3\2\2\2\62:\3\2\2\2\63\64\f\6\2\2\64\65\7\b\2\2\659\5\6\4\7\66\67\f"+
		"\5\2\2\679\7\b\2\28\63\3\2\2\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2"+
		"\2;\7\3\2\2\2<:\3\2\2\2=>\5\n\6\2>\t\3\2\2\2?@\b\6\1\2@A\7\f\2\2AV\5\n"+
		"\6\nBV\5\f\7\2CD\7\30\2\2DE\7\65\2\2EF\7\22\2\2FG\7\65\2\2GH\7\34\2\2"+
		"HV\5\n\6\5IJ\7\31\2\2JK\7\65\2\2KL\7\22\2\2LM\7\65\2\2MN\7\34\2\2NV\5"+
		"\n\6\4OP\7\32\2\2PQ\7\65\2\2QR\7\22\2\2RS\7\65\2\2ST\7\34\2\2TV\5\n\6"+
		"\3U?\3\2\2\2UB\3\2\2\2UC\3\2\2\2UI\3\2\2\2UO\3\2\2\2Ve\3\2\2\2WX\f\t\2"+
		"\2XY\7\n\2\2Yd\5\n\6\nZ[\f\b\2\2[\\\7\13\2\2\\d\5\n\6\t]^\f\6\2\2^_\7"+
		"*\2\2_`\5\16\b\2`a\7+\2\2ab\5\16\b\2bd\3\2\2\2cW\3\2\2\2cZ\3\2\2\2c]\3"+
		"\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\13\3\2\2\2ge\3\2\2\2hi\5\16\b\2"+
		"ij\7\35\2\2jk\5\16\b\2k\u00a0\3\2\2\2lm\5\16\b\2mn\7\36\2\2no\5\16\b\2"+
		"o\u00a0\3\2\2\2pq\5\16\b\2qr\7\37\2\2rs\5\16\b\2s\u00a0\3\2\2\2tu\5\16"+
		"\b\2uv\7 \2\2vw\5\16\b\2w\u00a0\3\2\2\2xy\5\16\b\2yz\7!\2\2z{\5\16\b\2"+
		"{\u00a0\3\2\2\2|}\5\16\b\2}~\7#\2\2~\177\5\16\b\2\177\u00a0\3\2\2\2\u0080"+
		"\u0081\5\16\b\2\u0081\u0082\7\"\2\2\u0082\u0083\5\16\b\2\u0083\u00a0\3"+
		"\2\2\2\u0084\u0085\5\16\b\2\u0085\u0086\7\16\2\2\u0086\u0087\5\16\b\2"+
		"\u0087\u00a0\3\2\2\2\u0088\u0089\5\16\b\2\u0089\u008a\7\r\2\2\u008a\u008b"+
		"\5\16\b\2\u008b\u00a0\3\2\2\2\u008c\u008d\5\16\b\2\u008d\u008e\7\17\2"+
		"\2\u008e\u00a0\3\2\2\2\u008f\u0090\5\16\b\2\u0090\u0091\7\20\2\2\u0091"+
		"\u00a0\3\2\2\2\u0092\u0093\5\16\b\2\u0093\u0094\7\21\2\2\u0094\u0095\5"+
		"\16\b\2\u0095\u00a0\3\2\2\2\u0096\u0097\5\16\b\2\u0097\u0098\7\23\2\2"+
		"\u0098\u0099\5\16\b\2\u0099\u00a0\3\2\2\2\u009a\u00a0\5\16\b\2\u009b\u009c"+
		"\5\16\b\2\u009c\u009d\7\22\2\2\u009d\u009e\5\16\b\2\u009e\u00a0\3\2\2"+
		"\2\u009fh\3\2\2\2\u009fl\3\2\2\2\u009fp\3\2\2\2\u009ft\3\2\2\2\u009fx"+
		"\3\2\2\2\u009f|\3\2\2\2\u009f\u0080\3\2\2\2\u009f\u0084\3\2\2\2\u009f"+
		"\u0088\3\2\2\2\u009f\u008c\3\2\2\2\u009f\u008f\3\2\2\2\u009f\u0092\3\2"+
		"\2\2\u009f\u0096\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009b\3\2\2\2\u00a0"+
		"\r\3\2\2\2\u00a1\u00a2\b\b\1\2\u00a2\u00bd\7\63\2\2\u00a3\u00bd\7\62\2"+
		"\2\u00a4\u00bd\7\61\2\2\u00a5\u00bd\7\24\2\2\u00a6\u00bd\7\25\2\2\u00a7"+
		"\u00bd\7\26\2\2\u00a8\u00bd\7\27\2\2\u00a9\u00bd\7\65\2\2\u00aa\u00ab"+
		"\7,\2\2\u00ab\u00ac\5\n\6\2\u00ac\u00ad\7-\2\2\u00ad\u00bd\3\2\2\2\u00ae"+
		"\u00af\7\65\2\2\u00af\u00b0\7,\2\2\u00b0\u00b1\5\20\t\2\u00b1\u00b2\7"+
		"-\2\2\u00b2\u00bd\3\2\2\2\u00b3\u00b4\7\65\2\2\u00b4\u00b5\7,\2\2\u00b5"+
		"\u00bd\7-\2\2\u00b6\u00b7\7.\2\2\u00b7\u00b8\5\20\t\2\u00b8\u00b9\7/\2"+
		"\2\u00b9\u00bd\3\2\2\2\u00ba\u00bb\7.\2\2\u00bb\u00bd\7/\2\2\u00bc\u00a1"+
		"\3\2\2\2\u00bc\u00a3\3\2\2\2\u00bc\u00a4\3\2\2\2\u00bc\u00a5\3\2\2\2\u00bc"+
		"\u00a6\3\2\2\2\u00bc\u00a7\3\2\2\2\u00bc\u00a8\3\2\2\2\u00bc\u00a9\3\2"+
		"\2\2\u00bc\u00aa\3\2\2\2\u00bc\u00ae\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc"+
		"\u00b6\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00d2\3\2\2\2\u00be\u00bf\f\n"+
		"\2\2\u00bf\u00c0\7)\2\2\u00c0\u00d1\5\16\b\13\u00c1\u00c2\f\t\2\2\u00c2"+
		"\u00c3\7&\2\2\u00c3\u00d1\5\16\b\n\u00c4\u00c5\f\b\2\2\u00c5\u00c6\7\'"+
		"\2\2\u00c6\u00d1\5\16\b\t\u00c7\u00c8\f\7\2\2\u00c8\u00c9\7$\2\2\u00c9"+
		"\u00d1\5\16\b\b\u00ca\u00cb\f\6\2\2\u00cb\u00cc\7%\2\2\u00cc\u00d1\5\16"+
		"\b\7\u00cd\u00ce\f\5\2\2\u00ce\u00cf\7(\2\2\u00cf\u00d1\5\16\b\6\u00d0"+
		"\u00be\3\2\2\2\u00d0\u00c1\3\2\2\2\u00d0\u00c4\3\2\2\2\u00d0\u00c7\3\2"+
		"\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\17\3\2\2\2\u00d4\u00d2\3\2\2"+
		"\2\u00d5\u00d6\b\t\1\2\u00d6\u00d7\5\16\b\2\u00d7\u00dd\3\2\2\2\u00d8"+
		"\u00d9\f\3\2\2\u00d9\u00da\7\60\2\2\u00da\u00dc\5\20\t\4\u00db\u00d8\3"+
		"\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\21\3\2\2\2\u00df\u00dd\3\2\2\2\20\24\"$\618:Uce\u009f\u00bc\u00d0\u00d2"+
		"\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}