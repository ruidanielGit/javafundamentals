package com.curso.javacore.assertions;

public class AssertionsTest {
    public static void main(String[] args) {

        calculaSalario(0);
    }

    private static void calculaSalario(double salario) {

        //o assert é como um if sem o else, ou seja
        //ele garante que o salario tem de ser > 0
        //estamos a dizer que temos a certeza que o salario é sempre maior que 0
        //se for menor que 0 alguma coisa está errada e o código tem de ser alterado
        assert (salario > 0) : "O salario não deve ser menor que zero, salario: " + salario;
    }

    //alternativa
    public static void calSalario(double salario) {

        if (salario < 0) {
            throw new IllegalArgumentException();
        }
    }
}