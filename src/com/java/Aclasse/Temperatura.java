package com.java.Aclasse;

import java.util.Scanner;

// exercicio temperatura
public class Temperatura {
    public static void main(String[] args) {

        /* final quer dizer que uma vez setado não podera ser alterado */
        /* nome de constantes com letras maiusculas */
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o valor de F:");
        double F = teclado.nextDouble();

        final double AJUSTE = 32;
        final double DIFERENCA = 5/9.0;

        double C = (F - AJUSTE) * DIFERENCA;

        System.out.println("O resultado final é:" + C);

    }
}
