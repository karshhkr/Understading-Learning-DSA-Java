package com.example.DSA.java.Stacks;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack();
        stack.push(25);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
