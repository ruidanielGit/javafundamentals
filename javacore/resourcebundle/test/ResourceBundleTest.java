package com.curso.javacore.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {

        ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));

        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));

        rb = ResourceBundle.getBundle("messages", new Locale("pt", "PT"));

        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("video"));
    }
}
