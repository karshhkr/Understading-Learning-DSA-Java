package com.example.DSA.java.collectionframework.ListInteface.Set;

import java.util.*;

class Student{
    int rollno;
    String name;
    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
// we generate hascode , equals method to perform for custom obj
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollno);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
public class set1 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("karshkr",1));
        set.add(new Student("kiwi",2));
        set.add(new Student("karshkr",1));

        System.out.println(set.toString());



       // Set<Integer> set = new HashSet<>();
      //  Set<Integer> set = new LinkedHashSet<>(); // in this element is linked in order , O(n)
//        Set<Integer> set = new TreeSet<>(); // using binary search tree use to sort the element we get // TC: O(log(n)
//Set<String> set1 = new HashSet<>();
//
//set1.add("anuj");
//set1.add("anuj");
//set1.add("karshkr");
//set1.add("kiwi");
//        System.out.println(set1);


//        set.add(18);
//        set.add(12);
//        set.add(37);
//        set.add(18);
//        set.add(12);
//        //remove duplicates
//        System.out.println(set);
//        set.remove(12);
//
//        System.out.println(set);
//
//        System.out.println(set.contains(42));



    }
}
