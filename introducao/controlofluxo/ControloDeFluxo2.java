package com.curso.introducao.controlofluxo;

public class ControloDeFluxo2 {
    public static void main(String[] args) {

        int idade = 23;
        String status;
        char sexo = 'F';
        String qualsexo;


        if (idade < 18) {
            status = "Não Adulto";
        } else {
            status = "Adulto";
        }

        /*
        Alternativa ao if que usac apenas 1 linha de código
        como funciona:
        O que vem antes do ':' é considerado verdadeiro, o que vem a seguir falso
        o valor é guardado na variável status
         */
        status = idade < 18 ? "Não Adulto" : "Adulto";
        System.out.println(status);

        qualsexo = sexo == 'F' ? "É uma rapariga" : "É um rapaz";
        System.out.println(qualsexo);


    }
}
