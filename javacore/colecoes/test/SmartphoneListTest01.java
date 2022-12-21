package com.curso.javacore.colecoes.test;

import com.curso.javacore.colecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {

        //Crio uma lista de smarthphones do tipo Smartphone
        List<Smartphone> smartphones = new ArrayList<>(10);

        //inicializacao de smartphones
        Smartphone s1 = new Smartphone("111111", "iPhone");
        Smartphone s2 = new Smartphone("222222", "Samsung");
        Smartphone s3 = new Smartphone("333333", "Huawei");
        Smartphone s4 = new Smartphone("444444", "Pixel");

        //Adiciono smartphones à lista de smartphones
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        //imprimo a lista de smartphones
        System.out.println(smartphones);
        //Limpando a lista mas ficamos com a variável de referência para continuarmos a usar
        //smartphones.clear();
        //System.out.println(smartphones);

        //Verificando se existe o smartphone s4
        System.out.println(smartphones.contains(s4));
        System.out.println(smartphones.indexOf(s1));

        //Adicionando o smartphone4 na primeira posicao da lista
        smartphones.add(0, s4);
        System.out.println(smartphones);
    }
}































