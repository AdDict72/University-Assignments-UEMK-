import java.util.Scanner;

// 3. Write a Java program to change temperature from Celsius to Fahrenheit.
public class Q_3 {
    public static void main(String[] args) {
        System.out.print("Enter the Temperature in Celsius: ");
        Scanner in = new Scanner(System.in);
        float celsius = in.nextFloat();
        in.close();
        float fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("The temperature in Farenheit is: " + fahrenheit + "deg F");
    }
}
