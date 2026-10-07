package com.example.DSA.java.Recurrsion;

public class BinarySearchInRecurssion {
    public static void main(String[] args) {
        int[]arr={2,4,6,8,10, 12,14};
         int result =search(arr,98,0,arr.length-1);
        System.out.println(result);
    }


     static int search(int [] arr, int target, int s, int e) {
         if (s > e) {
             return -1;
         }
         int m = s + (e - s) / 2;

         if (arr[m] == target) {
             return m;
         }
         if (target < arr[m]) {
             return search(arr, target, s, m - 1);// recursion b/c search () calls itself

         }

             return search(arr, target, m + 1, e);// recursion b/c search () calls itself
         }
        }


