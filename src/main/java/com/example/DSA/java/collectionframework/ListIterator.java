package com.example.DSA.java.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        List<String> str =  new ArrayList<>();
        str.add("kiwi");
        str.add("karshkr");
        str.add("utkarsh");

        //using for loop
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }

        //using for each
        for(String s: str){
            System.out.println(str);
        }

        //using iterator from collection
        Iterator<String> iterator = str.iterator();
        while(iterator.hasNext()){ // when there is elelemnt print it
            System.out.println(iterator.next());
        }
}
}

