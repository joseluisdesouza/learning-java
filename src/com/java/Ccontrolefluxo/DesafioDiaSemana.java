package com.java.Ccontrolefluxo;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um nomero: ");

        int dias = entrada.nextInt();

        if (dias == 1) {
            System.out.println("Segunda");
        } else if (dias == 2) {
            System.out.println("Terça");
        } else if (dias == 3) {
            System.out.println("Quarta");
        } else if (dias == 4) {
            System.out.println("Quinta");
        } else if (dias == 5) {
            System.out.println("Sexta");
        }
//fiz esse exercicio ao contrario, os numeros vao nos System e os dias vao nas condicoes
        System.out.println("Fim!");
        entrada.close();

    }
}
