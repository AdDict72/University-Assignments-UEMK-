package week_5;

import java.util.Scanner;

public class Q_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the integers
        int[] numbers = new int[10];

        // Read ten integers from the user
        System.out.println("Enter ten integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Display the integers in reverse order
        System.out.println("Integers in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}
