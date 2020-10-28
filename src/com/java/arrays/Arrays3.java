package com.java.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        //tres formas de iniciar um array em java
        int[] numeros = new int[5];// foi alocado na memoria esse espaço pra depois ser atribuido valores
        int[] numeros2 = {1, 2, 3, 4, 5,}; //ja com valores atrubuidos, tam =5, index = 0 até 4
        int[] numeros3 = new int[]{1, 2, 3, 4, 5}; //esse é uma junção com o segundo exemplo mostrado


        //duas formas de fazer o FOR
      //  int i = 0;
      //   for (int i =0; i < numeros2.length; i++) {
      //       System.out.println(numeros2[i]);
        //   }

        for (int num : numeros2) {
            System.out.println(num); // vamos utilizar bastante esse for
        }
    }
}
