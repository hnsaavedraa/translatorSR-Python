import org.antlr.v4.runtime.tree.TerminalNode;
import javax.tools.StandardLocation;
import java.util.List;

public class ListenerSRToPy extends SRLanguageBaseListener {
    public int amountOfTabsStartOfSentence = 0;
    public int amountOfTabsSequential = 0;
    public String returnsito = "";

    @Override
    public void enterGlobal(SRLanguageParser.GlobalContext ctx) {
        printIdentation();
        System.out.println("\n#File from global: " + ctx.ID().toString().replaceAll("\\[", "").replaceAll("]", "") + "\n\n" +
                            "import numpy as np");
    }

    @Override
    public void enterResource_specification(SRLanguageParser.Resource_specificationContext ctx) {
        printIdentation();
        System.out.println("\n#File from resource: " + ctx.ID().toString().replaceAll("\\[", "").replaceAll("]", "") + "\n\n" + "import numpy as np");
        if (ctx.IMPORT() != null){
            printIdentation();
            System.out.println("import " + ctx.ID(1).toString().replaceAll("\\[", "").replaceAll("]", ""));
        }
    }

    @Override
    public void enterResource_body(SRLanguageParser.Resource_bodyContext ctx) {
        printIdentation();
        System.out.println("\n#File from resource: " + ctx.ID().toString().replaceAll("\\[", "").replaceAll("]", "") + "\n\n" + "import numpy as np");
    }

    @Override
    public void enterConstant(SRLanguageParser.ConstantContext ctx) {
        printIdentation();
        System.out.println(ctx.ID().toString().toUpperCase() + " = " + expressionTranslation(ctx.expression()));
    }

    @Override public void enterOp_invocation(SRLanguageParser.Op_invocationContext ctx) {
        if( ctx.CALL() == null && ctx.SEND() == null && ctx.CO() == null){
            String expr = expressionTranslation(ctx.expression());

            if (expr.substring(expr.length() - 1).matches("[a-z]")
                    || expr.substring(expr.length() - 1).matches("[A-Z]")) {
                printIdentation();
                System.out.print(expr);
            } else if (!expr.contains("(")) {
                printIdentation();
                System.out.println(expr);
            }
            if (expr.contains("(")) {
                System.out.println(expr);
            }
        }
        if(ctx.CALL() != null){
             System.out.print(expressionTranslation(ctx.expression()));
        }
    }
    @Override public void enterResource_control(SRLanguageParser.Resource_controlContext ctx) {
        
        if(ctx.actuals() != null){
            printIdentation();
            System.out.println(ctx.ID(0)+" = " + ctx.ID(1) +"("+actualsTranslation(ctx.actuals())+")" );
        }
        else if (ctx.DESTROY() != null){
            printIdentation();
            System.out.print(expressionTranslation(ctx.expression()));
        }
        
    }


    public String expressionTranslation(SRLanguageParser.ExpressionContext ctx){
        String expr = "";
        if(ctx.op_log() != null){
            expr = expr1Translation(ctx.expr1()) + " ";
            if(ctx.op_log().children.toString().equals("[&]")){
                expr += "and ";
            }else{
                expr += "or ";
            }
            expr += expressionTranslation(ctx.expression());
        } else if(ctx.EXCLAMACION() != null){
            expr = "not " + expr1Translation(ctx.expr1());
        } else if (ctx.ASIGNACION() != null) {
            expr = expr1Translation(ctx.expr1()) + " = " + expressionTranslation(ctx.expression());
        } else if (ctx.LPARENT() != null) {
            if(ctx.ID() != null){
                expr += ctx.ID().toString().replaceAll("\\[", "").replaceAll("]", "") + "(";
            }else{
                expr += "(";
            }
            if(ctx.actuals() != null){
                expr += actualsTranslation(ctx.actuals()) + ")";
            }else{
                expr += ")";
            }
        }else{
            expr = expr1Translation(ctx.expr1());
        }

        return expr;
    }

    public String expr1Translation(SRLanguageParser.Expr1Context ctx){
        String expr = "expr1";
        if(ctx.OPERADOR_COMPARACION() != null){
            expr = expr2Translation(ctx.expr2(0)) + 
                    ctx.OPERADOR_COMPARACION().toString().replaceAll("\\[", "").replaceAll("]", "") + 
                    expr2Translation(ctx.expr2(1));
        }else{
            expr = expr2Translation(ctx.expr2(0));
        }

        return expr;
    }

    public String expr2Translation(SRLanguageParser.Expr2Context ctx){
        String expr = "expr2";
        if (ctx.OPERADOR_ARITMETICO() != null) {
            expr = expr3Translation(ctx.expr3())
                    + ctx.OPERADOR_ARITMETICO().toString().replaceAll("\\[", "").replaceAll("]", "")
                    + expr2Translation(ctx.expr2());
        } else if(ctx.AUG() != null){
            expr = expr3Translation(ctx.expr3())
                    + " " + ctx.AUG().toString().replaceAll("\\[", "").replaceAll("]", "").replaceAll(":", "")
                    + " " + expr2Translation(ctx.expr2());
        } else {
            expr = expr3Translation(ctx.expr3());
        }
        return expr;
    }

    public String expr3Translation(SRLanguageParser.Expr3Context ctx){
        String expr = "";
        if(ctx.id_subs_lp() != null){
            expr = idSubsLpTranslation(ctx.id_subs_lp(), "expression");
        } else if(ctx.qualified_id() != null){
            expr = qualifiedIDTranslation(ctx.qualified_id());
        }else if(ctx.FALSE() != null){
            expr = "False";
        }else if(ctx.TRUE() != null){
            expr = "True";
        }
        else if(ctx.ID() != null){
            expr = ctx.ID().toString();
        }else if(ctx.NUM() != null){
            expr = ctx.NUM().toString().replaceAll("\\[", "").replaceAll("]", "");
        }
        else{
            expr = ctx.children.toString().replaceAll("\\[", "").replaceAll("]", "");
        }
        return expr;
    }

    @Override public void enterOp_type(SRLanguageParser.Op_typeContext ctx) {
        String varPameter = "";
        String varReturn = "";
        if(ctx.parameters() != null){
            varPameter = "def " + ctx.ID() + "(" + parametersTranslation(ctx.parameters()) + "): ";
        }
        if(ctx.result_id() != null){
            varReturn = "\n\treturn " + result_idTranslation(ctx.result_id());
        }
       System.out.println(varPameter + varReturn);
    }

    public String parametersTranslation(SRLanguageParser.ParametersContext ctx) {
        String parameter = "";
        if(ctx.parameters2() != null){
            parameter = parameters2Translation(ctx.parameters2());
        }
        return  parameter;
    }

    public String parameters2Translation(SRLanguageParser.Parameters2Context ctx) {
        String parameter = "";
        if(ctx.id_subs_lp() != null){
            parameter = idSubsLpTranslation(ctx.id_subs_lp(), "optype");
        }
        return parameter;
    }

    public String result_idTranslation(SRLanguageParser.Result_idContext ctx) {
        String var = "";
        if(ctx.id_subs_lp() != null){
            var = idSubsLpTranslation(ctx.id_subs_lp(), "optype");
        }
        return var;
    }

    public String idSubsLpTranslation(SRLanguageParser.Id_subs_lpContext ctx, String parent){
        String idSubsLp = "";
        String separator = ", ";
        if(ctx.COMA() != null){
            idSubsLp = idSubsLpTranslation(ctx.id_subs_lp(), parent) + separator + idSubsTranslation(ctx.id_subs());
        }else{
            idSubsLp = idSubsTranslation(ctx.id_subs());
        }
        return idSubsLp;
    }

    public String actualsTranslation(SRLanguageParser.ActualsContext ctx){
        String actuals = "";
        if(ctx.actuals() != null){
            actuals = expressionTranslation(ctx.expression()) + "," + actualsTranslation(ctx.actuals());
        }else{
            actuals = expressionTranslation(ctx.expression());
        }
        return actuals;
    }

    public String qualifiedIDTranslation(SRLanguageParser.Qualified_idContext ctx){
        String qualifiedId = "";
        if(ctx.PUNTO() != null){
            qualifiedId = ctx.ID(0).toString().replaceAll("\\[", "").replaceAll("]", "") + "." + ctx.ID(1).toString().replaceAll("\\[", "").replaceAll("]", "");
        } else if(ctx.id_subs_lp() != null){
            qualifiedId = ctx.ID(0).toString().replaceAll("\\[", "").replaceAll("]", "") + "." +
                            ctx.ID(1).toString().replaceAll("\\[", "").replaceAll("]", "") + "(" +
                            ")";
        } else{
            qualifiedId = ctx.ID(0).toString().replaceAll("\\[", "").replaceAll("]", "");
        }
        return qualifiedId;
    }

	@Override public void enterProc(SRLanguageParser.ProcContext ctx) { 
        String value = ctx.ID().toString();
        printIdentation();
        if(ctx.RETURNS() != null){
            returnsito = "\n\treturn " + qualifiedIDTranslation(ctx.result_id().t().qualified_id());
        }
        if(ctx.id_subs_lp() != null){
            System.out.println("def " + value + "(" + idSubsLpTranslation(ctx.id_subs_lp(), "operation") + ")" + ":");
        }else{
            System.out.println("def " + value + "()" + ":");
        }
        amountOfTabsStartOfSentence++;
    }

    @Override
    public void exitProc(SRLanguageParser.ProcContext ctx) {
        amountOfTabsStartOfSentence--;
        System.out.println("\t" + returnsito);
    }

    @Override public void enterWrite_expr(SRLanguageParser.Write_exprContext ctx) { 
        if(ctx.WRITE() != null){
            printIdentation();
            System.out.println("print(" + write_paramsTranslation(ctx.write_params())+ ")");
        }
    }

    public String write_paramsTranslation(SRLanguageParser.Write_paramsContext ctx) {
        String write = expressionTranslation(ctx.expression());
        if(ctx.COMA().toString().equals("[,]")) {
            write += ", " + write_paramsTranslation(ctx.write_params(0));
        }
        return write;
    }

    @Override public void enterOperation(SRLanguageParser.OperationContext ctx) {
        String var = "";
        if(ctx.op_prototype() != null) {
            if(ctx.op_prototype().prototype().RETURNS() != null){
                returnsito = "return " + result_idTranslation(ctx.op_prototype().prototype().result_id());
            }
        }else if(ctx.DOSPUNTOS() != null){
            if(ctx.COMA() != null && ctx.id_subs_lp().toArray().length > 1){
                int i = 0;
                while(true){
                    if(ctx.id_subs_lp(i) != null){
                        var = idSubsLpTranslation(ctx.id_subs_lp(i),"operation");
                        printIdentation();
                        System.out.println(var + " = " + ctx.ID(i).toString().replaceAll("\\[", "").replaceAll("]", ""));
                    }else{
                        break;
                    }
                    i++;
                }
            }else {
                var = idSubsLpTranslation(ctx.id_subs_lp(0),"operation");
                String[] parts = var.split(",");
                System.out.println(parts[0] + " = " + ctx.ID().toString().replaceAll("\\[", "").replaceAll("]", ""));
                System.out.println(parts[1].toString().replaceAll(" ", "") + " = " + ctx.ID().toString().replaceAll("\\[", "").replaceAll("]", ""));
            }
        }
    }

    @Override public void enterInvocation(SRLanguageParser.InvocationContext ctx) {
        if(ctx.actuals() != null){
            printIdentation();
            System.out.println(expressionTranslation(ctx.expression()) + "("+ actualsTranslation(ctx.actuals())+ ")" );
        }
        else{
            printIdentation();
            System.out.println(expressionTranslation(ctx.expression()) + "()" );
        }
    }

    @Override public void enterVariable(SRLanguageParser.VariableContext ctx) {
        String var = "";
        if(ctx.ASIGNACION() != null){
            var += idSubsTranslation(ctx.id_subs(0)) + " = " + expressionTranslation(ctx.expression());
            int i = 1;
            while(true){
                if(ctx.id_subs(i) != null){
                    var += ", " + idSubsTranslation(ctx.id_subs(i)) + " = " + expressionTranslation(ctx.expression());
                }else{
                    break;
                }
                i++;
            }
        }else{
            var += idSubsTranslation(ctx.id_subs(0)) + " = 0";
            int i = 1;
            while (true) {
                if(ctx.id_subs(i) != null){
                    var += ", " + idSubsTranslation(ctx.id_subs(i)) + " = 0";
                }else{
                    break;
                }
                i++;
            }
        }
        printIdentation();
        String tocompare = var.substring(var.length()-4);
        if( !tocompare.equals("open")){
            System.out.println(var);
        }
        else{
            System.out.print(var);
        }
       
    }

    public String idSubsTranslation(SRLanguageParser.Id_subsContext ctx){
        String idSubs = "";
        if(ctx.subscripts() != null){
            idSubs = ctx.ID().toString().replaceAll("\\[", "").replaceAll("]", "") + subscriptsTranslation(ctx.subscripts());
        }else{
            idSubs = ctx.ID().toString().replaceAll("\\[", "").replaceAll("]", "");
        }
        return idSubs;
    }

    public String subscriptsTranslation(SRLanguageParser.SubscriptsContext ctx){
        String subscripts = "";
        if(ctx.id_list() != null){
            subscripts = "[" + idListTranslation(ctx.id_list(), "subscripts") + "]";
        }
        return subscripts;
    }

    public String idListTranslation(SRLanguageParser.Id_listContext ctx, String parent){
        String idlist = "";
        String separator = "";
        if(parent.equals("subscripts") || parent.equals("expression")){
            separator = "][";
        }else{
            separator = ", ";
        }
        if(ctx.COMA() != null){
            idlist += expressionTranslation(ctx.expression()) + separator +
                    idListTranslation(ctx.id_list(), parent);
        } else if(ctx.DOSPUNTOS() != null){
            idlist += expressionTranslation(ctx.expression()) + ":" +
                    idListTranslation(ctx.id_list(), parent);
        } else{
            idlist += expressionTranslation(ctx.expression());
        }
        return idlist;
    }

   	@Override public void enterSequential(SRLanguageParser.SequentialContext ctx) { 
        if(ctx.IF() != null){
            printIdentation();
            System.out.println("if " + expr1Translation(ctx.expr1()) + ":");
            amountOfTabsStartOfSentence++;
            amountOfTabsSequential++;
        }else if(ctx.DO() != null){
            printIdentation();
            System.out.println("while "+expr1Translation(ctx.expr1()) + ":");
            amountOfTabsSequential++;
            amountOfTabsStartOfSentence++;
        }  
    }

    @Override
    public void enterQuantifier1(SRLanguageParser.Quantifier1Context ctx) { 
        amountOfTabsSequential++;
    }

    @Override
    public void exitSequential(SRLanguageParser.SequentialContext ctx) {
        amountOfTabsStartOfSentence -= amountOfTabsSequential;
        amountOfTabsSequential = 0;
    }

	@Override public void enterQuantifier2(SRLanguageParser.Quantifier2Context ctx) { 
        printIdentation();
        System.out.println("for " + ctx.ID() + " in range(" + expressionTranslation(ctx.expression(0)) + "," + expressionTranslation(ctx.expression(1)) + "):");
    }

    @Override
    public void exitQuantifier2(SRLanguageParser.Quantifier2Context ctx) {
        amountOfTabsStartOfSentence++;
    }

    public void printIdentation(){
        for(int i=0; i<amountOfTabsStartOfSentence; i++){
            System.out.print("\t");
        }
    }
}
