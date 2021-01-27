package com.java.Ytoken;

public class TokenTest {
    public static void main(String[] args) {
        String string = "José, Paulo, Joana, Camila, John";
        String[] tokens = string.split(",");
        for (String arr: tokens) {
            System.out.println(arr.trim());// trim elimina os espaços em branco do começo ao fim
        }
    }
    /**
     * quando trabalhamos com a classe string por que passemos numeros ela
     * ira transformar em string, ja a classe scanner temos a opção de
     * pegar esse token e fazer a conversão automaticamente
     */
}
