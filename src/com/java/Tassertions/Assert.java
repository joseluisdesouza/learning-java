package com.java.Tassertions;

public class Assert {
    public static void main(String[] args) {
//        calcSalario(-1000);
        calulaSalario(-233333);
    }

    private static void calcSalario(double salario) {
        assert (salario > 0): "passe um valor maior do que zero"; //podemos passar uma mensagem aqui
//        if  (salario > 0){
//            //fazer calculo
//        } else {
//            System.out.println("Não era pra chegar aqui");
//        }

        /**
         * nesse exemplo vemos que um salario não pode ser passado menor do que 0 então dessa forma aquele
         * else não precisaria estar ali, aqui foi só um mas imagine 30 classes com um else que não precisa ser usado
         * e é por isso que usamos a palavra "assert" ela nos afirma que o valor vai ser maior do que zero sendo assim
         * eliminando o if e else. Linha 9;
         *
         * tem uma regra que pelas boas praticas devemos deixar o metodo assert privado e não publico
         *
         * mas se quiser passar um metodo publico veja abaixo
         */

    }

    public static void calulaSalario(double salario2) {
        if (salario2 > 0) {}
            throw new IllegalArgumentException("Passe um valor maior de 0");
    }
}
