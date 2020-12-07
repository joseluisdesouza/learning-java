package com.java.modificador.estatico;


import com.java.modificador.estatico.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("Fusca",290);
        Carro c2 = new Carro("Ferrari", 390);
        Carro c3 = new Carro("Mclarem", 320);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
