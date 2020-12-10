package com.java.Darrays;

public class Arrays2 {
    public static void main(String[] args) {
        //byte, short, int, long, float, double =0
        //char '\ ' '
        //boolean false;
        // reference null

        String[] names = new String[3];
        names[0] = "Naruto";
        names[2] = "Goku";
        names[3] = "Vegeta";
        //length mostra o tamanho do array autimaticamente pra nao precisar ficar
        //alterando toda hora o metodo

        for(int i=0; i<names.length; i++) {
            System.out.println((i + 1) + "names " +names[i]);
        }
    }
}
