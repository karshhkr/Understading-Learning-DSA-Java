package com.example.DSA.java.Searching.BinarySearchLeetcode;

public class SearchInRotatedSortedArray33 {
    public static void main(String[] args) {
int arr[]={4,5,6,7,0,1,2};
        System.out.println(findpivot(arr));
    }
    public int search(int[] arr, int target) {
   int pivot =findpivot(arr);

   /// if we dont find pivot , it means it not the rotated array
        if(pivot==-1){

            //just do binary search
           return binarySearch(arr,target,0,arr.length-1);
        }
///  if we found Pivot We have two asc sorted Array
        if(arr[pivot]==target){
            return pivot;
        }
        else if(arr[0]<=target){
            return binarySearch(arr,target,0,pivot-1);

        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }
    static int binarySearch(int []arr, int target, int start, int end){
        if (start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;

            }else if (target>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return-1;
    }
    static int findpivot ( int[] arr){
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                /// ///All 4 Cases Here ///////////
//1
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }

//2
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid - 1;
                }
//3
                if (arr[mid] <= arr[start]) {
                    start = mid + 1;
                }
//4
                if (arr[mid] > arr[end]) {
                    end = mid - 1;
                } else { // finding the second half of the array
                    start = mid + 1;
                }

            }
            return -1;
        }

}
