package com.java.Rexception;

public class ErrorTest {
    public static void main(String[] args) {
        stackError();
    }

    public static void stackError() {
        stackError();
    }

    /**
     * Saiba que (error) não é uma exception(excessão)
     *
     * Sobre exception temos duas palavras muito importantes:
     * CHECKED (CHECADO) esse tipo de excessão esta alem do dominio do programador, ex: uma conecxão com o banco de dados etc
     * UNCHECKED (NÃO CHECADO) ja esse tipo de excessão é um problema de logica de programação, codigo errado
     * Todas as excessões de RunTimeException para baixo são do tipo UNCHECKED
     * Todas exceções filhas de Exception são do tipo CHECKED
     */

}
