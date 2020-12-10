package com.java.Aclasse;

public class ProdutoTest {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.nome = "ps5";
        produto.preco = 4.000;

        Produto.desconto = 0.29;

        System.out.println(produto);

        double precoFinal = produto.preco;
        double mediaCarrinho = (precoFinal) / 2;
        double trabalhandoComNovoMetodo = produto.precoComDesconto();

        System.out.println(mediaCarrinho);

    }
}
