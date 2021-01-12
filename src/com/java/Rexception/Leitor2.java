package com.java.Rexception;

public class Leitor2 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Fechando arquivo 2");
    }
}
