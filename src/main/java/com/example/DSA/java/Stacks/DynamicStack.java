package com.example.DSA.java.Stacks;

public class DynamicStack extends CustomStack{

//concept:-  Naya bada array banao
// Purane elements copy karo
// Continue karo

    public DynamicStack() { // when array is full its double size of the array and never be full

        super(); // calls parent class constructor
    }
    public DynamicStack(int size){
        super(size); //it will call CustonStack (int size)
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            //double the arrays size
            int[] temp = new int[data.length*2];

            //copy all previous item into new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];

            }
data=temp;
        }

         //inset items normally
        //array is not full so normal insertion

        return super.push(item);
    }
}
