package com.curso.javacore.iotest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {

        File file = new File("Arquivo.txt");

        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
            System.out.println(file.exists());//retorna true se o ficheiro existir
            System.out.println(file.canRead());
            System.out.println("path: " + file.getPath());
            System.out.println("Ultima modificação: " + new Date(file.lastModified()));
            if (file.exists()) {
                System.out.println("Ficheiro apagado: " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
