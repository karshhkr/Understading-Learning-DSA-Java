package com.example.DSA.java.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapAndReverse {



        public static void main(String[] args) {
            /// //syntax
            ArrayList<Integer> list = new ArrayList<>();

            int[] arr = {1, 2, 3, 4, 5, 6};
           // swap(arr, 1, 3);
            reverse(arr);
            System.out.println(Arrays.toString(arr));
        }
    //reverse the array
        static void reverse(int[] arr) {

            int start =0;
             int end =arr.length-1;
             while (start < end) {
                 int temp = arr[start];
                 arr[start] = arr[end];
                 arr[end] = temp;
                 start++;
                 end--;
             }


        }
        static void swap(int[] arr, int index1, int index2) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;

        }
    }

