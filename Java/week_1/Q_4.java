// 3. Write a Java program to change temperature from Fahrenheit to Celsius.

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        System.out.print("Enter the Temperature in Fahrenheit: ");
        Scanner in = new Scanner(System.in);
        float fahrenheit = in.nextFloat();
        in.close();
        float celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("The temperature in Celsius is: " + celsius + " deg C");
    }
}
