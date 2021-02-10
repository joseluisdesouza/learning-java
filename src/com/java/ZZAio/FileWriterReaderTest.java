package com.java.ZZAio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("Escrevendo uma msg no arquivo\n e pulando uma linha");
            fw.flush();
            fw.close();

            FileReader fr = new FileReader(file);
            char[] entrada = new char[500];
            int size = fr.read(entrada);
            System.out.println("Tamanho: " + size);
            for(char c: entrada) {
                System.out.print(c);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
