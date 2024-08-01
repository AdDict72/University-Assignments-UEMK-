public class Q_23 {
    public static void main(String[] args) {
        int rows = 3;
        int number = 1;
        int count=1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print(number + " ");
                number++;
            }
            count = count+2;
            System.out.println();
        }
    }
}

