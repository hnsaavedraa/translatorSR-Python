public class VisitorSLToPy<T> extends SLLanguageBaseVisitor<T> {
    @Override
    public T visitAssignationConst(SLLanguageParser.AssignationConstContext ctx) {
        String value = ctx.id().toString(); //Get the string of IDs
        value = value.replace(","," ="); //Make it one big assignation
        value = value.substring(1,value.length()-1); //Remove first and last characters [ ]
        System.out.println(value + " = " + visitChildren(ctx));
        return null;
    }
    @Override
    public T visitExpression(SLLanguageParser.ExpressionContext ctx) {
        String out = "";
        if(ctx.PIZQ() != null) {
            out += "(";
            out += visitChildren(ctx);
            out += ")";
            return (T)out;
        }
        out += visitChildren(ctx);
        return (T)out;
    }
    @Override
    public T visitConstant(SLLanguageParser.ConstantContext ctx) {
        String expr = "";
        if(ctx.NUM()!= null) {
            expr = ctx.NUM().toString();
        }
        if(ctx.CADENA()!= null) {
            expr = ctx.CADENA().toString();
        }
        if(ctx.BOOL()!= null) {
            expr = ctx.BOOL().toString();
        }
        if(ctx.DOUBLE()!= null) {
            expr = ctx.DOUBLE().toString();
        }
        if(ctx.id()!= null) {
            expr = ctx.id().toString();
        }
        return (T)expr;
    }

}
