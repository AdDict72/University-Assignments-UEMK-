package week_5;

import java.util.Scanner;

public class Q_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the investment amount and the annual interest rate
        System.out.print("Enter the investment amount: ");
        double investmentAmount = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble() / 100; // Convert percentage to decimal

        // Display table header
        System.out.println("\nYears\tFuture Value");
        System.out.println("-------------------");

        // Calculate and display future value for the years from 1 to 30
        for (int years = 1; years <= 30; years++) {
            double futureValue = calculateFutureValue(investmentAmount, annualInterestRate, years);
            System.out.printf("%-5d\t%.2f%n", years, futureValue);
        }

        scanner.close();
    }

    // Method to calculate the future value based on the investment amount, annual
    // interest rate, and years
    public static double calculateFutureValue(double investmentAmount, double annualInterestRate, int years) {
        return investmentAmount * Math.pow(1 + annualInterestRate, years);
    }
}
