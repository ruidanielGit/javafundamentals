package com.curso.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {

        List<String> jogos = new ArrayList<>(6);

        jogos.add("PlayerUnknow's Battlegrounds");
        jogos.add("League of Legends");
        jogos.add("CounterStrick");
        jogos.add("Red Crucible 2");
        jogos.add("Ballistic");

        //ordenando a lista por ordem alfafetica
        Collections.sort(jogos);

        for(String jogo : jogos){
            System.out.println(jogo);
        }
    }
}
