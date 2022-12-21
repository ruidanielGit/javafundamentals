package com.curso.javacore.introducaometodos.classes;

public class Professor {

    public String nome;
    public int numProf;
    public String morada;
    public String nascimento;


    public void imprime() {
        System.out.println("---------------");
        System.out.println(this.numProf);
        System.out.println(this.morada);
        System.out.println(this.nome);
    }
}
