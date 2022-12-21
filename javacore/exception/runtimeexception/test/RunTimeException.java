package com.curso.javacore.exception.runtimeexception.test;

public class RunTimeException {
    public static void main(String[] args) {

        try {
            divisao(10, 0);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    private static void divisao(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Passe um valor diferente de 0 para num2");
        }
        System.out.println(num1 / num2);
    }
}
