package com.curso.introducao.controlofluxo;

public class ControloDeFluxo4 {
    public static void main(String[] args) {

        int count = 0;

        while (count < 10) {
            System.out.println("AMO-TE <3 " + count++);
            ;
        }

        do {
            System.out.println("Hello");
        } while (count > 11);

        for(int i = 0; i<10; i++){
            System.out.println("O valor de I é:" + i);
        }
    }
}

