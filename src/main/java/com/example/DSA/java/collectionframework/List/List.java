package com.example.DSA.java.collectionframework.List;

import java.util.ArrayList;

public class List {  public static void main(String[] args) {
    java.util.List<Integer> list = new ArrayList<>(); // ArrayLsit is Dynamic in nature
    java.util.List<Integer> list2 = new ArrayList<>();// another List but of same type like Integer

    list.add(10);
    list.add(20);
    list.add(30);
//
//    list2.add(40);
//    list2.add(20);
//    list2.add(50);
//    list2.add(60);

    System.out.println(list);
/// / list interface method which is not in collection




//       //get
    System.out.println(list.get(0));

    System.out.println(list.indexOf(100));
//
//        //set
//        System.out.println(list.set(    1, 99));
//        System.out.println(list);
//
//        //add
//        list.add(2,1000);
//        System.out.println(list);
//
//       // remove
//        list.remove(2);



    //////

//// to check the size
//        System.out.println(list.size());
//        System.out.println(list.contains(10));
//


//revove
//       // System.out.println(list.remove(2));
//        list.remove(Integer.valueOf(1));

//
//
//        System.out.println(list);

//        list.addAll(list2);
//        list.retainAll(list2);// elements that are not present  in list




//convert list to Array

//        Object a[] =list.toArray();
//        for (Object o : a) {
//            Integer temp= (Integer)o;
//            System.out.println(temp);
//        }
//        System.out.println(list);

}

}
