package com.curso.javacore.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {


        //O resolve serve para obter o diretorio mãe, o Path maior
        Path dir = Paths.get("home/rui");
        Path arquivo = Paths.get("dev/arquivo.txt");
        //resolve devolve o caminho/Path onde está o arquivo
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/rui");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");
        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(file));
    }
}
