package com.java.Ccontrolefluxo;

public class ControleFluxo5 {
    public static void main(String[] args) {
        //dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
        //porem as parcelas nao podem ser menores do que mil 1000

        double valorTotal = 30000;
        for( int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + "R$"+ valorParcela);
        }
    }
}

//shift F10 roda a classe atual
