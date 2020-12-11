package com.java.Ooperadores;

public class Operadores {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        //Podemos criar uma variavel soma e usar a variavel soma para retorno
        int soma = num1 + num2;
        //para usar com uma string
        System.out.println("A soma é" + (num1 + num2));
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        //br.com.java.introducao.arrays.operadores.Operadores de igualdade
        //  <menor que
        //  >maior que
        //  <=menor ou igual
        //  >=maior ou igual
        //  == igual
        //  != diferente
        //O resultado de qualquer um desse sera um boolean

        boolean dezMaiorQueVinte = 10 > 20;
        boolean dezMenorQueVinte = 10 < 20;
        boolean dezMaiorIgualQueVinte = 10 >= 20;
        boolean dezMenorIgualQueVinte = 10 <= 20;
        boolean dezIgualQueVinte = 10 == 20;
        boolean dezDiferenteQueVinte = 10 != 20;
        //Agora é só escolher a variavel e colocar dentro do parametro.
        System.out.println(dezMaiorQueVinte);
    }
}
