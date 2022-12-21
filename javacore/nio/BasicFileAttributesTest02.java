package com.curso.javacore.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("Folder2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("Creation Time: " + creationTime);
        System.out.println("Last Modified Time: " + lastModifiedTime);
        System.out.println("Last Access Time: " + lastAccessTime);

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newCreationTime, creationTime);

        creationTime = basicFileAttributes.creationTime();
        lastModifiedTime = basicFileAttributes.lastModifiedTime();
        lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("Creation Time: " + creationTime);
        System.out.println("Last Modified Time: " + lastModifiedTime);
        System.out.println("Last Access Time: " + lastAccessTime);


    }
}
