package com.java.Ccontrolefluxo;

public class ControleFluxo2 {
    public static void main(String[] args) {
        int idade = 18;
        String status;
        if (idade < 15) {
            status = "infantil";
        } else if (idade >= 15 && idade < 18) {
            status = "juvenil";
        } else {
            status = "adulto";
        }

        //usando o operador ternario ? para true e : para false
        status = idade < 18 ? "infantil" : "adulto" ;

        System.out.println(status);

    }
}
