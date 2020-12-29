package com.java.Rexception;

import java.io.*;

public class TryWithResourceTest {
    public static void main(String[] args) {


    }

    public static void lerArquivo() {
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
