package com.java.Aclasse;

public class AreaCirc {

    double raio;
    //atributo estatico
    static final double PI = 3.14;

    AreaCirc(double raioInicial) {
//        PI = 3.14;
        raio = raio;
    }

    double area() {
        return PI * Math.pow(raio, 2);

    }

    //metodo estatico
    static double area(double raio) {
        return PI * Math.pow(raio, 2);
    }
}
