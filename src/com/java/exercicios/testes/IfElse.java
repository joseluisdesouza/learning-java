package com.java.exercicios.testes;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Digite um valor: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.println("Numero Par!");
        } else {
            System.out.println("Numero impar!");

        }

    }

}
