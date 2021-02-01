package com.java.Spadroesdeprojetos.builder.builders;

import com.java.Spadroesdeprojetos.builder.cars.Truck;
import com.java.Spadroesdeprojetos.builder.components.CarTypeEnum;
import com.java.Spadroesdeprojetos.builder.components.ColorCarEnum;
import com.java.Spadroesdeprojetos.builder.components.Engine;
import com.java.Spadroesdeprojetos.builder.components.TransmissionEnum;

public class TruckBuilder implements IBuilder{
    private CarTypeEnum carTypeEnum;
    private int seats;
    private TransmissionEnum transmissionEnum;
    private Engine engine;
    private ColorCarEnum color;

    @Override
    public void setCarType(CarTypeEnum carTypeEnum) {
        this.carTypeEnum = carTypeEnum;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmissions(TransmissionEnum transmissionEnum) {
        this.transmissionEnum = transmissionEnum;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setColor(ColorCarEnum color) {
        this.color = color;
    }

    public Truck getResult() {
        return new Truck(carTypeEnum, seats, engine, transmissionEnum);
    }
}

/**
 * Os builders ja sabem oque ele precisa colocar nos traibutos porque a classe esta sendo implementada com a interface IBuilder
 */
