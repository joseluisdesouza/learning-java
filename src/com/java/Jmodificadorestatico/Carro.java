package com.java.Jmodificadorestatico;

public class Carro {
    private String name;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240; // Nesse momento que colocarmos static ele passa a pertencer a classe e não ao objeto

    public Carro(String name, double velocidadeMaxima) {
        this.name = name;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("--------------------------");
        System.out.println(this.name);
        System.out.println("VM"+ this.velocidadeMaxima);
        System.out.println("VL"+ velocidadeLimite); //com o atributo static o this deve ser removido
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }
}
