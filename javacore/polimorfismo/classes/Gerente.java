package com.curso.javacore.polimorfismo.classes;

public class Gerente extends Funcionario {
    private double participacaoNoLucro;

    public Gerente(String nome, double salario, double participacaoNoLucro) {
        super(nome, salario);
        this.participacaoNoLucro = participacaoNoLucro;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + this.participacaoNoLucro;
    }

    public double getParticipacaoNoLucro() {
        return participacaoNoLucro;
    }

    public void setParticipacaoNoLucro(double participacaoNoLucro) {
        this.participacaoNoLucro = participacaoNoLucro;
    }
}
