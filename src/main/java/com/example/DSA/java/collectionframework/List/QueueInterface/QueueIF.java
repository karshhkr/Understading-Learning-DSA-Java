package com.example.DSA.java.collectionframework.List.QueueInterface;


import java.util.LinkedList;
import java.util.Queue;

public class QueueIF {
    public static void main(String[] args) {
     Queue<Integer> q = new LinkedList<>();// its implement through linkendlist
     q.offer(1);
     q.offer(2);
     q.offer(3);
        System.out.println(q);
//        System.out.println(q.poll());
//        System.out.println(q.peek());
//        System.out.println(q);


        //using while loop
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
        System.out.println(q.poll());// empty queue give null if poll
      //    System.out.println(q.remove());// it throws exception
    }
}
