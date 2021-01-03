package com.java.Spadroesdeprojetos.factory.method;

public class FactoryMethod {

    public static Transport transport;

    public static void main(String[] args) {

        /**
         *Neste padrão, voce deve substituir as chgamadas diretas(new) de
         * construção de objetos da classe, para um metodo intermediario
         * que fara o papel de fabrica, este metodo fabrica ou Factory Method,
         * ira controlar como criar os objetos que estendem a sua classe serão
         * instanciados.
         *
         * Os objetos retornados pelo metodo fabrica são chamados de produtos
         * ou Classes Concretas.
         *
         * Assim temos em noss cenario a classe Veiculo que implementa a interface
         * Transporte, e as subclasses concretas carros, motos, bicicletas que herdam
         * de Veiculo e implementar os metodos declarados na interface.
         *
         * A limitação fica por conta das subclasses. Caso estas retornem valores
         * diferentes, precisam compartilhar a mesma classe ou interface base. O
         * metodo fabrica ou Factory Method na classe base deve ter a interface como o
         * seu tipo de retorno
         *
         */

        configure(args[0]);
        if (transport != null) {
            runTransport();
        }

    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch (type) {
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotorcycleTransport();
                break;
            case "bike":
                transport = new BikeTransport();
                break;
            default:
                System.out.println("Selecione o tipo de entrega");
        }
    }
}
