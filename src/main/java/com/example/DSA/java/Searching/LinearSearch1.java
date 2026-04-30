package com.example.DSA.java.Searching;

public class LinearSearch1    {
    public static void main(String[] args) {
int[] nums={23,4,4,56,77,123,45,68,98};
int target =56; // not in the arry return -1 ;
    //    int target= 123;

  int ans=linearSearch(nums,target);
        System.out.println(ans);


     //   int ans =linearSearch2(nums,target);
      //  System.out.println(ans);

//        boolean ans =linearSearch3(nums,target);
//        System.out.println(ans);
    }


    //1.
    /////search the array if array is found return the indexes of it
    //////// otherwise return -1;

    static int  linearSearch(int[] arr, int target) {
         if (arr.length == 0){
             return -1;

         }

         /////ran a loop
         for (int index = 0; index < arr.length; index++) {
             //check element of every index if the ==  target
        int element= arr[index];
        if (element == target){
            return index;
        }
         }
/// this line execute if none retun statement is exceuted no elements in the array
        return -1;

    }



    //2.
    /// //// Search the elements and return the elements
    static int  linearSearch2(int[] arr, int target) {
        if (arr.length == 0){
            return -1;

        }

        /////ran a loop
        for (int element : arr) {
            //check element of every index if the ==  target
            if (element == target) {
                return element;
            }
        }
/// this line execute if none return statement is exceuted no elements in the array
        return Integer.MIN_VALUE; // we not ret=tuning the -1 cause -1 could be the element in the array

    }



    //1.
    ////// ///Search the target and return true or false///////
    static boolean  linearSearch3(int[] arr, int target) {
        if (arr.length == 0){
            return false;

        }


        int index = 0;
        for (int element : arr) {
            //check element of every index if the ==  target

            if (element == target){
                return true;
            }
            index++;
        }
        return false;
    }
}
