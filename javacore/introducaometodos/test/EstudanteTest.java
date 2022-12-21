package com.curso.javacore.introducaometodos.test;

import com.curso.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante aluno = new Estudante();

        aluno.nome = "Filipa";
        aluno.idade = 23;
        //aluno.notas = new double[]{};

        aluno.imprimeDadosAluno();
    }


}
