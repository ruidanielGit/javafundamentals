package com.curso.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(4);
        numeros.add(5);
        numeros.add(1);
        numeros.add(7);

        //tem de estar ordenada antes de fazer o binarySearch
        Collections.sort(numeros);
        //retorna o index de onde se encontra o numero 2
        System.out.println(Collections.binarySearch(numeros,2));
        //retorna o index de onde deveríamos colocar o número 0, porque
        //ele não existe na lista ainda
        System.out.println(Collections.binarySearch(numeros,0));
    }
}
