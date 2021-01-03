package Spadroesdeprojetos.factory.method;

import Spadroesdeprojetos.factory.method.IVehicle;

public class Motorcycle implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Inciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Ja pegamos a encomenda");
    }
}
