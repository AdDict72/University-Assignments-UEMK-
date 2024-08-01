/* Write a Java program to calculate Sum of two 2-dimensional arrays. */

import java.util.Scanner;

public class Q_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        int[][] array1 = new int[rows][columns];
        int[][] array2 = new int[rows][columns];

        System.out.println("Enter the elements of the 1st 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the 2nd 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array2[i][j] = sc.nextInt();
            }
        }


        int[][] SumArr = new int[rows][columns];
        for(int i = 0; i<rows ; i++){
            for(int j = 0; j<columns ; j++){
                SumArr[i][j] = array1[i][j]+array2[i][j];
            }
        }

        System.out.println("Sum of the arrays:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(SumArr[i][j] + " ");
            }
            System.out.println();
        }
    }    
}