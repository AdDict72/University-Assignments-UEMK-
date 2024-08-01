package week_5;

import java.lang.Math;
import java.util.Scanner;

class Circle2 {
    private double radius;
    private String color;

    // Default constructor
    Circle2() {
        radius = 1.0;
        color = "red";
    }

    // Constructor with radius parameter
    Circle2(double radius) {
        this.radius = radius;
        color = "red";
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Q_11 {
    public static void main(String[] args) {
        // Using default constructor
        Circle2 circle1 = new Circle2();
        System.out.println("Circle 1 - Radius: " + circle1.getRadius() + ", Area: " + circle1.getArea());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle: ");
        double radius = sc.nextDouble();
        sc.close();
        // Using constructor with radius parameter
        Circle2 circle2 = new Circle2(radius);
        System.out.println("Circle 2 - Radius: " + circle2.getRadius() + ", Area: " + circle2.getArea());
    }
}
