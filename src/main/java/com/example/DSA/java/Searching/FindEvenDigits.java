package com.example.DSA.java.Searching;

import java.util.Arrays;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits//
public class FindEvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findeven(nums));


    }

    static int findeven(int[] nums) {
        int count = 0;
        for (int num : nums) {// for every num in nums array
            if (even(num)) {
                count++;
            }
        }
        return count;
    }


    /// //function to check nums contains even number of digits or not

    static boolean even(int num) {
        int noOfDigits = digits(num);
   /*  if (noOfDigits %2== 0) { ///  checking its even or not
            return true;
        }
        return false; */
        return noOfDigits % 2 == 0;
    }


    /// another way to return the nmber of the digits //////////
    static int digits2(int num) {
        return (int) Math.log10(num);
    }




    static int digits(int num) {
        if(num<0){
            num=num*-1;

        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }


}