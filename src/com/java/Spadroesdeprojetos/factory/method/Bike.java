package com.java.Spadroesdeprojetos.factory.method;

public class Bike implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Inciando a corrida de bike");
    }

    @Override
    public void getCargo() {
        System.out.println("Ja pegamos a comida de bike");

    }
}
