package com.java.ZZAio;

import java.io.File;

public class FileDiretorioTest {
    public static void main(String[] args) {
        File file = new File("pasta criada a partir do FileDiretorio");
        boolean mkdir = file.mkdir();
        System.out.println("Diretorio criado " + mkdir);
    }
}
