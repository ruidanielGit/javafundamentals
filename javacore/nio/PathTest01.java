package com.curso.javacore.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {

        Path p1 = Paths.get("C:\\Users\\RuiDa\\IdeaProjects\\JavaOnline\\Folder2\\Arquivo.txt");
        Path p2 = Paths.get("C:\\Users\\RuiDa\\IdeaProjects\\JavaOnline\\Folder2","Arquivo.txt");
        Path p3 = Paths.get("C:","Users\\RuiDa\\IdeaProjects\\JavaOnline\\Folder2\\Arquivo.txt");
        Path p4 = Paths.get("C:","Users","RuiDa","IdeaProject","JavaOnline\\Folder2\\Arquivo.txt");

        System.out.println(p1.getFileName());
    }
}
