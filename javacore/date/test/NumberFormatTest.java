package com.curso.javacore.date.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {

        float valor = 123.4567f;

        //Locale localeJapao = new Locale("ja");
        //Locale localeFR = new Locale("ja");

        NumberFormat[] numberFormat = new NumberFormat[4];

        numberFormat[0] = NumberFormat.getInstance();
        //numero de digitos fracionarios = 1
        numberFormat[0].setMaximumFractionDigits(1);
        numberFormat[1] = NumberFormat.getInstance(Locale.JAPAN);
        numberFormat[2] = NumberFormat.getCurrencyInstance();
        numberFormat[3] = NumberFormat.getCurrencyInstance(Locale.JAPAN);

        for (NumberFormat nf : numberFormat) {
            System.out.println(nf.format(valor));
        }
    }
}
