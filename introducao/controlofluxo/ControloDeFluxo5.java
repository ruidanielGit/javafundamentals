package com.curso.introducao.controlofluxo;

public class ControloDeFluxo5 {
    public static void main(String[] args) {


        //dado um valor de um carro descubra em quantas vezes ele pode ser parcelado/em quantas prestações se pode comprar
        // Porém as prestações não podem ser menores que 1000 euros

        double valorDoCarro = 30000;
        double valorPrestacao = 1;
        double numeroDePrestaçoes = 1;

        /**
         for (valorPrestacao = 1; valorPrestacao <= valorDoCarro; valorPrestacao++) {
         if (valorDoCarro / valorPrestacao >= 1000) {
         System.out.println(valorPrestacao);
         } else {
         System.out.println("Saindo do ciclo para o for não continuar a iterar até 30000");
         break;
         }
         }*/

        for (numeroDePrestaçoes = 1; numeroDePrestaçoes <= valorDoCarro; numeroDePrestaçoes++) {

            valorPrestacao = valorDoCarro / numeroDePrestaçoes;

            if (valorPrestacao < 1000) {
                System.out.println("Saindo da iteração...");
                break;
            }
            System.out.println("Valor total do carro: " + valorDoCarro + "\nPrestação dividida em " + numeroDePrestaçoes
                    + "x = " + valorPrestacao + " euros");


        }
    }
}

