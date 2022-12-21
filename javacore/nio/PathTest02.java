package com.curso.javacore.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {

        Path pastaPath = Paths.get("Pasta Principal");

        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }
        //Criei um novo diretório dentro do diretorio principal "Pasta Principal"
        //Defini o Path, dando um nome ao diretorio e posteriormente criei o diretorio
        Path subPastaPath = Paths.get("Pasta Principal/subPasta");
        if (Files.notExists(subPastaPath)) {
            Path subPastaDirectory = Files.createDirectory(subPastaPath);
        }
        //Aqui Criei um arquivo dentro do diretorio subPastaDirectory
        //Indiquei o caminho onde pretendi criar o arquivo e defini o nome do arquivo
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        // temos obrigacao de controlar caso o arquivo já exista nesse diretorio,
        // se o arquivo não existir, cria o ficheiro primeiro
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

        //Agora quero copiar o arquivo "file.txt", que estava no diretorio "subpasta"
        //para isso criei um Path de origem, que é o ficheiro que
        //quero renomear/copiar, para um novo arquivo com o nome diferente
        //e o target é o Path onde quero que o quero criar, sendo que passei o Diretorio e o novo nome do arquivo
        Path source = filePath;
        //target é o local para onde queremos passar
        Path target = Paths.get(String.valueOf(subPastaPath), "file_renamed.txt");
        //Aqui copia o conteudo de source para o target, se o target ainda não existir
        if (Files.notExists(target)) {
            Files.copy(source, target);
        }

        //Apagando o ficheiro antigo que foi renomeado
        Files.delete(source);
    }
}
