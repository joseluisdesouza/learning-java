package com.java.lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {

        List<String> aprovados = Arrays
                .asList("Joao", "Pedro", "Marcelo");

        //Forma tradicional do for
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        //Usando lambda
        aprovados.forEach((nome) -> {
            System.out.println(nome + "!!!");
        });

        //podemos simplificar mais ainda...com Method Reference!
        aprovados.forEach(System.out::println);


        aprovados.forEach(nome -> meuImprimir(nome));

        aprovados.forEach(ForEach::meuImprimir);

    }

    static void meuImprimir(String nome) {
        System.out.println("Oi,meu nome é " + nome);
    }
}
