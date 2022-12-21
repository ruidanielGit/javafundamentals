package com.curso.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
//-----------------------------------------------------
        //byte, short, int, long, float, double são inicializados a 0
        // char '\u0000' ' '
        //boolean false;
        //reference(por exemplo um objeto String-> null
        int[] idade = new int[3];
        char[] nome = new char[3];
        boolean[] resposta = new boolean[3];
        String[] morada = new String[3];

        System.out.println(idade[1]);
        System.out.println(nome[1]);
        System.out.println(resposta[1]);
        System.out.println(morada[1] + "\n\n\n");

        //-----------------------------------------------


        String[] nomes = new String[4];

        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "Luffy";
        nomes[3] = "Kurosaki";

        //nomes.lenght retorna o tamanho do array, neste caso 4, desta forma
        // podemos mudar o tamanho do array sem ter de alterar no ciclo for
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        //criar um novo espaço de memória que aloca os dados da String antiga e acrescenta a nova casa
        nomes = new String[5];
        System.out.println(nomes[4]);
    }
}
