package com.curso.javacore.date.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDataTest {
    public static void main(String[] args) {

        //a classe date já está depreciada, devemos usar Calendar
        Date date = new Date();
        System.out.println(date.getTime());

        Calendar cal = Calendar.getInstance();
        //colocamos uma data especifica
        cal.setTime(date);
        //em que semana do ano nos encontramos
        System.out.println(cal.getWeeksInWeekYear());
        //verificando de domingo é o primeiro dia da semana
        if (Calendar.SUNDAY == cal.getFirstDayOfWeek())
            System.out.println("cawabamgaaa");
        //buscando o dia do ano em que estamos
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        //recebe a data do momento em que estamos
        cal.setTime(date);
        //soma 1 hora
        date.setTime(date.getTime() + 3_600_000L);
        cal.setTime(date);
        System.out.println(cal.getTime());
        //alternativa para adicionar 1 hora sem usar date
        cal.add(Calendar.HOUR, 1);
        System.out.println(cal.getTime());

        //NumberFormat, Locale, Calendar, Date, DateFormat
        //classes necessárias para trabalharmos com numeros, datas ou moedas
    }
}
