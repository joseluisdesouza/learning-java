package com.java.Hheranca;

public class Employee extends Person {

    private double salary;

    public Employee(String name) {
        super(name);
    }

    public void imprime() {
        super.imprime(); //Toda vez que quiser acessar dado da super classe usamos o super.e o dado referente, fizemos uma sobrescrita de metodo
        System.out.println("Salario: " + this.salary);
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
