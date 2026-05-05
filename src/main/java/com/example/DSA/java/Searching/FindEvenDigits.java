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
        if (noOfDigits %2== 0) { ///  checking its even or not
            return true;
        }
        return false;
    }

    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }


}