package com.curso.introducao.inicio;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {

        //=, -=, +=, /=, %=

        int salario= 1800;
        //salario=salario+200;
        salario+=200;

        System.out.println(salario);
        System.out.println(salario-=200);
    }
}
