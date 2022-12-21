package com.curso.javacore.introducaoclasses.test;

import com.curso.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor professor = new Professor();
        Professor professor2 = new Professor();

        professor.numProf = 200;
        professor.morada = "Rua das Flores";
        professor.nome = "Xavier";

        professor2.numProf = 201;
        professor2.morada = "Rua da Alegria";
        professor2.nome = "Filipa";

        System.out.println(professor.nome);
        System.out.println(professor.morada);
        System.out.println(professor.numProf);
        System.out.println("-----------------");
        System.out.println(professor2.nome);
        System.out.println(professor2.morada);
        System.out.println(professor2.numProf);
    }
}
