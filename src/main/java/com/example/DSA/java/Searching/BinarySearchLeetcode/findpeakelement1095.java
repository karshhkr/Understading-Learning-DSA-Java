package com.example.DSA.java.Searching.BinarySearchLeetcode;

public class findpeakelement1095 {


    //https://leetcode.com/problems/find-in-mountain-array/

        public static void main(String[] args) {

            int[] arr = {1, 2, 3, 4, 5, 3, 1};

            findpeakelement1095 obj =
                    new findpeakelement1095();

            System.out.println(obj.search(arr, 5));
        }

        int search(int[] arr, int target) {
            int peak=peakIndexInMountainArray(arr);
            int FirstOne=orderagnosticBS(arr, target,0,peak);
            if(FirstOne!=-1){ //try Search in first half of the array
                return FirstOne;
            }
            //try Search in second half of the array
            return orderagnosticBS(arr,target,peak+1,arr.length-1);

        }

        public int peakIndexInMountainArray(int[] arr) {

            int start = 0;
            int end = arr.length - 1;

            while(start<end){
                int mid =start+(end-start)/2;
                if(arr[mid]>arr[mid+1]){

                    end=mid;
                }

                else {
                    start=mid+1;//  we at the increasing side of the array
                }
            }
            return start;


        }
        static int orderagnosticBS(int[] arr, int target, int start, int end) {


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

                    } else  {// target elements is less than the middle  elements so its in the right of the mid
                        start = mid + 1;

                    }
                }


            }
            return -1;
        }
    }



