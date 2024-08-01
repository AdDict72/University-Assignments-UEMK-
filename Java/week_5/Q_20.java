package week_5;

import java.util.Scanner;

public class Q_20 {
    public static void main(String[] args) {
        // Define an array to store sales for each day of the week
        float[] sales = new float[7];

        // Accept sales values for each day of the week
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter sales for day " + (i + 1) + ": ");
            sales[i] = scanner.nextFloat();
        }
        scanner.close();

        // Calculate the total sales for the week
        float totalSales = 0;
        for (float sale : sales) {
            totalSales += sale;
        }

        // Calculate the average sale for the week
        float averageSale = totalSales / 7;

        // Display the average sale for the week
        System.out.println("Average sale for the week: " + averageSale);
    }
}
