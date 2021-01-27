package com.java.ZZAio;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("arquivo.txt");
        try {
            System.out.println(file.createNewFile());
            boolean exists = file.exists(); // Se ele existe true ou false
            System.out.println(exists);
            System.out.println("Pode ler?" +file.canRead());// Permissão de leitura
            System.out.println("Me mostre o caminho" + file.getPath()); // para saber o caminho
            System.out.println("Me mostre o caminho todo" + file.getAbsolutePath()); //Vai traser o caminho
            System.out.println("Me mostre a ultima vez que foi modificado" + new Date(file.lastModified()));
            if(exists) {
                System.out.println("Deletado ? " + file.delete()); // retorna um valor booleano
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
