import ast.program.Program;
import ast.types.Type;
import codegeneration.*;
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

        Visitor<Type, Void> typeCheckingVisitor = new TypeCheckingVisitor();
        typeCheckingVisitor.visit(ast, null);

        Visitor<Void, Void> offsetVisitor = new OffsetVisitor();
        offsetVisitor.visit(ast, null);

        CodeGenerator codeGenerator = new CodeGenerator(args[1], args[0]);
        AddressCGVisitor addressCGVisitor = new AddressCGVisitor(codeGenerator);
        ValueCGVisitor valueCGVisitor = new ValueCGVisitor(codeGenerator, addressCGVisitor);

        ast.accept(new ExecuteCGVisitor(codeGenerator, valueCGVisitor, addressCGVisitor), null);


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
