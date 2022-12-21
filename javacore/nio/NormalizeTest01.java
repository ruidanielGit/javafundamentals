package com.curso.javacore.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {

        String diretorioProjeto = ".idea/Home/rui/dev";
        //../ significa andar um diretorio para trás, ou seja voltar duas pastas por exemplo
        //../ fica .idea/Home/rui
        //../../ fica .idea/Home/
        String arquivo = "../../arquivo.txt";

        Path path = Paths.get(diretorioProjeto, arquivo);
        //O normalize serve para apresentar o diretorio que queremos
        //caso contrário só vai juntar as Strings
        System.out.println(path);
        System.out.println(path.normalize());
    }
}