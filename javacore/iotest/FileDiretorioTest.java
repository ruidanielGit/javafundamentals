package com.curso.javacore.iotest;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
    public static void main(String[] args) throws IOException {

//        File diretorio = new File("Folder");
//        boolean mkdir = diretorio.mkdir();
//
//        System.out.println("Diretório Criado " + mkdir);
//
//        //File arquivo = new File("diretorio, Arquivo.txt");
//        File arquivo = new File("C:\\Users\\RuiDa\\IdeaProjects\\JavaOnline\\Folder\\Arquivo.txt");
//
//        boolean newFile = arquivo.createNewFile();
//        System.out.println("Arquivo criado " + newFile);
//
//        File arquivoNovoNome = new File(diretorio, "arquivo renomeado.txt");
//        boolean remamed = arquivo.renameTo(arquivoNovoNome);
//        System.out.println("Arquivo Renomeado");
//
//        File diretorioRenomeado = new File("Folder2");
//        boolean diretRenomeado = diretorio.renameTo(diretorioRenomeado);
//        System.out.println("Diretorio renomeado " + diretRenomeado);

        buscarArquivo();
    }

    //Vai buscar todos os arquivos dentro do Folder 2
    public static void buscarArquivo() {

        File file = new File("Folder2");

        String[] lista = file.list();

        for (String arquivo : lista) {
            System.out.println(arquivo);
        }
    }
}
