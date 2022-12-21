package com.curso.javacore.colecoes.test;

import com.curso.javacore.colecoes.dominio.Jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class JogoByPrecoComparator implements Comparator<Jogo> {


    @Override
    public int compare(Jogo o1, Jogo o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class JogoSortTest01 {
    public static void main(String[] args) {

        List<Jogo> jogos = new ArrayList<>(6);

        //Criando Jogos para a lista de Jogos
        jogos.add(new Jogo(5L, "PlayerUnknow's Battlegrounds", 19.99));
        jogos.add(new Jogo(1L, "League of Legends", 10.99));
        jogos.add(new Jogo(3L, "CounterStrick", 7.99));
        jogos.add(new Jogo(7L, "Red Crucible 2", 39.99));
        jogos.add(new Jogo(4L, "Ballistic", 24.99));


        //Ordenando jogos por ID, para isso usamos a implementação do Comparable na classe Jogo.java
        //e fazemos override no método CompareTo, onde definimos o que queremos comparar, neste caso
        //foi o ID
        Collections.sort(jogos);

        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }
        System.out.println("---------------------");
        //Agora por nome, utilizando o Comparator
        jogos.sort(new JogoByPrecoComparator());

        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }

    }
}
