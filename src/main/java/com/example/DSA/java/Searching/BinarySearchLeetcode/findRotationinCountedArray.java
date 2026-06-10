package com.example.DSA.java.Searching.BinarySearchLeetcode;

public class findRotationinCountedArray {
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5,9,8,10  };
        System.out.println(countRotations(arr));


    }

    private static int countRotations(int[] arr) {
        int pivot=findPivot(arr);
        // if array is rotated the pivot +1
        return pivot+1;
    }
        static int findPivot(int[]arr)
        {
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
///  Use This when The elements at Start, Mid, End  are not duplicates
    static int findpivotWithDuplicates ( int[] arr){
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



////// if The Elements of Start Mid ANd End are equal skip the Duplicates

            if (arr[mid]==arr[start]&& arr[mid]==arr[end]){
                ///Note: check if the start and end were Pivot

//check start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;// skip the duplicates from the start
// check the end is pivot
                if(arr[end]>arr[end-1]){
                    return end-1;
                }
                end--; // skip the duplicates form end

            }

            //left side is sorted , so pivot should be at right
            if(arr[start]<arr[mid] || arr[start]==arr[mid]&& arr[mid]>arr[end]){
                start=mid+1;

            }else if(arr[mid]>arr[end]){
                end=mid-1;
            }
        }
        return -1;
    }
    }

