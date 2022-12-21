package com.curso.javacore.modificadorfinal.test;

import com.curso.javacore.modificadorfinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro c = new Carro();

        c.setNome("Porsche");
        System.out.println(c.getComprador().getNome());
        c.getComprador().setNome("Filipa");
        System.out.println(c.getComprador().getNome());

    }
}
