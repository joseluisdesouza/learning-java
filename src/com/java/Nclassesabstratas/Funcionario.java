package com.java.Nclassesabstratas;

//Classes abstratas são feitas para serem estendidas, não se cria objetos atraves delas
public abstract class Funcionario {
    protected String name;
    protected String clt;
    protected double salario;

    public Funcionario() {

    }

    public Funcionario(String name, String clt, double salario) {
        this.name = name;
        this.clt = clt;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "name='" + name + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }

    //Metodos abstratos não contem um corpo, e se a classe conter um metodo abstrato então a classe tera que ser abstrata tambem
    //Esse metodo obriga as classes filhas a sobrescreverem ele, sendo assim cada classe filha tera esse metodo com seu corpo com a logica desejada
    public abstract void calcSalario();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
