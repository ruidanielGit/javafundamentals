package com.curso.javacore.classesabstratas.classes;

public abstract class Funcionario extends Pessoa {

    protected String carteira;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String carteira, double salario) {
        this.nome = nome;
        this.carteira = carteira;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", carteira='" + carteira + '\'' +
                ", salario=" + salario +
                '}';
    }

    public abstract void calculaSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarteira() {
        return carteira;
    }

    public void setCarteira(String carteira) {
        this.carteira = carteira;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
