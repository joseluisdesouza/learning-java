package com.java.controlefluxo;

public class ControleFluxo6 {
    public static void main(String[] args) {
        //dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
        //porem as parcelas nao podem ser menores do que mil 1000
        // neste exemplo iremos fazer só que da logica inversa
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela <= 1000) {
                continue; // esse comando ignora tudo que estiver abaixo dele enquanto nao chegar ao seu resultado

            }
            System.out.println("Parcela" + parcela + "R$" + valorParcela);
        }
    }
}
