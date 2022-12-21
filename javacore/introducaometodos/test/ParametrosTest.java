package com.curso.javacore.introducaometodos.test;

import com.curso.javacore.introducaometodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        int num1 = 5;
        int num2 = 10;

        calc.alteraDoisNumeros(num1, num2);
    }
}
