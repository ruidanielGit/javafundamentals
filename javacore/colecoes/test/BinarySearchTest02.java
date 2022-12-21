package com.curso.javacore.colecoes.test;

import com.curso.javacore.colecoes.dominio.Jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {

        JogoByPrecoComparator jogoByPrecoComparator = new JogoByPrecoComparator();
        List<Jogo> jogos = new ArrayList<>(6);

        //Criando Jogos para a lista de Jogos
        jogos.add(new Jogo(5L, "PlayerUnknow's Battlegrounds", 19.99));
        jogos.add(new Jogo(1L, "League of Legends", 10.99));
        jogos.add(new Jogo(3L, "CounterStrick", 7.99));
        jogos.add(new Jogo(7L, "Red Crucible 2", 39.99));
        jogos.add(new Jogo(4L, "Ballistic", 24.99));

        jogos.sort(jogoByPrecoComparator);
        //Collections.sort(jogos);
        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }

        Jogo jogoParaProcurar = new Jogo(2L,"Mortal Kombat",59.99);
        System.out.println(Collections.binarySearch(jogos,jogoParaProcurar,jogoByPrecoComparator));

    }
}
