package com.java.Aclasse;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!!");

        System.out.println(s);

        //Podemos passar diretamente esses metodos
        String x = "Leo".toUpperCase();
        System.out.println(x);

//podemos quebrar a linha antes do ponto ou ate depois dele
        String y = "Bom dia X".
                replace("X", "Gui").
                toUpperCase().
                concat("Estou quebrando linhas por ponto");
        System.out.println(y);

        //Tipos primitivos nao tem o operador "."
//        int a = 3;
//        a.
        
    }
}
