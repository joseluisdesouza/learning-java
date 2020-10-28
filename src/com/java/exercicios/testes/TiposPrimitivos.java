package com.java.exercicios.testes;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informaçoes do funcionario

        //Tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 545;
        int id = 56789;
        long pontosAcumulados = 2_346_234_223L;

        //Tipos numericos reais
        float salario = 11_456.44F;
        // double é o dobro do float
        double vendasAcumuladas = 2_234_645_345.01;

        //Tipo booleano
        boolean estaDeFerias = false; // ou true

        //Tipo caractere
        char status = 'A'; // a, numeros ou ate simbolos '?'

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Numero de viagens
        System.out.println(numeroDeVoos /2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha ->" + salario);
        System.out.println("Ferias? " + estaDeFerias);
        System.out.println("Status:" + status);

    }
}
