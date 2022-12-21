package com.curso.javacore.classesabstratas.classes;

public class Gerente extends Funcionario {


    public Gerente() {
    }

    public Gerente(String nome, String carteira, double salario) {
        super(nome, carteira, salario);
    }


    @Override
    public void imprime() {

    }

    @Override
    public void calculaSalario() {
        this.salario = salario + (salario * 0.2);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", carteira='" + carteira + '\'' +
                ", salario=" + salario +
                '}';
    }
}
