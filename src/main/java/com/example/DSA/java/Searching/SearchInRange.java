package com.example.DSA.java.Searching;

public class SearchInRange {
    public static void main(String[] args) {
      //// search for the elements in the range of [a,b]  indexes

int[] arr={12,132,133,156,675};
int target=133;
        System.out.println(linearsearchinRange(arr, target, 1,4));

    }
    static int linearsearchinRange(int[] arr, int target, int start, int end ){
        if (arr.length==0){
            return -1;

        }
         for (int index =start; index<= end ; index++){
            int element= arr[index];


             if (element==target){
                 return index;
             }
         }
         return -1;
    }
}
