package com.example.DSA.java.Array;

import java.util.Arrays;

public class ColNotFixedSize {
    public static void main(String[] args) {
        int [][] arr= {
                {1,2,3,4}
                ,{6,7},
                {8,9,10,11}
        };
//         for (int[] arr1: arr)
//             System.out.println(Arrays.toString(arr1));

        for (int row=0; row<arr.length; row++) {
            for (int col=0; col<arr[row].length; col++) {
                System.out.println(arr[row][col]+" ");


            }
            System.out.println();
        }
    }
}
