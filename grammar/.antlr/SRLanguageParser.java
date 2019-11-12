// Generated from c:\Users\u005Cusuario\Desktop\translatorSR-Python\grammar\SRLanguage.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SRLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, GLOBAL=6, END=7, IMPORT=8, RESOURCE=9, 
		INT=10, VAR=11, IF=12, FI=13, ELSE=14, EXTEND=15, BODY=16, IN=17, NI=18, 
		CALL=19, FA=20, AF=21, LPARENT=22, RPARENT=23, LBRACKET=24, RBRACKET=25, 
		COMA=26, INITIAL=27, CONST=28, RETURNS=29, RETURN=30, TO=31, DOWNTO=32, 
		FINAL=33, OP=34, DO=35, OD=36, PROC=37, CO=38, OC=39, CAP=40, SEND=41, 
		DESTROY=42, BEGIN=43, RECEIVE=44, CREATE=45, OPTYPE=46, BY=47, SUCHTHAT=48, 
		TYPE=49, NULL=50, BOOL=51, VAL=52, RES=53, REF=54, EXIT=55, NEXT=56, FILE=57, 
		PRIVATE=58, OR=59, INDEX=60, MOD=61, STOP=62, PROCEDURE=63, AND=64, REAL=65, 
		ON=66, ROW=67, TRUE=68, SENDER=69, LEFT=70, UP=71, ABORT=72, REPLY=73, 
		PROCESS=74, CHAR=75, STRING=76, FALSE=77, LOW=78, HIGH=79, NEW=80, ENUM=81, 
		ANY=82, REC=83, PTR=84, UNION=85, VM=86, SEM=87, XOR=88, SKP=89, FORWARD=90, 
		SEPARATE=91, WRITE=92, V=93, P=94, EJECUTA=95, NUM=96, SEPARA=97, LBRACE=98, 
		RBRACE=99, ASIGNACION=100, SWAP=101, INCREMENTO=102, DECREMENTO=103, DESPLAZAR_IZQ=104, 
		DESPLAZAR_DER=105, EXCLAMACION=106, AUG=107, OPERADOR_ARITMETICO=108, 
		OPERADOR_COMPARACION=109, CADENA=110, ESP=111, LINE_COMMENT=112, ID=113;
	public static final int
		RULE_components = 0, RULE_global = 1, RULE_resource_specification = 2, 
		RULE_resource_body = 3, RULE_spec_body = 4, RULE_proc = 5, RULE_block = 6, 
		RULE_block_items = 7, RULE_block_item = 8, RULE_declarations = 9, RULE_constant = 10, 
		RULE_type = 11, RULE_op_type = 12, RULE_variable = 13, RULE_operation = 14, 
		RULE_statements = 15, RULE_write_expr = 16, RULE_write_params = 17, RULE_explicit_call = 18, 
		RULE_invocation = 19, RULE_sequential = 20, RULE_op_invocation = 21, RULE_op_service = 22, 
		RULE_in_cmd = 23, RULE_resource_control = 24, RULE_t = 25, RULE_basic_type = 26, 
		RULE_enum_def = 27, RULE_pointer_def = 28, RULE_record_def = 29, RULE_union_def = 30, 
		RULE_capability_def = 31, RULE_cap_for = 32, RULE_prototype = 33, RULE_op_prototype = 34, 
		RULE_op_res = 35, RULE_id_list = 36, RULE_result_id = 37, RULE_type_res = 38, 
		RULE_subscripts = 39, RULE_id_subs_lp = 40, RULE_id_subs = 41, RULE_parameters = 42, 
		RULE_parameters2 = 43, RULE_expression = 44, RULE_op_log = 45, RULE_expr1 = 46, 
		RULE_expr2 = 47, RULE_expr3 = 48, RULE_quantifier = 49, RULE_quantifier1 = 50, 
		RULE_quantifier2 = 51, RULE_direction = 52, RULE_step_opt = 53, RULE_such_that_opt = 54, 
		RULE_actuals = 55, RULE_qualified_id = 56;
	public static final String[] ruleNames = {
		"components", "global", "resource_specification", "resource_body", "spec_body", 
		"proc", "block", "block_items", "block_item", "declarations", "constant", 
		"type", "op_type", "variable", "operation", "statements", "write_expr", 
		"write_params", "explicit_call", "invocation", "sequential", "op_invocation", 
		"op_service", "in_cmd", "resource_control", "t", "basic_type", "enum_def", 
		"pointer_def", "record_def", "union_def", "capability_def", "cap_for", 
		"prototype", "op_prototype", "op_res", "id_list", "result_id", "type_res", 
		"subscripts", "id_subs_lp", "id_subs", "parameters", "parameters2", "expression", 
		"op_log", "expr1", "expr2", "expr3", "quantifier", "quantifier1", "quantifier2", 
		"direction", "step_opt", "such_that_opt", "actuals", "qualified_id"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "'&'", "'||'", "'.'", "'global'", "'end'", "'import'", 
		"'resource'", "'int'", "'var'", "'if'", "'fi'", "'else'", "'extend'", 
		"'body'", "'in'", "'ni'", "'call'", "'fa'", "'af'", "'('", "')'", "'['", 
		"']'", "','", "'inital'", "'const'", "'returns'", "'return'", "'to'", 
		"'downto'", "'final'", "'op'", "'do'", "'od'", "'proc'", "'co'", "'oc'", 
		"'cap'", "'send'", "'destroy'", "'begin'", "'receive'", "'create'", "'optype'", 
		"'by'", "'st'", "'type'", "'null'", "'bool'", "'val'", "'res'", "'ref'", 
		"'exit'", "'next'", "'file'", "'private'", "'or'", "'index'", "'mod'", 
		"'stop'", "'procedure'", "'and'", "'real'", "'on'", "'row'", "'true'", 
		"'sender'", "'left'", "'up'", "'abort'", "'reply'", "'process'", "'char'", 
		"'string'", "'false'", "'low'", "'high'", "'new'", "'enum'", "'any'", 
		"'rec'", "'ptr'", "'union'", "'vm'", "'sem'", "'xor'", "'skip'", "'forward'", 
		"'separate'", "'write'", "'V'", "'P'", "'->'", null, "'[]'", "'{'", "'}'", 
		"':='", "':=:'", "'++'", "'--'", "'<<'", "'>>'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "GLOBAL", "END", "IMPORT", "RESOURCE", 
		"INT", "VAR", "IF", "FI", "ELSE", "EXTEND", "BODY", "IN", "NI", "CALL", 
		"FA", "AF", "LPARENT", "RPARENT", "LBRACKET", "RBRACKET", "COMA", "INITIAL", 
		"CONST", "RETURNS", "RETURN", "TO", "DOWNTO", "FINAL", "OP", "DO", "OD", 
		"PROC", "CO", "OC", "CAP", "SEND", "DESTROY", "BEGIN", "RECEIVE", "CREATE", 
		"OPTYPE", "BY", "SUCHTHAT", "TYPE", "NULL", "BOOL", "VAL", "RES", "REF", 
		"EXIT", "NEXT", "FILE", "PRIVATE", "OR", "INDEX", "MOD", "STOP", "PROCEDURE", 
		"AND", "REAL", "ON", "ROW", "TRUE", "SENDER", "LEFT", "UP", "ABORT", "REPLY", 
		"PROCESS", "CHAR", "STRING", "FALSE", "LOW", "HIGH", "NEW", "ENUM", "ANY", 
		"REC", "PTR", "UNION", "VM", "SEM", "XOR", "SKP", "FORWARD", "SEPARATE", 
		"WRITE", "V", "P", "EJECUTA", "NUM", "SEPARA", "LBRACE", "RBRACE", "ASIGNACION", 
		"SWAP", "INCREMENTO", "DECREMENTO", "DESPLAZAR_IZQ", "DESPLAZAR_DER", 
		"EXCLAMACION", "AUG", "OPERADOR_ARITMETICO", "OPERADOR_COMPARACION", "CADENA", 
		"ESP", "LINE_COMMENT", "ID"
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
	public String getGrammarFileName() { return "SRLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SRLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ComponentsContext extends ParserRuleContext {
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SRLanguageParser.EOF, 0); }
		public Resource_specificationContext resource_specification() {
			return getRuleContext(Resource_specificationContext.class,0);
		}
		public ComponentsContext components() {
			return getRuleContext(ComponentsContext.class,0);
		}
		public Resource_bodyContext resource_body() {
			return getRuleContext(Resource_bodyContext.class,0);
		}
		public ComponentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_components; }
	}

	public final ComponentsContext components() throws RecognitionException {
		ComponentsContext _localctx = new ComponentsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_components);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				global();
				setState(115);
				match(EOF);
				}
				break;
			case RESOURCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				resource_specification();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GLOBAL) | (1L << RESOURCE) | (1L << BODY))) != 0)) {
					{
					setState(118);
					components();
					}
				}

				setState(121);
				match(EOF);
				}
				break;
			case BODY:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				resource_body();
				setState(124);
				match(EOF);
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
		public TerminalNode GLOBAL() { return getToken(SRLanguageParser.GLOBAL, 0); }
		public TerminalNode ID() { return getToken(SRLanguageParser.ID, 0); }
		public TerminalNode END() { return getToken(SRLanguageParser.END, 0); }
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
			setState(128);
			match(GLOBAL);
			setState(129);
			match(ID);
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(130);
				constant();
				}
				break;
			case TYPE:
				{
				setState(131);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(134);
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
		public TerminalNode RESOURCE() { return getToken(SRLanguageParser.RESOURCE, 0); }
		public List<TerminalNode> ID() { return getTokens(SRLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SRLanguageParser.ID, i);
		}
		public TerminalNode IMPORT() { return getToken(SRLanguageParser.IMPORT, 0); }
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public List<Spec_bodyContext> spec_body() {
			return getRuleContexts(Spec_bodyContext.class);
		}
		public Spec_bodyContext spec_body(int i) {
			return getRuleContext(Spec_bodyContext.class,i);
		}
		public TerminalNode LPARENT() { return getToken(SRLanguageParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(SRLanguageParser.RPARENT, 0); }
		public List<TerminalNode> END() { return getTokens(SRLanguageParser.END); }
		public TerminalNode END(int i) {
			return getToken(SRLanguageParser.END, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode INITIAL() { return getToken(SRLanguageParser.INITIAL, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public TerminalNode FINAL() { return getToken(SRLanguageParser.FINAL, 0); }
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
			int _alt;
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(RESOURCE);
				setState(137);
				match(ID);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IMPORT) {
					{
					setState(138);
					match(IMPORT);
					setState(139);
					match(ID);
					}
				}

				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << OP) | (1L << OPTYPE) | (1L << TYPE))) != 0)) {
					{
					{
					setState(142);
					declarations();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(148);
						spec_body();
						}
						} 
					}
					setState(153);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(RESOURCE);
				setState(155);
				match(ID);
				setState(156);
				match(LPARENT);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(157);
					parameters();
					}
				}

				setState(160);
				match(RPARENT);
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(161);
						declarations();
						}
						} 
					}
					setState(166);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << IF) | (1L << IN) | (1L << CALL) | (1L << FA) | (1L << RETURN) | (1L << OP) | (1L << DO) | (1L << CO) | (1L << SEND) | (1L << DESTROY) | (1L << RECEIVE) | (1L << EXIT) | (1L << NEXT))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (REPLY - 73)) | (1L << (SKP - 73)) | (1L << (WRITE - 73)) | (1L << (ID - 73)))) != 0)) {
					{
					{
					setState(167);
					statements();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INITIAL) {
					{
					setState(173);
					match(INITIAL);
					setState(174);
					block();
					setState(175);
					match(END);
					}
				}

				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(179);
					proc();
					}
					}
					setState(182); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PROC );
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINAL) {
					{
					setState(184);
					match(FINAL);
					setState(185);
					block();
					setState(186);
					match(END);
					}
				}

				setState(190);
				match(END);
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

	public static class Resource_bodyContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(SRLanguageParser.BODY, 0); }
		public TerminalNode ID() { return getToken(SRLanguageParser.ID, 0); }
		public List<TerminalNode> END() { return getTokens(SRLanguageParser.END); }
		public TerminalNode END(int i) {
			return getToken(SRLanguageParser.END, i);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode INITIAL() { return getToken(SRLanguageParser.INITIAL, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public TerminalNode FINAL() { return getToken(SRLanguageParser.FINAL, 0); }
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
			setState(194);
			match(BODY);
			setState(195);
			match(ID);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << OP) | (1L << OPTYPE) | (1L << TYPE))) != 0)) {
				{
				setState(196);
				declarations();
				}
			}

			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIAL) {
				{
				setState(199);
				match(INITIAL);
				setState(200);
				block();
				setState(201);
				match(END);
				}
			}

			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205);
				proc();
				}
				}
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROC );
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(210);
				match(FINAL);
				setState(211);
				block();
				setState(212);
				match(END);
				}
			}

			setState(216);
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

	public static class Spec_bodyContext extends ParserRuleContext {
		public List<TerminalNode> END() { return getTokens(SRLanguageParser.END); }
		public TerminalNode END(int i) {
			return getToken(SRLanguageParser.END, i);
		}
		public TerminalNode BODY() { return getToken(SRLanguageParser.BODY, 0); }
		public List<TerminalNode> ID() { return getTokens(SRLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SRLanguageParser.ID, i);
		}
		public TerminalNode LPARENT() { return getToken(SRLanguageParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(SRLanguageParser.RPARENT, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode INITIAL() { return getToken(SRLanguageParser.INITIAL, 0); }
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public TerminalNode FINAL() { return getToken(SRLanguageParser.FINAL, 0); }
		public TerminalNode RESOURCE() { return getToken(SRLanguageParser.RESOURCE, 0); }
		public TerminalNode SEPARATE() { return getToken(SRLanguageParser.SEPARATE, 0); }
		public Spec_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_body; }
	}

	public final Spec_bodyContext spec_body() throws RecognitionException {
		Spec_bodyContext _localctx = new Spec_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_spec_body);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(END);
				}
				break;
			case BODY:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(BODY);
				setState(220);
				match(ID);
				setState(221);
				match(LPARENT);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(222);
					parameters();
					}
				}

				setState(225);
				match(RPARENT);
				setState(226);
				block();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INITIAL) {
					{
					setState(227);
					match(INITIAL);
					setState(228);
					block();
					setState(229);
					match(END);
					}
				}

				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PROC) {
					{
					{
					setState(233);
					proc();
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINAL) {
					{
					setState(239);
					match(FINAL);
					setState(240);
					block();
					setState(241);
					match(END);
					}
				}

				setState(245);
				match(END);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(246);
					match(ID);
					}
				}

				}
				break;
			case RESOURCE:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(RESOURCE);
				setState(250);
				match(ID);
				setState(251);
				match(LPARENT);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(252);
					parameters();
					}
				}

				setState(255);
				match(RPARENT);
				setState(256);
				match(SEPARATE);
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

	public static class ProcContext extends ParserRuleContext {
		public TerminalNode PROC() { return getToken(SRLanguageParser.PROC, 0); }
		public TerminalNode ID() { return getToken(SRLanguageParser.ID, 0); }
		public TerminalNode LPARENT() { return getToken(SRLanguageParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(SRLanguageParser.RPARENT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(SRLanguageParser.END, 0); }
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(SRLanguageParser.RETURNS, 0); }
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
		enterRule(_localctx, 10, RULE_proc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(PROC);
			setState(260);
			match(ID);
			setState(261);
			match(LPARENT);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(262);
				id_subs_lp(0);
				}
			}

			setState(265);
			match(RPARENT);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(266);
				match(RETURNS);
				setState(267);
				result_id();
				}
			}

			setState(270);
			block();
			setState(271);
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

	public static class BlockContext extends ParserRuleContext {
		public Block_itemsContext block_items() {
			return getRuleContext(Block_itemsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(273);
				block_items();
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

	public static class Block_itemsContext extends ParserRuleContext {
		public Block_itemContext block_item() {
			return getRuleContext(Block_itemContext.class,0);
		}
		public Block_itemsContext block_items() {
			return getRuleContext(Block_itemsContext.class,0);
		}
		public Block_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_items; }
	}

	public final Block_itemsContext block_items() throws RecognitionException {
		Block_itemsContext _localctx = new Block_itemsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			block_item();
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(277);
					match(T__0);
					}
				}

				setState(280);
				block_items();
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

	public static class Block_itemContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_item; }
	}

	public final Block_itemContext block_item() throws RecognitionException {
		Block_itemContext _localctx = new Block_itemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block_item);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				declarations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				statements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				expression();
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

	public static class DeclarationsContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
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
		enterRule(_localctx, 18, RULE_declarations);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				constant();
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(289);
					declarations();
					}
					break;
				}
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				type();
				setState(294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(293);
					declarations();
					}
					break;
				}
				}
				break;
			case OPTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				op_type();
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(297);
					declarations();
					}
					break;
				}
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				variable();
				}
				break;
			case OP:
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
				operation();
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(302);
					declarations();
					}
					break;
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(SRLanguageParser.CONST, 0); }
		public TerminalNode ID() { return getToken(SRLanguageParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(SRLanguageParser.ASIGNACION, 0); }
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
		enterRule(_localctx, 20, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(CONST);
			setState(308);
			match(ID);
			setState(309);
			match(ASIGNACION);
			setState(310);
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
		public TerminalNode TYPE() { return getToken(SRLanguageParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(SRLanguageParser.ID, 0); }
		public TerminalNode OPERADOR_COMPARACION() { return getToken(SRLanguageParser.OPERADOR_COMPARACION, 0); }
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
		enterRule(_localctx, 22, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(TYPE);
			setState(313);
			match(ID);
			setState(314);
			match(OPERADOR_COMPARACION);
			setState(315);
			t();
			setState(316);
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
		public TerminalNode OPTYPE() { return getToken(SRLanguageParser.OPTYPE, 0); }
		public TerminalNode ID() { return getToken(SRLanguageParser.ID, 0); }
		public TerminalNode OPERADOR_COMPARACION() { return getToken(SRLanguageParser.OPERADOR_COMPARACION, 0); }
		public TerminalNode LPARENT() { return getToken(SRLanguageParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(SRLanguageParser.RPARENT, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(SRLanguageParser.RETURNS, 0); }
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
		enterRule(_localctx, 24, RULE_op_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(OPTYPE);
			setState(319);
			match(ID);
			setState(320);
			match(OPERADOR_COMPARACION);
			setState(321);
			match(LPARENT);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(322);
				parameters();
				}
			}

			setState(325);
			match(RPARENT);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(326);
				match(RETURNS);
				setState(327);
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
		public TerminalNode VAR() { return getToken(SRLanguageParser.VAR, 0); }
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(SRLanguageParser.ASIGNACION, 0); }
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
		enterRule(_localctx, 26, RULE_variable);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(VAR);
				setState(331);
				id_subs_lp(0);
				setState(332);
				match(T__1);
				setState(333);
				t();
				setState(336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(334);
					match(ASIGNACION);
					setState(335);
					expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(VAR);
				setState(339);
				id_subs_lp(0);
				setState(340);
				match(ASIGNACION);
				setState(341);
				expression();
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(SRLanguageParser.OP, 0); }
		public List<Id_subs_lpContext> id_subs_lp() {
			return getRuleContexts(Id_subs_lpContext.class);
		}
		public Id_subs_lpContext id_subs_lp(int i) {
			return getRuleContext(Id_subs_lpContext.class,i);
		}
		public Op_prototypeContext op_prototype() {
			return getRuleContext(Op_prototypeContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(SRLanguageParser.RETURNS, 0); }
		public Result_idContext result_id() {
			return getRuleContext(Result_idContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SRLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SRLanguageParser.ID, i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operation);
		int _la;
		try {
			int _alt;
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(OP);
				setState(346);
				id_subs_lp(0);
				setState(347);
				op_prototype();
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURNS) {
					{
					setState(348);
					match(RETURNS);
					setState(349);
					result_id();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(OP);
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(354);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ID) {
							{
							setState(353);
							id_subs_lp(0);
							}
						}

						setState(356);
						match(T__1);
						setState(357);
						match(ID);
						setState(359);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMA) {
							{
							setState(358);
							match(COMA);
							}
						}

						}
						} 
					}
					setState(365);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		public Explicit_callContext explicit_call() {
			return getRuleContext(Explicit_callContext.class,0);
		}
		public Write_exprContext write_expr() {
			return getRuleContext(Write_exprContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statements);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				sequential();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				op_invocation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				op_service();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				resource_control();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(372);
				explicit_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(373);
				write_expr();
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

	public static class Write_exprContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(SRLanguageParser.WRITE, 0); }
		public TerminalNode LPARENT() { return getToken(SRLanguageParser.LPARENT, 0); }
		public Write_paramsContext write_params() {
			return getRuleContext(Write_paramsContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(SRLanguageParser.RPARENT, 0); }
		public Write_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_expr; }
	}

	public final Write_exprContext write_expr() throws RecognitionException {
		Write_exprContext _localctx = new Write_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_write_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(WRITE);
			setState(377);
			match(LPARENT);
			setState(378);
			write_params();
			setState(379);
			match(RPARENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_paramsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Write_paramsContext> write_params() {
			return getRuleContexts(Write_paramsContext.class);
		}
		public Write_paramsContext write_params(int i) {
			return getRuleContext(Write_paramsContext.class,i);
		}
		public Write_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_params; }
	}

	public final Write_paramsContext write_params() throws RecognitionException {
		Write_paramsContext _localctx = new Write_paramsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_write_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			expression();
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(382);
					match(COMA);
					setState(383);
					write_params();
					}
					} 
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class Explicit_callContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(SRLanguageParser.CALL, 0); }
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public Explicit_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_call; }
	}

	public final Explicit_callContext explicit_call() throws RecognitionException {
		Explicit_callContext _localctx = new Explicit_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_explicit_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(CALL);
			setState(390);
			invocation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvocationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPARENT() { return getToken(SRLanguageParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(SRLanguageParser.RPARENT, 0); }
		public ActualsContext actuals() {
			return getRuleContext(ActualsContext.class,0);
		}
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			expression();
			setState(393);
			match(LPARENT);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPARENT || _la==NULL || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (NUM - 68)) | (1L << (EXCLAMACION - 68)) | (1L << (CADENA - 68)) | (1L << (ID - 68)))) != 0)) {
				{
				setState(394);
				actuals();
				}
			}

			setState(397);
			match(RPARENT);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SKP() { return getToken(SRLanguageParser.SKP, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(SRLanguageParser.ASIGNACION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCREMENTO() { return getToken(SRLanguageParser.INCREMENTO, 0); }
		public TerminalNode DECREMENTO() { return getToken(SRLanguageParser.DECREMENTO, 0); }
		public TerminalNode IF() { return getToken(SRLanguageParser.IF, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode EJECUTA() { return getToken(SRLanguageParser.EJECUTA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FI() { return getToken(SRLanguageParser.FI, 0); }
		public TerminalNode SEPARA() { return getToken(SRLanguageParser.SEPARA, 0); }
		public TerminalNode DO() { return getToken(SRLanguageParser.DO, 0); }
		public TerminalNode OD() { return getToken(SRLanguageParser.OD, 0); }
		public TerminalNode FA() { return getToken(SRLanguageParser.FA, 0); }
		public Quantifier1Context quantifier1() {
			return getRuleContext(Quantifier1Context.class,0);
		}
		public TerminalNode AF() { return getToken(SRLanguageParser.AF, 0); }
		public TerminalNode EXIT() { return getToken(SRLanguageParser.EXIT, 0); }
		public TerminalNode NEXT() { return getToken(SRLanguageParser.NEXT, 0); }
		public SequentialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequential; }
	}

	public final SequentialContext sequential() throws RecognitionException {
		SequentialContext _localctx = new SequentialContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sequential);
		int _la;
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(SKP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				variable();
				setState(401);
				match(ASIGNACION);
				setState(402);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				variable();
				setState(405);
				match(INCREMENTO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				variable();
				setState(408);
				match(DECREMENTO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
				match(IF);
				setState(411);
				expr1();
				setState(412);
				match(EJECUTA);
				setState(413);
				block();
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARA) {
					{
					setState(414);
					match(SEPARA);
					}
				}

				setState(417);
				match(FI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(419);
				match(DO);
				setState(420);
				expr1();
				setState(421);
				match(EJECUTA);
				setState(422);
				block();
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARA) {
					{
					setState(423);
					match(SEPARA);
					}
				}

				setState(426);
				match(OD);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(428);
				match(FA);
				setState(429);
				quantifier1();
				setState(430);
				match(EJECUTA);
				setState(431);
				block();
				setState(432);
				match(AF);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(434);
				match(EXIT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(435);
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
		public TerminalNode CALL() { return getToken(SRLanguageParser.CALL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEND() { return getToken(SRLanguageParser.SEND, 0); }
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public TerminalNode CO() { return getToken(SRLanguageParser.CO, 0); }
		public TerminalNode OC() { return getToken(SRLanguageParser.OC, 0); }
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public TerminalNode EJECUTA() { return getToken(SRLanguageParser.EJECUTA, 0); }
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
		enterRule(_localctx, 42, RULE_op_invocation);
		int _la;
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CALL) {
					{
					setState(438);
					match(CALL);
					}
				}

				setState(441);
				operation();
				setState(443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(442);
					expression();
					}
					break;
				}
				}
				break;
			case SEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				match(SEND);
				setState(446);
				invocation();
				}
				break;
			case CO:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				match(CO);
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENT) {
					{
					setState(448);
					quantifier();
					}
				}

				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CALL) {
					{
					setState(451);
					match(CALL);
					}
				}

				setState(454);
				operation();
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENT || _la==NULL || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (NUM - 68)) | (1L << (EXCLAMACION - 68)) | (1L << (CADENA - 68)) | (1L << (ID - 68)))) != 0)) {
					{
					setState(455);
					expression();
					}
				}

				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EJECUTA) {
					{
					setState(458);
					match(EJECUTA);
					setState(459);
					block();
					}
				}

				setState(462);
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
		public TerminalNode IN() { return getToken(SRLanguageParser.IN, 0); }
		public TerminalNode NI() { return getToken(SRLanguageParser.NI, 0); }
		public List<In_cmdContext> in_cmd() {
			return getRuleContexts(In_cmdContext.class);
		}
		public In_cmdContext in_cmd(int i) {
			return getRuleContext(In_cmdContext.class,i);
		}
		public TerminalNode RECEIVE() { return getToken(SRLanguageParser.RECEIVE, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(SRLanguageParser.RETURN, 0); }
		public TerminalNode REPLY() { return getToken(SRLanguageParser.REPLY, 0); }
		public Op_serviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_service; }
	}

	public final Op_serviceContext op_service() throws RecognitionException {
		Op_serviceContext _localctx = new Op_serviceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_op_service);
		int _la;
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				match(IN);
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPARENT || _la==ID) {
					{
					{
					setState(467);
					in_cmd();
					}
					}
					setState(472);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(473);
				match(NI);
				}
				break;
			case RECEIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(RECEIVE);
				setState(475);
				operation();
				setState(477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(476);
					variable();
					}
					break;
				}
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				match(RETURN);
				}
				break;
			case REPLY:
				enterOuterAlt(_localctx, 4);
				{
				setState(480);
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

	public static class In_cmdContext extends ParserRuleContext {
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public TerminalNode LPARENT() { return getToken(SRLanguageParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(SRLanguageParser.RPARENT, 0); }
		public TerminalNode EJECUTA() { return getToken(SRLanguageParser.EJECUTA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode BY() { return getToken(SRLanguageParser.BY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(SRLanguageParser.RETURNS, 0); }
		public Result_idContext result_id() {
			return getRuleContext(Result_idContext.class,0);
		}
		public TerminalNode SEPARA() { return getToken(SRLanguageParser.SEPARA, 0); }
		public In_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_cmd; }
	}

	public final In_cmdContext in_cmd() throws RecognitionException {
		In_cmdContext _localctx = new In_cmdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_in_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPARENT) {
				{
				setState(483);
				quantifier();
				}
			}

			setState(486);
			qualified_id();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(487);
				subscripts();
				}
			}

			setState(490);
			match(LPARENT);
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(491);
				id_list();
				}
				break;
			}
			setState(494);
			match(RPARENT);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(495);
				match(T__2);
				setState(496);
				expr1();
				}
			}

			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(499);
				match(BY);
				setState(500);
				expression();
				}
			}

			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(503);
				match(RETURNS);
				setState(504);
				result_id();
				}
			}

			setState(507);
			match(EJECUTA);
			setState(508);
			block();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARA) {
				{
				setState(509);
				match(SEPARA);
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

	public static class Resource_controlContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SRLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SRLanguageParser.ID, i);
		}
		public TerminalNode ASIGNACION() { return getToken(SRLanguageParser.ASIGNACION, 0); }
		public TerminalNode CREATE() { return getToken(SRLanguageParser.CREATE, 0); }
		public TerminalNode LPARENT() { return getToken(SRLanguageParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(SRLanguageParser.RPARENT, 0); }
		public ActualsContext actuals() {
			return getRuleContext(ActualsContext.class,0);
		}
		public TerminalNode ON() { return getToken(SRLanguageParser.ON, 0); }
		public TerminalNode DESTROY() { return getToken(SRLanguageParser.DESTROY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Resource_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_control; }
	}

	public final Resource_controlContext resource_control() throws RecognitionException {
		Resource_controlContext _localctx = new Resource_controlContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_resource_control);
		int _la;
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(ID);
				setState(513);
				match(ASIGNACION);
				setState(514);
				match(CREATE);
				setState(515);
				match(ID);
				setState(516);
				match(LPARENT);
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENT || _la==NULL || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (NUM - 68)) | (1L << (EXCLAMACION - 68)) | (1L << (CADENA - 68)) | (1L << (ID - 68)))) != 0)) {
					{
					setState(517);
					actuals();
					}
				}

				setState(520);
				match(RPARENT);
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(521);
					match(ON);
					setState(522);
					match(ID);
					}
				}

				}
				break;
			case DESTROY:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				match(DESTROY);
				setState(526);
				expression();
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
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Enum_defContext enum_def() {
			return getRuleContext(Enum_defContext.class,0);
		}
		public Pointer_defContext pointer_def() {
			return getRuleContext(Pointer_defContext.class,0);
		}
		public Record_defContext record_def() {
			return getRuleContext(Record_defContext.class,0);
		}
		public Union_defContext union_def() {
			return getRuleContext(Union_defContext.class,0);
		}
		public Capability_defContext capability_def() {
			return getRuleContext(Capability_defContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_t);
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FILE:
			case REAL:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				basic_type();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				enum_def();
				}
				break;
			case PTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				pointer_def();
				}
				break;
			case REC:
				enterOuterAlt(_localctx, 4);
				{
				setState(532);
				record_def();
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 5);
				{
				setState(533);
				union_def();
				}
				break;
			case CAP:
				enterOuterAlt(_localctx, 6);
				{
				setState(534);
				capability_def();
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(535);
					t();
					}
					break;
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(538);
				qualified_id();
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

	public static class Basic_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(SRLanguageParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(SRLanguageParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(SRLanguageParser.INT, 0); }
		public TerminalNode FILE() { return getToken(SRLanguageParser.FILE, 0); }
		public TerminalNode REAL() { return getToken(SRLanguageParser.REAL, 0); }
		public Basic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type; }
	}

	public final Basic_typeContext basic_type() throws RecognitionException {
		Basic_typeContext _localctx = new Basic_typeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_basic_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FILE))) != 0) || _la==REAL || _la==CHAR) ) {
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

	public static class Enum_defContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(SRLanguageParser.ENUM, 0); }
		public TerminalNode LPARENT() { return getToken(SRLanguageParser.LPARENT, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(SRLanguageParser.RPARENT, 0); }
		public Enum_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_def; }
	}

	public final Enum_defContext enum_def() throws RecognitionException {
		Enum_defContext _localctx = new Enum_defContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_enum_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(ENUM);
			setState(544);
			match(LPARENT);
			setState(545);
			id_list();
			setState(546);
			match(RPARENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pointer_defContext extends ParserRuleContext {
		public TerminalNode PTR() { return getToken(SRLanguageParser.PTR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ANY() { return getToken(SRLanguageParser.ANY, 0); }
		public Pointer_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_def; }
	}

	public final Pointer_defContext pointer_def() throws RecognitionException {
		Pointer_defContext _localctx = new Pointer_defContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pointer_def);
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				match(PTR);
				setState(549);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				match(PTR);
				setState(551);
				match(ANY);
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

	public static class Record_defContext extends ParserRuleContext {
		public TerminalNode REC() { return getToken(SRLanguageParser.REC, 0); }
		public TerminalNode LPARENT() { return getToken(SRLanguageParser.LPARENT, 0); }
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(SRLanguageParser.RPARENT, 0); }
		public TerminalNode ASIGNACION() { return getToken(SRLanguageParser.ASIGNACION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Record_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_def; }
	}

	public final Record_defContext record_def() throws RecognitionException {
		Record_defContext _localctx = new Record_defContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_record_def);
		int _la;
		try {
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				match(REC);
				setState(555);
				match(LPARENT);
				setState(556);
				id_subs_lp(0);
				setState(557);
				match(T__1);
				setState(558);
				t();
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASIGNACION) {
					{
					setState(559);
					match(ASIGNACION);
					setState(560);
					expression();
					}
				}

				setState(563);
				match(RPARENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				match(REC);
				setState(566);
				match(LPARENT);
				setState(567);
				id_subs_lp(0);
				setState(568);
				match(ASIGNACION);
				setState(569);
				expression();
				setState(570);
				match(RPARENT);
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

	public static class Union_defContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(SRLanguageParser.UNION, 0); }
		public TerminalNode LPARENT() { return getToken(SRLanguageParser.LPARENT, 0); }
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(SRLanguageParser.RPARENT, 0); }
		public TerminalNode ASIGNACION() { return getToken(SRLanguageParser.ASIGNACION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Union_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_def; }
	}

	public final Union_defContext union_def() throws RecognitionException {
		Union_defContext _localctx = new Union_defContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_union_def);
		int _la;
		try {
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(UNION);
				setState(575);
				match(LPARENT);
				setState(576);
				id_subs_lp(0);
				setState(577);
				match(T__1);
				setState(578);
				t();
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASIGNACION) {
					{
					setState(579);
					match(ASIGNACION);
					setState(580);
					expression();
					}
				}

				setState(583);
				match(RPARENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(UNION);
				setState(586);
				match(LPARENT);
				setState(587);
				id_subs_lp(0);
				setState(588);
				match(ASIGNACION);
				setState(589);
				expression();
				setState(590);
				match(RPARENT);
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

	public static class Capability_defContext extends ParserRuleContext {
		public TerminalNode CAP() { return getToken(SRLanguageParser.CAP, 0); }
		public Cap_forContext cap_for() {
			return getRuleContext(Cap_forContext.class,0);
		}
		public Capability_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capability_def; }
	}

	public final Capability_defContext capability_def() throws RecognitionException {
		Capability_defContext _localctx = new Capability_defContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_capability_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(CAP);
			setState(595);
			cap_for();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cap_forContext extends ParserRuleContext {
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public Op_prototypeContext op_prototype() {
			return getRuleContext(Op_prototypeContext.class,0);
		}
		public TerminalNode SEM() { return getToken(SRLanguageParser.SEM, 0); }
		public TerminalNode VM() { return getToken(SRLanguageParser.VM, 0); }
		public Cap_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cap_for; }
	}

	public final Cap_forContext cap_for() throws RecognitionException {
		Cap_forContext _localctx = new Cap_forContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_cap_for);
		try {
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				qualified_id();
				}
				break;
			case LPARENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				op_prototype();
				}
				break;
			case SEM:
				enterOuterAlt(_localctx, 3);
				{
				setState(599);
				match(SEM);
				}
				break;
			case VM:
				enterOuterAlt(_localctx, 4);
				{
				setState(600);
				match(VM);
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

	public static class PrototypeContext extends ParserRuleContext {
		public TerminalNode LPARENT() { return getToken(SRLanguageParser.LPARENT, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(SRLanguageParser.RPARENT, 0); }
		public TerminalNode RETURNS() { return getToken(SRLanguageParser.RETURNS, 0); }
		public Result_idContext result_id() {
			return getRuleContext(Result_idContext.class,0);
		}
		public PrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototype; }
	}

	public final PrototypeContext prototype() throws RecognitionException {
		PrototypeContext _localctx = new PrototypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(LPARENT);
			setState(604);
			parameters();
			setState(605);
			match(RPARENT);
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(606);
				match(RETURNS);
				setState(607);
				result_id();
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

	public static class Op_prototypeContext extends ParserRuleContext {
		public PrototypeContext prototype() {
			return getRuleContext(PrototypeContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(SRLanguageParser.LBRACE, 0); }
		public Op_resContext op_res() {
			return getRuleContext(Op_resContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SRLanguageParser.RBRACE, 0); }
		public Op_prototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_prototype; }
	}

	public final Op_prototypeContext op_prototype() throws RecognitionException {
		Op_prototypeContext _localctx = new Op_prototypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_op_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			prototype();
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(611);
				match(LBRACE);
				setState(612);
				op_res();
				setState(613);
				match(RBRACE);
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

	public static class Op_resContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(SRLanguageParser.CALL, 0); }
		public TerminalNode SEND() { return getToken(SRLanguageParser.SEND, 0); }
		public Op_resContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_res; }
	}

	public final Op_resContext op_res() throws RecognitionException {
		Op_resContext _localctx = new Op_resContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_op_res);
		try {
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				match(CALL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				match(SEND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
				match(CALL);
				setState(620);
				match(COMA);
				setState(621);
				match(SEND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(622);
				match(SEND);
				setState(623);
				match(COMA);
				setState(624);
				match(CALL);
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

	public static class Id_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 72, RULE_id_list);
		int _la;
		try {
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENT || _la==NULL || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (NUM - 68)) | (1L << (EXCLAMACION - 68)) | (1L << (CADENA - 68)) | (1L << (ID - 68)))) != 0)) {
					{
					setState(628);
					expression();
					setState(629);
					match(COMA);
					setState(630);
					id_list();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENT || _la==NULL || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (NUM - 68)) | (1L << (EXCLAMACION - 68)) | (1L << (CADENA - 68)) | (1L << (ID - 68)))) != 0)) {
					{
					setState(634);
					expression();
					setState(635);
					match(T__1);
					setState(636);
					id_list();
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
		enterRule(_localctx, 74, RULE_result_id);
		try {
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(643);
					id_list();
					setState(644);
					match(T__1);
					setState(645);
					t();
					}
					break;
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

	public static class Type_resContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SRLanguageParser.LBRACE, 0); }
		public TerminalNode ID() { return getToken(SRLanguageParser.ID, 0); }
		public TerminalNode RBRACE() { return getToken(SRLanguageParser.RBRACE, 0); }
		public Type_resContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_res; }
	}

	public final Type_resContext type_res() throws RecognitionException {
		Type_resContext _localctx = new Type_resContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_type_res);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(651);
				match(LBRACE);
				setState(652);
				match(ID);
				setState(653);
				match(RBRACE);
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

	public static class SubscriptsContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(SRLanguageParser.LBRACKET, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(SRLanguageParser.RBRACKET, 0); }
		public SubscriptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscripts; }
	}

	public final SubscriptsContext subscripts() throws RecognitionException {
		SubscriptsContext _localctx = new SubscriptsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_subscripts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(LBRACKET);
			setState(657);
			id_list();
			setState(658);
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

	public static class Id_subs_lpContext extends ParserRuleContext {
		public Id_subsContext id_subs() {
			return getRuleContext(Id_subsContext.class,0);
		}
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SRLanguageParser.COMA, 0); }
		public Id_subs_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_subs_lp; }
	}

	public final Id_subs_lpContext id_subs_lp() throws RecognitionException {
		return id_subs_lp(0);
	}

	private Id_subs_lpContext id_subs_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Id_subs_lpContext _localctx = new Id_subs_lpContext(_ctx, _parentState);
		Id_subs_lpContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_id_subs_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(661);
			id_subs();
			}
			_ctx.stop = _input.LT(-1);
			setState(668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_subs_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_subs_lp);
					setState(663);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(664);
					match(COMA);
					setState(665);
					id_subs();
					}
					} 
				}
				setState(670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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

	public static class Id_subsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SRLanguageParser.ID, 0); }
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public Id_subsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_subs; }
	}

	public final Id_subsContext id_subs() throws RecognitionException {
		Id_subsContext _localctx = new Id_subsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_id_subs);
		try {
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				match(ID);
				setState(673);
				subscripts();
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
		enterRule(_localctx, 84, RULE_parameters);
		try {
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				parameters2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				parameters2();
				setState(678);
				match(T__0);
				setState(679);
				parameters();
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
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
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
		enterRule(_localctx, 86, RULE_parameters2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			id_subs_lp(0);
			setState(684);
			match(T__1);
			setState(685);
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
		public TerminalNode EXCLAMACION() { return getToken(SRLanguageParser.EXCLAMACION, 0); }
		public TerminalNode ASIGNACION() { return getToken(SRLanguageParser.ASIGNACION, 0); }
		public TerminalNode LPARENT() { return getToken(SRLanguageParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(SRLanguageParser.RPARENT, 0); }
		public TerminalNode ID() { return getToken(SRLanguageParser.ID, 0); }
		public ActualsContext actuals() {
			return getRuleContext(ActualsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expression);
		int _la;
		try {
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				expr1();
				setState(688);
				op_log();
				setState(689);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				match(EXCLAMACION);
				setState(692);
				expr1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(693);
				expr1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(694);
				expr1();
				setState(695);
				match(ASIGNACION);
				setState(696);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(698);
					match(ID);
					}
				}

				setState(701);
				match(LPARENT);
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENT || _la==NULL || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (NUM - 68)) | (1L << (EXCLAMACION - 68)) | (1L << (CADENA - 68)) | (1L << (ID - 68)))) != 0)) {
					{
					setState(702);
					actuals();
					}
				}

				setState(705);
				match(RPARENT);
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
		enterRule(_localctx, 90, RULE_op_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
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
		public TerminalNode OPERADOR_COMPARACION() { return getToken(SRLanguageParser.OPERADOR_COMPARACION, 0); }
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_expr1);
		try {
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				expr2();
				setState(711);
				match(OPERADOR_COMPARACION);
				setState(712);
				expr2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
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
		public TerminalNode OPERADOR_ARITMETICO() { return getToken(SRLanguageParser.OPERADOR_ARITMETICO, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode AUG() { return getToken(SRLanguageParser.AUG, 0); }
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_expr2);
		try {
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				expr3();
				setState(718);
				match(OPERADOR_ARITMETICO);
				setState(719);
				expr2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				expr3();
				setState(722);
				match(AUG);
				setState(723);
				expr2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(725);
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
		public TerminalNode ID() { return getToken(SRLanguageParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SRLanguageParser.NUM, 0); }
		public TerminalNode TRUE() { return getToken(SRLanguageParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SRLanguageParser.FALSE, 0); }
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public TerminalNode CADENA() { return getToken(SRLanguageParser.CADENA, 0); }
		public TerminalNode NULL() { return getToken(SRLanguageParser.NULL, 0); }
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_expr3);
		try {
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(730);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(731);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(732);
				id_subs_lp(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(733);
				qualified_id();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(734);
				match(CADENA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(735);
				match(NULL);
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
		enterRule(_localctx, 98, RULE_quantifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(LPARENT);
			setState(739);
			quantifier1();
			setState(740);
			match(RPARENT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 100, RULE_quantifier1);
		try {
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				quantifier2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				quantifier2();
				setState(744);
				match(COMA);
				setState(745);
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
		public TerminalNode ID() { return getToken(SRLanguageParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(SRLanguageParser.ASIGNACION, 0); }
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
		enterRule(_localctx, 102, RULE_quantifier2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(ID);
			setState(750);
			match(ASIGNACION);
			setState(751);
			expression();
			setState(752);
			direction();
			setState(753);
			expression();
			setState(754);
			step_opt();
			setState(755);
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
		public TerminalNode TO() { return getToken(SRLanguageParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(SRLanguageParser.DOWNTO, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
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
		public TerminalNode BY() { return getToken(SRLanguageParser.BY, 0); }
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
		enterRule(_localctx, 106, RULE_step_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(759);
				match(BY);
				setState(760);
				expression();
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

	public static class Such_that_optContext extends ParserRuleContext {
		public TerminalNode SUCHTHAT() { return getToken(SRLanguageParser.SUCHTHAT, 0); }
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
		enterRule(_localctx, 108, RULE_such_that_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUCHTHAT) {
				{
				setState(763);
				match(SUCHTHAT);
				setState(764);
				expression();
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
		enterRule(_localctx, 110, RULE_actuals);
		try {
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				expression();
				setState(769);
				match(COMA);
				setState(770);
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

	public static class Qualified_idContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SRLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SRLanguageParser.ID, i);
		}
		public TerminalNode LPARENT() { return getToken(SRLanguageParser.LPARENT, 0); }
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(SRLanguageParser.RPARENT, 0); }
		public Qualified_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_id; }
	}

	public final Qualified_idContext qualified_id() throws RecognitionException {
		Qualified_idContext _localctx = new Qualified_idContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_qualified_id);
		try {
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				match(ID);
				setState(776);
				match(T__4);
				setState(777);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(778);
				match(ID);
				setState(779);
				match(T__4);
				setState(780);
				match(ID);
				setState(781);
				match(LPARENT);
				setState(782);
				id_subs_lp(0);
				setState(783);
				match(RPARENT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 40:
			return id_subs_lp_sempred((Id_subs_lpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean id_subs_lp_sempred(Id_subs_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3s\u0316\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\2\5\2z\n\2\3\2\3\2\3\2\3\2\3\2\5\2\u0081\n\2\3\3\3\3\3\3\3\3\5\3\u0087"+
		"\n\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u008f\n\4\3\4\7\4\u0092\n\4\f\4\16\4"+
		"\u0095\13\4\3\4\7\4\u0098\n\4\f\4\16\4\u009b\13\4\3\4\3\4\3\4\3\4\5\4"+
		"\u00a1\n\4\3\4\3\4\7\4\u00a5\n\4\f\4\16\4\u00a8\13\4\3\4\7\4\u00ab\n\4"+
		"\f\4\16\4\u00ae\13\4\3\4\3\4\3\4\3\4\5\4\u00b4\n\4\3\4\6\4\u00b7\n\4\r"+
		"\4\16\4\u00b8\3\4\3\4\3\4\3\4\5\4\u00bf\n\4\3\4\3\4\5\4\u00c3\n\4\3\5"+
		"\3\5\3\5\5\5\u00c8\n\5\3\5\3\5\3\5\3\5\5\5\u00ce\n\5\3\5\6\5\u00d1\n\5"+
		"\r\5\16\5\u00d2\3\5\3\5\3\5\3\5\5\5\u00d9\n\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u00e2\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ea\n\6\3\6\7\6\u00ed"+
		"\n\6\f\6\16\6\u00f0\13\6\3\6\3\6\3\6\3\6\5\6\u00f6\n\6\3\6\3\6\5\6\u00fa"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u0100\n\6\3\6\3\6\5\6\u0104\n\6\3\7\3\7\3\7\3"+
		"\7\5\7\u010a\n\7\3\7\3\7\3\7\5\7\u010f\n\7\3\7\3\7\3\7\3\b\5\b\u0115\n"+
		"\b\3\t\3\t\5\t\u0119\n\t\3\t\5\t\u011c\n\t\3\n\3\n\3\n\5\n\u0121\n\n\3"+
		"\13\3\13\5\13\u0125\n\13\3\13\3\13\5\13\u0129\n\13\3\13\3\13\5\13\u012d"+
		"\n\13\3\13\3\13\3\13\5\13\u0132\n\13\5\13\u0134\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u0146\n\16\3"+
		"\16\3\16\3\16\5\16\u014b\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0153"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u015a\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0161\n\20\3\20\3\20\5\20\u0165\n\20\3\20\3\20\3\20\5\20\u016a\n"+
		"\20\7\20\u016c\n\20\f\20\16\20\u016f\13\20\5\20\u0171\n\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u0179\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\7\23\u0183\n\23\f\23\16\23\u0186\13\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\5\25\u018e\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01a2\n\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u01ab\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u01b7\n\26\3\27\5\27\u01ba\n\27\3\27\3\27\5\27\u01be"+
		"\n\27\3\27\3\27\3\27\3\27\5\27\u01c4\n\27\3\27\5\27\u01c7\n\27\3\27\3"+
		"\27\5\27\u01cb\n\27\3\27\3\27\5\27\u01cf\n\27\3\27\3\27\5\27\u01d3\n\27"+
		"\3\30\3\30\7\30\u01d7\n\30\f\30\16\30\u01da\13\30\3\30\3\30\3\30\3\30"+
		"\5\30\u01e0\n\30\3\30\3\30\5\30\u01e4\n\30\3\31\5\31\u01e7\n\31\3\31\3"+
		"\31\5\31\u01eb\n\31\3\31\3\31\5\31\u01ef\n\31\3\31\3\31\3\31\5\31\u01f4"+
		"\n\31\3\31\3\31\5\31\u01f8\n\31\3\31\3\31\5\31\u01fc\n\31\3\31\3\31\3"+
		"\31\5\31\u0201\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0209\n\32\3\32"+
		"\3\32\3\32\5\32\u020e\n\32\3\32\3\32\5\32\u0212\n\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u021b\n\33\3\33\5\33\u021e\n\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u022b\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0234\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u023f\n\37\3 \3 \3 \3 \3 \3 \3 \5 \u0248\n \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \5 \u0253\n \3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u025c\n\"\3"+
		"#\3#\3#\3#\3#\5#\u0263\n#\3$\3$\3$\3$\3$\5$\u026a\n$\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\5%\u0274\n%\3&\3&\3&\3&\3&\5&\u027b\n&\3&\3&\3&\3&\5&\u0281\n"+
		"&\5&\u0283\n&\3\'\3\'\3\'\3\'\3\'\5\'\u028a\n\'\5\'\u028c\n\'\3(\3(\3"+
		"(\5(\u0291\n(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\7*\u029d\n*\f*\16*\u02a0\13"+
		"*\3+\3+\3+\5+\u02a5\n+\3,\3,\3,\3,\3,\5,\u02ac\n,\3-\3-\3-\3-\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02be\n.\3.\3.\5.\u02c2\n.\3.\5.\u02c5"+
		"\n.\3/\3/\3\60\3\60\3\60\3\60\3\60\5\60\u02ce\n\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\5\61\u02d9\n\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\5\62\u02e3\n\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u02ee\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\5\67\u02fc\n\67\38\38\58\u0300\n8\39\39\39\39\39\59\u0307\n9\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0314\n:\3:\2\3R;\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnpr\2\5\7\2\f\f\65\65;;CCMM\3\2\5\6\3\2!\"\2\u036a\2\u0080\3\2\2\2\4"+
		"\u0082\3\2\2\2\6\u00c2\3\2\2\2\b\u00c4\3\2\2\2\n\u0103\3\2\2\2\f\u0105"+
		"\3\2\2\2\16\u0114\3\2\2\2\20\u0116\3\2\2\2\22\u0120\3\2\2\2\24\u0133\3"+
		"\2\2\2\26\u0135\3\2\2\2\30\u013a\3\2\2\2\32\u0140\3\2\2\2\34\u0159\3\2"+
		"\2\2\36\u0170\3\2\2\2 \u0178\3\2\2\2\"\u017a\3\2\2\2$\u017f\3\2\2\2&\u0187"+
		"\3\2\2\2(\u018a\3\2\2\2*\u01b6\3\2\2\2,\u01d2\3\2\2\2.\u01e3\3\2\2\2\60"+
		"\u01e6\3\2\2\2\62\u0211\3\2\2\2\64\u021d\3\2\2\2\66\u021f\3\2\2\28\u0221"+
		"\3\2\2\2:\u022a\3\2\2\2<\u023e\3\2\2\2>\u0252\3\2\2\2@\u0254\3\2\2\2B"+
		"\u025b\3\2\2\2D\u025d\3\2\2\2F\u0264\3\2\2\2H\u0273\3\2\2\2J\u0282\3\2"+
		"\2\2L\u028b\3\2\2\2N\u0290\3\2\2\2P\u0292\3\2\2\2R\u0296\3\2\2\2T\u02a4"+
		"\3\2\2\2V\u02ab\3\2\2\2X\u02ad\3\2\2\2Z\u02c4\3\2\2\2\\\u02c6\3\2\2\2"+
		"^\u02cd\3\2\2\2`\u02d8\3\2\2\2b\u02e2\3\2\2\2d\u02e4\3\2\2\2f\u02ed\3"+
		"\2\2\2h\u02ef\3\2\2\2j\u02f7\3\2\2\2l\u02fb\3\2\2\2n\u02ff\3\2\2\2p\u0306"+
		"\3\2\2\2r\u0313\3\2\2\2tu\5\4\3\2uv\7\2\2\3v\u0081\3\2\2\2wy\5\6\4\2x"+
		"z\5\2\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\2\2\3|\u0081\3\2\2\2}~\5\b"+
		"\5\2~\177\7\2\2\3\177\u0081\3\2\2\2\u0080t\3\2\2\2\u0080w\3\2\2\2\u0080"+
		"}\3\2\2\2\u0081\3\3\2\2\2\u0082\u0083\7\b\2\2\u0083\u0086\7s\2\2\u0084"+
		"\u0087\5\26\f\2\u0085\u0087\5\30\r\2\u0086\u0084\3\2\2\2\u0086\u0085\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\t\2\2\u0089\5\3\2\2\2\u008a\u008b"+
		"\7\13\2\2\u008b\u008e\7s\2\2\u008c\u008d\7\n\2\2\u008d\u008f\7s\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0093\3\2\2\2\u0090\u0092\5\24"+
		"\13\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0099\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\5\n"+
		"\6\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u00c3\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\13"+
		"\2\2\u009d\u009e\7s\2\2\u009e\u00a0\7\30\2\2\u009f\u00a1\5V,\2\u00a0\u009f"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a6\7\31\2\2"+
		"\u00a3\u00a5\5\24\13\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ac\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00ab\5 \21\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b3\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b0\7\35\2\2\u00b0\u00b1\5\16\b\2\u00b1\u00b2\7\t\2\2\u00b2\u00b4\3"+
		"\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b7\5\f\7\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00be\3\2\2\2\u00ba\u00bb\7#\2\2\u00bb"+
		"\u00bc\5\16\b\2\u00bc\u00bd\7\t\2\2\u00bd\u00bf\3\2\2\2\u00be\u00ba\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\t\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u008a\3\2\2\2\u00c2\u009c\3\2\2\2\u00c3\7\3\2\2\2"+
		"\u00c4\u00c5\7\22\2\2\u00c5\u00c7\7s\2\2\u00c6\u00c8\5\24\13\2\u00c7\u00c6"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cd\3\2\2\2\u00c9\u00ca\7\35\2\2"+
		"\u00ca\u00cb\5\16\b\2\u00cb\u00cc\7\t\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c9"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00d1\5\f\7\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d8\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d6\5\16\b\2\u00d6"+
		"\u00d7\7\t\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\t\2\2\u00db\t\3\2\2\2\u00dc\u0104"+
		"\7\t\2\2\u00dd\u00de\7\22\2\2\u00de\u00df\7s\2\2\u00df\u00e1\7\30\2\2"+
		"\u00e0\u00e2\5V,\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e4\7\31\2\2\u00e4\u00e9\5\16\b\2\u00e5\u00e6\7\35\2"+
		"\2\u00e6\u00e7\5\16\b\2\u00e7\u00e8\7\t\2\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00e5\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ee\3\2\2\2\u00eb\u00ed\5\f"+
		"\7\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f5\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7#"+
		"\2\2\u00f2\u00f3\5\16\b\2\u00f3\u00f4\7\t\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f1\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\7\t"+
		"\2\2\u00f8\u00fa\7s\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u0104\3\2\2\2\u00fb\u00fc\7\13\2\2\u00fc\u00fd\7s\2\2\u00fd\u00ff\7\30"+
		"\2\2\u00fe\u0100\5V,\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0102\7\31\2\2\u0102\u0104\7]\2\2\u0103\u00dc\3\2\2\2\u0103"+
		"\u00dd\3\2\2\2\u0103\u00fb\3\2\2\2\u0104\13\3\2\2\2\u0105\u0106\7\'\2"+
		"\2\u0106\u0107\7s\2\2\u0107\u0109\7\30\2\2\u0108\u010a\5R*\2\u0109\u0108"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010e\7\31\2\2"+
		"\u010c\u010d\7\37\2\2\u010d\u010f\5L\'\2\u010e\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\5\16\b\2\u0111\u0112\7\t\2\2"+
		"\u0112\r\3\2\2\2\u0113\u0115\5\20\t\2\u0114\u0113\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\17\3\2\2\2\u0116\u011b\5\22\n\2\u0117\u0119\7\3\2\2\u0118"+
		"\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\5\20"+
		"\t\2\u011b\u0118\3\2\2\2\u011b\u011c\3\2\2\2\u011c\21\3\2\2\2\u011d\u0121"+
		"\5\24\13\2\u011e\u0121\5 \21\2\u011f\u0121\5Z.\2\u0120\u011d\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\23\3\2\2\2\u0122\u0124\5\26\f"+
		"\2\u0123\u0125\5\24\13\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0134\3\2\2\2\u0126\u0128\5\30\r\2\u0127\u0129\5\24\13\2\u0128\u0127"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0134\3\2\2\2\u012a\u012c\5\32\16\2"+
		"\u012b\u012d\5\24\13\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0134"+
		"\3\2\2\2\u012e\u0134\5\34\17\2\u012f\u0131\5\36\20\2\u0130\u0132\5\24"+
		"\13\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0122\3\2\2\2\u0133\u0126\3\2\2\2\u0133\u012a\3\2\2\2\u0133\u012e\3\2"+
		"\2\2\u0133\u012f\3\2\2\2\u0134\25\3\2\2\2\u0135\u0136\7\36\2\2\u0136\u0137"+
		"\7s\2\2\u0137\u0138\7f\2\2\u0138\u0139\5Z.\2\u0139\27\3\2\2\2\u013a\u013b"+
		"\7\63\2\2\u013b\u013c\7s\2\2\u013c\u013d\7o\2\2\u013d\u013e\5\64\33\2"+
		"\u013e\u013f\5N(\2\u013f\31\3\2\2\2\u0140\u0141\7\60\2\2\u0141\u0142\7"+
		"s\2\2\u0142\u0143\7o\2\2\u0143\u0145\7\30\2\2\u0144\u0146\5V,\2\u0145"+
		"\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a\7\31"+
		"\2\2\u0148\u0149\7\37\2\2\u0149\u014b\5L\'\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\33\3\2\2\2\u014c\u014d\7\r\2\2\u014d\u014e\5R*\2"+
		"\u014e\u014f\7\4\2\2\u014f\u0152\5\64\33\2\u0150\u0151\7f\2\2\u0151\u0153"+
		"\5Z.\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u015a\3\2\2\2\u0154"+
		"\u0155\7\r\2\2\u0155\u0156\5R*\2\u0156\u0157\7f\2\2\u0157\u0158\5Z.\2"+
		"\u0158\u015a\3\2\2\2\u0159\u014c\3\2\2\2\u0159\u0154\3\2\2\2\u015a\35"+
		"\3\2\2\2\u015b\u015c\7$\2\2\u015c\u015d\5R*\2\u015d\u0160\5F$\2\u015e"+
		"\u015f\7\37\2\2\u015f\u0161\5L\'\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0171\3\2\2\2\u0162\u016d\7$\2\2\u0163\u0165\5R*\2\u0164\u0163"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\7\4\2\2\u0167"+
		"\u0169\7s\2\2\u0168\u016a\7\34\2\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u016c\3\2\2\2\u016b\u0164\3\2\2\2\u016c\u016f\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2"+
		"\2\2\u0170\u015b\3\2\2\2\u0170\u0162\3\2\2\2\u0171\37\3\2\2\2\u0172\u0179"+
		"\5*\26\2\u0173\u0179\5,\27\2\u0174\u0179\5.\30\2\u0175\u0179\5\62\32\2"+
		"\u0176\u0179\5&\24\2\u0177\u0179\5\"\22\2\u0178\u0172\3\2\2\2\u0178\u0173"+
		"\3\2\2\2\u0178\u0174\3\2\2\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0177\3\2\2\2\u0179!\3\2\2\2\u017a\u017b\7^\2\2\u017b\u017c\7\30\2\2"+
		"\u017c\u017d\5$\23\2\u017d\u017e\7\31\2\2\u017e#\3\2\2\2\u017f\u0184\5"+
		"Z.\2\u0180\u0181\7\34\2\2\u0181\u0183\5$\23\2\u0182\u0180\3\2\2\2\u0183"+
		"\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185%\3\2\2\2"+
		"\u0186\u0184\3\2\2\2\u0187\u0188\7\25\2\2\u0188\u0189\5(\25\2\u0189\'"+
		"\3\2\2\2\u018a\u018b\5Z.\2\u018b\u018d\7\30\2\2\u018c\u018e\5p9\2\u018d"+
		"\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\7\31"+
		"\2\2\u0190)\3\2\2\2\u0191\u01b7\7[\2\2\u0192\u0193\5\34\17\2\u0193\u0194"+
		"\7f\2\2\u0194\u0195\5Z.\2\u0195\u01b7\3\2\2\2\u0196\u0197\5\34\17\2\u0197"+
		"\u0198\7h\2\2\u0198\u01b7\3\2\2\2\u0199\u019a\5\34\17\2\u019a\u019b\7"+
		"i\2\2\u019b\u01b7\3\2\2\2\u019c\u019d\7\16\2\2\u019d\u019e\5^\60\2\u019e"+
		"\u019f\7a\2\2\u019f\u01a1\5\16\b\2\u01a0\u01a2\7c\2\2\u01a1\u01a0\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7\17\2\2\u01a4"+
		"\u01b7\3\2\2\2\u01a5\u01a6\7%\2\2\u01a6\u01a7\5^\60\2\u01a7\u01a8\7a\2"+
		"\2\u01a8\u01aa\5\16\b\2\u01a9\u01ab\7c\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\7&\2\2\u01ad\u01b7\3\2\2\2\u01ae"+
		"\u01af\7\26\2\2\u01af\u01b0\5f\64\2\u01b0\u01b1\7a\2\2\u01b1\u01b2\5\16"+
		"\b\2\u01b2\u01b3\7\27\2\2\u01b3\u01b7\3\2\2\2\u01b4\u01b7\79\2\2\u01b5"+
		"\u01b7\7:\2\2\u01b6\u0191\3\2\2\2\u01b6\u0192\3\2\2\2\u01b6\u0196\3\2"+
		"\2\2\u01b6\u0199\3\2\2\2\u01b6\u019c\3\2\2\2\u01b6\u01a5\3\2\2\2\u01b6"+
		"\u01ae\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7+\3\2\2\2"+
		"\u01b8\u01ba\7\25\2\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01bd\5\36\20\2\u01bc\u01be\5Z.\2\u01bd\u01bc\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01d3\3\2\2\2\u01bf\u01c0\7+\2\2\u01c0\u01d3\5(\25"+
		"\2\u01c1\u01c3\7(\2\2\u01c2\u01c4\5d\63\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4"+
		"\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c7\7\25\2\2\u01c6\u01c5\3\2\2\2"+
		"\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\5\36\20\2\u01c9\u01cb"+
		"\5Z.\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc"+
		"\u01cd\7a\2\2\u01cd\u01cf\5\16\b\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2"+
		"\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\7)\2\2\u01d1\u01d3\3\2\2\2\u01d2"+
		"\u01b9\3\2\2\2\u01d2\u01bf\3\2\2\2\u01d2\u01c1\3\2\2\2\u01d3-\3\2\2\2"+
		"\u01d4\u01d8\7\23\2\2\u01d5\u01d7\5\60\31\2\u01d6\u01d5\3\2\2\2\u01d7"+
		"\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2"+
		"\2\2\u01da\u01d8\3\2\2\2\u01db\u01e4\7\24\2\2\u01dc\u01dd\7.\2\2\u01dd"+
		"\u01df\5\36\20\2\u01de\u01e0\5\34\17\2\u01df\u01de\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e4\3\2\2\2\u01e1\u01e4\7 \2\2\u01e2\u01e4\7K\2\2\u01e3"+
		"\u01d4\3\2\2\2\u01e3\u01dc\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2"+
		"\2\2\u01e4/\3\2\2\2\u01e5\u01e7\5d\63\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7"+
		"\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\5r:\2\u01e9\u01eb\5P)\2\u01ea"+
		"\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\7\30"+
		"\2\2\u01ed\u01ef\5J&\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0"+
		"\3\2\2\2\u01f0\u01f3\7\31\2\2\u01f1\u01f2\7\5\2\2\u01f2\u01f4\5^\60\2"+
		"\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f6"+
		"\7\61\2\2\u01f6\u01f8\5Z.\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01fb\3\2\2\2\u01f9\u01fa\7\37\2\2\u01fa\u01fc\5L\'\2\u01fb\u01f9\3\2"+
		"\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\7a\2\2\u01fe"+
		"\u0200\5\16\b\2\u01ff\u0201\7c\2\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2"+
		"\2\2\u0201\61\3\2\2\2\u0202\u0203\7s\2\2\u0203\u0204\7f\2\2\u0204\u0205"+
		"\7/\2\2\u0205\u0206\7s\2\2\u0206\u0208\7\30\2\2\u0207\u0209\5p9\2\u0208"+
		"\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020d\7\31"+
		"\2\2\u020b\u020c\7D\2\2\u020c\u020e\7s\2\2\u020d\u020b\3\2\2\2\u020d\u020e"+
		"\3\2\2\2\u020e\u0212\3\2\2\2\u020f\u0210\7,\2\2\u0210\u0212\5Z.\2\u0211"+
		"\u0202\3\2\2\2\u0211\u020f\3\2\2\2\u0212\63\3\2\2\2\u0213\u021e\5\66\34"+
		"\2\u0214\u021e\58\35\2\u0215\u021e\5:\36\2\u0216\u021e\5<\37\2\u0217\u021e"+
		"\5> \2\u0218\u021a\5@!\2\u0219\u021b\5\64\33\2\u021a\u0219\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021e\5r:\2\u021d\u0213\3\2\2"+
		"\2\u021d\u0214\3\2\2\2\u021d\u0215\3\2\2\2\u021d\u0216\3\2\2\2\u021d\u0217"+
		"\3\2\2\2\u021d\u0218\3\2\2\2\u021d\u021c\3\2\2\2\u021e\65\3\2\2\2\u021f"+
		"\u0220\t\2\2\2\u0220\67\3\2\2\2\u0221\u0222\7S\2\2\u0222\u0223\7\30\2"+
		"\2\u0223\u0224\5J&\2\u0224\u0225\7\31\2\2\u02259\3\2\2\2\u0226\u0227\7"+
		"V\2\2\u0227\u022b\5\30\r\2\u0228\u0229\7V\2\2\u0229\u022b\7T\2\2\u022a"+
		"\u0226\3\2\2\2\u022a\u0228\3\2\2\2\u022b;\3\2\2\2\u022c\u022d\7U\2\2\u022d"+
		"\u022e\7\30\2\2\u022e\u022f\5R*\2\u022f\u0230\7\4\2\2\u0230\u0233\5\64"+
		"\33\2\u0231\u0232\7f\2\2\u0232\u0234\5Z.\2\u0233\u0231\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\7\31\2\2\u0236\u023f\3\2\2\2"+
		"\u0237\u0238\7U\2\2\u0238\u0239\7\30\2\2\u0239\u023a\5R*\2\u023a\u023b"+
		"\7f\2\2\u023b\u023c\5Z.\2\u023c\u023d\7\31\2\2\u023d\u023f\3\2\2\2\u023e"+
		"\u022c\3\2\2\2\u023e\u0237\3\2\2\2\u023f=\3\2\2\2\u0240\u0241\7W\2\2\u0241"+
		"\u0242\7\30\2\2\u0242\u0243\5R*\2\u0243\u0244\7\4\2\2\u0244\u0247\5\64"+
		"\33\2\u0245\u0246\7f\2\2\u0246\u0248\5Z.\2\u0247\u0245\3\2\2\2\u0247\u0248"+
		"\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\7\31\2\2\u024a\u0253\3\2\2\2"+
		"\u024b\u024c\7W\2\2\u024c\u024d\7\30\2\2\u024d\u024e\5R*\2\u024e\u024f"+
		"\7f\2\2\u024f\u0250\5Z.\2\u0250\u0251\7\31\2\2\u0251\u0253\3\2\2\2\u0252"+
		"\u0240\3\2\2\2\u0252\u024b\3\2\2\2\u0253?\3\2\2\2\u0254\u0255\7*\2\2\u0255"+
		"\u0256\5B\"\2\u0256A\3\2\2\2\u0257\u025c\5r:\2\u0258\u025c\5F$\2\u0259"+
		"\u025c\7Y\2\2\u025a\u025c\7X\2\2\u025b\u0257\3\2\2\2\u025b\u0258\3\2\2"+
		"\2\u025b\u0259\3\2\2\2\u025b\u025a\3\2\2\2\u025cC\3\2\2\2\u025d\u025e"+
		"\7\30\2\2\u025e\u025f\5V,\2\u025f\u0262\7\31\2\2\u0260\u0261\7\37\2\2"+
		"\u0261\u0263\5L\'\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263E\3\2"+
		"\2\2\u0264\u0269\5D#\2\u0265\u0266\7d\2\2\u0266\u0267\5H%\2\u0267\u0268"+
		"\7e\2\2\u0268\u026a\3\2\2\2\u0269\u0265\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"G\3\2\2\2\u026b\u0274\7\25\2\2\u026c\u0274\7+\2\2\u026d\u026e\7\25\2\2"+
		"\u026e\u026f\7\34\2\2\u026f\u0274\7+\2\2\u0270\u0271\7+\2\2\u0271\u0272"+
		"\7\34\2\2\u0272\u0274\7\25\2\2\u0273\u026b\3\2\2\2\u0273\u026c\3\2\2\2"+
		"\u0273\u026d\3\2\2\2\u0273\u0270\3\2\2\2\u0274I\3\2\2\2\u0275\u0283\5"+
		"Z.\2\u0276\u0277\5Z.\2\u0277\u0278\7\34\2\2\u0278\u0279\5J&\2\u0279\u027b"+
		"\3\2\2\2\u027a\u0276\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u0283\3\2\2\2\u027c"+
		"\u027d\5Z.\2\u027d\u027e\7\4\2\2\u027e\u027f\5J&\2\u027f\u0281\3\2\2\2"+
		"\u0280\u027c\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0283\3\2\2\2\u0282\u0275"+
		"\3\2\2\2\u0282\u027a\3\2\2\2\u0282\u0280\3\2\2\2\u0283K\3\2\2\2\u0284"+
		"\u028c\5\64\33\2\u0285\u0286\5J&\2\u0286\u0287\7\4\2\2\u0287\u0288\5\64"+
		"\33\2\u0288\u028a\3\2\2\2\u0289\u0285\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\u028c\3\2\2\2\u028b\u0284\3\2\2\2\u028b\u0289\3\2\2\2\u028cM\3\2\2\2"+
		"\u028d\u028e\7d\2\2\u028e\u028f\7s\2\2\u028f\u0291\7e\2\2\u0290\u028d"+
		"\3\2\2\2\u0290\u0291\3\2\2\2\u0291O\3\2\2\2\u0292\u0293\7\32\2\2\u0293"+
		"\u0294\5J&\2\u0294\u0295\7\33\2\2\u0295Q\3\2\2\2\u0296\u0297\b*\1\2\u0297"+
		"\u0298\5T+\2\u0298\u029e\3\2\2\2\u0299\u029a\f\3\2\2\u029a\u029b\7\34"+
		"\2\2\u029b\u029d\5T+\2\u029c\u0299\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c"+
		"\3\2\2\2\u029e\u029f\3\2\2\2\u029fS\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1"+
		"\u02a5\7s\2\2\u02a2\u02a3\7s\2\2\u02a3\u02a5\5P)\2\u02a4\u02a1\3\2\2\2"+
		"\u02a4\u02a2\3\2\2\2\u02a5U\3\2\2\2\u02a6\u02ac\5X-\2\u02a7\u02a8\5X-"+
		"\2\u02a8\u02a9\7\3\2\2\u02a9\u02aa\5V,\2\u02aa\u02ac\3\2\2\2\u02ab\u02a6"+
		"\3\2\2\2\u02ab\u02a7\3\2\2\2\u02acW\3\2\2\2\u02ad\u02ae\5R*\2\u02ae\u02af"+
		"\7\4\2\2\u02af\u02b0\5\64\33\2\u02b0Y\3\2\2\2\u02b1\u02b2\5^\60\2\u02b2"+
		"\u02b3\5\\/\2\u02b3\u02b4\5Z.\2\u02b4\u02c5\3\2\2\2\u02b5\u02b6\7l\2\2"+
		"\u02b6\u02c5\5^\60\2\u02b7\u02c5\5^\60\2\u02b8\u02b9\5^\60\2\u02b9\u02ba"+
		"\7f\2\2\u02ba\u02bb\5Z.\2\u02bb\u02c5\3\2\2\2\u02bc\u02be\7s\2\2\u02bd"+
		"\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\7\30"+
		"\2\2\u02c0\u02c2\5p9\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3"+
		"\3\2\2\2\u02c3\u02c5\7\31\2\2\u02c4\u02b1\3\2\2\2\u02c4\u02b5\3\2\2\2"+
		"\u02c4\u02b7\3\2\2\2\u02c4\u02b8\3\2\2\2\u02c4\u02bd\3\2\2\2\u02c5[\3"+
		"\2\2\2\u02c6\u02c7\t\3\2\2\u02c7]\3\2\2\2\u02c8\u02c9\5`\61\2\u02c9\u02ca"+
		"\7o\2\2\u02ca\u02cb\5`\61\2\u02cb\u02ce\3\2\2\2\u02cc\u02ce\5`\61\2\u02cd"+
		"\u02c8\3\2\2\2\u02cd\u02cc\3\2\2\2\u02ce_\3\2\2\2\u02cf\u02d0\5b\62\2"+
		"\u02d0\u02d1\7n\2\2\u02d1\u02d2\5`\61\2\u02d2\u02d9\3\2\2\2\u02d3\u02d4"+
		"\5b\62\2\u02d4\u02d5\7m\2\2\u02d5\u02d6\5`\61\2\u02d6\u02d9\3\2\2\2\u02d7"+
		"\u02d9\5b\62\2\u02d8\u02cf\3\2\2\2\u02d8\u02d3\3\2\2\2\u02d8\u02d7\3\2"+
		"\2\2\u02d9a\3\2\2\2\u02da\u02e3\7s\2\2\u02db\u02e3\7b\2\2\u02dc\u02e3"+
		"\7F\2\2\u02dd\u02e3\7O\2\2\u02de\u02e3\5R*\2\u02df\u02e3\5r:\2\u02e0\u02e3"+
		"\7p\2\2\u02e1\u02e3\7\64\2\2\u02e2\u02da\3\2\2\2\u02e2\u02db\3\2\2\2\u02e2"+
		"\u02dc\3\2\2\2\u02e2\u02dd\3\2\2\2\u02e2\u02de\3\2\2\2\u02e2\u02df\3\2"+
		"\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e1\3\2\2\2\u02e3c\3\2\2\2\u02e4\u02e5"+
		"\7\30\2\2\u02e5\u02e6\5f\64\2\u02e6\u02e7\7\31\2\2\u02e7e\3\2\2\2\u02e8"+
		"\u02ee\5h\65\2\u02e9\u02ea\5h\65\2\u02ea\u02eb\7\34\2\2\u02eb\u02ec\5"+
		"f\64\2\u02ec\u02ee\3\2\2\2\u02ed\u02e8\3\2\2\2\u02ed\u02e9\3\2\2\2\u02ee"+
		"g\3\2\2\2\u02ef\u02f0\7s\2\2\u02f0\u02f1\7f\2\2\u02f1\u02f2\5Z.\2\u02f2"+
		"\u02f3\5j\66\2\u02f3\u02f4\5Z.\2\u02f4\u02f5\5l\67\2\u02f5\u02f6\5n8\2"+
		"\u02f6i\3\2\2\2\u02f7\u02f8\t\4\2\2\u02f8k\3\2\2\2\u02f9\u02fa\7\61\2"+
		"\2\u02fa\u02fc\5Z.\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fcm\3"+
		"\2\2\2\u02fd\u02fe\7\62\2\2\u02fe\u0300\5Z.\2\u02ff\u02fd\3\2\2\2\u02ff"+
		"\u0300\3\2\2\2\u0300o\3\2\2\2\u0301\u0307\5Z.\2\u0302\u0303\5Z.\2\u0303"+
		"\u0304\7\34\2\2\u0304\u0305\5p9\2\u0305\u0307\3\2\2\2\u0306\u0301\3\2"+
		"\2\2\u0306\u0302\3\2\2\2\u0307q\3\2\2\2\u0308\u0314\7s\2\2\u0309\u030a"+
		"\7s\2\2\u030a\u030b\7\7\2\2\u030b\u0314\7s\2\2\u030c\u030d\7s\2\2\u030d"+
		"\u030e\7\7\2\2\u030e\u030f\7s\2\2\u030f\u0310\7\30\2\2\u0310\u0311\5R"+
		"*\2\u0311\u0312\7\31\2\2\u0312\u0314\3\2\2\2\u0313\u0308\3\2\2\2\u0313"+
		"\u0309\3\2\2\2\u0313\u030c\3\2\2\2\u0314s\3\2\2\2gy\u0080\u0086\u008e"+
		"\u0093\u0099\u00a0\u00a6\u00ac\u00b3\u00b8\u00be\u00c2\u00c7\u00cd\u00d2"+
		"\u00d8\u00e1\u00e9\u00ee\u00f5\u00f9\u00ff\u0103\u0109\u010e\u0114\u0118"+
		"\u011b\u0120\u0124\u0128\u012c\u0131\u0133\u0145\u014a\u0152\u0159\u0160"+
		"\u0164\u0169\u016d\u0170\u0178\u0184\u018d\u01a1\u01aa\u01b6\u01b9\u01bd"+
		"\u01c3\u01c6\u01ca\u01ce\u01d2\u01d8\u01df\u01e3\u01e6\u01ea\u01ee\u01f3"+
		"\u01f7\u01fb\u0200\u0208\u020d\u0211\u021a\u021d\u022a\u0233\u023e\u0247"+
		"\u0252\u025b\u0262\u0269\u0273\u027a\u0280\u0282\u0289\u028b\u0290\u029e"+
		"\u02a4\u02ab\u02bd\u02c1\u02c4\u02cd\u02d8\u02e2\u02ed\u02fb\u02ff\u0306"+
		"\u0313";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}