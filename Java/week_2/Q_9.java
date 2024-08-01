import java.util.Scanner;
public class Q_9{
    public static void main(String[] args) {
        Scanner ml=new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=ml.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println(num+"*"+i+"="+num*i + "  ");
        }
        ml.close();
    }
}

