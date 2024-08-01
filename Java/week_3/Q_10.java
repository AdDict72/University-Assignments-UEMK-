/*Write a Java program to enter n elements in an array and find smallest number among them.*/

import java.util.Scanner;

class smallNumber{
    void smallNum(int arr[], int size){
        int smallNum=arr[0];
        for(int i = 0 ; i < size-1 ; i++){
            if(arr[i]>arr[i+1]){
                smallNum=arr[i+1];
            }
        }
        System.out.println("The smallest number is : " + smallNum);
    }
}
public class Q_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");     
        int size =  sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the elements one by one : ");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        smallNumber sn = new smallNumber();
        sn.smallNum(arr, size);
    }
}
