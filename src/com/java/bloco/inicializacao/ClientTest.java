package com.java.bloco.inicializacao;


import com.java.bloco.inicializacao.Client;

public class ClientTest {
    public static void main(String[] args) {
        Client c = new Client();
        for (int parcela : c.getParcelas()) {
            System.out.print(parcela + " ");
        }

    }
}
