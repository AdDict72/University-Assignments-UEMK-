package week_5;

// import java.util.Scanner;
import java.util.Date;

class Account {
    private int id;
    private double balance;
    private static double annualInterestRate = 3; // Assume all accounts have the same interest rate
    private Date dateCreated;

    // No-arg constructor that creates a default account
    public Account() {
        id = 0;
        balance = 0;
        dateCreated = new Date();
    }

    // Constructor that creates an account with the specified id and initial balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    // Accessor method for id
    public int getId() {
        return id;
    }

    // Mutator method for id
    public void setId(int id) {
        this.id = id;
    }

    // Accessor method for balance
    public double getBalance() {
        return balance;
    }

    // Mutator method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Accessor method for annualInterestRate
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Mutator method for annualInterestRate
    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    // Accessor method for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    // Method to calculate and return the monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // Method to calculate and return the monthly interest
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    // Method to withdraw a specified amount from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Method to deposit a specified amount to the account
    public void deposit(double amount) {
        balance += amount;
    }
}

// public class Q_13 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter Id: ");
// int id = sc.nextInt();
// System.out.print("Enter Balance: ");
// double balance = sc.nextDouble();
// Account acc = new Account(id, balance);
// }

// }