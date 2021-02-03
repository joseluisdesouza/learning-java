package com.java.Spadroesdeprojetos.bridge.transmissions;

import com.java.Spadroesdeprojetos.bridge.platforms.IPlatform;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Live implements ITransmission{
    protected IPlatform platform;

    public Live() {

    }

    public Live(IPlatform platform) {
        this.platform = platform;
    }


    @Override
    public void broadcasting() {
        System.out.println("Inciando a transmissão");
    }

    @Override
    public void result() {
        System.out.println("_________ON AIR__________");

    }
}
