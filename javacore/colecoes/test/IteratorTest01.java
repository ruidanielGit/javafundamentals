package com.curso.javacore.colecoes.test;

import com.curso.javacore.colecoes.dominio.Jogo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {

        List<Jogo> jogos = new ArrayList<>(6);

        //Criando Jogos para a lista de Jogos
        jogos.add(new Jogo(5L, "PlayerUnknow's Battlegrounds", 19.99, 4));
        jogos.add(new Jogo(1L, "League of Legends", 10.99, 0));
        jogos.add(new Jogo(3L, "CounterStrick", 7.99, 6));
        jogos.add(new Jogo(7L, "Red Crucible 2", 39.99, 9));
        jogos.add(new Jogo(4L, "Ballistic", 24.99, 3));

//        Iterator<Jogo> jogoIterator = jogos.iterator();
//        //removendo jogos que a quantidade seja 0
//        while (jogoIterator.hasNext()) {
//            if (jogoIterator.next().getQuantidade() == 0) {
//                jogoIterator.remove();
//            }
//        }

        // OU

        jogos.removeIf(jogo -> jogo.getQuantidade() == 0);
        System.out.println(jogos);
    }
}


























