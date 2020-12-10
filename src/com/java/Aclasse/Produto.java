package com.java.Aclasse;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() {

    }

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //metodo do tipo double, sem parametros que retorna seguinte expressão
    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    //metodo com parametro
    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }
}
