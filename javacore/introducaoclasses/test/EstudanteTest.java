package com.curso.javacore.introducaoclasses.test;

import com.curso.javacore.introducaoclasses.classes.Estudante;


public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudantes = new Estudante();

        estudantes.nome = "joão";
        estudantes.idade = 18;
        estudantes.matricula = "213";

        System.out.println(estudantes.idade);



    }
}
