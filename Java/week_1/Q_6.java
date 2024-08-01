import java.util.*;

class Q_6 {
	static final double pi = 3.14;

	public void area(double radius) {
		System.out.println("Area = " + (pi * radius * radius));
	}

	public void perimeter(double radius) {
		System.out.println("Perimeter = " + (float) (2 * pi * radius));
	}

	public static void main(String[] args) {
		Q_6 c1 = new Q_6();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		double radius = sc.nextDouble();

		c1.area(radius);
		c1.perimeter(radius);
	}
}

// Output :

// Enter the radius of the circle : 10
// Area = 314.0
// Perimeter = 62.8