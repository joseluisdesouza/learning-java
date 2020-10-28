package com.java.exercicios.testes;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Ola pessoal".charAt(2)); // Vai pegar uma letra do index 2 no caso a letra a

        String s = "Boa tarde";
        System.out.println(s.concat("!!!")); //Concatena s + "!!!" igual a isso
        System.out.println(s.startsWith("Boa")); // Verifica se inicia com Boa, é um boolean true ou false
        System.out.println(s.toLowerCase().startsWith("Boa")); // Verfica o toLower e depois o outro
        System.out.println(s.length()); //Mostra o tamanho da string
        System.out.println(s.endsWith("tarde")); //Verifica com qual palavra termina
        System.out.println(s.equals("boa tarde")); //Verifica se é igual oou não
        System.out.println(s.equalsIgnoreCase("boa tarde"));

    }
}
