package week_5;

import java.util.Scanner;

class Fraction {
    private int numerator;
    private int denominator;

    // Constructor to initialize with numerator and denominator
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Constructor to initialize with only numerator (denominator defaults to 1)
    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    // Default constructor (numerator and denominator both default to 0)
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public double getFractionalValue() {
        return (double) numerator / denominator;
    }
}

public class Q_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Fraction: ");
        System.out.print("Numerator: ");
        int numerator = sc.nextInt();
        System.out.print("Denominator: ");
        int denominator = sc.nextInt();

        // Initializing objects using different constructors
        Fraction fraction1 = new Fraction(numerator, denominator); // Fraction 3/4
        System.out.println("Enter 2nd Fraction: ");
        System.out.print("Numerator: ");
        numerator = sc.nextInt();
        sc.close();
        Fraction fraction2 = new Fraction(numerator); // Fraction 5/1
        Fraction fraction3 = new Fraction(); // Fraction 0/0 (Invalid, but for demonstration)

        // Displaying fractional values
        System.out.println("Fraction 1: " + fraction1.getFractionalValue());
        System.out.println("Fraction 2: " + fraction2.getFractionalValue());
        System.out.println("Fraction 3: " + fraction3.getFractionalValue());
    }
}
