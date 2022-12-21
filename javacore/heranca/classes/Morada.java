package com.curso.javacore.heranca.classes;

public class Morada {

    private String rua;
    private String codigoPostal;

    public void imprime() {
        System.out.println("Rua: " + this.rua);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
