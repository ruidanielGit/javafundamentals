package com.curso.introducao.controlofluxo;

public class ExercicioControloFluxo {
    public static void main(String[] args) {

        /*
        Crie uma variavel salario e imprima seu imposto
        imposto:
        salario<1000 5% de imposto
        salario >=1000 && salario <2000 10%
        salario >=2000 && salario <4000 15%
        salario >5000 20%
         */

        double salario = 1000;
        double imposto;

        if (salario < 1000) {
            imposto = 0.05 * salario;
        } else if (salario >= 1000 && salario < 2000) {
            imposto = 0.1 * salario;
        } else if (salario >= 2000 && salario < 4000) {
            imposto = 0.15 * salario;
        } else {
            imposto = 0.2 * salario;
        }
        System.out.println(imposto);
    }
}
