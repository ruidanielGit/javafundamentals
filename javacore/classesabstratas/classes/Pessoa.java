package com.curso.javacore.classesabstratas.classes;

public abstract class Pessoa {

    protected String nome;

    public abstract void imprime();

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
