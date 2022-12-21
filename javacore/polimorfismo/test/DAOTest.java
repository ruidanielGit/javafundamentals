package com.curso.javacore.polimorfismo.test;

import com.curso.javacore.polimorfismo.classes.ArquivoDAOImpl;
import com.curso.javacore.polimorfismo.classes.DataBaseDAO;
import com.curso.javacore.polimorfismo.classes.InterfaceDataAccessObject;

import java.util.ArrayList;
import java.util.List;

public class DAOTest {
    public static void main(String[] args) {


        InterfaceDataAccessObject arquivoDAO = new ArquivoDAOImpl();
        InterfaceDataAccessObject dataBaseDAO = new DataBaseDAO();
        arquivoDAO.save();
        dataBaseDAO.save();

        List<String> lista = new ArrayList<>();
        lista.add("Filipa");
        lista.add("Daniel");
        lista.add("Luna");
        lista.add("Marquinho");

        for(String nome : lista){
            System.out.println(nome);
        }
    }
}
