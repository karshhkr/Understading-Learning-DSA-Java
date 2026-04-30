package com.example.DSA.java.Array;

public class MaxElements {
    public static void main(String[] args) {
        int[] arr={1,2,33,64,85,26,97,15};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,4));
    }
    static  int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }


        }

        return max;

    }

    // if we want am range of the max betwwen the indexes then

    static  int maxRange(int[] arr, int start, int end ) {
        int max = arr[start];
        for (int i = start; i <=end; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }


        }

        return max;

    }
}
