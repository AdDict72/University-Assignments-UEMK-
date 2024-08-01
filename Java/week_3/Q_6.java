/* Write a Java program to search an element in an array.*/
public class Q_6{
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int searchElement = 30;
        boolean found = false;


        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                System.out.println("Element " + searchElement + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
    }
}
