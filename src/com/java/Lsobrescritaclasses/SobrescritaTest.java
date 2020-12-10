package com.java.Lsobrescritaclasses;

public class SobrescritaTest { //Toda classe é filha de object, toda classe é um objeto, seria explicitamente assim: public class Person extends Object
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Pedro");
        p.setAge(30);
        System.out.println(p); //Neste caso ele ira imprimir um local alocado na memoria mas se fizermos uma sobrescrita do metodo toString que vem da classe Object conseguimos imprimir oque queremos
    }
}
