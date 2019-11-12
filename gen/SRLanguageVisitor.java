// Generated from C:/Users/usuario/Desktop/translatorSR-Python/grammar\SRLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SRLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SRLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#components}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponents(SRLanguageParser.ComponentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(SRLanguageParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#resource_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_specification(SRLanguageParser.Resource_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#resource_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_body(SRLanguageParser.Resource_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#spec_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_body(SRLanguageParser.Spec_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc(SRLanguageParser.ProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SRLanguageParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#block_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_items(SRLanguageParser.Block_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_item(SRLanguageParser.Block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(SRLanguageParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(SRLanguageParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SRLanguageParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#op_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_type(SRLanguageParser.Op_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SRLanguageParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#subscripts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscripts(SRLanguageParser.SubscriptsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#id_subs_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_subs_lp(SRLanguageParser.Id_subs_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#id_subs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_subs(SRLanguageParser.Id_subsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(SRLanguageParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(SRLanguageParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(SRLanguageParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#write_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_expr(SRLanguageParser.Write_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#write_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_params(SRLanguageParser.Write_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#explicit_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_call(SRLanguageParser.Explicit_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation(SRLanguageParser.InvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#sequential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequential(SRLanguageParser.SequentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#op_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_invocation(SRLanguageParser.Op_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#op_service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_service(SRLanguageParser.Op_serviceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#in_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_cmd(SRLanguageParser.In_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#resource_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_control(SRLanguageParser.Resource_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(SRLanguageParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#basic_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_type(SRLanguageParser.Basic_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#enum_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_def(SRLanguageParser.Enum_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#pointer_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_def(SRLanguageParser.Pointer_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#record_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_def(SRLanguageParser.Record_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#union_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_def(SRLanguageParser.Union_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#capability_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapability_def(SRLanguageParser.Capability_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#cap_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCap_for(SRLanguageParser.Cap_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrototype(SRLanguageParser.PrototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#op_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_prototype(SRLanguageParser.Op_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#op_res}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_res(SRLanguageParser.Op_resContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#result_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_id(SRLanguageParser.Result_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#type_res}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_res(SRLanguageParser.Type_resContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(SRLanguageParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#parameters2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters2(SRLanguageParser.Parameters2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SRLanguageParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#op_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_log(SRLanguageParser.Op_logContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(SRLanguageParser.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(SRLanguageParser.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr3(SRLanguageParser.Expr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(SRLanguageParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#quantifier1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier1(SRLanguageParser.Quantifier1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#quantifier2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier2(SRLanguageParser.Quantifier2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(SRLanguageParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#step_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep_opt(SRLanguageParser.Step_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#such_that_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuch_that_opt(SRLanguageParser.Such_that_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#actuals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActuals(SRLanguageParser.ActualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRLanguageParser#qualified_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_id(SRLanguageParser.Qualified_idContext ctx);
}