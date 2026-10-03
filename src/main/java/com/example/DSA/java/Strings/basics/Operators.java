package com.example.DSA.java.Strings.basics;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');//ascii value
        System.out.println("a"+"b");
        System.out.println((char)('a'+5));

        System.out.println("a"+7); //concated with string integer will converted to wrapper class Integer that will call toString()

        System.out.println("karshkr"+ new Integer(7)+ new ArrayList<>());
    }
}
