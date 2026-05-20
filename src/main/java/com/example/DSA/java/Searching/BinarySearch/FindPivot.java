package com.example.DSA.java.Searching.BinarySearch;

public class FindPivot {
    public static void main(String[] args) {
int []arr={4,5,6,7,0,1,2};
        System.out.println(findpivot(arr));
    }
    static int findpivot(int[]arr){
       int start = 0;
       int end = arr.length-1;
       while(start<=end){
           int mid = start+(end-start)/2;
           /// ///All 4 Cases Here ///////////
//1
       if(mid<end && arr[mid]>arr[mid+1]){
           return mid;
       }

//2
       if(mid>start && arr[mid]<arr[mid-1]){
           return mid-1;
       }
//3
       if(arr[mid]<=arr[start]){
           start = mid+1;
       }
//4
       if(arr[mid]>arr[end]){
           end = mid-1;
       }
       else{ // finding the second half of the array
           start = mid+1;
       }

       }
       return -1;
    }

}
