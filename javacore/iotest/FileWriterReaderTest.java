package com.curso.javacore.iotest;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
    public static void main(String[] args) {

        File file = new File("Arquivo.txt");

        try {
            FileWriter fw = new FileWriter(file);
            if (!file.exists()) {
                file.createNewFile();
            } else {
                fw.write("Escrevendo uma mensagem no Arquivo\nEscrevendo noutra linha\n");
                //flush para termos a certeza que tudo entrou no arquivo
                fw.flush();
                fw.close();
                FileReader fr = new FileReader(file);
                char[] in = new char[500];

                System.out.println(fr.read(in));
                fr.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
