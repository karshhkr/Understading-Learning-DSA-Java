package com.example.DSA.java.Conditions_loops;

import org.springframework.http.converter.json.GsonBuilderUtils;
import java.util.*;
public class Main {
    /*
    syatx of if statement :
    i (boolean expression t or f ){
    //body}
    else{
    //do this
    }
     */

    public static void main(String[] args) {
        int salary = 25400;

        if (salary > 10000) {
            salary = salary + 20000;
        } else {
            salary = salary + 10000;
        }

        System.out.println(salary); // ab sahi jagah par hai
    }
}


