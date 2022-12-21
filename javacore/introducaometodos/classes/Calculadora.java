package com.curso.javacore.introducaometodos.classes;

public class Calculadora {

    //void significa que o método vai ser executado mas não vai retornar nada
    public void somaDoisNumeros() {

        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    /**
     * Multiplica dois numeros
     *
     * @param num1 primeiro numero a multiplicar
     * @param num2 segundo numero a multiplicar
     */
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public void divisaoDoisNumero(double num1, double num2) {

        if ((num1 / num2) == 0) {
            System.out.println("Impossível dividir por 0");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 30;
        num2 = 40;

        System.out.println("Num1: " + num1 + " Num2: " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }
        System.out.println("Resultado da soma: " + soma);
    }

    /**
     * Com o varArgs podemos passar qualquer tipo de argumentos, separados por virgulas
     * ao contrário do somaArray, que tem de receber obrigatoriamente um Array
     * @param numeros
     */
    public void somaVarArgs(int... numeros){
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }
        System.out.println("Resultado da soma: " + soma);
    }
}


