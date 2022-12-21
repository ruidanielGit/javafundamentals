package com.curso.javacore.colecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Teklado","teclado");
        map.put("mouze","mouse");

        System.out.println(map);

        //como obter as chaves
        for(String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        System.out.println("-----------------");
        //como obter os valores
        for(String value: map.values()){
            System.out.println(value);
        }
        System.out.println("-----------------");
        //como obter os dois
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
