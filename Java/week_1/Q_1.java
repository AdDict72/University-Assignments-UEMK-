import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        System.out.print("Enter Your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        System.out.println("My Name is " + name);
    }
}
