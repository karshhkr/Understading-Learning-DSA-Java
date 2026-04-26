package com.example.DSA.java.collectionframework.ComparableAndComparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal implements Comparable<Animal>{
    @Override
    public int compareTo(Animal that ) {
if(this.weight==that.weight)
    return this.weight=that.weight;
        return this.weight - that.weight;
    }

    String name;
    int weight;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}'+"\n";
    }

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
}
public class Main {
    public static void main(String[] args) {
Animal animal = new Animal("Dog", 10);
Animal animal1 = new Animal("Cat", 80);
Animal animal2 = new Animal("Bird", 30);
Animal animal3 = new Animal("Ant", 30);
Animal animal4 = new Animal("Pig", 40);

List<Animal> animals = new ArrayList<Animal>();
animals.add(animal);
animals.add(animal1);
animals.add(animal2);
animals.add(animal3);
animals.add(animal4);

        System.out.println(animals);

        //sorting the animals collection class mein meth sort
       Collections.sort(animals);
        System.out.println(animals);

    }

}
