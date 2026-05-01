package com.example.DSA.java.Searching;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
String name= "karshkr";
char target = 'r';
       // System.out.println(search(name,target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    //Using ForEach Loop
    /// and method charToArray in for each loop cause for each loop works on collection and arrays
    static boolean search2(String str, char target) {
        if(str.length()==0){ //for string length() is a method
            return false;
        }
        for(char ch:str.toCharArray()){// .charAtArray string ko Char[] array
            if(ch ==target){
                return true;

            }

        }
        return false;
    }
    static boolean search(String str, char target) {
        if(str.length()==0){ //for string length() is a method
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;

            }

        }
        return false;
    }
}
