package com.java.exercicios.testes;

public class ConversaoNumeroString {
    public static void main(String[] args) {

        //Estou usando o wrapper
        Integer num1 = 1000;
        System.out.println(num1.toString().length());  // o lenght é para saber o tamanho da string e não do numero

        int num2 = 10000;
        System.out.println(Integer.toString(num2));

    }
}
