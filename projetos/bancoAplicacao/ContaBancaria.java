package com.curso.projetos.bancoAplicacao;

import java.awt.desktop.SystemEventListener;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ContaBancaria implements Icontabancaria {

    //quantidade de dinheiro presente na conta bancária
    private int montante = 0;
    //ultima montante a ser retirada ou depositada
    private int[] transacoes = new int[10];
    private String nomeDoCliente;
    private int clienteID;

    ArrayList listaTransacoes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    {
        System.out.println("*****Bem vindo ao nosso banco!*****");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para iniciar atividade neste banco, é necessário criar uma conta...");
        System.out.println("Nome do cliente: ");
        this.nomeDoCliente = scanner.next().concat(scanner.next());
        System.out.println("ID do cliente: ");
        this.clienteID = scanner.nextInt();
    }

    public ContaBancaria() {
        mostraMenu();
    }


    //Deposita uma quantia na conta e atualiza a lista de transações

    /**
     * atualiza a montante
     * se for a primeira transação, insere este depósito na posição 0 do array de transações
     * se já existirem transações,incrementa o tamanho do array e coloca o deposito na última casa do array de transações
     *
     * @param quantia, valor a depositar na conta
     */
    @Override
    public void depositar(int quantia) {
        ArrayList listaTransacoes = new ArrayList<>();
        this.montante = this.montante + quantia;
        this.listaTransacoes.add(quantia);
        voltarAoMenu();
    }

    //Levanta uma quantia da conta e atualiza a lista de transações
    @Override
    public void levantarDinheiro(int quantia) {

    }

    @Override
    public void mostrarTransacoes() {
        int count = 0, opcao = 0;

        for (int i = 0; i < (this.listaTransacoes.size()); i++) {
            System.out.println(this.listaTransacoes.get(i));
        }
        voltarAoMenu();
    }

    @Override
    public void mostraMenu() {

        int opcao;

        System.out.println("--------------MENU--------------");
        System.out.print("1- Depositar Dinheiro");
        System.out.println("    2- Levantar Dinheiro");
        System.out.print("3- Consultar Transações");
        System.out.println("    0- Sair");
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Montante a depositar: ");
                this.montante = scanner.nextInt();
                depositar(this.montante);
            case 2:
                System.out.println("Montante a levantar: ");
                this.montante = scanner.nextInt();
                levantarDinheiro(this.montante);
            case 3:
                System.out.println("Transações efetuadas: ");
                mostrarTransacoes();
                break;
            default:
                System.out.println(".....Volte Sempre.....");
                break;
        }
    }

    @Override
    public void voltarAoMenu() {
        int opcao = 0;
        System fechar;
        System.out.println("0- Voltar ao Menu | 1- Sair");
        opcao = scanner.nextInt();
        switch (opcao) {
            case 0:
                mostraMenu();
                break;
            case 1:
                //tenho de arranjar forma de fechar o programa
                break;
            default:
                System.out.println("Escolha inválida, selecione entre 0 e 1.");
                mostrarTransacoes();
        }
    }
}
