package com.java.Spadroesdeprojetos.bridge.platforms;

public class FacebookLive implements IPlatform{

    public FacebookLive() {
        configureRMTP();
        System.out.println("FacebookLive: iniciando a transmissão");
    }
    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: autorizando aplicação");
    }
}
