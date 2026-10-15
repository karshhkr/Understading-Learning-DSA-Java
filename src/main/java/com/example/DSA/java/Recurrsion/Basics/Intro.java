package com.example.DSA.java.Recurrsion.Basics;

public class Intro {
    public static void main(String[] args) {
        ///  write afunction taht prints hello world
   message();
    }
    static void message(){
        System.out.println(" hello World Welcome to DSA");
        message2(); //function calling another function

    }
    static void message2(){
        System.out.println(" hello World Welcome to DSA");
        message3();
    }
    static void message3(){
        System.out.println(" hello World Welcome to DSA");
    }
}
