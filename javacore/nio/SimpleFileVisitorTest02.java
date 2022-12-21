package com.curso.javacore.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {

        Path root = Paths.get("pasta");
        Files.walkFileTree(root, new ListAllFiles());
    }

    static class ListAllFiles extends SimpleFileVisitor<Path> {


        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

            if (file.getFileName().toString().endsWith(".java")) {
                System.out.println(file.getFileName());
            }
            return FileVisitResult.CONTINUE;
        }

        /**
         * vai entrar no dir que pretendemos (está referenciado no main) e mostra
         * os diretórios e arquivos desse diretorio
         *
         * @param dir   a reference to the directory
         * @param attrs the directory's basic attributes
         * @return
         * @throws IOException
         */
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            System.out.println("pre visit: " + dir.getFileName());
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            return super.visitFileFailed(file, exc);
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            System.out.println("post visit: " + dir.getFileName());
            return FileVisitResult.CONTINUE;
        }
    }
}