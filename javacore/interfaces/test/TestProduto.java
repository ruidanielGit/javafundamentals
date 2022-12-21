package com.curso.javacore.interfaces.test;

import com.curso.javacore.interfaces.classes.Produto;

public class TestProduto {
    public static void main(String[] args) {


        Produto p = new Produto("Notbook", 4, 3000);

        p.calcularImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}
