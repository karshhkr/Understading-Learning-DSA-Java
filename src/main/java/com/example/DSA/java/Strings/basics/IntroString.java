package com.example.DSA.java.Strings.basics;

public class IntroString {
    public static void main(String[] args) {
//
//        String a ="karsh";
//      String   b="karsh";
//
//
//
//        System.out.println(a==b);



        String name1= new String("karsh");
        String name2= new String ("karsh");
          String c=name2;
        System.out.println(c==name2);
        System.out.println( name1 == name2);
        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(0));
    }

    ///  any value ro make clean and readble in output is pretty printing
    public static class PrettyPrinting {
        public static void main(String[] args) {
             float a= 435.987f;
            //System.out.printf("formated number is  %.2f", a);

    //        System.out.println(Math.PI);

          //  System.out.printf("pie: %.3f", Math.PI );

            System.out.printf("hello my name is %s and I am a %s ","karsh","coder");
        }
    }
}
