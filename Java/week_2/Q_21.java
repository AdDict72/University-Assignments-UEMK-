import java.util.Scanner;

public class Q_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the interval from the user
        System.out.print("Enter the starting number of the interval: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number of the interval: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        // Display prime numbers in the interval
        displayPrimeNumbers(start, end);

        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to display prime numbers within an interval
    public static void displayPrimeNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
