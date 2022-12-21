package com.curso.javacore.colecoes.test;

import com.curso.javacore.colecoes.dominio.Jogo;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        //O Set não deixa criar dados repetidos, adicionei 2 jogos iguais e ele não adicionou o segundo
        //Set<Jogo> jogos = new HashSet<>();

        //ou LinkedHashSet, que tem em consideração a ordem de inserção
        Set<Jogo> jogos = new LinkedHashSet<>();


        jogos.add(new Jogo(5L, "PlayerUnknow's Battlegrounds", 19.99, 4));
        jogos.add(new Jogo(1L, "League of Legends", 10.99, 0));
        jogos.add(new Jogo(3L, "CounterStrick", 7.99, 6));
        jogos.add(new Jogo(7L, "Red Crucible 2", 39.99, 9));
        jogos.add(new Jogo(4L, "Ballistic", 24.99, 3));
        jogos.add(new Jogo(4L, "Ballistic", 24.99, 3));


        for(Jogo jogo : jogos){
            System.out.println(jogo);
        }
    }
}
