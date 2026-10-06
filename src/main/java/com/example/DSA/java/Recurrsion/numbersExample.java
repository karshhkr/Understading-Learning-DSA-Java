package com.example.DSA.java.Recurrsion;



public class numbersExample {
    public static void main(String[] args) {
        // write a function that take a number and print the number
  //print 5 numbers

  numbers1(1);



    }

    static  void numbers1(int n)
    {
        System.out.println(n); // printing no.
        numbers2(2); // calling next function
    }
    static  void numbers2(int n)
    {
        System.out.println(n);
        numbers3(3);// calling next function
    }
    static  void numbers3(int n)
    {
        System.out.println(n);
        numbers4(4);// calling next function
    }

    static  void numbers4(int n)
    {
        System.out.println(n);
        numbers5(5);// calling next function
    }
    static  void numbers5(int n)
    {
        System.out.println(n);

    }



}
