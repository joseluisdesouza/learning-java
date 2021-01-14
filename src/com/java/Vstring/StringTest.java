package com.java.Vstring;

public class StringTest {
    public static void main(String[] args) {
        String nome = "José"; // Usaremos dessa forma, mais simples e ocupa menos espaço na memoria

       // StringTest sobreNome = new StringTest("Souza"); // 1 : variavel de referencia, 2 : um objeto do tipo string, 3 : Uma string no pool de string

//        System.out.println(nome + sobreNome);

        String teste = "Goku";
        String teste2 = "goku";

        System.out.println(teste.charAt(3)); // Quantas letras contem
        System.out.println(teste.equals(teste2)); // se é igual a o objeto 2
        System.out.println(teste.equalsIgnoreCase(teste2)); // se é igual ao objeto 2 ignorando maiusculas e minusculas
        System.out.println(teste.length()); // para saber o tamanho
        System.out.println(teste.replace('o', 'z')); // trocando uma letra
        System.out.println(teste.toLowerCase()); // passando tudo para minusculo
        System.out.println(teste.toUpperCase()); // passando tudo para maiusculo
        System.out.println(teste2.substring('g', 'k')); // esse pega apenas uma parte da string
        System.out.println(teste.trim()); // remove todos os espaços contidos

    }

    /**
     * Strings no java são imutaveis, quer dizer que elas não mudam nunca!
     *
     * A classe StringTest é final sendo assim impossivel de ser sobrescrita
     *
     * StringTest Constant Pool é uma piscina de string onde as Strings são guardadas, o java nunca vai criar uma variavel de referncia
     * do tipo string igual a uma ja existente
     */
}
