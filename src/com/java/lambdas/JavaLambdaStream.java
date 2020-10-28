package com.java.lambdas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class JavaLambdaStream {
    public static void main(String[] args) {

        //Lambda não veio somente para diminuir o tamanho do codigo mas tambem pata podermos usar as Streams
        // API DE STREAM são fluxo de dados

        List<Integer> asList = Arrays.asList(1, 2, 3, 4);

        //Para imprimir essa lista do Java 7
        for (Integer integer : asList) {
            System.out.println(integer);
        }

        System.out.println("---------------------");

        //Ja apartir do Java 8 usando as stream
        asList.stream()
                .filter(e-> e % 2 == 0)
                .forEach(e -> System.out.println(e));

    }
}
