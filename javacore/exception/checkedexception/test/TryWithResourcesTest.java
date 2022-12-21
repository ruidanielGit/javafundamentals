package com.curso.javacore.exception.checkedexception.test;

import com.curso.javacore.exception.checkedexception.classes.Leitor1;
import com.curso.javacore.exception.checkedexception.classes.Leitor2;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {

        lerArquivoNovo();
    }

    public static void lerArquivo() {

        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void lerArquivoNovo() {

        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
