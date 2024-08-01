public class Q_3 {
    static void display(int num) {
        System.out.println("Displaying integer: " + num);
    }
  
    static void display(double num) {
        System.out.println("Displaying double: " + num);
    }

    static void display(String str, int num) {
        System.out.println("Displaying string and integer: " + str + ", " + num);
    }

    public static void main(String[] args) {
        display(10);
        display(10.5);
        display("Hello", 20);
    }
}
