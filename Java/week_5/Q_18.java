package week_5;

import java.util.Scanner;

class Square {
    private double side;

    Square(double side) {
        this.side = side;
    }

    double area() {
        return side * side;
    }
}

public class Q_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side of a Square: ");
        double side = sc.nextDouble();
        sc.close();
        Square sq = new Square(side);
        System.out.println("Area: " + sq.area());
    }
}