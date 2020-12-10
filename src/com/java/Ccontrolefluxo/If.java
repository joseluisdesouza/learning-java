package com.java.Ccontrolefluxo;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a media: ");
        double media = scanner.nextDouble();

        if (media <= 10 && media >= 7.0) {
            System.out.println("Aprovado!");
        }

        if (media < 7 && media >= 4.5) {
            System.out.println("recuperação");
        }

        scanner.close();
    }
}
