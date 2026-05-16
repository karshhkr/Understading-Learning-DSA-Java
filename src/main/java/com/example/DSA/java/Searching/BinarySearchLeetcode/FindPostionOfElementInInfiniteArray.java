package com.example.DSA.java.Searching.BinarySearchLeetcode;

public class FindPostionOfElementInInfiniteArray {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7, 9, 10, 15, 18, 22, 30, 45, 67};
        int target = 15;

        int ans = findRange(arr, target);
        System.out.println(ans);
    }
    static int findRange(int[] nums, int target){

        ///  start the range of the  size 2
        int start = 0;
        int end = 1;
        while(target>nums[end]){
            int newStart=end+1;
             end =Math.min(end+(end-start+1)*2,
                     nums.length-1);

            start=newStart;
        }
return findposofinfinitearray(nums, target, start, end);

    }

    static int findposofinfinitearray(int [] arr , int target, int start, int end ){


///// we doesnt know the Size of the array
//        int start=0;
//        int end =arr.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;// elements found
            }
        }
        return -1;// elements not exist
    }
    }

