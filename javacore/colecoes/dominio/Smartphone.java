package com.curso.javacore.colecoes.dominio;

import java.util.ArrayList;

public class Smartphone {

    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

//    /**
//     * Este Override do equals serve para comparar apenas o serial number
//     * dá true mesmo que seja de 2 objetos diferentes, se tiverem o mesmo serial number
//     *
//     * @param obj objeto a comparar
//     * @return
//     */
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) return false;
//        if (this == obj) return true;
//        if (this.getClass() != obj.getClass()) return false;
//        Smartphone smartphone = (Smartphone) obj;
//        if (serialNumber != null && serialNumber.equals(((Smartphone) obj).serialNumber)) ;
//        return true;
//    }

    /*
    se x.equals(y) == true, y.hashCode() = x.hashCode()
    se y.hashCode == x.hashCode, não necessariamente o equals de y.equals(x) tem de ser true
    porque podem estar na mesma caixa, mas podem não ser o mesmo objeto
    x.equals(y) == false
    se y.hashCode() != x.hashCode x.equals(y) deverá ser false
     */

    /**
     * Este override compara apenas o hashCode do serialNumber
     * dá true se os serialNumber dos dois objetos forem iguais
     *
     * @return
     */
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
