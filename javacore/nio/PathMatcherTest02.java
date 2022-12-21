package com.curso.javacore.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


/**
 * Este programa recolhe todas as classes que têm "Test" no nome e que acabam em .java OU .class
 */
class FindAllTestJavaOrCless extends SimpleFileVisitor<Path> {
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*Test*.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        if (matcher.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {

Path root = Paths.get(".");
Files.walkFileTree(root, new FindAllTestJavaOrCless());
    }
}
