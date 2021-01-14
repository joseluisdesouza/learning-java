package com.java.Aclasse;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String A;
        String B;
        String C;

        System.out.println("Digite o primeiro valor: ");
        A = teclado.nextLine();
        System.out.println("Digite o segundo valor: ");
        B = teclado.nextLine();
        System.out.println("Digite o terceiro valor: ");
        C = teclado.nextLine();

        double num1 = Double.parseDouble(A);
        double num2 = Double.parseDouble(B);
        double num3 = Double.parseDouble(C);

        double soma = num1 + num2 + num3 / 3;

        System.out.println("A media é: " + soma);

        teclado.close();
    }

    // Da forma do curso correta
//    Scanner teclado = new Scanner(System.in);
//
//    System.out.print("Informe o primeiro salario: ");
//    StringTest A = teclado.next().replace(",", ".");
//    System.out.print("Informe o segundo salario: ");
//    StringTest B = teclado.next().replace(",", ".");
//    System.out.print("Informe o terceiro salario: ");
//    StringTest C = teclado.next().replace(",", ".");
//
//    double num1 = Double.parseDouble(A);
//    double num2 = Double.parseDouble(B);
//    double num3 = Double.parseDouble(C);
//
//    double media = (num1 + num2 + num3) / 3;
//
//        System.out.println("A media é: "+ media);
//
//        teclado.close();

}
