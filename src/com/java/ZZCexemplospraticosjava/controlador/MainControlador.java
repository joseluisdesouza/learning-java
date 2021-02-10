package com.java.ZZCexemplospraticosjava.controlador;

public class MainControlador {
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();
        controleRemoto.ligar();
        controleRemoto.maisVolume();
        controleRemoto.ligarMudo();
        controleRemoto.abrirMenu();
        controleRemoto.fecharMenu();
    }
}
