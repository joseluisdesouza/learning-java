package com.java.Rexception;

import java.io.*;

public class TryWithResourceTest {
    public static void main(String[] args) {
        lerArquivoDosLeitores();
    }

    public static void lerArquivoDosLeitores() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {
            /**
             * ele ira ler de baixo para cima
             */

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void lerArquivoMaisAtual() {
        try (Reader reader = new BufferedReader(new FileReader("text.txt"))) {

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void lerArquivoOld() {
        /**
         * ate a versão 6 do java a leitura era feita dessa forma
         */
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {

        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
