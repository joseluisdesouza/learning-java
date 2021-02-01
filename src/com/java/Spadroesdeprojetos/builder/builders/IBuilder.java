package com.java.Spadroesdeprojetos.builder.builders;

import com.java.Spadroesdeprojetos.builder.components.CarTypeEnum;
import com.java.Spadroesdeprojetos.builder.components.ColorCarEnum;
import com.java.Spadroesdeprojetos.builder.components.Engine;
import com.java.Spadroesdeprojetos.builder.components.TransmissionEnum;

public interface IBuilder {
    
    void setCarType(CarTypeEnum carTypeEnum);
    void setSeats(int seats);
    void setTransmissions(TransmissionEnum transmissionEnum);
    void setEngine(Engine engine);
    void setColor(ColorCarEnum color);
}

/**
 * Essa interface esta mostrando o que deve ter cada vez que eu for construir um objeto carro.
 */

