package com.java.Mmodificadorfinal;

public class Car {
    private String name;
    private String model;
    //Sempre devemos inicializar um atributo que foi declarado com final, um valor que nunca ira mudar
    //O nome da variavel sempre deve ser declarado em uppercase
    private static final double limitSpeed = 200;
    private final Buyer BUYER = new Buyer();

    public static double getLimitSpeed() {
        return limitSpeed;
    }

    public Buyer getBuyer() {
        return BUYER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
