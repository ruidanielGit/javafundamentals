package com.curso.javacore.exception.checkedexception.test;

import com.curso.javacore.exception.customexceptions.LoginInvalidoException;

public class CustomExceptionTest {
    public static void main(String[] args) {

        try {
            login();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    public static void login() throws LoginInvalidoException {

        String usuarioNoBancoDados = "Goku";
        String senha = "111";

        String usuarioDigitado = "Goku";
        String senhaDigitada = "123";

        if (usuarioDigitado.compareTo(usuarioNoBancoDados) == 0 && senhaDigitada.compareTo(senha) == 0) {
            System.out.println("Login Efetuado");
        } else
            throw new LoginInvalidoException();
    }
}
