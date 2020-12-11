package com.java.Fenums;

public class ClientEnumTest {
    public static void main(String[] args) {
        Client c = new Client("Joao", Client.PESSOA_FISICA);
        System.out.println("Imprimindo objeto " + c.toString());

        System.out.println("-------------------------------------");

        ClientWithEnum c1 = new ClientWithEnum("Pedro", TypeEnumClient.PESSOA_FISICA);
        System.out.println(c1);
    }
}
