package com.java.exercicios.testes;

public class CoversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1;
        System.out.println(a);// O "a" consegue ser um inteiro mesmo sendo do tipo double

        float b = (float) 1.0; // Conversao explicita

        int c = 4;
//        byte d = c;  Dessa forma não da
        byte d = (byte) c; // Temos que fazer um CAST explicito
        System.out.println(d);
    }
}
