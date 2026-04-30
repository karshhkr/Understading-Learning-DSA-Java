package com.example.DSA.java.Array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
///  yeh primitive hai toh yahan copy paass hoga not refernce of array


       ///////// Array for primitives ////////////




//        //1. Print the array using Primitives
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
//      //3. using toString its an method which array has to convert Array into the string
//
//        System.out.println(Arrays.toString(arr));
//
//
//
//





///////////////          Array of the Objects     /////////////////////



        String[] str =new String [5];// decalaration taking size of of 5 and dynamic memmory created in heap containg ref var of it in the memory
        for(int i =0; i<str.length; i++){
            str[i]=sc.next();
        }

        System.out.println(Arrays.toString(str));

        //Modify the value over the ref var using the index
        str[1]="Karshkr";
        System.out.println(Arrays.toString(str));
        }


    }

