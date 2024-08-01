package week_5;

import java.util.Scanner;

class ThreeDigitNumber {
    private int num;

    public ThreeDigitNumber(int num) {
        if (num >= 100 && num <= 999) {
            this.num = num;
        } else {
            System.out.println("Error: The number must be a 3-digit number.");
            System.exit(0);
        }
    }

    public void displayReverse() {
        int originalNum = num;
        int reverse = 0;

        while (originalNum != 0) {
            int digit = originalNum % 10;
            reverse = reverse * 10 + digit;
            originalNum /= 10;
        }

        System.out.println("Original Number: " + num);
        System.out.println("Reverse Number: " + reverse);
    }
}

public class Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        sc.close();
        ThreeDigitNumber number = new ThreeDigitNumber(num);
        number.displayReverse();
    }
}
