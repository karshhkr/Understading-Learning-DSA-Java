package com.example.DSA.java.collectionframework.MapInterface;

import java.util.Collection;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

map.put(1, "us");
map.put(2, "in");
        System.out.println(map);
//map.remove(1);
//map.containsKey(1);
//map.putIfAbsent(1, "us2");
//        System.out.println(map);
//        System.out.println(map.containsKey(1));
//
//        System.out.println(map.get(1));
//        System.out.println(map.getOrDefault(3,"others"));


        Set<Integer > keys = map.keySet();// give set of key
        System.out.println(keys);


Collection<String> values =map.values();// give collection of values
        System.out.println(values);

    }
}
