package com.java.Nclassesabstratas;

public class Gerente extends Funcionario{

    public Gerente() {
    }

    public Gerente(String name, String clt, double salario) {
        super(name, clt, salario);
    }

    @Override
    public void calcSalario() {
        this.salario = salario + (salario * 0.2);
    }
}
