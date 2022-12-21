package com.curso.javacore.expressoesregulares.test;

public class TokensTest {
    public static void main(String[] args) {

        String str = "Aurora, Filipa, Rui, Luna, Renato";
        String[] tokens = str.split(",");

        for (String tok : tokens) {
            System.out.println(tok.trim());
        }
    }

}
