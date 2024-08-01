import java.util.*;

class Q_7 {
	int number;

	public void check(int number) {
		if (number > 0) {
			if (number % 2 == 0) {
				System.out.println(number + " is a even number.");
			} else {
				System.out.println(number + " is a odd number.");
			}
		} else {
			System.out.println("Please enter a positive number or number should be greater than 0.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q_7 oe = new Q_7();
		System.out.println("Enter a number : ");
		int number = sc.nextInt();

		oe.check(number);
	}
}

// Output :

// Enter a number :
// 12
// 12 is a even number.

// Enter a number :
// 9
// 9 is a odd number.