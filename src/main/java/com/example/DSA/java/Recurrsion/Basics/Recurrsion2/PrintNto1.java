package com.example.DSA.java.Recurrsion.Basics.Recurrsion2;
/// print number n --> 1 all digits
public class PrintNto1 {
    public static void main(String[] args) {
      ///   func(5);
//        funcReverse(5);
funcBoth(5);
    }
    static void func(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        func(n-1);

    }
    static void funcReverse(int n){
        if (n==0){
            return;
        }

        funcReverse(n-1);
        System.out.println(n);

    }

    static void funcBoth    (int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        funcBoth(n-1);
        System.out.println(n);


    }
}
