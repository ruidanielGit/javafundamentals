package com.curso.javacore.exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {

        //criarArquivo();

        abrirArquivo();
    }

    public static void criarArquivo() {

        File file = new File("Teste.txt");
        try {
            file.createNewFile();
            System.out.println("Arquivo Criado...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void abrirArquivo() {

        File file = new File("Teste.txt");
        try {
            file.createNewFile();
            System.out.println("Abrindo Arquivo...");
            System.out.println("Executando leitura do arquivo");
            System.out.println("Escrevendo no arquivo");
        } catch (IOException e) {
            e.printStackTrace();
        } //mesmo que seja lançada uma exceção, o finally é executado
        finally{
            file.deleteOnExit();
            System.out.println("destruindo o Arquivo");
        }
    }
}
