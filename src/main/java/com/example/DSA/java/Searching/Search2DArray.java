package com.example.DSA.java.Searching;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int [][] arr={
                {18,25,31},
                {43,59,62},
                {17,81,59}
        };
         int target= 59;
          int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    ///
     static int[] search(int[][] arr, int target ){
for (int row=0; row<arr.length; row++){
    for(int col=0; col<arr[row].length;col++){
        if (arr[row][col]==target){
            return new int[]{row, col};
        }
    }
}
return new int[]{-1,-1};
     }
}
