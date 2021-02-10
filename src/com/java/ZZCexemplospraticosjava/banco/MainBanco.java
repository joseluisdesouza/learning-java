package com.java.ZZCexemplospraticosjava.banco;

public class MainBanco {
    public static void main(String[] args) {
        ContaBanco contaBanco = new ContaBanco();
        contaBanco.setNumConta(111);
        contaBanco.setDono("João");
        contaBanco.abrirConta("CC");
        contaBanco.estadoAtual();
    }
}
