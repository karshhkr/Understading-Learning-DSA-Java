package com.example.DSA.java.collectionframework.ListInteface.QueueInterface;

import java.util.ArrayDeque;

public class ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque< >();
        ArrayDeque<Integer> stack = new ArrayDeque< >(); // deque has stack behaviour due to insertion and deletion from both ends
//        ad.offer(19);
//        ad.offerLast(20);
//        ad.offerFirst(30);
//        System.out.println(ad);
//        System.out.println(ad.peek());
//
//        System.out.println(ad.pollLast());
//        System.out.println(ad);

// due to deque it has Stack  fifo

        stack.push(13);
        stack.push(26);
        stack.push(37);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);


        //ArrayDeque has queue implementation too
        ArrayDeque<Integer> q = new ArrayDeque< >();
        q.offer(53);
        q.offer(65);
        q.offer(71);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q);
    }
}
