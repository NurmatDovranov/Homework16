package com.company;

public class Circle {
    public static double PI;
    public static int radius;

    public static void area(){
        System.out.println("Area of circle is: "+PI*(radius*radius));
    }
    public static void circumference(){
        System.out.println("Circumference of circle is: "+PI*2*radius);
    }
}
