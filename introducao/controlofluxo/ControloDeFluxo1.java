package com.curso.introducao.controlofluxo;

public class ControloDeFluxo1 {
    public static void main(String[] args) {

        // idade < 15 categoria infantil
        // idade >= 15 && idade <=18 categoria juvenil
        // idade >=18 adulto
        int idade = 15;
        String categoria;
/**
 * Alternativa 1
 if (idade >= 6) {
 System.out.println("Categoria Infantil");
 } else if (idade >= 15 && idade <=18) {
 System.out.printf("Categoria Juvenil");
 } else {
 System.out.println("Adulto");
 }**/

        if (idade >= 19) {
            categoria = "Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}