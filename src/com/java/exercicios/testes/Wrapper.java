package com.java.exercicios.testes;

public class Wrapper {
    public static void main(String[] args) {

        //Esses são as versoes dos tipos primitivos para a POO

        //byte
        Byte b = 10;
        Short s = 1000;

        //Integer.parseInt(entrada.next());
        Integer i = 100000; //int
        Long l = 100000000000L; // Precisa por o l(L) no final
        System.out.println(b.byteValue()); //Mostra o valor de byte
        System.out.println(s.toString());//transforma para uma string
        System.out.println(i * 3);
        System.out.println(l /3);

        Float f = 123.34F;
        System.out.println(f);

        Double d = 1234.1234;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println();
    }
}
