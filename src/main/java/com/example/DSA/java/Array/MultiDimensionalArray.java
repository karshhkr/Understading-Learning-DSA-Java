package com.example.DSA.java.Array;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
/////////////  Synatx of Multidimenstional Array/////////
      /*
      1 2 3
      4 5 6
      7 8 9
       */


        /////Storing in the multi Array/////


        //  int [][]arr =new int[3][];// no of columns not mandatory
//    int [][] arr2D ={
//            {1,2,3},// 0th index
//            {4,5},//..1th thh index
//            {6,7,8,9}//... arr2D[2]= {6,7,8,9}
//    };


//// //////////input // /////////

        int[][] arr = new int[3][4];
        System.out.println(arr.length);// give no.of rows ki length

        // input
        for (int row = 0; row < arr.length; row++) {// for each row

            for (int col = 0; col < arr[row].length; col++) { // for each col of that  array at that row  we need the  length of the array
                //taki row k saare col tak chale loop
                arr[row][col] = sc.nextInt();



            }
        }
        //output
        for (int row = 0; row < arr.length; row++) {// for each row

            System.out.println(Arrays.toString(arr[row]));
        }




//        for (int[] arr1 : arr) {
//            System.out.println(Arrays.toString(arr1));
  //  }
            }
        }

