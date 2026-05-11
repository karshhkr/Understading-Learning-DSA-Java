package com.example.DSA.java.Searching.BinarySearchLeetcode;

public class CeilingOfTheNumber {
    public static void main(String[] args) {
int [] arr={2,3,5,9,14,16,18};
int target=15;
int ans=ceiling(arr,target);
        System.out.println(ans);
    }



    /// //// Ceiling =  Greatest No >= Target



    //return index
    static int ceiling(int []arr, int target){

/// ///If the Traget > Greatest No in the array

        if(target>arr[arr.length-1]){
            return -1;
        }


        int start=0;
        int end =arr.length-1;
        while(start<=end){
            // finding the middle
//        int mid=(start+end)/2; // might be possible that (start+mid)exceeds the range of int in  Java integer Overflow
            int mid=start+(end-start)/2;
            if(target<arr[mid]){// target elements is less than the middle  elements so its in the left of the mid
                end=mid-1;

            }
            else if(target>arr[mid]) {// target elements is less than the middle  elements so its in the right of the mid
                start=mid+1;

            }
            else {
                return mid;// elements not exist
            }
        }
        return start;
    }
}
