package com.example.DSA.java.Searching.BinarySearchLeetcode;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array//
public class FindFirstAndLastPositionElementInSortedArray34 {
    public static void main(String[] args) {
int[] nums={5,7,7,8,8,9,10};
int target=7;
int[] ans= searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1}; /// if the ans is not found return -1,-1
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }


    /// /this function retuns index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1; /// if the ans is not found return -1,-1
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;

            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                /// possible ans is found but dont stop lemnets could be left and right
                ans = mid;
                if (findStartIndex == true) {
                    end = mid - 1; // target found check left side
                } else if (findStartIndex == false) {
                    start = mid + 1;  // target found check right side
                }

            }

        }

        return ans;
    }
}
