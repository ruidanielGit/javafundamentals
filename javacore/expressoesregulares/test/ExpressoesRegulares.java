package com.curso.javacore.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares {
    public static void main(String[] args) {
// \d - vai buscar todos os digitos
// \D - vai buscar todos os que não forem digitos
        // \s espaços em braco \t \n \f \r
        // \S caracter que não é branco
        // \w carateres de palavras a-z, A-Z, digitos e _
        // \W tudo o que não forem carateres de palavras
        // []
        // ? zero um uma
        // * zero ou mais
        // + uma ou mais
        // {n,n} de n ate n
        // ()
        // |
        // $
        // . coringa, pode ser substituido por qualquer coisa

        //String regex = "\\s";
        //String regex = "0[xX][0-9a-fA-F]";//procurar numeros decimais
//        String regex = "[aA]";
//        String texto = "cafeBABE";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(texto);
//
//        System.out.println("Texto: " + texto);
//        System.out.println("Indice: 0123456789");
//        System.out.println("Expressao: " + matcher.pattern());
//        System.out.println("Posiçoes encontradas");
//
//        while (matcher.find()) {
//            System.out.printf(matcher.start() + " " + matcher.group());
//        }

//OBTER EMAILS
        String regex = "[a-zA-Z0-9\\._-]+@([a-z]+\\.)+([a-zA-Z])+"; //        String regex = "[\\w\\._-]+@([a-z]+\\.)+([a-zA-Z])+";

        String texto = "filiparibeiro214@gmail.com, ruidaniiel@gmail.com.br, luna@sapo.pt";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressao: " + matcher.pattern());
        System.out.println("Posiçoes encontradas");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
