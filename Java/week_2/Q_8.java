import java.util.Scanner;
//multiple of 10 between a given interval
public class Q_8{
    public static void main(String[] args) {
        Scanner mul=new Scanner(System.in);
        System.out.println("Enter the starting Interval: ");
        int start=mul.nextInt();
        System.out.println("Enter the ending Interval: ");
        int end=mul.nextInt();
        
        System.out.println("Multiple of 10 between "+start+" and "+end);

        int firstMultiple= start%10==0 ? start:(start/10+1)*10;
        
        for(int i=firstMultiple;i<=end;i+=10){
            System.out.println(i);
        }
        mul.close();
    } 
}
