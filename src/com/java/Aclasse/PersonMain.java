package com.java.Aclasse;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Pedro");
        person.setAge(26);
        System.out.println("This is name person: " + person.getName());
        System.out.println("This is age person: " + person.getAge());
    }
}
