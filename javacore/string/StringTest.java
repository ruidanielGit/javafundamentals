package com.curso.javacore.string;

public class StringTest {
    public static void main(String[] args) {

        String nome = "Filipa";

        nome = nome.concat(" Ribeiro");//aqui estamos a criar uma nova String,
        // mas o nome continua a referenciar apenas "Filipa"

        String nome2 = "Filipa";
        String nome3 = "Gooooku";

        System.out.println(nome);
        System.out.println(nome.charAt(0));
        //dá false porque nome passou a referenciar uma nova String "Filipa Ribeiro"
        System.out.println(nome.equalsIgnoreCase(nome2));
        //devolve tamanho da string
        System.out.println(nome.length());
        //troca as letras da string, pela nova letra
        System.out.println(nome3.replace('o', 'a'));
        System.out.println(nome3.toLowerCase());
        //Quebra a String, para 0 imprime a primeira, mas para o segundo numero
        //contar o indice a partir de 1
        System.out.println(nome.substring(0,3));
        //trim apenas retira todos os espaços do inicio e fim da String
        //neste caso não fez nada porque não existem esses espaços na String
        System.out.println(nome.trim());
    }
}
