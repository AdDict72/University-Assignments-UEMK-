/**
 * Write a Java program to show the use of all keywords for exception handling
 */
import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter first number :");
            int a = sc.nextInt();
            System.out.println("Enter second number :");
            int b = sc.nextInt();

            int res = Divide(a,b);
            System.out.println("Result is : " + res);
        } catch (ArithmeticException e) {
            System.out.println("Error : " + e.getMessage());
        }
        finally{
            System.out.println("This part is executed in any situation....");
        }

        try {
            System.out.println("Enter Your age :");
            int age = sc.nextInt();
            AgeCheck(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Error : " +e.getMessage());
        }
    }

    public static int Divide(int a , int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Divide by zero....");
        }
        return a/b;
    }

    public static void AgeCheck(int age) throws IllegalArgumentException{
        if(age<0){
            throw new IllegalArgumentException("Age can't be negative....");
        }
        else{
            System.out.println("Your age is " + age);
        }
    }
   
}