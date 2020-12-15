package com.java.Qpolimorfismo;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Ronaldo", 8000, 2000);
        Vendedor v = new Vendedor("Pirlo", 2000, 1600);
        RelatorioPagamento relatorio = new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(g);
//        relatorio.relatorioPagamentoVendedor(v);
        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("-----------------");
        relatorio.relatorioPagamentoGenerico(v);
    }
}
