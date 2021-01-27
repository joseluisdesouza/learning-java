package com.java.Ytoken;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("1 true 100 o1");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
