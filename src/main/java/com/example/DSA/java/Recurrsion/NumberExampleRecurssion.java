package com.example.DSA.java.Recurrsion;

public class NumberExampleRecurssion {
    public static void main(String[] args) {
        numbers1(1);
    }

    static  void numbers1(int n) {
        if (n == 5) { ///  Base condit ion
            System.out.println(5  );

            return;
        }//
        System.out.println(n);

        //recursive call
        // if you are calling a function again and again , you can treat its asa separate call in the stack
        numbers1(n+1); // last function call is called Tail function
    }

}
