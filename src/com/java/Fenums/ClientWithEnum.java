package com.java.Fenums;

public class ClientWithEnum {

    private String name;
    private TypeEnumClient typeEnumClient;

    public ClientWithEnum(String name, TypeEnumClient typeEnumClient) {
        this.name = name;
        this.typeEnumClient = typeEnumClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeEnumClient getTypeEnumClient() {
        return typeEnumClient;
    }

    public void setTypeEnumClient(TypeEnumClient typeEnumClient) {
        this.typeEnumClient = typeEnumClient;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", typeEnumClient=" + typeEnumClient + "";
    }
}
