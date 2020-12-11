package com.java.Fenums;

import java.util.Objects;

public class Client  {
    private String name;
    private int type;
    public static final int PESSOA_FISICA = 1;
    public static final int PESSOA_JURIDICA = 2;


    public Client(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getPessoaFisica() {
        return PESSOA_FISICA;
    }

    public static int getPessoaJuridica() {
        return PESSOA_JURIDICA;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String type; // Variavel local sempre vai ter prioridade sobre a variavel de classe
        if (this.type ==1)
            type = "Pessoa Fisica";
        else
            type = "Pessoa Juridica";
        return "Nome " + this.name + " Tipo do cliente " + type;
    }
}
