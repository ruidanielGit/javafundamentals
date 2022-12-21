package com.curso.javacore.heranca.classes;

public class Pessoa {
    //protected para ser acessível a classes filhas
    protected String nome;
    private String nif;
    private Morada morada;

    static {
        System.out.println("Bloco de inicialização estático de pessoa");
    }
    {
        System.out.println("Bloco de inicialização estático de pessoa 1");
    }
    {
        System.out.println("Bloco de inicialização estático de pessoa 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String nif) {
        this(nome);
        this.nif = nif;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nif: " + this.nif);
        System.out.println("Morada: " + this.morada.getRua() + " " + this.morada.getCodigoPostal());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Morada getMorada() {
        return morada;
    }

    public void setMorada(Morada morada) {
        this.morada = morada;
    }
}
