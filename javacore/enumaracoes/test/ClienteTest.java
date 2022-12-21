package com.curso.javacore.enumaracoes.test;

import com.curso.javacore.enumaracoes.classes.Cliente;
import com.curso.javacore.enumaracoes.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {

        Cliente c = new Cliente("Filipa", TipoCliente.PESSOA_FISICA);
        System.out.println(c);
    }
}
