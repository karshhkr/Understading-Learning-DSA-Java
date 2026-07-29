package com.example.DSA.java.Searching.BinarySearchLeetcode;

public class SplitArrayLargestSum410 {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;

        SplitArrayLargestSum410 obj = new SplitArrayLargestSum410();

        int ans = obj.SplitArray(nums, m);

        System.out.println("Minimum largest sum = " + ans);
    }
     public int SplitArray(int []nums, int m){
        int start =0;
        int end =0;
        for (int i=0;i< nums.length;i++)

        {
             start = Math.max(start,nums[i]);// in the end of loop this will contains the max item of the array

            end += nums[i];
        }
         while (start < end){
             //mid is ans
             int mid  = start + (end-start)/2;

             //calc how many peices divide this in  with max sum
             int sum =0;
             int pieces=1;
for (int num:nums){
if (sum +num>mid){
    //you cannot add this in subarray
    // add this in new subarray the sum = num

       sum =num;
         pieces ++;
    }
else {
    sum+= num;
  }

}
 if (pieces>m){
     start = mid +1;
 }
   else {
     end =mid;
 }
         }
          return end;// here start == end

     }
}
