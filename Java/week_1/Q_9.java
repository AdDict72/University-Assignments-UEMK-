import java.util.*;

class Q_9 {
	int number;

	public void findMaximum(int n1, int n2, int n3) {
		if ((n1 > n2) && (n1 > n3)) {
			System.out.println(n1 + " is maximum.");
		} else if ((n2 > n3) && (n2 > n3)) {
			System.out.println(n2 + " is maximum.");
		} else {
			System.out.println(n3 + " is maximum.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q_9 find1 = new Q_9();

		System.out.println("Enter 3 numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		find1.findMaximum(n1, n2, n3);
	}
}

// Output :

// Enter 3 numbers :
// 45
// 56
// 10
// 56 is maximum.