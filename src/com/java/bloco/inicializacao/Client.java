package com.java.bloco.inicializacao;

public class Client {
    // 0 - Bloco de inicialização é executado quando a jvm carregar a classe (é executado apenas uma vez)
    // 1 - Alocado espaco na memoria para o objeto que sera criado
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - Bloco de inicialização é executado, para criar um usamos {} antes do construtor como boa pratica
    // 4 - O construtor é executado
    private int[] parcelas;
    {
        parcelas = new int[100];
        System.out.println("inicia aqui");
        for(int i=1; i<=100; i++) {
            parcelas[i-1] = i;
        }
    }
    public Client() {

    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
