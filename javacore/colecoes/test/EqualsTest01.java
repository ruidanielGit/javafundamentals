package com.curso.javacore.colecoes.test;

import com.curso.javacore.colecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("21398213", "iPhone");
        Smartphone s2 = new Smartphone("213498213", "iPhone");
        Smartphone s3 = s1;

        //System.out.println(s1.getSerialNumber().equals(s2.getSerialNumber()));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.hashCode()==s2.hashCode() && s1.equals(s2));
        System.out.println(s1.hashCode()==s2.hashCode());
    }
}
