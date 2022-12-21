package com.curso.javacore.iotest;

import java.io.*;

public class BufferTest {
    public static void main(String[] args) {

        File file = new File("Arquivo.txt");

        try (FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw);
             FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            if (!file.exists()) {
                file.createNewFile();
            } else {
                bw.write("Escrevendo uma mensagem no Arquivo");
                bw.newLine();//pula uma linha no ficheiro
                bw.write("Outra linha");
                //flush para termos a certeza que tudo entrou no arquivo
                bw.flush();
                bw.close();
                //Para ler o arquivo uso o BufferedReader
                String s = null;
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                }
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

