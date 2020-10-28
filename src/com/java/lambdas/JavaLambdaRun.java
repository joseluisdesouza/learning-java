package com.java.lambdas;

public class JavaLambdaRun {
    public static void main(String[] args) {

        //JAVA FUNÇOES LAMBDA

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        }).run();

    }
}
