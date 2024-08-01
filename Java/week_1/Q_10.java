import java.util.*;

class Q_10 {
	int number;

	public void swap(int n1, int n2) {
		System.out.println("Before swapping : \nA = " + n1 + " B = " + n2);
		int temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("\nAfter swapping : \nA = " + n1 + " B = " + n2);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Q_10 s1 = new Q_10();

		System.out.println("Enter 2 numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		s1.swap(n1, n2);
	}
}

// Output :

// Enter 2 numbers :
// 10
// 20
// Before swapping :
// A = 10 B = 20

// After swapping :
// A = 20 B = 10