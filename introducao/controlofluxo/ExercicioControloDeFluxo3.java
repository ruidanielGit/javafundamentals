package com.curso.introducao.controlofluxo;

public class ExercicioControloDeFluxo3 {
    public static void main(String[] args) {

        //Imprima todos os números pares de 0 até 100000

        int num = 0;
        int resultado = 0;
        int count = 0;

        /**
         * imprime todos os números pares e indica quantos números pares
         * existem entre 0 e 100000
         * */
        while (num < 100000) {
            if (num % 2 == 0) {
                System.out.println(num);
                count++;
            }
            num++;

        }
        System.out.println(count);


        /**
         do {
         if (num % 2 == 0) {
         System.out.println(num);
         count++;
         } num++;
         } while (num < 100000);
         System.out.println(count);
         */

        /**
         for (num=0; num < 100000; num++) {
         if (num % 2 == 0)
         System.out.println(num);
         }*/

    }
}
