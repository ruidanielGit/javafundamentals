package com.curso.projetos.bancoAplicacao;

public interface Icontabancaria {

    //depositar quantia na conta
    void depositar(int quantia);

    //retira dinheiro da conta
    void levantarDinheiro(int quantia);

    //retorna a ultima quantia retirada ou recebida
    void mostrarTransacoes();

    void mostraMenu();
    void voltarAoMenu();
}
