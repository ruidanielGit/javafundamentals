package com.curso.javacore.polimorfismo.classes;

public class ArquivoDAOImpl implements InterfaceDataAccessObject {


    @Override
    public void save() {
        System.out.println("Salvando dados nos arquivos");
    }
}
