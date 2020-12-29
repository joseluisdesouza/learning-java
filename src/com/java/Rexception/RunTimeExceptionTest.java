package com.java.Rexception;

public class RunTimeExceptionTest {
    public static void main(String[] args) {
        try {
            divisao(10,0);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); // caso queira pegar somente a mensagem
        }

    }

    private static void divisao(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Passe um valor diferente de 0 para num2");
        }
        int result = num1/num2;
        System.out.println(result);
    }

    /**
     * Erros em tempo de execução geralmente são causados pela logica do programador
     * Lembre-se, sempre que lançar uma excessão, passe uma mensagem no construtor como esta na linha 15;
     */
}
