package com.java.Rexception;

public class Leitor1 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Fechando arquivo 1");
    }
}
