package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Circle.PI=3.14;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Write radius of circle: ");
        Circle.radius = scanner.nextInt();
    Circle.area();
    Circle.circumference();
    }
}
