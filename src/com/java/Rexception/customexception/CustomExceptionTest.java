package com.java.Rexception.customexception;

public class CustomExceptionTest {
    public static void main(String[] args) throws LoginInvalidoException {
        logar();
        /**
         * podemos adicionar a excecão a assinatura do metodo ou fazer um try, cath
         */
    }

    private static void logar() throws LoginInvalidoException {
        String usuarioBancoDeDados = "Goku";
        String senhaBancoDeDados = "111";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "123";
        if (!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)) {
            throw new LoginInvalidoException();
        } else {
            System.out.println("Logado");
        }
    }
}
