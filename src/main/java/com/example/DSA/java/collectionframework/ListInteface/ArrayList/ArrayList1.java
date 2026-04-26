package com.example.DSA.java.collectionframework.ListInteface.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        //syntax
    //    ArrayList<Integer> list=new ArrayList<>();

        //Multi Dimenstional Array
        ArrayList<ArrayList<Integer>> list1=new ArrayList<>();


        // Initialization
        for(int i=0;i<3;i++)
        {
            list1.add(new ArrayList<>());
        }

        //adding Elements
        for (int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                list1.get(i).add(sc.nextInt());
//list.add(1);
//list.add(2);
        System.out.println(list1);



    }
}
