package com.example.DSA.java.Strings.basics;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name1="Java Developer";
        System.out.println(Arrays.toString(name1.toCharArray()));
//        name1.getBytes(StandardCharsets.UTF_8);
        System.out.println(name1.toUpperCase());
        System.out.println(name1.indexOf('a'));
        System.out.println(name1.lastIndexOf('a'));
        System.out.println("java".strip());
        System.out.println(Arrays.toString(name1.split(" ")));

    }
}
