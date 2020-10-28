package com.java.arrays;

public class Arrays1 {
    public static void main(String[] args) {
        //int[] idades;// isso é uma referencia para um objeto, no java todo array é um objeto
        int[] idades = new int[3]; /* nesse momento ele criou um espaço na memoria com 3 espaços
        com seu indice 2 porque inicia do 0 e a palavra new é sempre utilizada para criar um objeto e todo array é um */
        idades[0] = 20;
        idades[1] = 30;
        idades[2] = 40;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
