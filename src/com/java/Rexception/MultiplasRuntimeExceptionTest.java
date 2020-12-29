package com.java.Rexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try {

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("dentro do ArithmeticException");
        }
        System.out.println("final do programa");

        System.out.println("--------------------------------------");

        try {

        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        }
        System.out.println("final do programa");
        /**
         * apartir do java 7 uma nova funcionalidade foi inserida ajudando muito
         * na diminuição de codigo, veja o mesmo exemplo acima!
         */

        System.out.println("---------------------------------------");


        try {
            talvezLanceException();
        } catch (SQLException e) {

        } catch (IOException e) {

            /**
             * Nesse exemplo tive que tratar duas excessoes,
             * veja que usei a super classe de FileNotFoundException
             * e funciona normalmente
             */
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }

    /**
     * a regra é, o mais generico por ultimo
     */
}
