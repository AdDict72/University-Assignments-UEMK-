/*Write a Java program to find the sum of diagonal elements in a 2D array.*/

public class Q_8 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},{4,8,6},{7,8,9}
        };
        int rows = arr.length;
        int columns = arr[0].length;

        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;

        for(int i = 0 ; i < rows; i++){
            firstDiagonalSum = firstDiagonalSum + arr[i][i];
        }
        for(int i = 0 ; i < rows; i++){
            secondDiagonalSum = secondDiagonalSum + arr[i][columns-1-i];
        }

        System.out.println("Sum of first daigonal : " +  firstDiagonalSum);
        System.out.println("Sum of second daigonal : " + secondDiagonalSum);
        
    }
}
