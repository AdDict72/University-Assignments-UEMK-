package week_5;
// Create a “circle” class & a “point” class. The coordinates of the circle are given and used within the “circle” class as object of the “point” class. Display the area of circle.

import java.lang.Math;
import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }
}

public class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Coordinates of the Circle: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Point center = new Point(x, y);
        System.out.println("Enter the Radius of the Circle: ");
        double radius = sc.nextDouble();
        sc.close();
        Circle circle = new Circle(center, radius);

        System.out.println("Circle Center: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Circle Radius: " + circle.getRadius());
        System.out.print("Circle Area: ");
        System.out.printf("%.3f", circle.calculateArea());
    }
}
