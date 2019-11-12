import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            // crear un analizador léxico que se alimenta a partir de la entrada (archivo  o consola)
            SRLanguageLexer lexer;
            if (args.length > 0)
                lexer = new SRLanguageLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new SRLanguageLexer(CharStreams.fromStream(System.in));
            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el objeto correspondiente al analizador sintáctico que se alimenta a partir del buffer de tokens
            SRLanguageParser parser = new SRLanguageParser(tokens);
            ParseTree tree = parser.components(); // Iniciar el analisis sintáctico en la regla inicial: r
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new ListenerSRToPy(),tree);
            System.out.println();
/*            VisitorSLToPy<Object> loader = new VisitorSLToPy<Object>();
            loader.visit(tree);*/


            //System.out.println(tree.toStringTree(parser)); // imprime el arbol al estilo LISP
        } catch (Exception e) {
            System.err.println("Error (Test): " + e);


        }
    }
}
