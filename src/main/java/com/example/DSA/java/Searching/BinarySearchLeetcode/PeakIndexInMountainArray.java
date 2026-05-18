package com.example.DSA.java.Searching.BinarySearchLeetcode;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
int arr[]={1,2,3,5,7,6,3,2};

    } public int peakIndexInMountainArray(int[] arr) {


    int start=0;
    int end=arr.length-1;
        while(start<end){
        int mid =start+(end-start)/2;
        if(arr[mid]>arr[mid+1]){
            /// /this may be ans but check left side
            end=mid;//  we at the decreasing side of the array

        }
        /// /this may be also the ans but check right side
        else if (arr[mid]<arr[mid+1]){
            start=mid+1;//  we at the increasing side of the array
        }
    }
        // start= end pointing largest element of the array
        // we have search the conditions for the largest element now the the elemet would at start and end

        return start;// we can return end too;
}


}
