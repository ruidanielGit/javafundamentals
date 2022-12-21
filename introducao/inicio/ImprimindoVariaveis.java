package com.curso.introducao.inicio;

/**
 *
 */
public class ImprimindoVariaveis {
    public static void main(String[] args) {
        int idade = 10;
        double salarioDouble = 3000;
        float salarioFloat = 3000;
        byte idadeByte = 12;
        short idadeShort = 31124;
        boolean verdade = true;
        boolean falso = false;
        long numeroGrande = 1000L;
        char letra = 'A'; //2 bytes
        String nome = "Rui Silva";
        int telefone = 963300220;
        String endereco = "4585-022";


        System.out.println("Resto da divisão:"+(21%2));
        System.out.println("\nO " + nome + " domiciliado no endereço " + endereco + " e telefone " + telefone +
                " não possui nenhum tipo de pendencia");
    }
}
