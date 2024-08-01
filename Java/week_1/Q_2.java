import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int num_1 = in.nextInt();
        System.out.print("Enter Second Number: ");
        int num_2 = in.nextInt();
        in.close();

        System.out.println("SUM = " + (num_1 + num_2));
    }
}
