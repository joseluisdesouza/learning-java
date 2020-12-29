package com.java.Rexception;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) throws IOException {
    criarArquivo();

    abrirArquivo();
    }

    public static void criarArquivo() throws IOException {
        File file = new File("Teste.txt");
        try { //Tente fazer isso
            System.out.println("Arquivo criado?"+file.createNewFile()); //Ele lancou essa exception e devemos trata-la
        }catch (IOException e) { //E caso lançe uma exceção pegue ela
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Caso o codigo apresente uma exception o java vai pular da linha 14 diretamente para a 16,
     * então sempre trate o bloco catch.
     */

    public static void abrirArquivo() {
        File file = new File("Teste.txt");
        try { //Tente fazer isso
            System.out.println("Arquivo criado?"+file.createNewFile()); //Ele lancou essa exception e devemos trata-la
            System.out.println("Abrindo um arquivo");
            System.out.println("Executando um arquivo");
            System.out.println("Escrevendo um arquivo");

        }catch (IOException e) { //E caso lançe uma exceção pegue ela
            e.printStackTrace();
        } finally {
            System.out.println("Fechar um arquivo");
        }

        /**
         * e se caso o programa parar na linha 28? ele não ira chegar na 33 onde fechamos o arquivo
         * dai pensando da melhor forma podemos colocar o restante dentro no catch porem estariamos
         * repetindo codigo e é por isso que existe o bloco finally
         * Nunca se deve criar um try sozinho, ou criamos um try catch ou try finally,
         * mas geralmente é utilizado o try catch
         */
    }


}
