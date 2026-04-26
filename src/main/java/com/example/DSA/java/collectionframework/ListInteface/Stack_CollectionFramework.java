package com.example.DSA.java.collectionframework.ListInteface;
import java.util.*;

public class Stack_CollectionFramework {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("a");
        st.push("b");
        st.push("c");
        System.out.println(st.pop());
        System.out.println(st);

        st.peek();// check the top element
        System.out.println(st.peek());
        System.out.println(st.empty()); //to check empty
        System.out.println(st.isEmpty());
    }
}
