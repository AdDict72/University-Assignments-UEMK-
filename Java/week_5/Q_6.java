package week_5;

import java.util.Scanner;

class Employe {
    private int empId;
    private String empName;
    private double basicSalary;

    public Employe(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    public double calculateGrossSalary() {
        // Assuming 10% of basic salary is given as allowance
        double allowance = 0.10 * basicSalary;
        double grossSalary = basicSalary + allowance;
        return grossSalary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Gross Salary: $" + calculateGrossSalary());
    }
}

public class Q_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Basic Salary: ₹");
        double basicSalary = sc.nextDouble();

        Employe employee = new Employe(empId, empName, basicSalary);
        employee.displayEmployeeDetails();

        sc.close();
    }
}
