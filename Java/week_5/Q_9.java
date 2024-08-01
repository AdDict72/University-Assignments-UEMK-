package week_5;

import java.util.Scanner;

class Tender {
    private double cost;
    private String companyName;

    public Tender(double cost, String companyName) {
        this.cost = cost;
        this.companyName = companyName;
    }

    public double getCost() {
        return cost;
    }

    public String getCompanyName() {
        return companyName;
    }
}

public class Q_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tender[] tenders = new Tender[5];

        // Accepting data for five objects
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter cost for tender " + (i + 1) + ":");
            double cost = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter company name for tender " + (i + 1) + ":");
            String companyName = scanner.nextLine();

            tenders[i] = new Tender(cost, companyName);
        }

        // Finding the tender with minimum cost
        Tender minCostTender = tenders[0];
        for (int i = 1; i < tenders.length; i++) {
            if (tenders[i].getCost() < minCostTender.getCost()) {
                minCostTender = tenders[i];
            }
        }

        // Displaying the company name for the tender with minimum cost
        System.out.println("Company Name for Minimum Cost Tender: " + minCostTender.getCompanyName());

        scanner.close();
    }
}
