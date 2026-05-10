package com.example.DSA.java.Searching.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {



        int[] arr = {12, 14, 17, 19, 56, 76, 89, 90};

        int target = 76;
        int ans = orderagnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderagnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        /// Check whether the Arr is sorted in Ascending Order or Descending
        boolean isAsc= arr[start] < arr[end];



        while (start <= end) {

            // finding the middle
//        int mid=(start+end)/2; // might be possible that (start+mid)exceeds the range of int in  Java integer Overflow
            int mid = start + (end - start) / 2;

           if(arr[mid] == target) {
               return mid ;
           }

/// // if ascending
if (isAsc){
    if (target < arr[mid]) {// target elements is less than the middle  elements so its in the left of the mid
        end = mid - 1;

    } else if (target > arr[mid]) {// target elements is less than the middle  elements so its in the right of the mid
        start = mid + 1;

    }
}

///  if not Ascending
           else {
    if (target >arr[mid]) {// target elements is less than the middle  elements so its in the left of the mid
        end = mid - 1;

    } else if (target > arr[mid]) {// target elements is less than the middle  elements so its in the right of the mid
        start = mid + 1;

    }
            }


        }
        return -1;
    }
}