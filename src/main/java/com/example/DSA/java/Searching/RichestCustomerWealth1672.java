//https://leetcode.com/problems/richest-customer-wealth/description/
package com.example.DSA.java.Searching;

public class RichestCustomerWealth1672 {
    public static void main(String[] args) {

    }
    static int MaxWealth(int [][] accounts){
        int ans=Integer.MIN_VALUE;
        int sum=0;
for (int person=0; person<accounts.length; person++){
    //person=row
    //accounts=col
    for (int account=0; account<accounts[person].length; account++){

////// sum of rows and cols////
        sum+=accounts[person][account];

        }

    if (sum>ans){
        ans=sum;
    }
    }
return ans;
}
    }

