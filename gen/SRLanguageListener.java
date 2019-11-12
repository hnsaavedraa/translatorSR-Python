// Generated from C:/Users/usuario/Desktop/translatorSR-Python/grammar\SRLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SRLanguageParser}.
 */
public interface SRLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#components}.
	 * @param ctx the parse tree
	 */
	void enterComponents(SRLanguageParser.ComponentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#components}.
	 * @param ctx the parse tree
	 */
	void exitComponents(SRLanguageParser.ComponentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(SRLanguageParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(SRLanguageParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#resource_specification}.
	 * @param ctx the parse tree
	 */
	void enterResource_specification(SRLanguageParser.Resource_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#resource_specification}.
	 * @param ctx the parse tree
	 */
	void exitResource_specification(SRLanguageParser.Resource_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#resource_body}.
	 * @param ctx the parse tree
	 */
	void enterResource_body(SRLanguageParser.Resource_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#resource_body}.
	 * @param ctx the parse tree
	 */
	void exitResource_body(SRLanguageParser.Resource_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#spec_body}.
	 * @param ctx the parse tree
	 */
	void enterSpec_body(SRLanguageParser.Spec_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#spec_body}.
	 * @param ctx the parse tree
	 */
	void exitSpec_body(SRLanguageParser.Spec_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(SRLanguageParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(SRLanguageParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SRLanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SRLanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#block_items}.
	 * @param ctx the parse tree
	 */
	void enterBlock_items(SRLanguageParser.Block_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#block_items}.
	 * @param ctx the parse tree
	 */
	void exitBlock_items(SRLanguageParser.Block_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#block_item}.
	 * @param ctx the parse tree
	 */
	void enterBlock_item(SRLanguageParser.Block_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#block_item}.
	 * @param ctx the parse tree
	 */
	void exitBlock_item(SRLanguageParser.Block_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(SRLanguageParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(SRLanguageParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SRLanguageParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SRLanguageParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SRLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SRLanguageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#op_type}.
	 * @param ctx the parse tree
	 */
	void enterOp_type(SRLanguageParser.Op_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#op_type}.
	 * @param ctx the parse tree
	 */
	void exitOp_type(SRLanguageParser.Op_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SRLanguageParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SRLanguageParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(SRLanguageParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(SRLanguageParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(SRLanguageParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(SRLanguageParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#write_expr}.
	 * @param ctx the parse tree
	 */
	void enterWrite_expr(SRLanguageParser.Write_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#write_expr}.
	 * @param ctx the parse tree
	 */
	void exitWrite_expr(SRLanguageParser.Write_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#write_params}.
	 * @param ctx the parse tree
	 */
	void enterWrite_params(SRLanguageParser.Write_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#write_params}.
	 * @param ctx the parse tree
	 */
	void exitWrite_params(SRLanguageParser.Write_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#explicit_call}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_call(SRLanguageParser.Explicit_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#explicit_call}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_call(SRLanguageParser.Explicit_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#invocation}.
	 * @param ctx the parse tree
	 */
	void enterInvocation(SRLanguageParser.InvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#invocation}.
	 * @param ctx the parse tree
	 */
	void exitInvocation(SRLanguageParser.InvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#sequential}.
	 * @param ctx the parse tree
	 */
	void enterSequential(SRLanguageParser.SequentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#sequential}.
	 * @param ctx the parse tree
	 */
	void exitSequential(SRLanguageParser.SequentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#op_invocation}.
	 * @param ctx the parse tree
	 */
	void enterOp_invocation(SRLanguageParser.Op_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#op_invocation}.
	 * @param ctx the parse tree
	 */
	void exitOp_invocation(SRLanguageParser.Op_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#op_service}.
	 * @param ctx the parse tree
	 */
	void enterOp_service(SRLanguageParser.Op_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#op_service}.
	 * @param ctx the parse tree
	 */
	void exitOp_service(SRLanguageParser.Op_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#in_cmd}.
	 * @param ctx the parse tree
	 */
	void enterIn_cmd(SRLanguageParser.In_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#in_cmd}.
	 * @param ctx the parse tree
	 */
	void exitIn_cmd(SRLanguageParser.In_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#resource_control}.
	 * @param ctx the parse tree
	 */
	void enterResource_control(SRLanguageParser.Resource_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#resource_control}.
	 * @param ctx the parse tree
	 */
	void exitResource_control(SRLanguageParser.Resource_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(SRLanguageParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(SRLanguageParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type(SRLanguageParser.Basic_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type(SRLanguageParser.Basic_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#enum_def}.
	 * @param ctx the parse tree
	 */
	void enterEnum_def(SRLanguageParser.Enum_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#enum_def}.
	 * @param ctx the parse tree
	 */
	void exitEnum_def(SRLanguageParser.Enum_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#pointer_def}.
	 * @param ctx the parse tree
	 */
	void enterPointer_def(SRLanguageParser.Pointer_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#pointer_def}.
	 * @param ctx the parse tree
	 */
	void exitPointer_def(SRLanguageParser.Pointer_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#record_def}.
	 * @param ctx the parse tree
	 */
	void enterRecord_def(SRLanguageParser.Record_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#record_def}.
	 * @param ctx the parse tree
	 */
	void exitRecord_def(SRLanguageParser.Record_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#union_def}.
	 * @param ctx the parse tree
	 */
	void enterUnion_def(SRLanguageParser.Union_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#union_def}.
	 * @param ctx the parse tree
	 */
	void exitUnion_def(SRLanguageParser.Union_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#capability_def}.
	 * @param ctx the parse tree
	 */
	void enterCapability_def(SRLanguageParser.Capability_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#capability_def}.
	 * @param ctx the parse tree
	 */
	void exitCapability_def(SRLanguageParser.Capability_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#cap_for}.
	 * @param ctx the parse tree
	 */
	void enterCap_for(SRLanguageParser.Cap_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#cap_for}.
	 * @param ctx the parse tree
	 */
	void exitCap_for(SRLanguageParser.Cap_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#prototype}.
	 * @param ctx the parse tree
	 */
	void enterPrototype(SRLanguageParser.PrototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#prototype}.
	 * @param ctx the parse tree
	 */
	void exitPrototype(SRLanguageParser.PrototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#op_prototype}.
	 * @param ctx the parse tree
	 */
	void enterOp_prototype(SRLanguageParser.Op_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#op_prototype}.
	 * @param ctx the parse tree
	 */
	void exitOp_prototype(SRLanguageParser.Op_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#op_res}.
	 * @param ctx the parse tree
	 */
	void enterOp_res(SRLanguageParser.Op_resContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#op_res}.
	 * @param ctx the parse tree
	 */
	void exitOp_res(SRLanguageParser.Op_resContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(SRLanguageParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(SRLanguageParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#result_id}.
	 * @param ctx the parse tree
	 */
	void enterResult_id(SRLanguageParser.Result_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#result_id}.
	 * @param ctx the parse tree
	 */
	void exitResult_id(SRLanguageParser.Result_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#type_res}.
	 * @param ctx the parse tree
	 */
	void enterType_res(SRLanguageParser.Type_resContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#type_res}.
	 * @param ctx the parse tree
	 */
	void exitType_res(SRLanguageParser.Type_resContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void enterSubscripts(SRLanguageParser.SubscriptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void exitSubscripts(SRLanguageParser.SubscriptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#id_subs_lp}.
	 * @param ctx the parse tree
	 */
	void enterId_subs_lp(SRLanguageParser.Id_subs_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#id_subs_lp}.
	 * @param ctx the parse tree
	 */
	void exitId_subs_lp(SRLanguageParser.Id_subs_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#id_subs}.
	 * @param ctx the parse tree
	 */
	void enterId_subs(SRLanguageParser.Id_subsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#id_subs}.
	 * @param ctx the parse tree
	 */
	void exitId_subs(SRLanguageParser.Id_subsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(SRLanguageParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(SRLanguageParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#parameters2}.
	 * @param ctx the parse tree
	 */
	void enterParameters2(SRLanguageParser.Parameters2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#parameters2}.
	 * @param ctx the parse tree
	 */
	void exitParameters2(SRLanguageParser.Parameters2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SRLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SRLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#op_log}.
	 * @param ctx the parse tree
	 */
	void enterOp_log(SRLanguageParser.Op_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#op_log}.
	 * @param ctx the parse tree
	 */
	void exitOp_log(SRLanguageParser.Op_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(SRLanguageParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(SRLanguageParser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(SRLanguageParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(SRLanguageParser.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr3(SRLanguageParser.Expr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr3(SRLanguageParser.Expr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(SRLanguageParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(SRLanguageParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#quantifier1}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier1(SRLanguageParser.Quantifier1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#quantifier1}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier1(SRLanguageParser.Quantifier1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#quantifier2}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier2(SRLanguageParser.Quantifier2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#quantifier2}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier2(SRLanguageParser.Quantifier2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(SRLanguageParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(SRLanguageParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#step_opt}.
	 * @param ctx the parse tree
	 */
	void enterStep_opt(SRLanguageParser.Step_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#step_opt}.
	 * @param ctx the parse tree
	 */
	void exitStep_opt(SRLanguageParser.Step_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#such_that_opt}.
	 * @param ctx the parse tree
	 */
	void enterSuch_that_opt(SRLanguageParser.Such_that_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#such_that_opt}.
	 * @param ctx the parse tree
	 */
	void exitSuch_that_opt(SRLanguageParser.Such_that_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#actuals}.
	 * @param ctx the parse tree
	 */
	void enterActuals(SRLanguageParser.ActualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#actuals}.
	 * @param ctx the parse tree
	 */
	void exitActuals(SRLanguageParser.ActualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRLanguageParser#qualified_id}.
	 * @param ctx the parse tree
	 */
	void enterQualified_id(SRLanguageParser.Qualified_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRLanguageParser#qualified_id}.
	 * @param ctx the parse tree
	 */
	void exitQualified_id(SRLanguageParser.Qualified_idContext ctx);
}