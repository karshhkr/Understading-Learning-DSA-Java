package com.example.DSA.java.Array;

import java.util.Arrays;
import java.util.Scanner;
// why we used paasinginfunction because of Array  mein Reference pass hota hai
// not the full copy of it yeh original array ko modify krta hai
public class PassinginFuction {
    public static void main(String[] args) {
int[] nums={2,3,4,56,6};
        System.out.println(Arrays.toString(nums));
        change(nums);// chamnging the value using this method change by pass nums into it
        System.out.println(Arrays.toString(nums));
    }
    static  void change(int[] arr)  // change method
    {
        arr[0]=99;
    }
}
