package com.curso.javacore.colecoes.test;

import com.curso.javacore.colecoes.dominio.Jogo;
import com.curso.javacore.colecoes.dominio.Smartphone;

import java.util.*;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class jogoPrecoComparator implements Comparator<Jogo>{

    @Override
    public int compare(Jogo o1, Jogo o2) {
        return Double.compare(o1.getPreco(),o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {

        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());

        Smartphone s = new Smartphone("123", "Huawei");

        set.add(s);

        NavigableSet<Jogo> jogos = new TreeSet<>(new jogoPrecoComparator());

        jogos.add(new Jogo(5L, "PlayerUnknow's Battlegrounds", 19.99));
        jogos.add(new Jogo(1L, "League of Legends", 10.99));
        jogos.add(new Jogo(3L, "CounterStrick", 7.99));

        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }

        Jogo tankWar = new Jogo(4L, "tankWar", 20.99);

        System.out.println("-------------");
        // Devolve o jogo que tem o preço imediatamente abaixo do jogo que estamos a comparar
        //tem em consideração o preço pois é o parâmetro que estamos a considerar no Comparator
        // que criamos
        System.out.println(jogos.lower(tankWar));
        // preço imediatemento abaixo ou igual
        System.out.println(jogos.floor(tankWar));
        //Devolve o jogo que tem o preço imediatamente abaixo do jogo que estamos a comparar
        //não havendo nenhum com preço superior, devolve null
        System.out.println(jogos.higher(tankWar));
        //maior ou igual
        System.out.println(jogos.ceiling(tankWar));
        //Devolve e remove primeiro elemento da lista
        System.out.println(jogos.pollFirst());
        //Devolve e remove ultimo elemento da lista
        System.out.println(jogos.pollLast());
        System.out.println(jogos.size());

    }
}


































