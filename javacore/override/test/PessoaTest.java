package com.curso.javacore.override.test;

import com.curso.javacore.override.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.setNome("Filipa");
        p.setIdade(23);

        System.out.println(p);
    }
}
