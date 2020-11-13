package com.java.operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {


        System.out.println(3 > 4);
        System.out.println(3 >= 4);
        System.out.println(3 < 4);
        System.out.println(3 <= 4);
        System.out.println(30 > 4);
        System.out.println(30 != 4);

        double nota = 7.3;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem desconto? " + temDesconto);

        //atribuiçao
        int a = 2;
        int b = 3;
        int c = a + b;

        //podemos usar o operador de atribução na linha 24...
        //significa que esta acrescentado dentro da variavel c oque tem dentro da variavel b
        c += b;
        c -= b;
        c *= b;
        c /= b;

        //Operadores Unario

        int f = 1;
        int g = 2;

        f++; // a = a + 1
        f--; // a= a -1

        ++g; // b = b + 1
        --g; // b = b - 1

        System.out.println(f);
        System.out.println(g);

    }
}
