package com.java.Eblocoinicializacao;


public class ClientTest {
    public static void main(String[] args) {
        Client c = new Client();
        for (int parcela : c.getParcelas()) {
            System.out.print(parcela + " ");
        }

    }
}
