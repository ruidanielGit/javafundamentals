package com.curso.javacore.polimorfismo.test;

import com.curso.javacore.polimorfismo.classes.*;

public class PolimorfismoTest {
    public static void main(String[] args) {

        Gerente g = new Gerente("Filipa", 2500, 1000);
        Vendedor v = new Vendedor("Rui", 2300, 1000);

        RelatorioPagamento rp = new RelatorioPagamento();
//        rp.relatorioPagamentoGerente(g);
//        rp.relatorioPagamentoVendedor(v);

        rp.relatorioPagamentoGenerico(g);
        System.out.println("------------------------------");
        rp.relatorioPagamentoGenerico(v);


    }
}
