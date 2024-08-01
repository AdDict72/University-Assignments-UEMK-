/**
 * Write a Java program using try and catch to generate NegativeArrayIndex Exception 
   and Arithmetic Exception.
 */
public class Q_2 {

    public static void main(String[] args) {
  
      try {
        int[] myArray = new int[-5];

      } catch (NegativeArraySizeException e) {
        System.out.println("\nError: Negative Array Index. Array index cannot be negative.");
      }
      try{
        int result = 10 / 0;
        System.out.println(result);

      }
      catch (ArithmeticException e) {
        System.out.println("\nError: Division by Zero. You cannot divide by zero.");
      }
      finally {
        System.out.println("\nThis block always executes.");
      }
    }
  }
  