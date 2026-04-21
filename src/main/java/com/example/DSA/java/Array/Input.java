package com.example.DSA.java.Array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        //1. array for primitives
//        int[] arr=new int[3];
//        arr[0]=23;
//        arr[1]=32;
//        arr[2]=34;
//        //[23,32,34]
//        System.out.println(arr[2]);
//
////        // input using for loops
////        for(int i=0;i<arr.length;i++) {
////            arr[i] = sc.nextInt();
////        }
//
//        // 2. using for each loop
//      for(int nums:arr){ // for every element in array print the element
//          System.out.println(nums);// nums rpresent the elements of array
//      }
//
//      //3. using toString its an method which array has
//
//        System.out.println(Arrays.toString(arr));
//
//
//
//





// array of the Objects
        String[] str =new String [5];
        for(int i =0; i<=str.length; i++){
            str[i]=sc.next();
        }

        System.out.println(Arrays.toString(str));
        }


    }

