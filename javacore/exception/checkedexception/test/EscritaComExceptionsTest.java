package com.curso.javacore.exception.checkedexception.test;

import com.curso.javacore.exception.checkedexception.classes.Funcionario;
import com.curso.javacore.exception.checkedexception.classes.Pessoa;

public class EscritaComExceptionsTest {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        Funcionario f = new Funcionario();

        f.salvarPessoa();
    }
}
