package com.curso.javacore.classesabstratas.classes;

public class Vendedor extends Funcionario {

    private double totalVendas;

    public Vendedor(String nome, String carteira, double salario, double totalVendas) {
        super(nome, carteira, salario);
        this.totalVendas = totalVendas;
    }


    public Vendedor() {
    }

    @Override
    public void imprime() {

    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "totalVendas=" + totalVendas +
                ", nome='" + nome + '\'' +
                ", carteira='" + carteira + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calculaSalario() {
        this.salario = salario + (totalVendas * 0.05);
    }

    public Vendedor(String nome, String carteira, double salario) {
        super(nome, carteira, salario);
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }


}
