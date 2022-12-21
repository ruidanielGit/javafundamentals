package com.curso.javacore.polimorfismo.classes;

public class DataBaseDAO implements InterfaceDataAccessObject{


    @Override
    public void save() {
        System.out.println("Salvando dados no banco de dados...");
    }
}
