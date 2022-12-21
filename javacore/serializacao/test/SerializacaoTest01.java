package com.curso.javacore.serializacao.test;

import com.curso.javacore.serializacao.dominio.Aluno;
import com.curso.javacore.serializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(8170283L, "RuiSilva", "password123");
        Turma turma = new Turma("Maratona Java");

        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }

    //guardar um objeto num array de bytes e guardar em algum lugar
    private static void serializar(Aluno aluno) {

        //onde quero salvar
        Path path = Paths.get("pasta/aluno.ser");

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Ir buscar o objeto serializado ao lugar onde está guardado e obtém novamente o objevo deserializado
    private static void deserializar() {

        //onde quero salvar
        Path path = Paths.get("pasta/aluno.ser");

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}













