package com.java.Ccontrolefluxo;

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        //imprima todos os numeros pares de 0 ate 100000
        //tambem podemos colocar esse valor em uma variavel
        for(int i=0; i<100000; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
}
