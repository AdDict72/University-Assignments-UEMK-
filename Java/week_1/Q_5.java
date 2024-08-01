import java.util.Scanner;

// Write a Java program to find area and perimeter of a rectangle.
public class Q_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length and Breadth of the Rectangle: ");
        int len = sc.nextInt();
        int bre = sc.nextInt();
        sc.close();
        int area = len * bre;
        int perimeter = 2 * (len + bre);
        System.out.println("Area = " + area + ", Perimeter = " + perimeter);
    }
}
