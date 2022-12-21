package com.curso.javacore.introducaometodos.test;

import com.curso.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(4, 4); //estes numeros são chamados argumentos

        calc.divisaoDoisNumero(20, 2);

        int[] numeros = {1, 2, 3, 4, 5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);
    }
}
