package com.java.Nclassesabstratas;

public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor() {

    }

    public Vendedor(String name, String clt, double salario, double totalVendas) {
        super(name, clt, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public void calcSalario() {
        this.salario = salario + (totalVendas * 0.05);
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
