package com.curso.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {

        //ArrayList é um array que pode ser incrementado
        //o <String> indica nos que o tipo da lista é String, só aceita String
        //senão aceitaria qualquer tipo de dados
        List<String> nomes = new ArrayList<>();

        nomes.add("Filipa");
        nomes.add("Ribeiro");
        nomes.add("Rui");
        nomes.add("Silva");

        System.out.println("---------------------");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("---------------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();

        for(int i=0;i<10;i++){
            numeros.add((i+1));
        }

        for(Integer numero: numeros){
            System.out.println(numero);
        }
    }
}
