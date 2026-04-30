package com.example.DSA.java.collectionframework.ListInteface.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiDArrayListExample {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ArrayList<Integer>> list = new ArrayList<>();


///  initailization of the list
        for (int i = 0; i < 3; i++)// three list added in arraylist
        {
            list.add(new ArrayList<>());///add the new arraylist
        }



       ///// //add elements//////
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }

            {

            }
        }
        System.out.println(list);
    }
}