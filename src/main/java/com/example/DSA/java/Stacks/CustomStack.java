package com.example.DSA.java.Stacks;

public class CustomStack { //Dynamic stack
   protected int [] data;
   private static final int DEFAULT_SIZE=10;//no size given then its 10 as default

  int ptr=-1; //stack empty no elements



   public CustomStack(){ // constructor
  this(DEFAULT_SIZE);
   }
   public CustomStack(int size){ //main constructor
       this.data=new int[size];
   }

   //push
   public boolean push(int item){
       if(isFull()){ //checkiffull
           System.out.println("Stack is full");
           return false;
       }
       ptr++; //top ko aage leke aao
       data[ptr]=item; //stored value
       return true;
   }

   //pop
   public int pop() throws StackException{
       if(isEmpty()){
           throw new StackException("Stack is empty cannot pop");
       }
return data[ptr--];
   }

   //peek
   public int peek() throws StackException {
       if (isEmpty()) {
           System.out.println("stack is empty cannot peek");
       }
       return   data[ptr];

       }


    public boolean isFull() {
       return ptr ==data.length-1; // last index --> full stack
    }
    private boolean isEmpty(){
       return ptr ==-1; // --> no elements
    }
}
