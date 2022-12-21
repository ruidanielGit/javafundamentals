package com.curso.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {

        //Passando de ArrayList para Array


        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(3);
        numeros.add(2);
        numeros.add(4);

        Integer[] integerListToArray = numeros.toArray(new Integer[0]);

        System.out.println(Arrays.toString(integerListToArray));

        System.out.println("-------------------------");
        //Passando de Array para ArrayList


        Integer[] numerosArray = new Integer[3];

        numerosArray[0]=2;
        numerosArray[1]=1;
        numerosArray[2]=3;

        List<Integer> listaNumeros = new ArrayList<>(Arrays.asList(numerosArray));

        //adiona numero 15 à lista
        listaNumeros.add(15);
        System.out.println(listaNumeros);
        System.out.println(List.of(numerosArray));
    }
}






























