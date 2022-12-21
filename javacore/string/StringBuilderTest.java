package com.curso.javacore.string;

public class StringBuilderTest {
    public static void main(String[] args) {

//        O StringBuilder não cria novas Strings na String pool,
//        o que faz é aumentar sempre a String já criado,
//        ao contrário do que acontece quando utilizamos apenas
//        o objeto String, em que é criada uma nova String na String pool
//        daí a sua eficiência  nível de performance
//
        String s = "Uma frase comum";
        StringBuilder ss = new StringBuilder(10);
        ss.append(s);
        System.out.println(ss);
        //Reverse String
        System.out.println(ss.reverse());
        System.out.println(ss.reverse());
        //Delete parte da String
        System.out.println(ss.delete(9,ss.length()));
        System.out.println(ss.insert(9," comum"));
    }
}
