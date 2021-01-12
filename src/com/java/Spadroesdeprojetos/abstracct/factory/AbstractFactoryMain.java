package com.java.Spadroesdeprojetos.abstracct.factory;

import com.java.Spadroesdeprojetos.abstracct.factory.app.Application;
import com.java.Spadroesdeprojetos.abstracct.factory.factories.ITransportFactory;
import com.java.Spadroesdeprojetos.abstracct.factory.factories.NineNineTransport;
import com.java.Spadroesdeprojetos.abstracct.factory.factories.UberTransport;

public class AbstractFactoryMain {

    public static Application configureApplication() {
        Application app;
        ITransportFactory factory;

        String company = "uber";

        if (company == "99") {
            factory = new UberTransport();
        } else {
            factory = new NineNineTransport();
        }
        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRout();

        /**
         * No Abstract Factory primeiro precisamos declarar explicitamente interfaces
         * para cada produto distinto da familia de produtos (ex: veiculos e aeronaves).
         * Então podemos fazer todas as variantes dos produtos seguirem essas interfaces.
         *
         * Em seguida declaramos a fabrica abstrata-uma interface com uma lista de metodos
         * de criação para todos os produtos que fazem parte da familia de produtos(por
         * exemplo, criarTransporteVeiculo, criarTransporteAeronave ). Esses metodos devem
         * retornar tipos abstratos de produtos representados pelas interfaces que extraimos
         * previamente: Veiculo, Aeronave e assim por diante.
         */
    }
}
