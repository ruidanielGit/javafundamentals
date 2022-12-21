package com.curso.javacore.wrappers.test;

import java.nio.charset.CharsetEncoder;

public class WrappersTest {
    public static void main(String[] args) {

        byte byteprimitivo = 1;//é considerado byte, de 1 até 127
        short shortprimitivo = 1;
        int intprimitivo = 10;
        long longprimitivo = 101L;
        float floatprimitvo = 10F;
        double doubleprimitivo = 100D;
        char charprimitivo = 'A';
        boolean bolleanprimitivo = true;

        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer integerWrapper = 10;
        Long longWrapper = 100L;
        Float floatWrapper = 10F;
        Double doubleWrapper = 100D;
        Character charWrapper = 'A';
        Boolean bolleanWrapper = true;

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('0'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toLowerCase('A'));
        String valor = "10";
        Float f = Float.parseFloat(valor);
        System.out.println(f);
    }
}
