package com.example.DSA.java.collectionframework.ListInteface.QueueInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a); //its a comparator which make maxheap and making the priority high to large element



        pq.add(18);
        pq.add(12);
        pq.add(31);
        System.out.println(pq);// it remove the element which is smaller higher=st priority is of the small
        System.out.println(pq.poll());



    }
}
