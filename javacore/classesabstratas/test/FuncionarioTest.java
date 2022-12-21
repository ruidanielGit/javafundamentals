package com.curso.javacore.classesabstratas.test;

import com.curso.javacore.classesabstratas.classes.Gerente;
import com.curso.javacore.classesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {

        Vendedor v= new Vendedor("Filipa","2131",2000,800);
        Gerente g = new Gerente("Luna", "2123", 2000);
        v.calculaSalario();
        g.calculaSalario();
        System.out.println(v);
        System.out.println(g);
    }
}
