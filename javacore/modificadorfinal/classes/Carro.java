package com.curso.javacore.modificadorfinal.classes;

public final class Carro {

    private static final double VELOCIDADE_FINAL = 200;
    private String nome;
    private String marca;
    private final Comprador comprador = new Comprador();


    @Override
    public String toString() {
        return "Carro{" +
                "carro='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Comprador getComprador() {
        return comprador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
