package com.java.Aclasse;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a; //atribução por valor(Tipo primitivo)

        a++;
        b--;

        System.out.println(a + " " + b);

        Produto p1 = new Produto();
        Produto p2 = p1; //aqui temos uma atribuição por referencia porque estamos trabalando com objeto

    }

}
