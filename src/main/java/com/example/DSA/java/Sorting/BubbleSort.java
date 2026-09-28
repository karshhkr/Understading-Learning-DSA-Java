//package com.example.DSA.java.Sorting;

import java.util.Arrays;

public class BubbleSort {
  public  static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr) {
boolean swapped;
        // run the steps n-1\
        for (int i =0; i<= arr.length-1; i++) {
            swapped = false;
            //for each elements last index is max elements(n-1)
            for (int j = 1; j<= arr.length-i-1; j++) {
                // swap if smaller tham prev elements
                if(arr[j]<arr[j-1]){

                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            // if not swap for i it means program is sorted
            if(!swapped){
                break;
            }
        }
    }
}
