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
 *
 * O diretor controla a ordem da construção. Ele sabe quais etapas de construção chamar para produzir este ou aquele modelo de carro.
 *
 * Director – esta é a classe que controla o algoritmo responsável por gerar o objeto do produto final. Um objeto Director é instanciado e seus métodos construtores são chamados.
 * O método inclui um parâmetro para capturar objetos específicos do tipo Concrete Builder que serão então utilizados para gerar o produto (product).
 * Dessa forma, o director, chama os métodos do concrete builder na ordem correta para gerar o objeto produto.
 *
 */
