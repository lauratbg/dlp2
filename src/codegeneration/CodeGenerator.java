package codegeneration;

import ast.types.Type;
import ast.types.builtin.IntType;

import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter out;

    public CodeGenerator(String outFilename, String inFilename) throws IOException {
        try {
            out = new PrintWriter(outFilename);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        out.println("\n#source " + inFilename + "\n");
        out.flush();
    }

    public void pusha(int offset) {
        out.println("\tpusha " + offset);
        out.flush();
    }

    public void pushBP() {
        out.println("\tpush\tbp");
        out.flush();
    }

    public void push(int offset) {
        out.println("\tpushi " + offset);
        out.flush();
    }

    public void add(Type type) {
        out.println("\tadd" + type.suffix()) ;
        out.flush();
    }

    public void writeLine(int line) {
        out.println("\n\n#line \t" + line);
        out.flush();
    }

    public void addComment(String comment) {
        out.println("\t' * " + comment);
        out.flush();
    }

    public void out(char suffix) {
        out.println("\tout" + suffix);
        out.flush();
    }

    public void store(char suffix) {
        out.println("\tstore" + suffix);
        out.flush();
    }

    public void in(char suffix) {
        out.println("\tin" + suffix);
        out.flush();
    }

    public void write(String s) {
        out.println(s);
        out.flush();
    }

    public void enter(int i) {
        out.println("\tenter " + i);
        out.flush();
    }

    public void ret(int i, int i1, int i2) {
        out.println("\t ret" + i + ", " + i1 + ", " + i2);
        out.flush();
    }

    public void pushb(int value) {
        out.println("\tpushb " + value);
        out.flush();
    }

    public void load(Type type) {
        out.println("\tload" + type.suffix());
        out.flush();
    }

    public void sub(Type type) {
        out.println("\tsub" + type.suffix()) ;
        out.flush();
    }

    public void mul(Type type) {
        out.println("\tmul" + type.suffix()) ;
        out.flush();
    }

    public void div(Type type) {
        out.println("\tdiv" + type.suffix()) ;
        out.flush();
    }


    public void i2f() {
        out.println("\ti2f");
        out.flush();
    }

    public void i2b() {
        out.println("\ti2b");
        out.flush();
    }

    public void f2i() {
        out.println("\tf2i");
        out.flush();
    }

    public void b2i() {
        out.println("\tb2i");
        out.flush();
    }

    public void gt(char suffix) {
        out.println("\tgt" + suffix);
        out.flush();
    }

    public void lt(char suffix) {
        out.println("\tlt" + suffix);
        out.flush();
    }

    public void ge(char suffix) {
        out.println("\tge" + suffix);
        out.flush();
    }

    public void le(char suffix) {
        out.println("\tle" + suffix);
        out.flush();
    }

    public void eq(char suffix) {
        out.println("\teq" + suffix);
        out.flush();
    }

    public void ne(char suffix) {
        out.println("\tne" + suffix);
        out.flush();
    }

    public void and() {
        out.println("\tand");
        out.flush();
    }

    public void or() {
        out.println("\tor");
        out.flush();
    }

    public void pushf(double value) {
        out.println("\tpushf " + value);
        out.flush();
    }

    public void mod(Type type) {
        out.println("\tmod" + type.suffix()) ;
        out.flush();
    }

    public void not() {
        out.println("\tnot");
        out.flush();
    }
}
