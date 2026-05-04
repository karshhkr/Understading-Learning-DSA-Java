package com.example.DSA.java.Searching;

public class FindMin {



    public static void main(String[] args) {
        int []arr={12,35,56,-7,45,89,93,54};
        System.out.println(min(arr));
      //  System.out.println(max(arr));
    }

    ///  find the minimum elements in the array in the array    /////////
     static int min(int [] arr){
if(arr.length==0){
    return -1;
}
int ans=arr[0];// ans is 0 th index
          for (int i =1; i< arr.length; i++){
              if(arr[i]<ans){ //agar arr of arr[i] less than anss
                ans=arr[i];// return arr[i] as ans
              }
          }

/// ////////find the minimum elements in the array in the array    /////////


//         static int max(int [] arr){
//             if(arr.length==0){
//                 return -1;
//             }
//             int ans=arr[0];// ans is 0 th index
//             for (int i =1; i< arr.length; i++){
//                 if(arr[i]>ans){ //agar arr of arr[i] less than anss
//                     ans=arr[i];// return arr[i] as ans
//                 }
//             }

return ans;
     }
}
