package com.java.Zresourcebuldles;



import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBuldle {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("good.morning"));
        resourceBundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("good.morning"));
    }
}
