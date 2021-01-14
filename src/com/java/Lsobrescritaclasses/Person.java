package com.java.Lsobrescritaclasses;

public class Person {
    private String name;
    private int age;

    //Fazendo a sobrescrita
    public String toString() {
        return "Name: " +name + "Age: " +age;
    }

    //Para a sobrescrita usando o toString podemos usar um codigo gerado pela IDE o proprio toString
    //    @Override
    //    public StringTest toString() {
    //        return "Person{" +
    //                "name='" + name + '\'' +
    //                ", age=" + age +
    //                '}';
    //    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
