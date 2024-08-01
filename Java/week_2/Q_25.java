public class Q_25 {
    public static void main(String[] args) {
        int rows = 4;

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print the number
            System.out.print(i);

            // Print additional spaces
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }

            // Print the number again for odd rows
            if (i != rows) {
                System.out.print(i);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
