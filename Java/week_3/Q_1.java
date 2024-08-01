/*Write a Java program to calculate Sum & Average of an integer array. */
import java.util.Scanner;
class sum_and_avg{
    public int  CalSum(int arr[],int s){
        int sum=0;
        for(int i =0;i<s;i++){
            sum = sum+arr[i];            
        }        
        return sum;
    }
    public void calAvg(int sum,int s){
        int avg=sum/s;  
        System.out.println("The avg. of the array : " + avg);
    }
}
public class Q_1 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");     
        int size =  sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements one by one : ");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        sum_and_avg sa = new sum_and_avg();
        int sum = sa.CalSum(arr,size);
        System.out.println("The sum of the array : " + sum);
        sa.calAvg(sum,size);
    }
}
