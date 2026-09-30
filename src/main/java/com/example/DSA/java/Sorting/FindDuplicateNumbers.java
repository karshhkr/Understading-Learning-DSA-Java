package com.example.DSA.java.Sorting;

import java.util.Arrays;

import static java.util.Collections.swap;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        int nums[]={1,3,4,2,2};
        findDuplicate(nums);
        System.out.println(Arrays.toString(nums));

    }

   public  static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            //check the correct positions of elements
             if(nums[i]!=i+1) {

                 int correctIndex = nums[i] - 1;
                 if (nums[i] != nums[correctIndex]) {
                     swap(i, nums, correctIndex);
                 }
                 else {
                     return nums[i];
                 }
             } else
             {
                      i++;
                 }
        }
       return -1;
    }

        private static void swap ( int i, int[] nums, int correctIndex){
       int temp=nums[i];
       nums[i]=nums[correctIndex];
       nums[correctIndex]=temp;

    }
}