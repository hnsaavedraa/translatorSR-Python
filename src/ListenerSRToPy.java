import org.antlr.v4.runtime.tree.TerminalNode;

import javax.tools.StandardLocation;
import java.util.List;

public class ListenerSRToPy extends SRLanguageBaseListener {
    public int amountOfTabsStartOfSentence = 0;

    @Override public void enterComponents(SRLanguageParser.ComponentsContext ctx) {
        System.out.println(ctx.global() != null);
    }

    @Override public void exitComponents(SRLanguageParser.ComponentsContext ctx) {

    }
    /*
    @Override
    public void enterAssignationConst(SRLanguageParser.AssignationConstContext ctx){
        String value = ctx.id(0).ID().toString(); //Get the string of IDs
        System.out.print(value + " = " + translationOfExpression(ctx.expression(0)));
    }

    @Override
    public void exitAssignationConst(SLLanguageParser.AssignationConstContext ctx) {
        System.out.println();
    }
    @Override
    public void enterSentence(SLLanguageParser.SentenceContext ctx){
        System.out.println();
        for(int i = 0; i < amountOfTabsStartOfSentence; i++) {
            System.out.print("\t");
        }
    }

    @Override
    public void enterAssignationVar(SLLanguageParser.AssignationVarContext ctx) {
        System.out.print(ctx.id(0).ID().toString());
        System.out.println(" = " + translateTipo(ctx.tipo()));
        for(int i = 1; i < ctx.id().size(); i++){
            System.out.print(ctx.id(i).ID().toString());
            System.out.println(" = " + translateTipo(ctx.tipo()));
        }
    }

    public String translateTipo(SLLanguageParser.TipoContext ctx) {
        String tipo = "";
        if (ctx.VECTOR() != null) {
            if (ctx.tipoVector().expression() != null) {
                tipo += "[0]*";
                tipo += translationOfExpression(ctx.tipoVector().expression());
            } else {
                tipo = "[]";
            }
        }
        if (ctx.MATRIZ() != null) {
            tipo = "[[]]";
        }
        if (ctx.NUMERICO() != null) {
            tipo = "0";
        }
        if (ctx.CADENATIPO() != null) {
            tipo = "\"\"";
        }
        if (ctx.LOGICO() != null) {
            tipo = "TRUE";
        }
        if (ctx.ID() != null) {
            tipo = ctx.ID().toString();
        }
        return tipo;
    }
    */


}
