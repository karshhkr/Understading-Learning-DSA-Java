package com.example.DSA.java.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

public class FindAllDuplicatesinanArray442 {
    public static void main(String[] args) {
int nums[]={4,3,2,7,8,2,3,1};
        System.out.println(findallDuplicate(nums));

System.out.println(Arrays.toString(nums));
    }
    static List<Integer> findallDuplicate(int[] nums){
    int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {

                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {
                    swap(i, nums, correctIndex);
                }
                else
                {
                    i++;
            }


            }
        else{
            i++;
            }
            }

// search for missing number
            List<Integer>ans =new ArrayList<>();
            for(int index=0;index<nums.length;index++){
                if(nums[index]!=index+1){
                 ans.add(nums[index]);
                }
            }
            return ans;
        }
        private static void swap( int i, int[] nums, int correctIndex){
    int temp=nums[i];
    nums[i]=nums[correctIndex];
    nums[correctIndex]=temp;

}
}
