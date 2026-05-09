package com.example.DSA.java.Searching.BinarySearch;

public class   BinarySearch1 {
    public static void main(String[] args) {
int []arr={-18,-27,-19,2,3,4,18,19,57,88};
int target=4;
int ans=binarySearch(arr,target);
        System.out.println(ans);
    }

    /// ////TWO POINTER PATTERN IS USED IN BS
    /// / return index
    /// ///return -1 if not exists
    static int binarySearch(int []arr, int target){


    int start=0;
    int end =arr.length-1;
    while(start<=end){
        // finding the middle
//        int mid=(start+end)/2; // might be possible that (start+mid)exceeds the range of int in  Java
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
return Integer.MIN_VALUE;
    }
}
