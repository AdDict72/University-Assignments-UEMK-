package week_5;

import java.util.Scanner;

public class Q_16 {
    private double[] numbers;

    public Q_16() {
        numbers = new double[10];
    }

    public void readNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
        }
        scanner.close();
    }

    public double calculateAverage() {
        double sum = 0;
        for (double number : this.numbers) {
            sum += number;
        }
        return sum / this.numbers.length;
    }

    public int countAboveAverage() {
        double average = this.calculateAverage();
        int count = 0;
        for (double number : this.numbers) {
            if (number > average) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Q_16 averageAndAbove = new Q_16();
        averageAndAbove.readNumbers();

        double average = averageAndAbove.calculateAverage();
        int countAboveAverage = averageAndAbove.countAboveAverage();

        System.out.println("Average of the numbers: " + average);
        System.out.println("Numbers above the average: " + countAboveAverage);
    }
}
