package com.java.Spadroesdeprojetos.bridge.platforms;

public class TwitchTV implements IPlatform{
    public TwitchTV() {
        configureRMTP();
        System.out.println("TwitchTV: iniciando a transmissão");
    }
    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: autorizando aplicação");
    }
}
