package com.java.Vstring;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String " + (fim-inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(500000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder " + (fim-inicio) + " ms");

    }

    private static void concatString(int tam) {
        String string = "";
        for (int i = 0; i < tam; i++) {
            string += i;
        }
    }

    private static void concatStringBuilder(int tam) {
        StringBuilder string1 = new StringBuilder(tam);
        for (int i = 0; i < tam; i++) {
            string1.append(i);
        }
    }
}
