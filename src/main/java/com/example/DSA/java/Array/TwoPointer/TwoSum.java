//package com.example.DSA.java.Array.TwoPointer;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int[] result=twoSum(arr,22);
        System.out.println(Arrays.toString(result));

    }
    static int[] twoSum(int[] arr, int target) {

        int n=arr.length;
        int i =0;
        int j=arr.length-1;
        while(i<j){
            int sum =arr[i]+arr[j];
            if(sum==target){
                return new int[]{i,j};
            }
            if(sum>target){
                j--;
            }
            else if (sum<target){
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}
