package com.curso.javacore.colecoes.dominio;

import java.util.Objects;

public class Jogo implements Comparable<Jogo> {

    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Jogo(Long id, String nome, double preco) {

        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Jogo(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +'}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogo jogo = (Jogo) o;
        return  id.equals(jogo.id) && nome.equals(jogo.nome);
    }

    @Override
    public int compareTo(Jogo outroJogo) {
        // negativo se o this < outroJogo
        // se this == outroJogo, return 0
        // positivo se this > outroJogo

        if (this.id < outroJogo.getId()) {
            return -1;
        } else if (this.id.equals(outroJogo.getId())) {
            return 0;
        } else
            return 1;
        /**
         * podemos e devemos usar apenas o código do Wrapper do Long
         * return this.id.compareTo(outroManga.getId());
         * Se nos for fornecido um valor primitivo e não um Wrapper,
         * fazemos por exemplo return Double.valueOf(preco).compareTo(outroJogo.getPreco());
         */
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
