package com.java.Spadroesdeprojetos.builder.cars;

import com.java.Spadroesdeprojetos.builder.components.CarTypeEnum;
import com.java.Spadroesdeprojetos.builder.components.Engine;
import com.java.Spadroesdeprojetos.builder.components.TransmissionEnum;

public class Car {

    private final CarTypeEnum carTypeEnum;
    private final int seats;
    private final Engine engine;
    private final TransmissionEnum transmissionEnum;

    public Car(CarTypeEnum carTypeEnum, int seats, Engine engine, TransmissionEnum transmissionEnum) {
        this.carTypeEnum = carTypeEnum;
        this.seats = seats;
        this.engine = engine;
        this.transmissionEnum = transmissionEnum;
    }

    public CarTypeEnum getCarTypeEnum() {
        return carTypeEnum;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public TransmissionEnum getTransmissionEnum(){
        return transmissionEnum;
    }
}

/**
 * Product – o product representa o objeto complexo que está sendo construído
 *
 * O concrete builder então constrói a representação interna do produto e define o processo pelo qual essa classe será montada.
 * Na classe product são incluídas outras classes que definem as partes que a constituem, dentre elas, as interfaces para a montagem das partes no resultado final.
 */
