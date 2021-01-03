package Spadroesdeprojetos.factory.method;

import Spadroesdeprojetos.factory.method.IVehicle;

public abstract class Transport {

    void startTransport() {
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
