package week_5;

import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private int sub1;
    private int sub2;

    public Student(String name, int rollNo, int sub1, int sub2) {
        this.name = name;
        this.rollNo = rollNo;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }

    public int calculateTotalMarks() {
        return sub1 + sub2;
    }

    public double calculatePercentage() {
        int totalMarks = calculateTotalMarks();
        return (totalMarks / 2.0); // Assuming each subject is out of 100
    }
}

public class Q_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details of the student:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll: ");
        int roll = sc.nextInt();
        System.out.print("Sub 1 Number: ");
        int sub1 = sc.nextInt();
        System.out.print("Sub 2 Number: ");
        int sub2 = sc.nextInt();
        sc.close();
        Student student = new Student(name, roll, sub1, sub2);

        student.displayStudentDetails();
        System.out.println("Total Marks: " + student.calculateTotalMarks());
        System.out.println("Percentage Scored: " + student.calculatePercentage() + "%");
    }
}
