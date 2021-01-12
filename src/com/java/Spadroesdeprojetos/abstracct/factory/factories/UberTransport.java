package com.java.Spadroesdeprojetos.abstracct.factory.factories;

import com.java.Spadroesdeprojetos.abstracct.factory.aircrafts.Airplane;
import com.java.Spadroesdeprojetos.abstracct.factory.aircrafts.IAircraft;
import com.java.Spadroesdeprojetos.abstracct.factory.landvehicles.Car;
import com.java.Spadroesdeprojetos.abstracct.factory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
