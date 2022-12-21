package com.curso.javacore.nio;

import java.nio.file.*;

public class PathMatcherTest01 {
    public static void main(String[] args) {

        Path path01 = Paths.get("pasta/subpasta/file.bkp");
        Path path02 = Paths.get("pasta/subpasta/file.txt");
        Path path03 = Paths.get("pasta/subpasta/file.java");
        //procurando um arquivo que contenha "bkp"
        matches(path01,"glob:**.bkp");
        matches(path01,"glob:**/*.bkp");
        //procurando um arquivo que tenha ".bkp" ou ".txt" ou ".java"
        matches(path01,"glob:**/*.{bkp,txt,java}");
        matches(path02,"glob:**/*.{bkp,txt,java}");
        matches(path03,"glob:**/*.{bkp,txt,java}");
        //procurando um arquivo que depois do '.', tenha 3 letras, seja quais forem
        matches(path03,"glob:**/*.???");//deu false porque passei o Path03 e "java" tem 4 letras
        matches(path03,"glob:**/file.????");
    }

    public static void matches(Path path, String glob) {

        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
