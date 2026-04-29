package com.example.DSA.java.Basics.FunctionandMethods;

import java.util.Scanner;

public class main {
    public static void Main(String[] args) {
sum();
    }
   static void sum (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num = sc.nextInt();
        sc.nextLine();
       System.out.println("enter the number2:");
       int num2 = sc.nextInt();
       sc.nextLine();
       int sum=num+num2;

       System.out.println("the sum is: "+sum);

    }

    /*
    Access modifier
    return_type name(){
    //body
    return statement;
    }


     */
}
