package com.curso.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {

        //outra forma de inicializar um array
        int[] numeros = new int[]{1, 2, 3, 4};

        //alternativa ao for normal, este é o foreach
        //na primeira iteracao pega o valor atribui a aux(auxiliar) o valor da casa 0
        //na segunda iteracao atribui a aux o valor da casa 1, etc
        for (int aux : numeros) {
            System.out.println(aux);
        }
    }
}
