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
        builder.setEngine(new Engine(2000));
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
        builder.setEngine(new Engine(6000));
        builder.setColor(ColorCarEnum.VERMELHO);
    }
}

/**
 * Nosso diretor ja sabe que quando eu chamar um Sedan ou um Truck como ele devera ser construido isso atraves
 * da chamado da interface IBUilder
 * <p>
 * O diretor controla a ordem da construção. Ele sabe quais etapas de construção chamar para produzir este ou aquele modelo de carro.
 * <p>
 *
 * O diretor é apenas responsável por executar as etapas de
 * construção em uma sequência em particular. Isso ajuda quando
 * produzindo produtos de acordo com uma ordem específica ou
 * configuração. A rigor, a classe diretor é opcional, já que o
 * cliente pode controlar os builders diretamente.
 *
 */
