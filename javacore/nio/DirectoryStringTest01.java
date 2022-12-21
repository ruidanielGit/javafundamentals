package com.curso.javacore.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStringTest01 {
    public static void main(String[] args) {

        //DirectoryStream lista todos os arquivos de um diretório

        Path path = Paths.get("."); //o '.' pega tudo do diretorio atual, MaratonaJava

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
