package com.java.Fenums;

public enum TypeEnumClient {

    PESSOA_FISICA, PESSOA_JURIDICA;

    private int type;
    private String name;

    void ClientType(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getName() { return name;}

    public int getType() {return type;}

}
