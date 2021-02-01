package com.java.Spadroesdeprojetos.builder.cars;

import com.java.Spadroesdeprojetos.builder.components.CarTypeEnum;
import com.java.Spadroesdeprojetos.builder.components.Engine;
import com.java.Spadroesdeprojetos.builder.components.TransmissionEnum;

public class Truck {

    private final CarTypeEnum carTypeEnum;
    private final int seats;
    private final Engine engine;
    private final TransmissionEnum transmissionEnum;

    public Truck(CarTypeEnum carTypeEnum, int seats, Engine engine, TransmissionEnum transmissionEnum) {
        this.carTypeEnum = carTypeEnum;
        this.seats = seats;
        this.engine = engine;
        this.transmissionEnum = transmissionEnum;
    }

    public String result() {
        String truck = "Truck with motor: " + engine.getPower() + "\n";
        truck += " Transmission: " + transmissionEnum;

        return truck;
    }
}

/**
 * Product – o product representa o objeto complexo que está sendo construído
 *
 * O concrete builder então constrói a representação interna do produto e define o processo pelo qual essa classe será montada.
 * Na classe product são incluídas outras classes que definem as partes que a constituem, dentre elas, as interfaces para a montagem das partes no resultado final.
 */
