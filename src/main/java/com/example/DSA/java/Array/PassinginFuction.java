package com.example.DSA.java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class PassinginFuction {
    public static void main(String[] args) {
int[] nums={2,3,4,56,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static  void change(int[] arr)
    {
        arr[0]=99;
    }
}
