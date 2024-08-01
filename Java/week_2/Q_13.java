import java.util.Scanner;
import java.lang.Math;
public class Q_13 {
    public static void main(String[] args) {
        Scanner ex=new Scanner(System.in);
        System.out.println("Enter the number: ");
        double num=ex.nextInt();
        System.out.println("Enter the exponent:");
        double expo=ex.nextInt();
        double result=Math.pow(num, expo);
        System.out.println("Result is: "+result);

        ex.close();
    }
}
