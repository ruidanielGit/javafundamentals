package com.curso.javacore.serializacao.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {

    private static final long serialVersionUID = -294684763583461892L;
    private Long alunoId;
    //transient para não serializar turma
    private transient Turma turma;
    private String nome;
    //password é transient porque não queremos que seja serializado, porque se alguém tiver acesso ao arquivo serealizado
    //terá também acesso à password, o que não se pretende
    private transient String password;
    private static final String escola = "Escola Lordelo";

    public Aluno(Long alunoId, String nome, String password) {
        this.alunoId = alunoId;
        this.nome = nome;
        this.password = password;

    }

    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "alunoId=" + alunoId +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", escola='" + escola + '\'' +
                '}';
    }

    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public static String getEscola() {
        return escola;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
