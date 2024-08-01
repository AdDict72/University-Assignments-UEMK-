import java.util.Scanner;

public class Q_7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range of natural numbers: ");
        int range = scanner.nextInt();
        int sum = calculateSum(range);
        System.out.println("Sum of natural numbers up to " + range + " is: " + sum);       
        scanner.close();
    }
    
    public static int calculateSum(int range) {
        int sum = 0;
        for (int i = 1; i <= range; i++) {
            sum += i;
        }
        return sum;
    }
}
