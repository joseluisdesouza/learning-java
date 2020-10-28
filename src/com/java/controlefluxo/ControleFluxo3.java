package com.java.controlefluxo;

public class ControleFluxo3 {
    public static void main(String[] args) {

        byte dia = 5;
        // tipos de variaves que podem ir aqui no switch: char, int, byte, string e enum.
        switch (dia) {

            case 1:
                System.out.println("segunda");
                break;
            case 2:
                System.out.println("terça");
                break;
            case 3:
                System.out.println("quarta");
                break;
            case 4:
                System.out.println("quinta");
                break;
            case 5:
                System.out.println("sexta");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;

        }

        String sexo = "m";
        switch (sexo) {
            case "m":
                System.out.println("Masculino");
                break;
            case "f":
                System.out.println("Feminino");
                break;
            default:
                System.out.println("opção invalida");
                //usamos o default para opção invalida, o break nao precisa ir no final tecnicamente.
        }

    }

}