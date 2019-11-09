// Generated from c:\translatorSR-Python\grammar\SLLanguage.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ID=7, ESP=8, LINE_COMMENT=9, 
		GLOBAL=10, END=11, IMPORT=12, RESOURCE=13, INT=14, VAR=15, IF=16, FI=17, 
		ELSE=18, EXTEND=19, BODY=20, IN=21, NI=22, CALL=23, FA=24, AF=25, LBRACKET=26, 
		RBRACKET=27, INITIAL=28, CONST=29, RETURNS=30, RETURN=31, TO=32, DOWNTO=33, 
		FINAL=34, OP=35, DO=36, OD=37, PROC=38, CO=39, OC=40, CAP=41, SEND=42, 
		DESTROY=43, BEGIN=44, RECEIVE=45, CREATE=46, OPTYPE=47, BY=48, SUCHTHAT=49, 
		TYPE=50, NULL=51, BOOL=52, VAL=53, RES=54, REF=55, EXIT=56, NEXT=57, FILE=58, 
		PRIVATE=59, OR=60, INDEX=61, WRITE=62, READ=63, MOD=64, STOP=65, PROCEDURE=66, 
		AND=67, REAL=68, ON=69, ROW=70, TRUE=71, SENDER=72, LEFT=73, UP=74, ABORT=75, 
		REPLY=76, PROCESS=77, CHAR=78, STRING=79, FALSE=80, LOW=81, HIGH=82, NEW=83, 
		ENUM=84, ANY=85, REC=86, UNION=87, VM=88, XOR=89, SKP=90, FORWARD=91, 
		V=92, P=93, EJECUTA=94, NUM=95, SEPARA=96, LBRACE=97, RBRACE=98, ASIGNACION=99, 
		EQUAL=100, SWAP=101, INCREMENTO=102, DECREMENTO=103, DESPLAZAR_IZQ=104, 
		DESPLAZAR_DER=105, AUG=106, OPERADOR_ARITMETICO=107, OPERADOR_COMPARACION=108, 
		CADENA=109, SPEC=110;
	public static final int
		RULE_components = 0, RULE_global = 1, RULE_resource_specification = 2, 
		RULE_resource_body = 3, RULE_proc = 4, RULE_block = 5, RULE_declarations = 6, 
		RULE_constant = 7, RULE_type = 8, RULE_op_type = 9, RULE_variable = 10, 
		RULE_operation = 11, RULE_statements = 12, RULE_sequential = 13, RULE_op_invocation = 14, 
		RULE_op_service = 15, RULE_resource_control = 16, RULE_t = 17, RULE_parameters = 18, 
		RULE_parameters2 = 19, RULE_id_list = 20, RULE_result_id = 21, RULE_type_res = 22, 
		RULE_subscripts = 23, RULE_expression = 24, RULE_op_log = 25, RULE_expr1 = 26, 
		RULE_expr2 = 27, RULE_expr3 = 28, RULE_quantifier = 29, RULE_quantifier1 = 30, 
		RULE_quantifier2 = 31, RULE_direction = 32, RULE_step_opt = 33, RULE_such_that_opt = 34, 
		RULE_actuals = 35;
	public static final String[] ruleNames = {
		"components", "global", "resource_specification", "resource_body", "proc", 
		"block", "declarations", "constant", "type", "op_type", "variable", "operation", 
		"statements", "sequential", "op_invocation", "op_service", "resource_control", 
		"t", "parameters", "parameters2", "id_list", "result_id", "type_res", 
		"subscripts", "expression", "op_log", "expr1", "expr2", "expr3", "quantifier", 
		"quantifier1", "quantifier2", "direction", "step_opt", "such_that_opt", 
		"actuals"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'&'", "';'", "','", "'!'", "'|'", null, null, null, "'global'", 
		"'end'", "'import'", "'resource'", "'int'", "'var'", "'if'", "'fi'", "'else'", 
		"'extend'", "'body'", "'in'", "'ni'", "'call'", "'fa'", "'af'", "'('", 
		"')'", "'inital'", "'const'", "'returns'", "'return'", "'to'", "'downto'", 
		"'final'", "'op'", "'do'", "'od'", "'proc'", "'co'", "'oc'", "'cap'", 
		"'send'", "'destroy'", "'begin'", "'receive'", "'create'", "'optype'", 
		"'by'", "'st'", "'type'", "'null'", "'bool'", "'val'", "'res'", "'ref'", 
		"'exit'", "'next'", "'file'", "'private'", "'or'", "'index'", "'write'", 
		"'read'", "'mod'", "'stop'", "'procedure'", "'and'", "'real'", "'on'", 
		"'row'", "'true'", "'sender'", "'left'", "'up'", "'abort'", "'reply'", 
		"'process'", "'char'", "'string'", "'false'", "'low'", "'high'", "'new'", 
		"'enum'", "'any'", "'rec'", "'union'", "'vm'", "'xor'", "'skip'", "'forward'", 
		"'V'", "'P'", "'->'", null, "'[]'", "'{'", "'}'", "':='", "'='", "':=:'", 
		"'++'", "'--'", "'<<'", "'>>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "ID", "ESP", "LINE_COMMENT", 
		"GLOBAL", "END", "IMPORT", "RESOURCE", "INT", "VAR", "IF", "FI", "ELSE", 
		"EXTEND", "BODY", "IN", "NI", "CALL", "FA", "AF", "LBRACKET", "RBRACKET", 
		"INITIAL", "CONST", "RETURNS", "RETURN", "TO", "DOWNTO", "FINAL", "OP", 
		"DO", "OD", "PROC", "CO", "OC", "CAP", "SEND", "DESTROY", "BEGIN", "RECEIVE", 
		"CREATE", "OPTYPE", "BY", "SUCHTHAT", "TYPE", "NULL", "BOOL", "VAL", "RES", 
		"REF", "EXIT", "NEXT", "FILE", "PRIVATE", "OR", "INDEX", "WRITE", "READ", 
		"MOD", "STOP", "PROCEDURE", "AND", "REAL", "ON", "ROW", "TRUE", "SENDER", 
		"LEFT", "UP", "ABORT", "REPLY", "PROCESS", "CHAR", "STRING", "FALSE", 
		"LOW", "HIGH", "NEW", "ENUM", "ANY", "REC", "UNION", "VM", "XOR", "SKP", 
		"FORWARD", "V", "P", "EJECUTA", "NUM", "SEPARA", "LBRACE", "RBRACE", "ASIGNACION", 
		"EQUAL", "SWAP", "INCREMENTO", "DECREMENTO", "DESPLAZAR_IZQ", "DESPLAZAR_DER", 
		"AUG", "OPERADOR_ARITMETICO", "OPERADOR_COMPARACION", "CADENA", "SPEC"
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
	public String getGrammarFileName() { return "SLLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SLLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ComponentsContext extends ParserRuleContext {
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public Resource_specificationContext resource_specification() {
			return getRuleContext(Resource_specificationContext.class,0);
		}
		public Resource_bodyContext resource_body() {
			return getRuleContext(Resource_bodyContext.class,0);
		}
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ComponentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_components; }
	}

	public final ComponentsContext components() throws RecognitionException {
		ComponentsContext _localctx = new ComponentsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_components);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				global();
				}
				break;
			case RESOURCE:
			case SPEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				resource_specification();
				}
				break;
			case BODY:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				resource_body();
				}
				break;
			case PROC:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				proc();
				}
				break;
			case ID:
			case VAR:
			case IF:
			case IN:
			case CALL:
			case FA:
			case CONST:
			case RETURN:
			case OP:
			case DO:
			case CO:
			case SEND:
			case DESTROY:
			case RECEIVE:
			case OPTYPE:
			case TYPE:
			case EXIT:
			case NEXT:
			case REPLY:
			case SKP:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				block();
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

	public static class GlobalContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(SLLanguageParser.GLOBAL, 0); }
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public TerminalNode END() { return getToken(SLLanguageParser.END, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(GLOBAL);
			setState(80);
			match(ID);
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(81);
				constant();
				}
				break;
			case TYPE:
				{
				setState(82);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(85);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resource_specificationContext extends ParserRuleContext {
		public TerminalNode SPEC() { return getToken(SLLanguageParser.SPEC, 0); }
		public List<TerminalNode> ID() { return getTokens(SLLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SLLanguageParser.ID, i);
		}
		public TerminalNode IMPORT() { return getToken(SLLanguageParser.IMPORT, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode RESOURCE() { return getToken(SLLanguageParser.RESOURCE, 0); }
		public TerminalNode SEPARA() { return getToken(SLLanguageParser.SEPARA, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Resource_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_specification; }
	}

	public final Resource_specificationContext resource_specification() throws RecognitionException {
		Resource_specificationContext _localctx = new Resource_specificationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_resource_specification);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(SPEC);
				setState(88);
				match(ID);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IMPORT) {
					{
					setState(89);
					match(IMPORT);
					setState(90);
					match(ID);
					}
				}

				setState(96);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(93);
					constant();
					}
					break;
				case TYPE:
					{
					setState(94);
					type();
					}
					break;
				case OP:
					{
					setState(95);
					operation();
					}
					break;
				case EOF:
					break;
				default:
					break;
				}
				}
				break;
			case RESOURCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(RESOURCE);
				setState(99);
				match(ID);
				{
				setState(100);
				match(LBRACKET);
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(101);
					parameters();
					}
					break;
				}
				setState(104);
				match(RBRACKET);
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARA) {
					{
					setState(106);
					match(SEPARA);
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

	public static class Resource_bodyContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(SLLanguageParser.BODY, 0); }
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public List<TerminalNode> END() { return getTokens(SLLanguageParser.END); }
		public TerminalNode END(int i) {
			return getToken(SLLanguageParser.END, i);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode INITIAL() { return getToken(SLLanguageParser.INITIAL, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode FINAL() { return getToken(SLLanguageParser.FINAL, 0); }
		public Resource_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_body; }
	}

	public final Resource_bodyContext resource_body() throws RecognitionException {
		Resource_bodyContext _localctx = new Resource_bodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_resource_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(BODY);
			setState(112);
			match(ID);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << OP) | (1L << OPTYPE) | (1L << TYPE))) != 0)) {
				{
				setState(113);
				declarations();
				}
			}

			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIAL) {
				{
				setState(116);
				match(INITIAL);
				setState(117);
				block();
				setState(118);
				match(END);
				}
			}

			setState(122);
			proc();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(123);
				match(FINAL);
				setState(124);
				block();
				setState(125);
				match(END);
				}
			}

			setState(129);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcContext extends ParserRuleContext {
		public TerminalNode PROC() { return getToken(SLLanguageParser.PROC, 0); }
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(SLLanguageParser.RETURNS, 0); }
		public Result_idContext result_id() {
			return getRuleContext(Result_idContext.class,0);
		}
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_proc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(PROC);
			setState(132);
			match(ID);
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(133);
				id_list();
				}
				break;
			}
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(136);
				match(RETURNS);
				setState(137);
				result_id();
				}
			}

			setState(140);
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

	public static class BlockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(142);
				declarations();
				}
				break;
			}
			setState(145);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Op_typeContext op_type() {
			return getRuleContext(Op_typeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarations);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				constant();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				type();
				}
				break;
			case OPTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				op_type();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				variable();
				}
				break;
			case OP:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				operation();
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(SLLanguageParser.CONST, 0); }
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(SLLanguageParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(CONST);
			setState(155);
			match(ID);
			setState(156);
			match(EQUAL);
			setState(157);
			expression();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode TYPE() { return getToken(SLLanguageParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(SLLanguageParser.EQUAL, 0); }
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public Type_resContext type_res() {
			return getRuleContext(Type_resContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(TYPE);
			setState(160);
			match(ID);
			setState(161);
			match(EQUAL);
			setState(162);
			t();
			setState(163);
			type_res();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_typeContext extends ParserRuleContext {
		public TerminalNode OPTYPE() { return getToken(SLLanguageParser.OPTYPE, 0); }
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(SLLanguageParser.EQUAL, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(SLLanguageParser.RETURNS, 0); }
		public Result_idContext result_id() {
			return getRuleContext(Result_idContext.class,0);
		}
		public Op_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_type; }
	}

	public final Op_typeContext op_type() throws RecognitionException {
		Op_typeContext _localctx = new Op_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_op_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(OPTYPE);
			setState(166);
			match(ID);
			setState(167);
			match(EQUAL);
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(168);
				parameters();
				}
				break;
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(171);
				match(RETURNS);
				setState(172);
				result_id();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SLLanguageParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(SLLanguageParser.ASIGNACION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(VAR);
			setState(176);
			match(ID);
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(177);
				subscripts();
				}
				break;
			}
			setState(180);
			match(T__0);
			setState(181);
			type();
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(182);
				match(ASIGNACION);
				setState(183);
				expression();
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(SLLanguageParser.OP, 0); }
		public List<TerminalNode> ID() { return getTokens(SLLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SLLanguageParser.ID, i);
		}
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(SLLanguageParser.RETURNS, 0); }
		public Result_idContext result_id() {
			return getRuleContext(Result_idContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operation);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(OP);
				setState(187);
				match(ID);
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(188);
					subscripts();
					}
					break;
				}
				setState(192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(191);
					parameters();
					}
					break;
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURNS) {
					{
					setState(194);
					match(RETURNS);
					setState(195);
					result_id();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(OP);
				setState(199);
				match(ID);
				setState(201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(200);
					subscripts();
					}
					break;
				}
				setState(203);
				match(ID);
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

	public static class StatementsContext extends ParserRuleContext {
		public SequentialContext sequential() {
			return getRuleContext(SequentialContext.class,0);
		}
		public Op_invocationContext op_invocation() {
			return getRuleContext(Op_invocationContext.class,0);
		}
		public Op_serviceContext op_service() {
			return getRuleContext(Op_serviceContext.class,0);
		}
		public Resource_controlContext resource_control() {
			return getRuleContext(Resource_controlContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statements);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case IF:
			case FA:
			case DO:
			case EXIT:
			case NEXT:
			case SKP:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				sequential();
				}
				break;
			case CALL:
			case OP:
			case CO:
			case SEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				op_invocation();
				}
				break;
			case IN:
			case RETURN:
			case RECEIVE:
			case REPLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				op_service();
				}
				break;
			case ID:
			case DESTROY:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				resource_control();
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

	public static class SequentialContext extends ParserRuleContext {
		public TerminalNode SKP() { return getToken(SLLanguageParser.SKP, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(SLLanguageParser.ASIGNACION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCREMENTO() { return getToken(SLLanguageParser.INCREMENTO, 0); }
		public TerminalNode DECREMENTO() { return getToken(SLLanguageParser.DECREMENTO, 0); }
		public TerminalNode IF() { return getToken(SLLanguageParser.IF, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode EJECUTA() { return getToken(SLLanguageParser.EJECUTA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEPARA() { return getToken(SLLanguageParser.SEPARA, 0); }
		public TerminalNode FI() { return getToken(SLLanguageParser.FI, 0); }
		public TerminalNode DO() { return getToken(SLLanguageParser.DO, 0); }
		public TerminalNode OD() { return getToken(SLLanguageParser.OD, 0); }
		public TerminalNode FA() { return getToken(SLLanguageParser.FA, 0); }
		public Quantifier2Context quantifier2() {
			return getRuleContext(Quantifier2Context.class,0);
		}
		public TerminalNode AF() { return getToken(SLLanguageParser.AF, 0); }
		public TerminalNode EXIT() { return getToken(SLLanguageParser.EXIT, 0); }
		public TerminalNode NEXT() { return getToken(SLLanguageParser.NEXT, 0); }
		public SequentialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequential; }
	}

	public final SequentialContext sequential() throws RecognitionException {
		SequentialContext _localctx = new SequentialContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sequential);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(SKP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				variable();
				setState(214);
				match(ASIGNACION);
				setState(215);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				variable();
				setState(218);
				match(INCREMENTO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				variable();
				setState(221);
				match(DECREMENTO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				match(IF);
				setState(224);
				expr1();
				setState(225);
				match(EJECUTA);
				setState(226);
				block();
				setState(227);
				match(SEPARA);
				setState(228);
				match(FI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				match(DO);
				setState(231);
				expr1();
				setState(232);
				match(EJECUTA);
				setState(233);
				block();
				setState(234);
				match(SEPARA);
				setState(235);
				match(OD);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(237);
				match(FA);
				setState(238);
				quantifier2();
				setState(239);
				match(EJECUTA);
				setState(240);
				block();
				setState(241);
				match(AF);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(243);
				match(EXIT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(244);
				match(NEXT);
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

	public static class Op_invocationContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode CALL() { return getToken(SLLanguageParser.CALL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEND() { return getToken(SLLanguageParser.SEND, 0); }
		public TerminalNode CO() { return getToken(SLLanguageParser.CO, 0); }
		public TerminalNode OC() { return getToken(SLLanguageParser.OC, 0); }
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public TerminalNode EJECUTA() { return getToken(SLLanguageParser.EJECUTA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Op_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_invocation; }
	}

	public final Op_invocationContext op_invocation() throws RecognitionException {
		Op_invocationContext _localctx = new Op_invocationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_op_invocation);
		int _la;
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CALL) {
					{
					setState(247);
					match(CALL);
					}
				}

				setState(250);
				operation();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==ID || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (NUM - 71)))) != 0)) {
					{
					setState(251);
					expression();
					}
				}

				}
				break;
			case SEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(SEND);
				setState(255);
				operation();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==ID || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (NUM - 71)))) != 0)) {
					{
					setState(256);
					expression();
					}
				}

				}
				break;
			case CO:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(CO);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(260);
					quantifier();
					}
				}

				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CALL) {
					{
					setState(263);
					match(CALL);
					}
				}

				setState(266);
				operation();
				setState(267);
				match(LBRACKET);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==ID || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (NUM - 71)))) != 0)) {
					{
					setState(268);
					expression();
					}
				}

				setState(271);
				match(RBRACKET);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EJECUTA) {
					{
					setState(272);
					match(EJECUTA);
					setState(273);
					block();
					}
				}

				setState(276);
				match(OC);
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

	public static class Op_serviceContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(SLLanguageParser.IN, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode EJECUTA() { return getToken(SLLanguageParser.EJECUTA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEPARA() { return getToken(SLLanguageParser.SEPARA, 0); }
		public TerminalNode NI() { return getToken(SLLanguageParser.NI, 0); }
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode BY() { return getToken(SLLanguageParser.BY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RECEIVE() { return getToken(SLLanguageParser.RECEIVE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(SLLanguageParser.RETURN, 0); }
		public TerminalNode REPLY() { return getToken(SLLanguageParser.REPLY, 0); }
		public Op_serviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_service; }
	}

	public final Op_serviceContext op_service() throws RecognitionException {
		Op_serviceContext _localctx = new Op_serviceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_op_service);
		int _la;
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(IN);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(281);
					quantifier();
					}
				}

				setState(284);
				operation();
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(285);
					id_list();
					}
					break;
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(288);
					match(T__1);
					setState(289);
					expr1();
					}
				}

				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(292);
					match(BY);
					setState(293);
					expression();
					}
				}

				setState(296);
				match(EJECUTA);
				setState(297);
				block();
				setState(298);
				match(SEPARA);
				setState(299);
				match(NI);
				}
				break;
			case RECEIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(RECEIVE);
				setState(302);
				operation();
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(303);
					variable();
					}
				}

				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(RETURN);
				}
				break;
			case REPLY:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				match(REPLY);
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

	public static class Resource_controlContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SLLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SLLanguageParser.ID, i);
		}
		public TerminalNode ASIGNACION() { return getToken(SLLanguageParser.ASIGNACION, 0); }
		public TerminalNode CREATE() { return getToken(SLLanguageParser.CREATE, 0); }
		public ActualsContext actuals() {
			return getRuleContext(ActualsContext.class,0);
		}
		public TerminalNode ON() { return getToken(SLLanguageParser.ON, 0); }
		public TerminalNode DESTROY() { return getToken(SLLanguageParser.DESTROY, 0); }
		public Resource_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_control; }
	}

	public final Resource_controlContext resource_control() throws RecognitionException {
		Resource_controlContext _localctx = new Resource_controlContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_resource_control);
		int _la;
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(ID);
				setState(311);
				match(ASIGNACION);
				setState(312);
				match(CREATE);
				setState(313);
				match(ID);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==ID || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (NUM - 71)))) != 0)) {
					{
					setState(314);
					actuals();
					}
				}

				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(317);
					match(ON);
					setState(318);
					match(ID);
					}
				}

				}
				break;
			case DESTROY:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(DESTROY);
				setState(322);
				match(ID);
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

	public static class TContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public TerminalNode INT() { return getToken(SLLanguageParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(SLLanguageParser.BOOL, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << BOOL))) != 0)) ) {
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

	public static class ParametersContext extends ParserRuleContext {
		public Parameters2Context parameters2() {
			return getRuleContext(Parameters2Context.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameters);
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				parameters2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				parameters2();
				setState(329);
				match(T__2);
				setState(330);
				parameters();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Parameters2Context extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public Parameters2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters2; }
	}

	public final Parameters2Context parameters2() throws RecognitionException {
		Parameters2Context _localctx = new Parameters2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameters2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			id_list();
			setState(336);
			match(T__0);
			setState(337);
			t();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_id_list);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(ID);
				setState(341);
				match(T__3);
				setState(342);
				id_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Result_idContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Result_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_id; }
	}

	public final Result_idContext result_id() throws RecognitionException {
		Result_idContext _localctx = new Result_idContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_result_id);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				id_list();
				setState(348);
				match(T__0);
				setState(349);
				t();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Type_resContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SLLanguageParser.LBRACE, 0); }
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public TerminalNode RBRACE() { return getToken(SLLanguageParser.RBRACE, 0); }
		public Type_resContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_res; }
	}

	public final Type_resContext type_res() throws RecognitionException {
		Type_resContext _localctx = new Type_resContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type_res);
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(LBRACE);
				setState(355);
				match(ID);
				setState(356);
				match(RBRACE);
				}
				break;
			case EOF:
			case ID:
			case END:
			case VAR:
			case IF:
			case IN:
			case CALL:
			case FA:
			case AF:
			case INITIAL:
			case RETURN:
			case FINAL:
			case OP:
			case DO:
			case PROC:
			case CO:
			case OC:
			case SEND:
			case DESTROY:
			case RECEIVE:
			case EXIT:
			case NEXT:
			case REPLY:
			case SKP:
			case SEPARA:
			case ASIGNACION:
			case INCREMENTO:
			case DECREMENTO:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SubscriptsContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(SLLanguageParser.LBRACKET, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(SLLanguageParser.RBRACKET, 0); }
		public SubscriptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscripts; }
	}

	public final SubscriptsContext subscripts() throws RecognitionException {
		SubscriptsContext _localctx = new SubscriptsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_subscripts);
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(LBRACKET);
				setState(361);
				id_list();
				setState(362);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Op_logContext op_log() {
			return getRuleContext(Op_logContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				expr1();
				setState(368);
				op_log();
				setState(369);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(T__4);
				setState(372);
				expr1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				expr1();
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

	public static class Op_logContext extends ParserRuleContext {
		public Op_logContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_log; }
	}

	public final Op_logContext op_log() throws RecognitionException {
		Op_logContext _localctx = new Op_logContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_op_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__5) ) {
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

	public static class Expr1Context extends ParserRuleContext {
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public TerminalNode OPERADOR_COMPARACION() { return getToken(SLLanguageParser.OPERADOR_COMPARACION, 0); }
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr1);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				expr2();
				setState(379);
				match(OPERADOR_COMPARACION);
				setState(380);
				expr2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				expr2();
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

	public static class Expr2Context extends ParserRuleContext {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public TerminalNode OPERADOR_ARITMETICO() { return getToken(SLLanguageParser.OPERADOR_ARITMETICO, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr2);
		try {
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				expr3();
				setState(386);
				match(OPERADOR_ARITMETICO);
				setState(387);
				expr2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				expr3();
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

	public static class Expr3Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SLLanguageParser.NUM, 0); }
		public TerminalNode TRUE() { return getToken(SLLanguageParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SLLanguageParser.FALSE, 0); }
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ( !(_la==ID || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (TRUE - 71)) | (1L << (FALSE - 71)) | (1L << (NUM - 71)))) != 0)) ) {
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

	public static class QuantifierContext extends ParserRuleContext {
		public Quantifier1Context quantifier1() {
			return getRuleContext(Quantifier1Context.class,0);
		}
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_quantifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(LBRACKET);
			setState(395);
			quantifier1();
			setState(396);
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

	public static class Quantifier1Context extends ParserRuleContext {
		public Quantifier2Context quantifier2() {
			return getRuleContext(Quantifier2Context.class,0);
		}
		public Quantifier1Context quantifier1() {
			return getRuleContext(Quantifier1Context.class,0);
		}
		public Quantifier1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier1; }
	}

	public final Quantifier1Context quantifier1() throws RecognitionException {
		Quantifier1Context _localctx = new Quantifier1Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_quantifier1);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				quantifier2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				quantifier2();
				setState(400);
				match(T__3);
				setState(401);
				quantifier1();
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

	public static class Quantifier2Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(SLLanguageParser.ASIGNACION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public Step_optContext step_opt() {
			return getRuleContext(Step_optContext.class,0);
		}
		public Such_that_optContext such_that_opt() {
			return getRuleContext(Such_that_optContext.class,0);
		}
		public Quantifier2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier2; }
	}

	public final Quantifier2Context quantifier2() throws RecognitionException {
		Quantifier2Context _localctx = new Quantifier2Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_quantifier2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(ID);
			setState(406);
			match(ASIGNACION);
			setState(407);
			expression();
			setState(408);
			direction();
			setState(409);
			expression();
			setState(410);
			step_opt();
			setState(411);
			such_that_opt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(SLLanguageParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(SLLanguageParser.DOWNTO, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOWNTO) ) {
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

	public static class Step_optContext extends ParserRuleContext {
		public TerminalNode BY() { return getToken(SLLanguageParser.BY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Step_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step_opt; }
	}

	public final Step_optContext step_opt() throws RecognitionException {
		Step_optContext _localctx = new Step_optContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_step_opt);
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BY:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(BY);
				setState(416);
				expression();
				}
				break;
			case T__3:
			case RBRACKET:
			case SUCHTHAT:
			case EJECUTA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Such_that_optContext extends ParserRuleContext {
		public TerminalNode SUCHTHAT() { return getToken(SLLanguageParser.SUCHTHAT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Such_that_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_such_that_opt; }
	}

	public final Such_that_optContext such_that_opt() throws RecognitionException {
		Such_that_optContext _localctx = new Such_that_optContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_such_that_opt);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUCHTHAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(SUCHTHAT);
				setState(421);
				expression();
				}
				break;
			case T__3:
			case RBRACKET:
			case EJECUTA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ActualsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ActualsContext actuals() {
			return getRuleContext(ActualsContext.class,0);
		}
		public ActualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actuals; }
	}

	public final ActualsContext actuals() throws RecognitionException {
		ActualsContext _localctx = new ActualsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_actuals);
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				expression();
				setState(427);
				match(T__3);
				setState(428);
				actuals();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3p\u01b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\5\2P\n\2\3\3\3\3\3\3"+
		"\3\3\5\3V\n\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4\3\4\5\4c\n\4\3"+
		"\4\3\4\3\4\3\4\5\4i\n\4\3\4\3\4\3\4\5\4n\n\4\5\4p\n\4\3\5\3\5\3\5\5\5"+
		"u\n\5\3\5\3\5\3\5\3\5\5\5{\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\5\3"+
		"\5\3\6\3\6\3\6\5\6\u0089\n\6\3\6\3\6\5\6\u008d\n\6\3\6\3\6\3\7\5\7\u0092"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u009b\n\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00ac\n\13\3\13\3\13\5\13"+
		"\u00b0\n\13\3\f\3\f\3\f\5\f\u00b5\n\f\3\f\3\f\3\f\3\f\5\f\u00bb\n\f\3"+
		"\r\3\r\3\r\5\r\u00c0\n\r\3\r\5\r\u00c3\n\r\3\r\3\r\5\r\u00c7\n\r\3\r\3"+
		"\r\3\r\5\r\u00cc\n\r\3\r\5\r\u00cf\n\r\3\16\3\16\3\16\3\16\5\16\u00d5"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f8\n\17\3\20\5\20\u00fb\n\20\3"+
		"\20\3\20\5\20\u00ff\n\20\3\20\3\20\3\20\5\20\u0104\n\20\3\20\3\20\5\20"+
		"\u0108\n\20\3\20\5\20\u010b\n\20\3\20\3\20\3\20\5\20\u0110\n\20\3\20\3"+
		"\20\3\20\5\20\u0115\n\20\3\20\3\20\5\20\u0119\n\20\3\21\3\21\5\21\u011d"+
		"\n\21\3\21\3\21\5\21\u0121\n\21\3\21\3\21\5\21\u0125\n\21\3\21\3\21\5"+
		"\21\u0129\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0133\n\21"+
		"\3\21\3\21\5\21\u0137\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u013e\n\22\3"+
		"\22\3\22\5\22\u0142\n\22\3\22\3\22\5\22\u0146\n\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0150\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u015b\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0163\n"+
		"\27\3\30\3\30\3\30\3\30\5\30\u0169\n\30\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0170\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0179\n\32\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\5\34\u0182\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0189\n\35\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \5 \u0196"+
		"\n \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3#\5#\u01a5\n#\3$\3$\3$\5$\u01aa"+
		"\n$\3%\3%\3%\3%\3%\5%\u01b1\n%\3%\2\2&\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\6\5\2\t\t\20\20\66\66\4\2\4\4\b"+
		"\b\6\2\t\tIIRRaa\3\2\"#\2\u01dc\2O\3\2\2\2\4Q\3\2\2\2\6o\3\2\2\2\bq\3"+
		"\2\2\2\n\u0085\3\2\2\2\f\u0091\3\2\2\2\16\u009a\3\2\2\2\20\u009c\3\2\2"+
		"\2\22\u00a1\3\2\2\2\24\u00a7\3\2\2\2\26\u00b1\3\2\2\2\30\u00ce\3\2\2\2"+
		"\32\u00d4\3\2\2\2\34\u00f7\3\2\2\2\36\u0118\3\2\2\2 \u0136\3\2\2\2\"\u0145"+
		"\3\2\2\2$\u0147\3\2\2\2&\u014f\3\2\2\2(\u0151\3\2\2\2*\u015a\3\2\2\2,"+
		"\u0162\3\2\2\2.\u0168\3\2\2\2\60\u016f\3\2\2\2\62\u0178\3\2\2\2\64\u017a"+
		"\3\2\2\2\66\u0181\3\2\2\28\u0188\3\2\2\2:\u018a\3\2\2\2<\u018c\3\2\2\2"+
		">\u0195\3\2\2\2@\u0197\3\2\2\2B\u019f\3\2\2\2D\u01a4\3\2\2\2F\u01a9\3"+
		"\2\2\2H\u01b0\3\2\2\2JP\5\4\3\2KP\5\6\4\2LP\5\b\5\2MP\5\n\6\2NP\5\f\7"+
		"\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\3\3\2\2\2QR\7\f"+
		"\2\2RU\7\t\2\2SV\5\20\t\2TV\5\22\n\2US\3\2\2\2UT\3\2\2\2VW\3\2\2\2WX\7"+
		"\r\2\2X\5\3\2\2\2YZ\7p\2\2Z]\7\t\2\2[\\\7\16\2\2\\^\7\t\2\2][\3\2\2\2"+
		"]^\3\2\2\2^b\3\2\2\2_c\5\20\t\2`c\5\22\n\2ac\5\30\r\2b_\3\2\2\2b`\3\2"+
		"\2\2ba\3\2\2\2bc\3\2\2\2cp\3\2\2\2de\7\17\2\2ef\7\t\2\2fh\7\34\2\2gi\5"+
		"&\24\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\35\2\2km\3\2\2\2ln\7b\2\2ml\3"+
		"\2\2\2mn\3\2\2\2np\3\2\2\2oY\3\2\2\2od\3\2\2\2p\7\3\2\2\2qr\7\26\2\2r"+
		"t\7\t\2\2su\5\16\b\2ts\3\2\2\2tu\3\2\2\2uz\3\2\2\2vw\7\36\2\2wx\5\f\7"+
		"\2xy\7\r\2\2y{\3\2\2\2zv\3\2\2\2z{\3\2\2\2{|\3\2\2\2|\u0081\5\n\6\2}~"+
		"\7$\2\2~\177\5\f\7\2\177\u0080\7\r\2\2\u0080\u0082\3\2\2\2\u0081}\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\r\2\2\u0084"+
		"\t\3\2\2\2\u0085\u0086\7(\2\2\u0086\u0088\7\t\2\2\u0087\u0089\5*\26\2"+
		"\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u008b"+
		"\7 \2\2\u008b\u008d\5,\27\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\5\f\7\2\u008f\13\3\2\2\2\u0090\u0092\5\16\b"+
		"\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094"+
		"\5\32\16\2\u0094\r\3\2\2\2\u0095\u009b\5\20\t\2\u0096\u009b\5\22\n\2\u0097"+
		"\u009b\5\24\13\2\u0098\u009b\5\26\f\2\u0099\u009b\5\30\r\2\u009a\u0095"+
		"\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\17\3\2\2\2\u009c\u009d\7\37\2\2\u009d\u009e\7\t\2"+
		"\2\u009e\u009f\7f\2\2\u009f\u00a0\5\62\32\2\u00a0\21\3\2\2\2\u00a1\u00a2"+
		"\7\64\2\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4\7f\2\2\u00a4\u00a5\5$\23\2\u00a5"+
		"\u00a6\5.\30\2\u00a6\23\3\2\2\2\u00a7\u00a8\7\61\2\2\u00a8\u00a9\7\t\2"+
		"\2\u00a9\u00ab\7f\2\2\u00aa\u00ac\5&\24\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ae\7 \2\2\u00ae\u00b0\5,\27\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\25\3\2\2\2\u00b1\u00b2\7\21\2"+
		"\2\u00b2\u00b4\7\t\2\2\u00b3\u00b5\5\60\31\2\u00b4\u00b3\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\3\2\2\u00b7\u00ba\5\22"+
		"\n\2\u00b8\u00b9\7e\2\2\u00b9\u00bb\5\62\32\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\27\3\2\2\2\u00bc\u00bd\7%\2\2\u00bd\u00bf\7\t\2\2"+
		"\u00be\u00c0\5\60\31\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2"+
		"\3\2\2\2\u00c1\u00c3\5&\24\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c5\7 \2\2\u00c5\u00c7\5,\27\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00cf\3\2\2\2\u00c8\u00c9\7%\2\2\u00c9"+
		"\u00cb\7\t\2\2\u00ca\u00cc\5\60\31\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3"+
		"\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\7\t\2\2\u00ce\u00bc\3\2\2\2\u00ce"+
		"\u00c8\3\2\2\2\u00cf\31\3\2\2\2\u00d0\u00d5\5\34\17\2\u00d1\u00d5\5\36"+
		"\20\2\u00d2\u00d5\5 \21\2\u00d3\u00d5\5\"\22\2\u00d4\u00d0\3\2\2\2\u00d4"+
		"\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\33\3\2\2"+
		"\2\u00d6\u00f8\7\\\2\2\u00d7\u00d8\5\26\f\2\u00d8\u00d9\7e\2\2\u00d9\u00da"+
		"\5\62\32\2\u00da\u00f8\3\2\2\2\u00db\u00dc\5\26\f\2\u00dc\u00dd\7h\2\2"+
		"\u00dd\u00f8\3\2\2\2\u00de\u00df\5\26\f\2\u00df\u00e0\7i\2\2\u00e0\u00f8"+
		"\3\2\2\2\u00e1\u00e2\7\22\2\2\u00e2\u00e3\5\66\34\2\u00e3\u00e4\7`\2\2"+
		"\u00e4\u00e5\5\f\7\2\u00e5\u00e6\7b\2\2\u00e6\u00e7\7\23\2\2\u00e7\u00f8"+
		"\3\2\2\2\u00e8\u00e9\7&\2\2\u00e9\u00ea\5\66\34\2\u00ea\u00eb\7`\2\2\u00eb"+
		"\u00ec\5\f\7\2\u00ec\u00ed\7b\2\2\u00ed\u00ee\7\'\2\2\u00ee\u00f8\3\2"+
		"\2\2\u00ef\u00f0\7\32\2\2\u00f0\u00f1\5@!\2\u00f1\u00f2\7`\2\2\u00f2\u00f3"+
		"\5\f\7\2\u00f3\u00f4\7\33\2\2\u00f4\u00f8\3\2\2\2\u00f5\u00f8\7:\2\2\u00f6"+
		"\u00f8\7;\2\2\u00f7\u00d6\3\2\2\2\u00f7\u00d7\3\2\2\2\u00f7\u00db\3\2"+
		"\2\2\u00f7\u00de\3\2\2\2\u00f7\u00e1\3\2\2\2\u00f7\u00e8\3\2\2\2\u00f7"+
		"\u00ef\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\35\3\2\2"+
		"\2\u00f9\u00fb\7\31\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fe\5\30\r\2\u00fd\u00ff\5\62\32\2\u00fe\u00fd"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0119\3\2\2\2\u0100\u0101\7,\2\2\u0101"+
		"\u0103\5\30\r\2\u0102\u0104\5\62\32\2\u0103\u0102\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0119\3\2\2\2\u0105\u0107\7)\2\2\u0106\u0108\5<\37\2\u0107"+
		"\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u010b\7\31"+
		"\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\5\30\r\2\u010d\u010f\7\34\2\2\u010e\u0110\5\62\32\2\u010f\u010e"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0114\7\35\2\2"+
		"\u0112\u0113\7`\2\2\u0113\u0115\5\f\7\2\u0114\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7*\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u00fa\3\2\2\2\u0118\u0100\3\2\2\2\u0118\u0105\3\2\2\2\u0119\37\3\2\2"+
		"\2\u011a\u011c\7\27\2\2\u011b\u011d\5<\37\2\u011c\u011b\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\5\30\r\2\u011f\u0121\5"+
		"*\26\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0124\3\2\2\2\u0122"+
		"\u0123\7\4\2\2\u0123\u0125\5\66\34\2\u0124\u0122\3\2\2\2\u0124\u0125\3"+
		"\2\2\2\u0125\u0128\3\2\2\2\u0126\u0127\7\62\2\2\u0127\u0129\5\62\32\2"+
		"\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b"+
		"\7`\2\2\u012b\u012c\5\f\7\2\u012c\u012d\7b\2\2\u012d\u012e\7\30\2\2\u012e"+
		"\u0137\3\2\2\2\u012f\u0130\7/\2\2\u0130\u0132\5\30\r\2\u0131\u0133\5\26"+
		"\f\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0137\3\2\2\2\u0134"+
		"\u0137\7!\2\2\u0135\u0137\7N\2\2\u0136\u011a\3\2\2\2\u0136\u012f\3\2\2"+
		"\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137!\3\2\2\2\u0138\u0139"+
		"\7\t\2\2\u0139\u013a\7e\2\2\u013a\u013b\7\60\2\2\u013b\u013d\7\t\2\2\u013c"+
		"\u013e\5H%\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\3\2\2"+
		"\2\u013f\u0140\7G\2\2\u0140\u0142\7\t\2\2\u0141\u013f\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0146\3\2\2\2\u0143\u0144\7-\2\2\u0144\u0146\7\t\2\2\u0145"+
		"\u0138\3\2\2\2\u0145\u0143\3\2\2\2\u0146#\3\2\2\2\u0147\u0148\t\2\2\2"+
		"\u0148%\3\2\2\2\u0149\u0150\5(\25\2\u014a\u014b\5(\25\2\u014b\u014c\7"+
		"\5\2\2\u014c\u014d\5&\24\2\u014d\u0150\3\2\2\2\u014e\u0150\3\2\2\2\u014f"+
		"\u0149\3\2\2\2\u014f\u014a\3\2\2\2\u014f\u014e\3\2\2\2\u0150\'\3\2\2\2"+
		"\u0151\u0152\5*\26\2\u0152\u0153\7\3\2\2\u0153\u0154\5$\23\2\u0154)\3"+
		"\2\2\2\u0155\u015b\7\t\2\2\u0156\u0157\7\t\2\2\u0157\u0158\7\6\2\2\u0158"+
		"\u015b\5*\26\2\u0159\u015b\3\2\2\2\u015a\u0155\3\2\2\2\u015a\u0156\3\2"+
		"\2\2\u015a\u0159\3\2\2\2\u015b+\3\2\2\2\u015c\u0163\5$\23\2\u015d\u015e"+
		"\5*\26\2\u015e\u015f\7\3\2\2\u015f\u0160\5$\23\2\u0160\u0163\3\2\2\2\u0161"+
		"\u0163\3\2\2\2\u0162\u015c\3\2\2\2\u0162\u015d\3\2\2\2\u0162\u0161\3\2"+
		"\2\2\u0163-\3\2\2\2\u0164\u0165\7c\2\2\u0165\u0166\7\t\2\2\u0166\u0169"+
		"\7d\2\2\u0167\u0169\3\2\2\2\u0168\u0164\3\2\2\2\u0168\u0167\3\2\2\2\u0169"+
		"/\3\2\2\2\u016a\u016b\7\34\2\2\u016b\u016c\5*\26\2\u016c\u016d\7\35\2"+
		"\2\u016d\u0170\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u016a\3\2\2\2\u016f\u016e"+
		"\3\2\2\2\u0170\61\3\2\2\2\u0171\u0172\5\66\34\2\u0172\u0173\5\64\33\2"+
		"\u0173\u0174\5\62\32\2\u0174\u0179\3\2\2\2\u0175\u0176\7\7\2\2\u0176\u0179"+
		"\5\66\34\2\u0177\u0179\5\66\34\2\u0178\u0171\3\2\2\2\u0178\u0175\3\2\2"+
		"\2\u0178\u0177\3\2\2\2\u0179\63\3\2\2\2\u017a\u017b\t\3\2\2\u017b\65\3"+
		"\2\2\2\u017c\u017d\58\35\2\u017d\u017e\7n\2\2\u017e\u017f\58\35\2\u017f"+
		"\u0182\3\2\2\2\u0180\u0182\58\35\2\u0181\u017c\3\2\2\2\u0181\u0180\3\2"+
		"\2\2\u0182\67\3\2\2\2\u0183\u0184\5:\36\2\u0184\u0185\7m\2\2\u0185\u0186"+
		"\58\35\2\u0186\u0189\3\2\2\2\u0187\u0189\5:\36\2\u0188\u0183\3\2\2\2\u0188"+
		"\u0187\3\2\2\2\u01899\3\2\2\2\u018a\u018b\t\4\2\2\u018b;\3\2\2\2\u018c"+
		"\u018d\7\34\2\2\u018d\u018e\5> \2\u018e\u018f\7\35\2\2\u018f=\3\2\2\2"+
		"\u0190\u0196\5@!\2\u0191\u0192\5@!\2\u0192\u0193\7\6\2\2\u0193\u0194\5"+
		"> \2\u0194\u0196\3\2\2\2\u0195\u0190\3\2\2\2\u0195\u0191\3\2\2\2\u0196"+
		"?\3\2\2\2\u0197\u0198\7\t\2\2\u0198\u0199\7e\2\2\u0199\u019a\5\62\32\2"+
		"\u019a\u019b\5B\"\2\u019b\u019c\5\62\32\2\u019c\u019d\5D#\2\u019d\u019e"+
		"\5F$\2\u019eA\3\2\2\2\u019f\u01a0\t\5\2\2\u01a0C\3\2\2\2\u01a1\u01a2\7"+
		"\62\2\2\u01a2\u01a5\5\62\32\2\u01a3\u01a5\3\2\2\2\u01a4\u01a1\3\2\2\2"+
		"\u01a4\u01a3\3\2\2\2\u01a5E\3\2\2\2\u01a6\u01a7\7\63\2\2\u01a7\u01aa\5"+
		"\62\32\2\u01a8\u01aa\3\2\2\2\u01a9\u01a6\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa"+
		"G\3\2\2\2\u01ab\u01b1\5\62\32\2\u01ac\u01ad\5\62\32\2\u01ad\u01ae\7\6"+
		"\2\2\u01ae\u01af\5H%\2\u01af\u01b1\3\2\2\2\u01b0\u01ab\3\2\2\2\u01b0\u01ac"+
		"\3\2\2\2\u01b1I\3\2\2\28OU]bhmotz\u0081\u0088\u008c\u0091\u009a\u00ab"+
		"\u00af\u00b4\u00ba\u00bf\u00c2\u00c6\u00cb\u00ce\u00d4\u00f7\u00fa\u00fe"+
		"\u0103\u0107\u010a\u010f\u0114\u0118\u011c\u0120\u0124\u0128\u0132\u0136"+
		"\u013d\u0141\u0145\u014f\u015a\u0162\u0168\u016f\u0178\u0181\u0188\u0195"+
		"\u01a4\u01a9\u01b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}