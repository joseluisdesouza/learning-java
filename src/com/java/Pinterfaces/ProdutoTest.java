package com.java.Pinterfaces;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 4, 2000);
        p.calcImposto();
        p.calcFrete();
        System.out.println(p);

    }
}
