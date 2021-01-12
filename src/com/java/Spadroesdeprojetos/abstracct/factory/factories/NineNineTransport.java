package com.java.Spadroesdeprojetos.abstracct.factory.factories;

import com.java.Spadroesdeprojetos.abstracct.factory.aircrafts.Helicopter;
import com.java.Spadroesdeprojetos.abstracct.factory.aircrafts.IAircraft;
import com.java.Spadroesdeprojetos.abstracct.factory.landvehicles.ILandVehicle;
import com.java.Spadroesdeprojetos.abstracct.factory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
