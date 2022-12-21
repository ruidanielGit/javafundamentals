package com.curso.javacore.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {


    public static void main(String[] args) {

        //Criando um arquivo ZIP

        //arquivoZip será o arquivo gerado
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        //arquivosParaZipar local onde vamos pegar os arquivos que queremos Zipar
        Path arquivosParaZipar = Paths.get("pasta/subpasta1/subsubpasta1");
        zip(arquivoZip, arquivosParaZipar);

        //Eu a tentar
        Path arquivoNovoZipado = Paths.get("Folder2/arquivos2.zip");
        Path arquivosQueQueroZipar = Paths.get("Folder2/arquivos");
        ziparArquivosDaPasta(arquivoNovoZipado, arquivosQueQueroZipar);
    }

    private static void zip(Path arquivoZip, Path arquivosParaZipar) {

        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)) {

            for (Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                //Files.copy copia a informacao que esta no file (arquivo) e transfere-a para o nova pasta no arquivo zip
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("Arquivo Zip Criado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void ziparArquivosDaPasta(Path arquivoNovoZipado, Path arquivosQueQueroZipar) {

        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoNovoZipado));
             //DirectoryStream serve para iterarmos um diretorio
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosQueQueroZipar)) {

            for (Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                //Abro/Crio o Esqueleto/Pasta,mas ainda não passou a informação que está no arquivo
                zipStream.putNextEntry(zipEntry);
                //Passo a informação que está no file, para o arquivo novo zipado
                Files.copy(file, zipStream);
                //Fecho
                zipStream.closeEntry();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



























