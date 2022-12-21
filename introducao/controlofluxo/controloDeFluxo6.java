package com.curso.introducao.controlofluxo;

public class controloDeFluxo6 {
    public static void main(String[] args) {

//dado um valor de um carro descubra em quantas vezes ele pode ser parcelado/em quantas prestações se pode comprar
        // Porém as prestações não podem ser menores que 1000 euros

        double valorDoCarro = 30000;
        int numeroDePrestacoes = 1;
        double valorPrestacao = 1;

        for (numeroDePrestacoes = (int) valorDoCarro; numeroDePrestacoes >= 1; numeroDePrestacoes--) {

            if (valorDoCarro / numeroDePrestacoes < 1000) {
                continue;
            }
            valorPrestacao = valorDoCarro / numeroDePrestacoes;
            System.out.println(valorDoCarro + "| Numero de Prestações: " + numeroDePrestacoes + " | Valor: " + valorPrestacao);
        }
    }
}