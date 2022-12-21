package com.curso.javacore.colecoes.test;

import com.curso.javacore.colecoes.dominio.Consumidor;
import com.curso.javacore.colecoes.dominio.Jogo;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Filipa Ribeiro");
        Consumidor consumidor2 = new Consumidor("Rui Silva");

        Jogo jogo1 = new Jogo(5L, "PlayerUnknow's Battlegrounds", 19.99);
        Jogo jogo2 = new Jogo(1L, "League of Legends", 10.99);
        Jogo jogo3 = new Jogo(3L, "CounterStrick", 7.99);
        Jogo jogo4 = new Jogo(7L, "Red Crucible 2", 39.99);
        Jogo jogo5 = new Jogo(4L, "Ballistic", 24.99);

        Map<Consumidor, Jogo> consumidorJogo = new HashMap<>();

        consumidorJogo.put(consumidor1, jogo1);
        consumidorJogo.put(consumidor2, jogo2);

        for (Map.Entry<Consumidor, Jogo> entry : consumidorJogo.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
