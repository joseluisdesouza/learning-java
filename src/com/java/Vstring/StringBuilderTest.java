package com.java.Vstring;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "Uma frase comun";
        StringBuilder sb = new StringBuilder(15);
        sb.append("def").insert(3, "ghi").reverse().delete(2,4);
        System.out.println(sb);
    }
}
