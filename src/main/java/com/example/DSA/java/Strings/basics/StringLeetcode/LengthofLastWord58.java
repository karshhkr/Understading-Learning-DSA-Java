package com.example.DSA.java.Strings.basics.StringLeetcode;

public class LengthofLastWord58 {
    public static void main(String[] args) {
String str="fly to the moon ";
        System.out.println(lengthofLastWord(str));
    }
     static int lengthofLastWord(String s) {
         String str = s.trim();
         int count = 0;

         for (int i = str.length() - 1; i >= 0; i--) {
             if (str.charAt(i) != ' ') {
                 count++;
             } else {
                 break;
             }

         }


         return count;
     }
}
