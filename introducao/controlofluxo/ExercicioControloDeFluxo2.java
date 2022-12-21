package com.curso.introducao.controlofluxo;

public class ExercicioControloDeFluxo2 {
    public static void main(String[] args) {

        //Crie um switch que dado um valor de 1 a 7
        //considerando 1 domingo, imprima se é dia útil ou fim de semana

        int dia = 4;

        switch (dia) {
            case 1:
            case 6:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("dia útil");
                break;
            default:
                System.out.println("Inválido");
        }
    }
}
