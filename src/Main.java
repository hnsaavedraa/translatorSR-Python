import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            // crear un analizador léxico que se alimenta a partir de la entrada (archivo  o consola)
            SLLanguageLexer lexer;
            if (args.length > 0)
                lexer = new SLLanguageLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new SLLanguageLexer(CharStreams.fromStream(System.in));
            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el objeto correspondiente al analizador sintáctico que se alimenta a partir del buffer de tokens
            SLLanguageParser parser = new SLLanguageParser(tokens);
            ParseTree tree = parser.s(); // Iniciar el analisis sintáctico en la regla inicial: r
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new ListenerSLToPy(),tree);
            System.out.println();
/*            VisitorSLToPy<Object> loader = new VisitorSLToPy<Object>();
            loader.visit(tree);*/


            //System.out.println(tree.toStringTree(parser)); // imprime el arbol al estilo LISP
        } catch (Exception e) {
            System.err.println("Error (Test): " + e);


        }
    }
}
