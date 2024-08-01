import java.util.Scanner;

public class Q_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();
        double kilometers = miles * 1.60934;
        System.out.println("Distance in kilometers: " + kilometers + " km");

        scanner.close();
    }
}

// Output :

// Enter distance in miles: 6
// Distance in kilometers: 9.65604 km