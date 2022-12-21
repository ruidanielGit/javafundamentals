package com.curso.javacore.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {

        //dando 2 Paths, como chegamos ao Path2 apartir do Path1

        //Criando 2 diretorios
        Path dir = Paths.get("/home/rui/");
        Path clazz = Paths.get("/home/rui/dev/olaMundo.java");

        //Como clazz está dentro do diretorio dir (é um subdiretorio)
        //usamos o relativize para obter o caminho desde o diretorio mae até ao diretorio clazz
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(dir.toString() + "\\" + pathToClazz);

        Path absoluto1 = Paths.get("/home/rui");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/rui/dev/olaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.202012");

        //como chegar ao diretorio absoluto3, tendo o diretorio absoluto1
        System.out.println("1 " + absoluto1.relativize(absoluto3));
        //como chegar ao diretorio absoluto1, tendo o diretorio absoluto3
        System.out.println("2 " + absoluto3.relativize(absoluto1));
        //como chegar ao diretorio absoluto2, tendo o diretorio absoluto1
        System.out.println("3 "+absoluto1.relativize(absoluto2));
        //Como chegar ao diretorio relativo2, tendo o diretorio absoluto1
        //como está dentro do absoluto1, basta pegar o nome da pasta
        //System.out.println("4 "+absoluto1.relativize(relativo2));
        //não dá para obter o caminho de relativo 1, tendo o absoluto1, pois é um caminho relativo
        //System.out.println("4 "+absoluto1.relativize(relativo1));

    }
}