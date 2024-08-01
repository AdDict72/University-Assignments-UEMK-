package week_5;

import java.util.Scanner;

public class Q_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert the number to a string for easier manipulation
        String numberString = String.valueOf(number);

        // Initialize sum to store the result
        int sum = 0;

        // Iterate through the digits of the number and calculate the sum of consecutive
        // pairs
        for (int i = 0; i < numberString.length() - 1; i++) {
            // Extract consecutive pairs of digits
            String consecutiveDigits = numberString.substring(i, i + 2);
            System.out.print(consecutiveDigits + " + ");
            // Convert the consecutive digits back to integer and add to sum
            sum += Integer.parseInt(consecutiveDigits);
        }

        // Output the result
        System.out.println("\b\b= " + sum);

        scanner.close();
    }
}
