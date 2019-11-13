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
		T__0=1, T__1=2, T__2=3, GLOBAL=4, END=5, IMPORT=6, RESOURCE=7, INT=8, 
		VAR=9, IF=10, FI=11, ELSE=12, EXTEND=13, BODY=14, IN=15, NI=16, CALL=17, 
		FA=18, AF=19, LPARENT=20, RPARENT=21, LBRACKET=22, RBRACKET=23, COMA=24, 
		INITIAL=25, CONST=26, RETURNS=27, RETURN=28, TO=29, DOWNTO=30, FINAL=31, 
		OP=32, DO=33, OD=34, PROC=35, CO=36, OC=37, CAP=38, SEND=39, DESTROY=40, 
		BEGIN=41, RECEIVE=42, CREATE=43, OPTYPE=44, BY=45, SUCHTHAT=46, TYPE=47, 
		NULL=48, BOOL=49, VAL=50, RES=51, REF=52, EXIT=53, NEXT=54, FILE=55, PRIVATE=56, 
		OR=57, INDEX=58, MOD=59, STOP=60, PROCEDURE=61, AND=62, REAL=63, ON=64, 
		ROW=65, TRUE=66, SENDER=67, LEFT=68, UP=69, ABORT=70, REPLY=71, PROCESS=72, 
		CHAR=73, STRING=74, FALSE=75, LOW=76, HIGH=77, NEW=78, ENUM=79, ANY=80, 
		REC=81, PTR=82, UNION=83, VM=84, SEM=85, XOR=86, SKP=87, FORWARD=88, SEPARATE=89, 
		WRITE=90, V=91, P=92, EJECUTA=93, NUM=94, SEPARA=95, LBRACE=96, RBRACE=97, 
		ASIGNACION=98, SWAP=99, INCREMENTO=100, DECREMENTO=101, DESPLAZAR_IZQ=102, 
		DESPLAZAR_DER=103, EXCLAMACION=104, PUNTO=105, DOSPUNTOS=106, AUG=107, 
		OPERADOR_ARITMETICO=108, OPERADOR_COMPARACION=109, CADENA=110, ESP=111, 
		LINE_COMMENT=112, ID=113;
	public static final int
		RULE_components = 0, RULE_global = 1, RULE_resource_specification = 2, 
		RULE_resource_body = 3, RULE_spec_body = 4, RULE_proc = 5, RULE_block = 6, 
		RULE_block_items = 7, RULE_block_item = 8, RULE_declarations = 9, RULE_constant = 10, 
		RULE_type = 11, RULE_op_type = 12, RULE_variable = 13, RULE_subscripts = 14, 
		RULE_id_subs_lp = 15, RULE_id_subs = 16, RULE_id_list = 17, RULE_operation = 18, 
		RULE_statements = 19, RULE_write_expr = 20, RULE_write_params = 21, RULE_explicit_call = 22, 
		RULE_invocation = 23, RULE_sequential = 24, RULE_op_invocation = 25, RULE_op_service = 26, 
		RULE_in_cmd = 27, RULE_resource_control = 28, RULE_t = 29, RULE_basic_type = 30, 
		RULE_enum_def = 31, RULE_pointer_def = 32, RULE_record_def = 33, RULE_union_def = 34, 
		RULE_capability_def = 35, RULE_cap_for = 36, RULE_prototype = 37, RULE_op_prototype = 38, 
		RULE_op_res = 39, RULE_result_id = 40, RULE_type_res = 41, RULE_parameters = 42, 
		RULE_parameters2 = 43, RULE_expression = 44, RULE_op_log = 45, RULE_expr1 = 46, 
		RULE_expr2 = 47, RULE_expr3 = 48, RULE_quantifier = 49, RULE_quantifier1 = 50, 
		RULE_quantifier2 = 51, RULE_direction = 52, RULE_step_opt = 53, RULE_such_that_opt = 54, 
		RULE_actuals = 55, RULE_qualified_id = 56;
	public static final String[] ruleNames = {
		"components", "global", "resource_specification", "resource_body", "spec_body", 
		"proc", "block", "block_items", "block_item", "declarations", "constant", 
		"type", "op_type", "variable", "subscripts", "id_subs_lp", "id_subs", 
		"id_list", "operation", "statements", "write_expr", "write_params", "explicit_call", 
		"invocation", "sequential", "op_invocation", "op_service", "in_cmd", "resource_control", 
		"t", "basic_type", "enum_def", "pointer_def", "record_def", "union_def", 
		"capability_def", "cap_for", "prototype", "op_prototype", "op_res", "result_id", 
		"type_res", "parameters", "parameters2", "expression", "op_log", "expr1", 
		"expr2", "expr3", "quantifier", "quantifier1", "quantifier2", "direction", 
		"step_opt", "such_that_opt", "actuals", "qualified_id"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'&'", "'||'", "'global'", "'end'", "'import'", "'resource'", 
		"'int'", "'var'", "'if'", "'fi'", "'else'", "'extend'", "'body'", "'in'", 
		"'ni'", "'call'", "'fa'", "'af'", "'('", "')'", "'['", "']'", "','", "'inital'", 
		"'const'", "'returns'", "'return'", "'to'", "'downto'", "'final'", "'op'", 
		"'do'", "'od'", "'proc'", "'co'", "'oc'", "'cap'", "'send'", "'destroy'", 
		"'begin'", "'receive'", "'create'", "'optype'", "'by'", "'st'", "'type'", 
		"'null'", "'bool'", "'val'", "'res'", "'ref'", "'exit'", "'next'", "'file'", 
		"'private'", "'or'", "'index'", "'mod'", "'stop'", "'procedure'", "'and'", 
		"'real'", "'on'", "'row'", "'true'", "'sender'", "'left'", "'up'", "'abort'", 
		"'reply'", "'process'", "'char'", "'string'", "'false'", "'low'", "'high'", 
		"'new'", "'enum'", "'any'", "'rec'", "'ptr'", "'union'", "'vm'", "'sem'", 
		"'xor'", "'skip'", "'forward'", "'separate'", "'write'", "'V'", "'P'", 
		"'->'", null, "'[]'", "'{'", "'}'", "':='", "':=:'", "'++'", "'--'", "'<<'", 
		"'>>'", "'!'", "'.'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "GLOBAL", "END", "IMPORT", "RESOURCE", "INT", 
		"VAR", "IF", "FI", "ELSE", "EXTEND", "BODY", "IN", "NI", "CALL", "FA", 
		"AF", "LPARENT", "RPARENT", "LBRACKET", "RBRACKET", "COMA", "INITIAL", 
		"CONST", "RETURNS", "RETURN", "TO", "DOWNTO", "FINAL", "OP", "DO", "OD", 
		"PROC", "CO", "OC", "CAP", "SEND", "DESTROY", "BEGIN", "RECEIVE", "CREATE", 
		"OPTYPE", "BY", "SUCHTHAT", "TYPE", "NULL", "BOOL", "VAL", "RES", "REF", 
		"EXIT", "NEXT", "FILE", "PRIVATE", "OR", "INDEX", "MOD", "STOP", "PROCEDURE", 
		"AND", "REAL", "ON", "ROW", "TRUE", "SENDER", "LEFT", "UP", "ABORT", "REPLY", 
		"PROCESS", "CHAR", "STRING", "FALSE", "LOW", "HIGH", "NEW", "ENUM", "ANY", 
		"REC", "PTR", "UNION", "VM", "SEM", "XOR", "SKP", "FORWARD", "SEPARATE", 
		"WRITE", "V", "P", "EJECUTA", "NUM", "SEPARA", "LBRACE", "RBRACE", "ASIGNACION", 
		"SWAP", "INCREMENTO", "DECREMENTO", "DESPLAZAR_IZQ", "DESPLAZAR_DER", 
		"EXCLAMACION", "PUNTO", "DOSPUNTOS", "AUG", "OPERADOR_ARITMETICO", "OPERADOR_COMPARACION", 
		"CADENA", "ESP", "LINE_COMMENT", "ID"
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << IF) | (1L << IN) | (1L << CALL) | (1L << FA) | (1L << LPARENT) | (1L << RETURN) | (1L << DO) | (1L << CO) | (1L << SEND) | (1L << DESTROY) | (1L << RECEIVE) | (1L << NULL) | (1L << EXIT) | (1L << NEXT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TRUE - 66)) | (1L << (REPLY - 66)) | (1L << (FALSE - 66)) | (1L << (SKP - 66)) | (1L << (WRITE - 66)) | (1L << (NUM - 66)) | (1L << (EXCLAMACION - 66)) | (1L << (CADENA - 66)) | (1L << (ID - 66)))) != 0)) {
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
		public List<Id_subsContext> id_subs() {
			return getRuleContexts(Id_subsContext.class);
		}
		public Id_subsContext id_subs(int i) {
			return getRuleContext(Id_subsContext.class,i);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(SRLanguageParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SRLanguageParser.COMA, i);
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
		int _la;
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(VAR);
				setState(331);
				id_subs();
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(332);
					match(COMA);
					setState(333);
					id_subs();
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(339);
				match(DOSPUNTOS);
				setState(340);
				t();
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(341);
					match(ASIGNACION);
					setState(342);
					expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(VAR);
				setState(346);
				id_subs();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(347);
					match(COMA);
					setState(348);
					id_subs();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(354);
				match(ASIGNACION);
				setState(355);
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
		enterRule(_localctx, 28, RULE_subscripts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(LBRACKET);
			setState(360);
			id_list();
			setState(361);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_id_subs_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(364);
			id_subs();
			}
			_ctx.stop = _input.LT(-1);
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_subs_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_subs_lp);
					setState(366);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(367);
					match(COMA);
					setState(368);
					id_subs();
					}
					} 
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		enterRule(_localctx, 32, RULE_id_subs);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(ID);
				setState(376);
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

	public static class Id_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SRLanguageParser.COMA, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(SRLanguageParser.DOSPUNTOS, 0); }
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_id_list);
		int _la;
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENT || _la==NULL || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (NUM - 66)) | (1L << (EXCLAMACION - 66)) | (1L << (CADENA - 66)) | (1L << (ID - 66)))) != 0)) {
					{
					setState(380);
					expression();
					setState(381);
					match(COMA);
					setState(382);
					id_list();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENT || _la==NULL || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (NUM - 66)) | (1L << (EXCLAMACION - 66)) | (1L << (CADENA - 66)) | (1L << (ID - 66)))) != 0)) {
					{
					setState(386);
					expression();
					setState(387);
					match(DOSPUNTOS);
					setState(388);
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
		public List<TerminalNode> COMA() { return getTokens(SRLanguageParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SRLanguageParser.COMA, i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operation);
		int _la;
		try {
			int _alt;
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(OP);
				setState(395);
				id_subs_lp(0);
				setState(396);
				op_prototype();
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURNS) {
					{
					setState(397);
					match(RETURNS);
					setState(398);
					result_id();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(OP);
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(403);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ID) {
							{
							setState(402);
							id_subs_lp(0);
							}
						}

						setState(405);
						match(DOSPUNTOS);
						setState(406);
						match(ID);
						setState(408);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMA) {
							{
							setState(407);
							match(COMA);
							}
						}

						}
						} 
					}
					setState(414);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 38, RULE_statements);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				sequential();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				op_invocation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				op_service();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
				resource_control();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(421);
				explicit_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(422);
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
		enterRule(_localctx, 40, RULE_write_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(WRITE);
			setState(426);
			match(LPARENT);
			setState(427);
			write_params();
			setState(428);
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
		public List<TerminalNode> COMA() { return getTokens(SRLanguageParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SRLanguageParser.COMA, i);
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
		enterRule(_localctx, 42, RULE_write_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			expression();
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(431);
					match(COMA);
					setState(432);
					write_params();
					}
					} 
				}
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		enterRule(_localctx, 44, RULE_explicit_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(CALL);
			setState(439);
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
		enterRule(_localctx, 46, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			expression();
			setState(442);
			match(LPARENT);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPARENT || _la==NULL || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (NUM - 66)) | (1L << (EXCLAMACION - 66)) | (1L << (CADENA - 66)) | (1L << (ID - 66)))) != 0)) {
				{
				setState(443);
				actuals();
				}
			}

			setState(446);
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
		enterRule(_localctx, 48, RULE_sequential);
		int _la;
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(SKP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				variable();
				setState(450);
				match(ASIGNACION);
				setState(451);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				variable();
				setState(454);
				match(INCREMENTO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				variable();
				setState(457);
				match(DECREMENTO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(459);
				match(IF);
				setState(460);
				expr1();
				setState(461);
				match(EJECUTA);
				setState(462);
				block();
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARA) {
					{
					setState(463);
					match(SEPARA);
					}
				}

				setState(466);
				match(FI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(468);
				match(DO);
				setState(469);
				expr1();
				setState(470);
				match(EJECUTA);
				setState(471);
				block();
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARA) {
					{
					setState(472);
					match(SEPARA);
					}
				}

				setState(475);
				match(OD);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(477);
				match(FA);
				setState(478);
				quantifier1();
				setState(479);
				match(EJECUTA);
				setState(480);
				block();
				setState(481);
				match(AF);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(483);
				match(EXIT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(484);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CALL() { return getToken(SRLanguageParser.CALL, 0); }
		public TerminalNode SEND() { return getToken(SRLanguageParser.SEND, 0); }
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public TerminalNode CO() { return getToken(SRLanguageParser.CO, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_op_invocation);
		int _la;
		try {
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case LPARENT:
			case NULL:
			case TRUE:
			case FALSE:
			case NUM:
			case EXCLAMACION:
			case CADENA:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CALL) {
					{
					setState(487);
					match(CALL);
					}
				}

				setState(490);
				expression();
				}
				break;
			case SEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				match(SEND);
				setState(492);
				invocation();
				}
				break;
			case CO:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				match(CO);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENT) {
					{
					setState(494);
					quantifier();
					}
				}

				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CALL) {
					{
					setState(497);
					match(CALL);
					}
				}

				setState(500);
				operation();
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENT || _la==NULL || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (NUM - 66)) | (1L << (EXCLAMACION - 66)) | (1L << (CADENA - 66)) | (1L << (ID - 66)))) != 0)) {
					{
					setState(501);
					expression();
					}
				}

				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EJECUTA) {
					{
					setState(504);
					match(EJECUTA);
					setState(505);
					block();
					}
				}

				setState(508);
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
		enterRule(_localctx, 52, RULE_op_service);
		int _la;
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(IN);
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPARENT || _la==ID) {
					{
					{
					setState(513);
					in_cmd();
					}
					}
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(519);
				match(NI);
				}
				break;
			case RECEIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(RECEIVE);
				setState(521);
				operation();
				setState(523);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(522);
					variable();
					}
					break;
				}
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				match(RETURN);
				}
				break;
			case REPLY:
				enterOuterAlt(_localctx, 4);
				{
				setState(526);
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
		enterRule(_localctx, 54, RULE_in_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPARENT) {
				{
				setState(529);
				quantifier();
				}
			}

			setState(532);
			qualified_id();
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(533);
				subscripts();
				}
			}

			setState(536);
			match(LPARENT);
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(537);
				id_list();
				}
				break;
			}
			setState(540);
			match(RPARENT);
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(541);
				match(T__1);
				setState(542);
				expr1();
				}
			}

			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(545);
				match(BY);
				setState(546);
				expression();
				}
			}

			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(549);
				match(RETURNS);
				setState(550);
				result_id();
				}
			}

			setState(553);
			match(EJECUTA);
			setState(554);
			block();
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARA) {
				{
				setState(555);
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
		enterRule(_localctx, 56, RULE_resource_control);
		int _la;
		try {
			setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(ID);
				setState(559);
				match(ASIGNACION);
				setState(560);
				match(CREATE);
				setState(561);
				match(ID);
				setState(562);
				match(LPARENT);
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENT || _la==NULL || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (NUM - 66)) | (1L << (EXCLAMACION - 66)) | (1L << (CADENA - 66)) | (1L << (ID - 66)))) != 0)) {
					{
					setState(563);
					actuals();
					}
				}

				setState(566);
				match(RPARENT);
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(567);
					match(ON);
					setState(568);
					match(ID);
					}
				}

				}
				break;
			case DESTROY:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				match(DESTROY);
				setState(572);
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
		enterRule(_localctx, 58, RULE_t);
		try {
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FILE:
			case REAL:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				basic_type();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				enum_def();
				}
				break;
			case PTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				pointer_def();
				}
				break;
			case REC:
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
				record_def();
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 5);
				{
				setState(579);
				union_def();
				}
				break;
			case CAP:
				enterOuterAlt(_localctx, 6);
				{
				setState(580);
				capability_def();
				setState(582);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(581);
					t();
					}
					break;
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(584);
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
		enterRule(_localctx, 60, RULE_basic_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FILE) | (1L << REAL))) != 0) || _la==CHAR) ) {
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
		enterRule(_localctx, 62, RULE_enum_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(ENUM);
			setState(590);
			match(LPARENT);
			setState(591);
			id_list();
			setState(592);
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
		enterRule(_localctx, 64, RULE_pointer_def);
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				match(PTR);
				setState(595);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				match(PTR);
				setState(597);
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
		enterRule(_localctx, 66, RULE_record_def);
		int _la;
		try {
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				match(REC);
				setState(601);
				match(LPARENT);
				setState(602);
				id_subs_lp(0);
				setState(603);
				match(DOSPUNTOS);
				setState(604);
				t();
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASIGNACION) {
					{
					setState(605);
					match(ASIGNACION);
					setState(606);
					expression();
					}
				}

				setState(609);
				match(RPARENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				match(REC);
				setState(612);
				match(LPARENT);
				setState(613);
				id_subs_lp(0);
				setState(614);
				match(ASIGNACION);
				setState(615);
				expression();
				setState(616);
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
		enterRule(_localctx, 68, RULE_union_def);
		int _la;
		try {
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				match(UNION);
				setState(621);
				match(LPARENT);
				setState(622);
				id_subs_lp(0);
				setState(623);
				match(DOSPUNTOS);
				setState(624);
				t();
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASIGNACION) {
					{
					setState(625);
					match(ASIGNACION);
					setState(626);
					expression();
					}
				}

				setState(629);
				match(RPARENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(UNION);
				setState(632);
				match(LPARENT);
				setState(633);
				id_subs_lp(0);
				setState(634);
				match(ASIGNACION);
				setState(635);
				expression();
				setState(636);
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
		enterRule(_localctx, 70, RULE_capability_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(CAP);
			setState(641);
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
		enterRule(_localctx, 72, RULE_cap_for);
		try {
			setState(647);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				qualified_id();
				}
				break;
			case LPARENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				op_prototype();
				}
				break;
			case SEM:
				enterOuterAlt(_localctx, 3);
				{
				setState(645);
				match(SEM);
				}
				break;
			case VM:
				enterOuterAlt(_localctx, 4);
				{
				setState(646);
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
		enterRule(_localctx, 74, RULE_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(LPARENT);
			setState(650);
			parameters();
			setState(651);
			match(RPARENT);
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(652);
				match(RETURNS);
				setState(653);
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
		enterRule(_localctx, 76, RULE_op_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			prototype();
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(657);
				match(LBRACE);
				setState(658);
				op_res();
				setState(659);
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
		enterRule(_localctx, 78, RULE_op_res);
		try {
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				match(CALL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				match(SEND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				match(CALL);
				setState(666);
				match(COMA);
				setState(667);
				match(SEND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(668);
				match(SEND);
				setState(669);
				match(COMA);
				setState(670);
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

	public static class Result_idContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public Result_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_id; }
	}

	public final Result_idContext result_id() throws RecognitionException {
		Result_idContext _localctx = new Result_idContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_result_id);
		try {
			setState(680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(674);
					id_subs_lp(0);
					setState(675);
					match(DOSPUNTOS);
					setState(676);
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
		enterRule(_localctx, 82, RULE_type_res);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(682);
				match(LBRACE);
				setState(683);
				match(ID);
				setState(684);
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
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				parameters2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				parameters2();
				setState(689);
				match(T__0);
				setState(690);
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
			setState(694);
			id_subs_lp(0);
			setState(695);
			match(DOSPUNTOS);
			setState(696);
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
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				expr1();
				setState(699);
				op_log();
				setState(700);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				match(EXCLAMACION);
				setState(703);
				expr1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(704);
				expr1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(705);
				expr1();
				setState(706);
				match(ASIGNACION);
				setState(707);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(709);
					match(ID);
					}
				}

				setState(712);
				match(LPARENT);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENT || _la==NULL || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (NUM - 66)) | (1L << (EXCLAMACION - 66)) | (1L << (CADENA - 66)) | (1L << (ID - 66)))) != 0)) {
					{
					setState(713);
					actuals();
					}
				}

				setState(716);
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
			setState(719);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
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
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				expr2();
				setState(722);
				match(OPERADOR_COMPARACION);
				setState(723);
				expr2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
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
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				expr3();
				setState(729);
				match(OPERADOR_ARITMETICO);
				setState(730);
				expr2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				expr3();
				setState(733);
				match(AUG);
				setState(734);
				expr2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(736);
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
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(741);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(742);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(743);
				id_subs_lp(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(744);
				qualified_id();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(745);
				match(CADENA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(746);
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
			setState(749);
			match(LPARENT);
			setState(750);
			quantifier1();
			setState(751);
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
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				quantifier2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
				quantifier2();
				setState(755);
				match(COMA);
				setState(756);
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
			setState(760);
			match(ID);
			setState(761);
			match(ASIGNACION);
			setState(762);
			expression();
			setState(763);
			direction();
			setState(764);
			expression();
			setState(765);
			step_opt();
			setState(766);
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
			setState(768);
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
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(770);
				match(BY);
				setState(771);
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
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUCHTHAT) {
				{
				setState(774);
				match(SUCHTHAT);
				setState(775);
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
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				expression();
				setState(780);
				match(COMA);
				setState(781);
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
		public TerminalNode PUNTO() { return getToken(SRLanguageParser.PUNTO, 0); }
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
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(785);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				match(ID);
				setState(787);
				match(PUNTO);
				setState(788);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(789);
				match(ID);
				setState(790);
				match(PUNTO);
				setState(791);
				match(ID);
				setState(792);
				match(LPARENT);
				setState(793);
				id_subs_lp(0);
				setState(794);
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
		case 15:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3s\u0321\4\2\t\2\4"+
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
		"\16\3\16\3\16\5\16\u014b\n\16\3\17\3\17\3\17\3\17\7\17\u0151\n\17\f\17"+
		"\16\17\u0154\13\17\3\17\3\17\3\17\3\17\5\17\u015a\n\17\3\17\3\17\3\17"+
		"\3\17\7\17\u0160\n\17\f\17\16\17\u0163\13\17\3\17\3\17\3\17\5\17\u0168"+
		"\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0174\n\21"+
		"\f\21\16\21\u0177\13\21\3\22\3\22\3\22\5\22\u017c\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0183\n\23\3\23\3\23\3\23\3\23\5\23\u0189\n\23\5\23\u018b"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u0192\n\24\3\24\3\24\5\24\u0196\n"+
		"\24\3\24\3\24\3\24\5\24\u019b\n\24\7\24\u019d\n\24\f\24\16\24\u01a0\13"+
		"\24\5\24\u01a2\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01aa\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u01b4\n\27\f\27\16\27\u01b7\13"+
		"\27\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u01bf\n\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u01d3\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01dc\n\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01e8\n\32\3\33"+
		"\5\33\u01eb\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u01f2\n\33\3\33\5\33\u01f5"+
		"\n\33\3\33\3\33\5\33\u01f9\n\33\3\33\3\33\5\33\u01fd\n\33\3\33\3\33\5"+
		"\33\u0201\n\33\3\34\3\34\7\34\u0205\n\34\f\34\16\34\u0208\13\34\3\34\3"+
		"\34\3\34\3\34\5\34\u020e\n\34\3\34\3\34\5\34\u0212\n\34\3\35\5\35\u0215"+
		"\n\35\3\35\3\35\5\35\u0219\n\35\3\35\3\35\5\35\u021d\n\35\3\35\3\35\3"+
		"\35\5\35\u0222\n\35\3\35\3\35\5\35\u0226\n\35\3\35\3\35\5\35\u022a\n\35"+
		"\3\35\3\35\3\35\5\35\u022f\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0237"+
		"\n\36\3\36\3\36\3\36\5\36\u023c\n\36\3\36\3\36\5\36\u0240\n\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\5\37\u0249\n\37\3\37\5\37\u024c\n\37\3 \3"+
		" \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u0259\n\"\3#\3#\3#\3#\3#\3#\3#\5"+
		"#\u0262\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u026d\n#\3$\3$\3$\3$\3$\3$\3"+
		"$\5$\u0276\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0281\n$\3%\3%\3%\3&\3&\3"+
		"&\3&\5&\u028a\n&\3\'\3\'\3\'\3\'\3\'\5\'\u0291\n\'\3(\3(\3(\3(\3(\5(\u0298"+
		"\n(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u02a2\n)\3*\3*\3*\3*\3*\5*\u02a9\n*\5*"+
		"\u02ab\n*\3+\3+\3+\5+\u02b0\n+\3,\3,\3,\3,\3,\5,\u02b7\n,\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02c9\n.\3.\3.\5.\u02cd\n.\3."+
		"\5.\u02d0\n.\3/\3/\3\60\3\60\3\60\3\60\3\60\5\60\u02d9\n\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02e4\n\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\5\62\u02ee\n\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u02f9\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\5\67\u0307\n\67\38\38\58\u030b\n8\39\39\39\39\39\59\u0312"+
		"\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u031f\n:\3:\2\3 ;\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnpr\2\5\7\2\n\n\63\6399AAKK\3\2\4\5\3\2\37 \2\u0376\2\u0080\3\2"+
		"\2\2\4\u0082\3\2\2\2\6\u00c2\3\2\2\2\b\u00c4\3\2\2\2\n\u0103\3\2\2\2\f"+
		"\u0105\3\2\2\2\16\u0114\3\2\2\2\20\u0116\3\2\2\2\22\u0120\3\2\2\2\24\u0133"+
		"\3\2\2\2\26\u0135\3\2\2\2\30\u013a\3\2\2\2\32\u0140\3\2\2\2\34\u0167\3"+
		"\2\2\2\36\u0169\3\2\2\2 \u016d\3\2\2\2\"\u017b\3\2\2\2$\u018a\3\2\2\2"+
		"&\u01a1\3\2\2\2(\u01a9\3\2\2\2*\u01ab\3\2\2\2,\u01b0\3\2\2\2.\u01b8\3"+
		"\2\2\2\60\u01bb\3\2\2\2\62\u01e7\3\2\2\2\64\u0200\3\2\2\2\66\u0211\3\2"+
		"\2\28\u0214\3\2\2\2:\u023f\3\2\2\2<\u024b\3\2\2\2>\u024d\3\2\2\2@\u024f"+
		"\3\2\2\2B\u0258\3\2\2\2D\u026c\3\2\2\2F\u0280\3\2\2\2H\u0282\3\2\2\2J"+
		"\u0289\3\2\2\2L\u028b\3\2\2\2N\u0292\3\2\2\2P\u02a1\3\2\2\2R\u02aa\3\2"+
		"\2\2T\u02af\3\2\2\2V\u02b6\3\2\2\2X\u02b8\3\2\2\2Z\u02cf\3\2\2\2\\\u02d1"+
		"\3\2\2\2^\u02d8\3\2\2\2`\u02e3\3\2\2\2b\u02ed\3\2\2\2d\u02ef\3\2\2\2f"+
		"\u02f8\3\2\2\2h\u02fa\3\2\2\2j\u0302\3\2\2\2l\u0306\3\2\2\2n\u030a\3\2"+
		"\2\2p\u0311\3\2\2\2r\u031e\3\2\2\2tu\5\4\3\2uv\7\2\2\3v\u0081\3\2\2\2"+
		"wy\5\6\4\2xz\5\2\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\2\2\3|\u0081\3"+
		"\2\2\2}~\5\b\5\2~\177\7\2\2\3\177\u0081\3\2\2\2\u0080t\3\2\2\2\u0080w"+
		"\3\2\2\2\u0080}\3\2\2\2\u0081\3\3\2\2\2\u0082\u0083\7\6\2\2\u0083\u0086"+
		"\7s\2\2\u0084\u0087\5\26\f\2\u0085\u0087\5\30\r\2\u0086\u0084\3\2\2\2"+
		"\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\7\2\2\u0089\5\3"+
		"\2\2\2\u008a\u008b\7\t\2\2\u008b\u008e\7s\2\2\u008c\u008d\7\b\2\2\u008d"+
		"\u008f\7s\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0093\3\2"+
		"\2\2\u0090\u0092\5\24\13\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0099\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u0098\5\n\6\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00c3\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u009d\7\t\2\2\u009d\u009e\7s\2\2\u009e\u00a0\7\26\2\2\u009f"+
		"\u00a1\5V,\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2"+
		"\2\u00a2\u00a6\7\27\2\2\u00a3\u00a5\5\24\13\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ac\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\5(\25\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b3\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\33\2\2\u00b0\u00b1\5\16\b\2\u00b1"+
		"\u00b2\7\7\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b7\5\f\7\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00be\3\2"+
		"\2\2\u00ba\u00bb\7!\2\2\u00bb\u00bc\5\16\b\2\u00bc\u00bd\7\7\2\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\7\7\2\2\u00c1\u00c3\3\2\2\2\u00c2\u008a\3\2\2\2\u00c2"+
		"\u009c\3\2\2\2\u00c3\7\3\2\2\2\u00c4\u00c5\7\20\2\2\u00c5\u00c7\7s\2\2"+
		"\u00c6\u00c8\5\24\13\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cd"+
		"\3\2\2\2\u00c9\u00ca\7\33\2\2\u00ca\u00cb\5\16\b\2\u00cb\u00cc\7\7\2\2"+
		"\u00cc\u00ce\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0"+
		"\3\2\2\2\u00cf\u00d1\5\f\7\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d8\3\2\2\2\u00d4\u00d5\7!"+
		"\2\2\u00d5\u00d6\5\16\b\2\u00d6\u00d7\7\7\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d4\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\7"+
		"\2\2\u00db\t\3\2\2\2\u00dc\u0104\7\7\2\2\u00dd\u00de\7\20\2\2\u00de\u00df"+
		"\7s\2\2\u00df\u00e1\7\26\2\2\u00e0\u00e2\5V,\2\u00e1\u00e0\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\27\2\2\u00e4\u00e9\5"+
		"\16\b\2\u00e5\u00e6\7\33\2\2\u00e6\u00e7\5\16\b\2\u00e7\u00e8\7\7\2\2"+
		"\u00e8\u00ea\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ee"+
		"\3\2\2\2\u00eb\u00ed\5\f\7\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f5\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\u00f2\7!\2\2\u00f2\u00f3\5\16\b\2\u00f3\u00f4\7\7\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f9\7\7\2\2\u00f8\u00fa\7s\2\2\u00f9\u00f8\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u0104\3\2\2\2\u00fb\u00fc\7\t\2\2\u00fc\u00fd\7s"+
		"\2\2\u00fd\u00ff\7\26\2\2\u00fe\u0100\5V,\2\u00ff\u00fe\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\27\2\2\u0102\u0104\7"+
		"[\2\2\u0103\u00dc\3\2\2\2\u0103\u00dd\3\2\2\2\u0103\u00fb\3\2\2\2\u0104"+
		"\13\3\2\2\2\u0105\u0106\7%\2\2\u0106\u0107\7s\2\2\u0107\u0109\7\26\2\2"+
		"\u0108\u010a\5 \21\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b\u010e\7\27\2\2\u010c\u010d\7\35\2\2\u010d\u010f\5R*\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\5\16"+
		"\b\2\u0111\u0112\7\7\2\2\u0112\r\3\2\2\2\u0113\u0115\5\20\t\2\u0114\u0113"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\17\3\2\2\2\u0116\u011b\5\22\n\2\u0117"+
		"\u0119\7\3\2\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011c\5\20\t\2\u011b\u0118\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\21\3\2\2\2\u011d\u0121\5\24\13\2\u011e\u0121\5(\25\2\u011f\u0121\5Z."+
		"\2\u0120\u011d\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\23"+
		"\3\2\2\2\u0122\u0124\5\26\f\2\u0123\u0125\5\24\13\2\u0124\u0123\3\2\2"+
		"\2\u0124\u0125\3\2\2\2\u0125\u0134\3\2\2\2\u0126\u0128\5\30\r\2\u0127"+
		"\u0129\5\24\13\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0134\3"+
		"\2\2\2\u012a\u012c\5\32\16\2\u012b\u012d\5\24\13\2\u012c\u012b\3\2\2\2"+
		"\u012c\u012d\3\2\2\2\u012d\u0134\3\2\2\2\u012e\u0134\5\34\17\2\u012f\u0131"+
		"\5&\24\2\u0130\u0132\5\24\13\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2"+
		"\u0132\u0134\3\2\2\2\u0133\u0122\3\2\2\2\u0133\u0126\3\2\2\2\u0133\u012a"+
		"\3\2\2\2\u0133\u012e\3\2\2\2\u0133\u012f\3\2\2\2\u0134\25\3\2\2\2\u0135"+
		"\u0136\7\34\2\2\u0136\u0137\7s\2\2\u0137\u0138\7d\2\2\u0138\u0139\5Z."+
		"\2\u0139\27\3\2\2\2\u013a\u013b\7\61\2\2\u013b\u013c\7s\2\2\u013c\u013d"+
		"\7o\2\2\u013d\u013e\5<\37\2\u013e\u013f\5T+\2\u013f\31\3\2\2\2\u0140\u0141"+
		"\7.\2\2\u0141\u0142\7s\2\2\u0142\u0143\7o\2\2\u0143\u0145\7\26\2\2\u0144"+
		"\u0146\5V,\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2"+
		"\2\u0147\u014a\7\27\2\2\u0148\u0149\7\35\2\2\u0149\u014b\5R*\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\33\3\2\2\2\u014c\u014d\7\13\2\2\u014d"+
		"\u0152\5\"\22\2\u014e\u014f\7\32\2\2\u014f\u0151\5\"\22\2\u0150\u014e"+
		"\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7l\2\2\u0156\u0159\5<\37"+
		"\2\u0157\u0158\7d\2\2\u0158\u015a\5Z.\2\u0159\u0157\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u0168\3\2\2\2\u015b\u015c\7\13\2\2\u015c\u0161\5\"\22\2"+
		"\u015d\u015e\7\32\2\2\u015e\u0160\5\"\22\2\u015f\u015d\3\2\2\2\u0160\u0163"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0165\7d\2\2\u0165\u0166\5Z.\2\u0166\u0168\3\2\2"+
		"\2\u0167\u014c\3\2\2\2\u0167\u015b\3\2\2\2\u0168\35\3\2\2\2\u0169\u016a"+
		"\7\30\2\2\u016a\u016b\5$\23\2\u016b\u016c\7\31\2\2\u016c\37\3\2\2\2\u016d"+
		"\u016e\b\21\1\2\u016e\u016f\5\"\22\2\u016f\u0175\3\2\2\2\u0170\u0171\f"+
		"\3\2\2\u0171\u0172\7\32\2\2\u0172\u0174\5\"\22\2\u0173\u0170\3\2\2\2\u0174"+
		"\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176!\3\2\2\2"+
		"\u0177\u0175\3\2\2\2\u0178\u017c\7s\2\2\u0179\u017a\7s\2\2\u017a\u017c"+
		"\5\36\20\2\u017b\u0178\3\2\2\2\u017b\u0179\3\2\2\2\u017c#\3\2\2\2\u017d"+
		"\u018b\5Z.\2\u017e\u017f\5Z.\2\u017f\u0180\7\32\2\2\u0180\u0181\5$\23"+
		"\2\u0181\u0183\3\2\2\2\u0182\u017e\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u018b"+
		"\3\2\2\2\u0184\u0185\5Z.\2\u0185\u0186\7l\2\2\u0186\u0187\5$\23\2\u0187"+
		"\u0189\3\2\2\2\u0188\u0184\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2"+
		"\2\2\u018a\u017d\3\2\2\2\u018a\u0182\3\2\2\2\u018a\u0188\3\2\2\2\u018b"+
		"%\3\2\2\2\u018c\u018d\7\"\2\2\u018d\u018e\5 \21\2\u018e\u0191\5N(\2\u018f"+
		"\u0190\7\35\2\2\u0190\u0192\5R*\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u01a2\3\2\2\2\u0193\u019e\7\"\2\2\u0194\u0196\5 \21\2\u0195"+
		"\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7l"+
		"\2\2\u0198\u019a\7s\2\2\u0199\u019b\7\32\2\2\u019a\u0199\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u0195\3\2\2\2\u019d\u01a0\3\2"+
		"\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u018c\3\2\2\2\u01a1\u0193\3\2\2\2\u01a2\'\3\2\2\2"+
		"\u01a3\u01aa\5\62\32\2\u01a4\u01aa\5\64\33\2\u01a5\u01aa\5\66\34\2\u01a6"+
		"\u01aa\5:\36\2\u01a7\u01aa\5.\30\2\u01a8\u01aa\5*\26\2\u01a9\u01a3\3\2"+
		"\2\2\u01a9\u01a4\3\2\2\2\u01a9\u01a5\3\2\2\2\u01a9\u01a6\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa)\3\2\2\2\u01ab\u01ac\7\\\2\2"+
		"\u01ac\u01ad\7\26\2\2\u01ad\u01ae\5,\27\2\u01ae\u01af\7\27\2\2\u01af+"+
		"\3\2\2\2\u01b0\u01b5\5Z.\2\u01b1\u01b2\7\32\2\2\u01b2\u01b4\5,\27\2\u01b3"+
		"\u01b1\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6-\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7\23\2\2\u01b9\u01ba"+
		"\5\60\31\2\u01ba/\3\2\2\2\u01bb\u01bc\5Z.\2\u01bc\u01be\7\26\2\2\u01bd"+
		"\u01bf\5p9\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2"+
		"\2\u01c0\u01c1\7\27\2\2\u01c1\61\3\2\2\2\u01c2\u01e8\7Y\2\2\u01c3\u01c4"+
		"\5\34\17\2\u01c4\u01c5\7d\2\2\u01c5\u01c6\5Z.\2\u01c6\u01e8\3\2\2\2\u01c7"+
		"\u01c8\5\34\17\2\u01c8\u01c9\7f\2\2\u01c9\u01e8\3\2\2\2\u01ca\u01cb\5"+
		"\34\17\2\u01cb\u01cc\7g\2\2\u01cc\u01e8\3\2\2\2\u01cd\u01ce\7\f\2\2\u01ce"+
		"\u01cf\5^\60\2\u01cf\u01d0\7_\2\2\u01d0\u01d2\5\16\b\2\u01d1\u01d3\7a"+
		"\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d5\7\r\2\2\u01d5\u01e8\3\2\2\2\u01d6\u01d7\7#\2\2\u01d7\u01d8\5^\60"+
		"\2\u01d8\u01d9\7_\2\2\u01d9\u01db\5\16\b\2\u01da\u01dc\7a\2\2\u01db\u01da"+
		"\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\7$\2\2\u01de"+
		"\u01e8\3\2\2\2\u01df\u01e0\7\24\2\2\u01e0\u01e1\5f\64\2\u01e1\u01e2\7"+
		"_\2\2\u01e2\u01e3\5\16\b\2\u01e3\u01e4\7\25\2\2\u01e4\u01e8\3\2\2\2\u01e5"+
		"\u01e8\7\67\2\2\u01e6\u01e8\78\2\2\u01e7\u01c2\3\2\2\2\u01e7\u01c3\3\2"+
		"\2\2\u01e7\u01c7\3\2\2\2\u01e7\u01ca\3\2\2\2\u01e7\u01cd\3\2\2\2\u01e7"+
		"\u01d6\3\2\2\2\u01e7\u01df\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e6\3\2"+
		"\2\2\u01e8\63\3\2\2\2\u01e9\u01eb\7\23\2\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u0201\5Z.\2\u01ed\u01ee\7)\2\2\u01ee"+
		"\u0201\5\60\31\2\u01ef\u01f1\7&\2\2\u01f0\u01f2\5d\63\2\u01f1\u01f0\3"+
		"\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f5\7\23\2\2\u01f4"+
		"\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\5&"+
		"\24\2\u01f7\u01f9\5Z.\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fc\3\2\2\2\u01fa\u01fb\7_\2\2\u01fb\u01fd\5\16\b\2\u01fc\u01fa\3\2"+
		"\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\7\'\2\2\u01ff"+
		"\u0201\3\2\2\2\u0200\u01ea\3\2\2\2\u0200\u01ed\3\2\2\2\u0200\u01ef\3\2"+
		"\2\2\u0201\65\3\2\2\2\u0202\u0206\7\21\2\2\u0203\u0205\58\35\2\u0204\u0203"+
		"\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u0212\7\22\2\2\u020a\u020b\7"+
		",\2\2\u020b\u020d\5&\24\2\u020c\u020e\5\34\17\2\u020d\u020c\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u0212\3\2\2\2\u020f\u0212\7\36\2\2\u0210\u0212\7"+
		"I\2\2\u0211\u0202\3\2\2\2\u0211\u020a\3\2\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0210\3\2\2\2\u0212\67\3\2\2\2\u0213\u0215\5d\63\2\u0214\u0213\3\2\2"+
		"\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\5r:\2\u0217\u0219"+
		"\5\36\20\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2"+
		"\u021a\u021c\7\26\2\2\u021b\u021d\5$\23\2\u021c\u021b\3\2\2\2\u021c\u021d"+
		"\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0221\7\27\2\2\u021f\u0220\7\4\2\2"+
		"\u0220\u0222\5^\60\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0225"+
		"\3\2\2\2\u0223\u0224\7/\2\2\u0224\u0226\5Z.\2\u0225\u0223\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0228\7\35\2\2\u0228\u022a\5"+
		"R*\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u022c\7_\2\2\u022c\u022e\5\16\b\2\u022d\u022f\7a\2\2\u022e\u022d\3\2"+
		"\2\2\u022e\u022f\3\2\2\2\u022f9\3\2\2\2\u0230\u0231\7s\2\2\u0231\u0232"+
		"\7d\2\2\u0232\u0233\7-\2\2\u0233\u0234\7s\2\2\u0234\u0236\7\26\2\2\u0235"+
		"\u0237\5p9\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\3\2\2"+
		"\2\u0238\u023b\7\27\2\2\u0239\u023a\7B\2\2\u023a\u023c\7s\2\2\u023b\u0239"+
		"\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0240\3\2\2\2\u023d\u023e\7*\2\2\u023e"+
		"\u0240\5Z.\2\u023f\u0230\3\2\2\2\u023f\u023d\3\2\2\2\u0240;\3\2\2\2\u0241"+
		"\u024c\5> \2\u0242\u024c\5@!\2\u0243\u024c\5B\"\2\u0244\u024c\5D#\2\u0245"+
		"\u024c\5F$\2\u0246\u0248\5H%\2\u0247\u0249\5<\37\2\u0248\u0247\3\2\2\2"+
		"\u0248\u0249\3\2\2\2\u0249\u024c\3\2\2\2\u024a\u024c\5r:\2\u024b\u0241"+
		"\3\2\2\2\u024b\u0242\3\2\2\2\u024b\u0243\3\2\2\2\u024b\u0244\3\2\2\2\u024b"+
		"\u0245\3\2\2\2\u024b\u0246\3\2\2\2\u024b\u024a\3\2\2\2\u024c=\3\2\2\2"+
		"\u024d\u024e\t\2\2\2\u024e?\3\2\2\2\u024f\u0250\7Q\2\2\u0250\u0251\7\26"+
		"\2\2\u0251\u0252\5$\23\2\u0252\u0253\7\27\2\2\u0253A\3\2\2\2\u0254\u0255"+
		"\7T\2\2\u0255\u0259\5\30\r\2\u0256\u0257\7T\2\2\u0257\u0259\7R\2\2\u0258"+
		"\u0254\3\2\2\2\u0258\u0256\3\2\2\2\u0259C\3\2\2\2\u025a\u025b\7S\2\2\u025b"+
		"\u025c\7\26\2\2\u025c\u025d\5 \21\2\u025d\u025e\7l\2\2\u025e\u0261\5<"+
		"\37\2\u025f\u0260\7d\2\2\u0260\u0262\5Z.\2\u0261\u025f\3\2\2\2\u0261\u0262"+
		"\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264\7\27\2\2\u0264\u026d\3\2\2\2"+
		"\u0265\u0266\7S\2\2\u0266\u0267\7\26\2\2\u0267\u0268\5 \21\2\u0268\u0269"+
		"\7d\2\2\u0269\u026a\5Z.\2\u026a\u026b\7\27\2\2\u026b\u026d\3\2\2\2\u026c"+
		"\u025a\3\2\2\2\u026c\u0265\3\2\2\2\u026dE\3\2\2\2\u026e\u026f\7U\2\2\u026f"+
		"\u0270\7\26\2\2\u0270\u0271\5 \21\2\u0271\u0272\7l\2\2\u0272\u0275\5<"+
		"\37\2\u0273\u0274\7d\2\2\u0274\u0276\5Z.\2\u0275\u0273\3\2\2\2\u0275\u0276"+
		"\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\7\27\2\2\u0278\u0281\3\2\2\2"+
		"\u0279\u027a\7U\2\2\u027a\u027b\7\26\2\2\u027b\u027c\5 \21\2\u027c\u027d"+
		"\7d\2\2\u027d\u027e\5Z.\2\u027e\u027f\7\27\2\2\u027f\u0281\3\2\2\2\u0280"+
		"\u026e\3\2\2\2\u0280\u0279\3\2\2\2\u0281G\3\2\2\2\u0282\u0283\7(\2\2\u0283"+
		"\u0284\5J&\2\u0284I\3\2\2\2\u0285\u028a\5r:\2\u0286\u028a\5N(\2\u0287"+
		"\u028a\7W\2\2\u0288\u028a\7V\2\2\u0289\u0285\3\2\2\2\u0289\u0286\3\2\2"+
		"\2\u0289\u0287\3\2\2\2\u0289\u0288\3\2\2\2\u028aK\3\2\2\2\u028b\u028c"+
		"\7\26\2\2\u028c\u028d\5V,\2\u028d\u0290\7\27\2\2\u028e\u028f\7\35\2\2"+
		"\u028f\u0291\5R*\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291M\3\2"+
		"\2\2\u0292\u0297\5L\'\2\u0293\u0294\7b\2\2\u0294\u0295\5P)\2\u0295\u0296"+
		"\7c\2\2\u0296\u0298\3\2\2\2\u0297\u0293\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"O\3\2\2\2\u0299\u02a2\7\23\2\2\u029a\u02a2\7)\2\2\u029b\u029c\7\23\2\2"+
		"\u029c\u029d\7\32\2\2\u029d\u02a2\7)\2\2\u029e\u029f\7)\2\2\u029f\u02a0"+
		"\7\32\2\2\u02a0\u02a2\7\23\2\2\u02a1\u0299\3\2\2\2\u02a1\u029a\3\2\2\2"+
		"\u02a1\u029b\3\2\2\2\u02a1\u029e\3\2\2\2\u02a2Q\3\2\2\2\u02a3\u02ab\5"+
		"<\37\2\u02a4\u02a5\5 \21\2\u02a5\u02a6\7l\2\2\u02a6\u02a7\5<\37\2\u02a7"+
		"\u02a9\3\2\2\2\u02a8\u02a4\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\3\2"+
		"\2\2\u02aa\u02a3\3\2\2\2\u02aa\u02a8\3\2\2\2\u02abS\3\2\2\2\u02ac\u02ad"+
		"\7b\2\2\u02ad\u02ae\7s\2\2\u02ae\u02b0\7c\2\2\u02af\u02ac\3\2\2\2\u02af"+
		"\u02b0\3\2\2\2\u02b0U\3\2\2\2\u02b1\u02b7\5X-\2\u02b2\u02b3\5X-\2\u02b3"+
		"\u02b4\7\3\2\2\u02b4\u02b5\5V,\2\u02b5\u02b7\3\2\2\2\u02b6\u02b1\3\2\2"+
		"\2\u02b6\u02b2\3\2\2\2\u02b7W\3\2\2\2\u02b8\u02b9\5 \21\2\u02b9\u02ba"+
		"\7l\2\2\u02ba\u02bb\5<\37\2\u02bbY\3\2\2\2\u02bc\u02bd\5^\60\2\u02bd\u02be"+
		"\5\\/\2\u02be\u02bf\5Z.\2\u02bf\u02d0\3\2\2\2\u02c0\u02c1\7j\2\2\u02c1"+
		"\u02d0\5^\60\2\u02c2\u02d0\5^\60\2\u02c3\u02c4\5^\60\2\u02c4\u02c5\7d"+
		"\2\2\u02c5\u02c6\5Z.\2\u02c6\u02d0\3\2\2\2\u02c7\u02c9\7s\2\2\u02c8\u02c7"+
		"\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cc\7\26\2\2"+
		"\u02cb\u02cd\5p9\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce"+
		"\3\2\2\2\u02ce\u02d0\7\27\2\2\u02cf\u02bc\3\2\2\2\u02cf\u02c0\3\2\2\2"+
		"\u02cf\u02c2\3\2\2\2\u02cf\u02c3\3\2\2\2\u02cf\u02c8\3\2\2\2\u02d0[\3"+
		"\2\2\2\u02d1\u02d2\t\3\2\2\u02d2]\3\2\2\2\u02d3\u02d4\5`\61\2\u02d4\u02d5"+
		"\7o\2\2\u02d5\u02d6\5`\61\2\u02d6\u02d9\3\2\2\2\u02d7\u02d9\5`\61\2\u02d8"+
		"\u02d3\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9_\3\2\2\2\u02da\u02db\5b\62\2"+
		"\u02db\u02dc\7n\2\2\u02dc\u02dd\5`\61\2\u02dd\u02e4\3\2\2\2\u02de\u02df"+
		"\5b\62\2\u02df\u02e0\7m\2\2\u02e0\u02e1\5`\61\2\u02e1\u02e4\3\2\2\2\u02e2"+
		"\u02e4\5b\62\2\u02e3\u02da\3\2\2\2\u02e3\u02de\3\2\2\2\u02e3\u02e2\3\2"+
		"\2\2\u02e4a\3\2\2\2\u02e5\u02ee\7s\2\2\u02e6\u02ee\7`\2\2\u02e7\u02ee"+
		"\7D\2\2\u02e8\u02ee\7M\2\2\u02e9\u02ee\5 \21\2\u02ea\u02ee\5r:\2\u02eb"+
		"\u02ee\7p\2\2\u02ec\u02ee\7\62\2\2\u02ed\u02e5\3\2\2\2\u02ed\u02e6\3\2"+
		"\2\2\u02ed\u02e7\3\2\2\2\u02ed\u02e8\3\2\2\2\u02ed\u02e9\3\2\2\2\u02ed"+
		"\u02ea\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ec\3\2\2\2\u02eec\3\2\2\2"+
		"\u02ef\u02f0\7\26\2\2\u02f0\u02f1\5f\64\2\u02f1\u02f2\7\27\2\2\u02f2e"+
		"\3\2\2\2\u02f3\u02f9\5h\65\2\u02f4\u02f5\5h\65\2\u02f5\u02f6\7\32\2\2"+
		"\u02f6\u02f7\5f\64\2\u02f7\u02f9\3\2\2\2\u02f8\u02f3\3\2\2\2\u02f8\u02f4"+
		"\3\2\2\2\u02f9g\3\2\2\2\u02fa\u02fb\7s\2\2\u02fb\u02fc\7d\2\2\u02fc\u02fd"+
		"\5Z.\2\u02fd\u02fe\5j\66\2\u02fe\u02ff\5Z.\2\u02ff\u0300\5l\67\2\u0300"+
		"\u0301\5n8\2\u0301i\3\2\2\2\u0302\u0303\t\4\2\2\u0303k\3\2\2\2\u0304\u0305"+
		"\7/\2\2\u0305\u0307\5Z.\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"m\3\2\2\2\u0308\u0309\7\60\2\2\u0309\u030b\5Z.\2\u030a\u0308\3\2\2\2\u030a"+
		"\u030b\3\2\2\2\u030bo\3\2\2\2\u030c\u0312\5Z.\2\u030d\u030e\5Z.\2\u030e"+
		"\u030f\7\32\2\2\u030f\u0310\5p9\2\u0310\u0312\3\2\2\2\u0311\u030c\3\2"+
		"\2\2\u0311\u030d\3\2\2\2\u0312q\3\2\2\2\u0313\u031f\7s\2\2\u0314\u0315"+
		"\7s\2\2\u0315\u0316\7k\2\2\u0316\u031f\7s\2\2\u0317\u0318\7s\2\2\u0318"+
		"\u0319\7k\2\2\u0319\u031a\7s\2\2\u031a\u031b\7\26\2\2\u031b\u031c\5 \21"+
		"\2\u031c\u031d\7\27\2\2\u031d\u031f\3\2\2\2\u031e\u0313\3\2\2\2\u031e"+
		"\u0314\3\2\2\2\u031e\u0317\3\2\2\2\u031fs\3\2\2\2hy\u0080\u0086\u008e"+
		"\u0093\u0099\u00a0\u00a6\u00ac\u00b3\u00b8\u00be\u00c2\u00c7\u00cd\u00d2"+
		"\u00d8\u00e1\u00e9\u00ee\u00f5\u00f9\u00ff\u0103\u0109\u010e\u0114\u0118"+
		"\u011b\u0120\u0124\u0128\u012c\u0131\u0133\u0145\u014a\u0152\u0159\u0161"+
		"\u0167\u0175\u017b\u0182\u0188\u018a\u0191\u0195\u019a\u019e\u01a1\u01a9"+
		"\u01b5\u01be\u01d2\u01db\u01e7\u01ea\u01f1\u01f4\u01f8\u01fc\u0200\u0206"+
		"\u020d\u0211\u0214\u0218\u021c\u0221\u0225\u0229\u022e\u0236\u023b\u023f"+
		"\u0248\u024b\u0258\u0261\u026c\u0275\u0280\u0289\u0290\u0297\u02a1\u02a8"+
		"\u02aa\u02af\u02b6\u02c8\u02cc\u02cf\u02d8\u02e3\u02ed\u02f8\u0306\u030a"+
		"\u0311\u031e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}