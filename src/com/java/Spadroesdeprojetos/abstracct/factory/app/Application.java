package com.java.Spadroesdeprojetos.abstracct.factory.app;

import com.java.Spadroesdeprojetos.abstracct.factory.aircrafts.IAircraft;
import com.java.Spadroesdeprojetos.abstracct.factory.factories.ITransportFactory;
import com.java.Spadroesdeprojetos.abstracct.factory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public void startRout(){
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
