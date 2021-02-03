package com.java.Spadroesdeprojetos.bridge.platforms;

public class YouTube implements IPlatform{
    public YouTube() {
        configureRMTP();
        System.out.println("YouTube: iniciando a transmissão");
    }
    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("YouTube: conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("YouTube: autorizando aplicação");
    }
}
