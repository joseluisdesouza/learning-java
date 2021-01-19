package com.java.Spadroesdeprojetos.builder.director;

import com.java.Spadroesdeprojetos.builder.builders.IBuilder;
import com.java.Spadroesdeprojetos.builder.components.CarTypeEnum;
import com.java.Spadroesdeprojetos.builder.components.ColorCarEnum;
import com.java.Spadroesdeprojetos.builder.components.Engine;
import com.java.Spadroesdeprojetos.builder.components.TransmissionEnum;

public class Director {

    public void constructSedanCar(IBuilder builder) {
        builder.setCarType(CarTypeEnum.SEDAN);
        builder.setSeats(5);
        builder.setTransmissions(TransmissionEnum.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(IBuilder builder) {
        builder.setCarType(CarTypeEnum.TRUCK);
        builder.setSeats(3);
        builder.setTransmissions(TransmissionEnum.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(13000));
    }

    public void constructSportCar(IBuilder builder) {
        builder.setCarType(CarTypeEnum.SPORTCAR);
        builder.setSeats(2);
        builder.setTransmissions(TransmissionEnum.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(5000));
        builder.setColor(ColorCarEnum.VERMELHO);
    }
}
