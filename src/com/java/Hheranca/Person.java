package com.java.Hheranca;

public class Person {

    private String name;
    private String cpf;
    private Address address;

    public Person(String name) {
        this.name = name; //Quando colocamos um construtor com parametros na super classe, a classe filha tambem pede o mesmo
    }

    public void imprime() {
        System.out.println("Name: " + this.name);
        System.out.println("cpf: " + this.cpf);
        System.out.println("Address: " + this.address.getStreet());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
