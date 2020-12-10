package com.java.Bmetodos.teste;


import com.java.Bmetodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int N1 = 5;
        int N2 = 10;
        calc.alteraDoisNumeros(N1, N2);
        System.out.println("Dentro do teste");
        System.out.println("N1: "+N1);
        System.out.println("N2: "+N2);

    }
}
