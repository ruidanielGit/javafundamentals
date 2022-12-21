package com.curso.javacore.date.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateFormatTest {
    public static void main(String[] args) {

        //Locale segue a ISO 369, ou seja, pt=portugues, br=brazil, en=ingles...
        Locale localeItal = new Locale("it");
        Locale localeFranc = new Locale("fr", "Franca");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja");

        Calendar calendario = Calendar.getInstance();
        //calendario.set(2015, 11, 26);
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItal);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeFranc);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        System.out.println(df1.format(calendario.getTime()));
        System.out.println(df2.format(calendario.getTime()));
        System.out.println(df3.format(calendario.getTime()));
        System.out.println(df4.format(calendario.getTime()));
        //Aparecer qual a linguagem do nosso local
        System.out.println(localeItal.getDisplayLanguage());
        System.out.println(localeFranc.getDisplayCountry());
        //Apresenta a lingua francesa, escrita em japonês
        System.out.println(localeFranc.getDisplayLanguage(localeJapao));


        //*****************************************
        System.out.println("*************************");
        //criação da data
        Calendar c = Calendar.getInstance();
        DateFormat[] dfa = new DateFormat[6];

        dfa[0] = DateFormat.getInstance();
        dfa[1] = DateFormat.getDateInstance();
        dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dfaa : dfa) {
            System.out.println(dfaa.format(c.getTime()));
        }
    }
}
