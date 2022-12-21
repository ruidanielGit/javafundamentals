package com.curso.javacore.exception.customexceptions;

public class LoginInvalidoException extends Exception{

    public LoginInvalidoException(){
        super("Usuario ou senha invalidos");
    }
}
