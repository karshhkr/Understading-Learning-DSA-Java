package com.example.DSA.java.Strings.basics.StringLeetcode;

public class PowerOfTwo231 {
    public static void main(String[] args) {
        int n=19;
        System.out.println(isPowerOfTwo(n));


    }
    static boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
         while(n!=1){
             if(n%2!=0){
                 return false;
             }
             else {
                 n=n/2;
             }
         }
         return true;
    }
}
