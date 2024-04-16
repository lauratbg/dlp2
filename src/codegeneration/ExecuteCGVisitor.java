package codegeneration;

public class ExecuteCGVisitor {
    // Read
    /*
        execute[[Read: statement ⟶ expression]]
            address[[expression]
            <in> expression.suffix
            <store> expression.suffix
     */

    // Write
    /*
        execute[[Write: statement ⟶ expression]]
            value[[expression] (the value is what I want to print)
            <out> expression.suffix
     */

    // Assignment
    /*
        execute[[Assignment: statement ⟶ exp1 exp2]] =
            address[[exp1]]
            value[[exp2]]
            store exp1.suffix
     */

    // Function Definition
    /*
        execute[[FunctionDefinition: definition -> type ID varDefinition*]] =
            <ID: >
            for(VarDefinition var : varDefinition*)
                execute[[var]]
     */

    // Variable definition
    /*
        execute[[VarDefinition: definition ⟶ type ID]] =
            ???
     */

    // Program
    /*
        execute[[Program: definition*]] =
            <' Invocation to the main function>
            for(Definition def : definition*)
                if(def instanceof VarDefinition)
                    execute[[def]]

            <call main>
            <halt>

            for(Definition def : definition*)
                if(def instanceof FunctionDefinition)
                    execute[[def]]
     */
}
