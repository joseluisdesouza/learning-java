package com.java.metodos.classes;

public class Calculadora {

    public int N1 = 10;
    public int N2 = 20;
    public int N3 = 30;

    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 10);
    }

    public void multiplicaDoisNumeros(int num1, int num2) { //metodo com parametros, assim o metodo fica menos engessado como no metodo acima
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double N1, double N2) {
        if (N1 != 0) {
            return N1 / N2;
        }
        return 0;
    }
    public void imprimeDoisNumerosDividos(double N1, double N2) {
        if (N2 != 0) {
            System.out.println(N1 / N2);
            return;
        }
        System.out.println("Não é possivel dividir por 0");
    }

    public void alteraDoisNumeros(int N1, int N2) {
        N1 = 30;
        N2 = 40;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("N1: "+N1);
        System.out.println("N2: "+N2);

    }

}
