package com.curso.javacore.introducaometodos.classes;

import java.util.Arrays;

public class Estudante {

    public String nome;
    public int idade;
    public double[] notas;

    public void imprimeDadosAluno() {

        double soma = 0;
        double media;

        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(Arrays.toString(notas)); //converte array de inteiros para String

        if (notas != null) {
            for (double nota : notas) {
                soma += nota;
            }
            System.out.println("Soma: " + soma);
            media = soma / notas.length;

            System.out.println("Média: " + media);
            if (media < 10) {
                System.out.println("Aluno Reprovado");
            } else
                System.out.println("Aluno Aprovado");
        } else
            System.out.println("Aluno não possui notas...");
    }
}
