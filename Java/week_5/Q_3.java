package week_5;

import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;

        System.out.println("Added Complex Number: " + newReal + " + " + newImaginary + "i");
    }
}

public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Complex Number");
        System.out.print("Real: ");
        double real = sc.nextInt();
        System.out.print("Imaginary: ");
        double imaginary = sc.nextInt();
        Complex c1 = new Complex(real, imaginary);
        System.out.println("Enter 2nd Complex Number");
        System.out.print("Real: ");
        real = sc.nextInt();
        System.out.print("Imaginary: ");
        imaginary = sc.nextInt();
        Complex c2 = new Complex(real, imaginary);
        sc.close();

        c1.add(c2);
    }
}
