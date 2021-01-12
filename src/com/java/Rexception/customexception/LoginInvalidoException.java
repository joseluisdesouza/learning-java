package com.java.Rexception.customexception;

public class LoginInvalidoException extends Exception{

    public LoginInvalidoException() {
        super("Usuario ou senha invalidos");
    }

    /**
     * a regra é: nunca coloque um tratamento de exceção dentro
     * da sua classe de exceção de customizadas
     */
}
