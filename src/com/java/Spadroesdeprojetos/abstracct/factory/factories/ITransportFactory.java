package com.java.Spadroesdeprojetos.abstracct.factory.factories;

import com.java.Spadroesdeprojetos.abstracct.factory.aircrafts.IAircraft;
import com.java.Spadroesdeprojetos.abstracct.factory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
}
