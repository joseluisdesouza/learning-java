package com.java.Uwrappers;

public class Wrappers {
    public static void main(String[] args) {
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10;
        float floatPrimitivo = 10;
        double doublePrimitivo = 10F;
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;

        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer integerWrapper = 1;
        Long longWrapper = 1L;
        Float floatWrapper = 1F;
        Double doubleWrapper = 1D;
        Character characterWrapper = 1;
        Boolean booleanWrapper =true;

        String valor = "10";
        Float f = new Float(valor);
        System.out.println(f);
    }

    /**
     * classes wrappers nada mais são do que classes utilitarias
     */
}
