import ast.program.Program;
import errorhandler.ErrorHandler;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorView;
import parser.*;

import org.antlr.v4.runtime.*;
import semantic.IdentificationVisitor;
import semantic.TypeCheckingVisitor;
import semantic.Visitor;

public class Main {

    public static void main(String... args) throws Exception {
        if (args.length < 1) {
            System.err.println("Please, pass me the input file.");
            return;
        }

        // create a lexer that feeds off of input CharStream
        CharStream input = CharStreams.fromFileName(args[0]);
        CmmLexer lexer = new CmmLexer(input);

        // create a parser that feeds off the tokens buffer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CmmParser parser = new CmmParser(tokens);
        Program ast = parser.program().ast;

        Visitor<Void, Void> identificationVisitor= new IdentificationVisitor();
        identificationVisitor.visit(ast, null);

        Visitor<Void, Void> typeCheckingVisitor = new TypeCheckingVisitor();
        typeCheckingVisitor.visit(ast, null);

        if (ErrorHandler.getInstance().anyErrors()) {
            ErrorHandler.getInstance().showErrors(System.err);
        }
        else {
            // * The AST is shown if no errors exist
            IntrospectorModel model = new IntrospectorModel(
                    "Program", ast);
            new IntrospectorView("Introspector", model);
        }
    }
}
