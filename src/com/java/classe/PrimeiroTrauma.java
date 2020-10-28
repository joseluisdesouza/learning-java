package com.java.classe;

public class PrimeiroTrauma {

    int a = 3; //Naõ posso mexer nessa linha
    static int b = 4;

    public static void main(String[] args) {
        //Para acessar precisamos criar uma instancia de PrimeiroTrauma
        PrimeiroTrauma p1 = new PrimeiroTrauma();

        System.out.println(p1.a);

        //Ou se definimos como estatico o atributo/membro
        System.out.println(b);

    }
}
