import java.util.Scanner;

public class Q_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is not divisible by 5.");
        }

        scanner.close();
    }
}

// Output :

// Enter a number: 25
// 25 is divisible by 5.

// Enter a number: 14
// 14 is not divisible by 5.