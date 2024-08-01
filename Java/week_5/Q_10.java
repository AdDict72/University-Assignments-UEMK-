package week_5;

import java.util.Scanner;

class Employee {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[5];

        // Accepting data for five objects
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Employee ID for employee " + (i + 1) + ":");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Name for employee " + (i + 1) + ":");
            String name = scanner.nextLine();
            System.out.print("Enter Salary for employee " + (i + 1) + ":");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            employees[i] = new Employee(empId, name, salary);
        }

        // Printing the data for all employees
        System.out.println("\nEmployee Data:");
        System.out.println("Emp ID\tName\tSalary");
        System.out.println("-----------------------");
        for (Employee employee : employees) {
            System.out.println(employee.getEmpId() + "\t" + employee.getName() + "\t" + employee.getSalary());
        }

        scanner.close();
    }
}
