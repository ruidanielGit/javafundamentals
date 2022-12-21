package com.curso.javacore.introducaoclasses.test;

import com.curso.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.matricula = "24-VD-63";
        carro.modelo = "Citroen";
        carro.velocidadeMax = 250f;
    }
}
