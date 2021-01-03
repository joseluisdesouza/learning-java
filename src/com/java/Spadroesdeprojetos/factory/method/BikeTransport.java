package com.java.Spadroesdeprojetos.factory.method;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
