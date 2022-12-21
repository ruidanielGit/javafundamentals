package com.curso.javacore.heranca.testes;

import com.curso.javacore.heranca.classes.Funcionario;
import com.curso.javacore.heranca.classes.Morada;
import com.curso.javacore.heranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Filipa");


        Funcionario f = new Funcionario("Aurora");
        Morada m = new Morada();
        m.setRua("Rua das Flores");
        m.setCodigoPostal("4585-022");

        f.setMorada(m);

        p.setMorada(m);

        f.setSalario(2500);

        f.setNome(p.getNome());

        //p.imprime();

        //f.imprime();
    }
}
