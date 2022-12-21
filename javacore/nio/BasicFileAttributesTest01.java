package com.curso.javacore.nio;

import java.io.File;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {

        //BasicFileAttributes, DosFileAttributes, PosixFileAttributes

        //Neste programa mudamos a "Ultima data de modificação do projeto para 10 dias atrás

        //defino date como sendo a data de hoje (-10) dias
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        //crio um novo arquivo, passando o local onde o quero e o nome
        File file = new File("Folder2/novo.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("Folder2/novo_path.txt");
        if (Files.notExists(path)) {
            Files.createFile(path);
        }
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
    }
}
