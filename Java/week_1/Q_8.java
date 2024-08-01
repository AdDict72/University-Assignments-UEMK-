import java.util.*;

class Q_8 {
	int number;

	public void check(int number) {
		if (number > 0) {
			System.out.println(number + " is a positive number.");
		} else if (number == 0) {
			System.out.println(number + " is neither positive nor negative.");
		} else {
			System.out.println(number + " is a negative number.");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q_8 pn = new Q_8();
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		pn.check(number);
	}
}

// Output :

// Enter a number:-1
// -1 is a negative number.

// Enter a number:2
// 2 is a positive number.

// Enter a number:0
// 0 is neither positive nor negative.