package com.java.Ooperadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int idade = 18;
        float salario = 1000f;
        // "E" = &&
        System.out.println(idade >= 18 && salario >= 1000);
        // "OU" = ||
        System.out.println(idade >= 18 || salario >= 1000);

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!condicao2);

        System.out.println("Tabela verdade E (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("Tabela verdade OU (OUR)");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("Tabela verdade OU Exclusivo (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("Tabela verdade NOT");
        System.out.println(!true);
        System.out.println(!false);


    }
}
