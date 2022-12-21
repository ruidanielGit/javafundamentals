package com.curso.javacore.polimorfismo.classes;

public class RelatorioPagamento {


    public void relatorioPagamentoGenerico(Funcionario funcionario) {

        String cargo;
        if (funcionario instanceof Gerente) {
            cargo = "Gerencia";
        } else cargo = "Vendedor";

        System.out.println("Gerando relatorio de pagamento para " + cargo);
        funcionario.calcularPagamento();
        System.out.print("Nome: " + funcionario.getNome());
        System.out.println("    |   Salario: " + funcionario.getSalario());
        if (funcionario instanceof Gerente) {
            //fez-se um cast para vendedor, e de seguida fomos buscar o total de vendas
            System.out.println("Participacao nos lucros: " + ((Gerente) funcionario).getParticipacaoNoLucro());
        }
        if (funcionario instanceof Vendedor) {
            //fez-se um cast para vendedor, e de seguida fomos buscar o total de vendas
            System.out.println("Total Vendas: " + ((Vendedor) funcionario).getTotalVendas());
        }
    }
}
