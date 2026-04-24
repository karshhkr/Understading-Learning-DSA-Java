package com.example.DSA.java.Array;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        //  int [][]arr =new int[3][];// no of collums not mandatory
//    int [][] arr2D ={
//            {1,2,3},// 0th index
//            {4,5},//..
//            {6,7,8,9}//...
//    };



        int[][] arr = new int[3][3];
        System.out.println(arr.length);// give no.of rows

        // input
        for (int row = 0; row < arr.length; row++) {// for each row

            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();


            }
        }
        //output
//        for (int row = 0; row < arr.length; row++) {// for each row
//
//            System.out.println(Arrays.toString(arr[row]));

        for (int[] arr1 : arr) {
            System.out.println(Arrays.toString(arr1));
            }
        }
    }
