package com.example.DSA.java.Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class dequeue {
    public static void main(String[] args) {
        Deque<Integer> dequeue = new ArrayDeque<Integer>();
        dequeue.add(21);
        dequeue.addLast(62);
        dequeue.addFirst(73);

        System.out.println(dequeue.remove());
        System.out.println(dequeue.remove());
    }
}
