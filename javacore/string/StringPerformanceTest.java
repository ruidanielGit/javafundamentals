package com.curso.javacore.string;

public class StringPerformanceTest {
    public static void main(String[] args) {

//        long inicio = System.currentTimeMillis();
//        concatString(200000);
//        long fim = System.currentTimeMillis();
//        System.out.println("Tempo gasto: " + (fim - inicio) + "ms");
        System.out.println("****************");
//        long inicio = System.currentTimeMillis();
//        concatStringBuilder(200000);
//        long fim = System.currentTimeMillis();
//        System.out.println("Tempo gasto: " + (fim - inicio) + "ms");
        System.out.println("****************");
        long inicio = System.currentTimeMillis();
        concatStringBuffer(200000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim - inicio) + "ms");
    }

    private static void concatString(int tam) {

        String string = "";

        for (int i = 0; i < tam; i++) {
            string += i;
        }
        System.out.println(string);
    }


    //Forma mais rápida de criar Strings, a nível de performance
    private static void concatStringBuilder(int tam) {

        StringBuilder string = new StringBuilder("");

        for (int i = 0; i < tam; i++) {
            string.append(i);
        }
        System.out.println(string);
    }

    private static void concatStringBuffer(int tam) {

        StringBuffer string = new StringBuffer("");

        for (int i = 0; i < tam; i++) {
            string.append(i);
        }
        System.out.println(string);
    }
}
