package com.java.ZZAio;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Escrevendo uma msg no arquivo\n e pulando uma linha");
            bw.newLine();
            bw.write("E pulando uma linha");
            bw.flush();
            bw.close();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s = null;
            while ((s=br.readLine()) != null){
                System.out.println(s);
            }
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
