/* Write a Java program to implement stack using array. */
import java.util.Scanner;
class stack{
    int maxSize;
    int[] arr;
    int top;

    stack(int size){
        this.maxSize = size;
        this.arr = new int[maxSize];
        this.top = -1;
    }

    public void push(int value){
        if(top == maxSize-1){
            System.out.println("The stack is full...!!");
        }
        else{
            top++;
            arr[top] = value;
            System.out.println("The Element pushed : " + value);
        }
    }
    public void pop(){
        if(top == -1){
            System.out.println("The stack is empty...!!");
        }
        else{
            System.out.println("Top elemet deleted : " + arr[top]);
            top--;
        }
    }
    public void peek(){
        if(top == -1){
            System.out.println("The stack is empty...!!");
        }
        else{
            System.out.println("Top elemet : " + arr[top]);
        }
    }
    public void display(){
        if(top == -1){
            System.out.println("The stack is empty...!!");
        }
        else{
        System.out.print("TOP --> | ");
        for(int i = top ; i>= 0; i-- ){
            System.out.print( arr[i] + " | " );
        }
        System.out.print("<--END");
        System.out.println();
        }
    }
}
public class Q_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");     
        int size =  sc.nextInt();
        stack stack = new stack(size);
        
        int val;
        System.out.println("Enter the elements one by one : ");
        for(int i =0;i<size;i++){
            val = sc.nextInt();
            stack.push(val);
        }
        stack.display();
        stack.peek();
        stack.pop();
        stack.display();
    }

    
}
