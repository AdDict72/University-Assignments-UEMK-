package week_5;

import java.util.Scanner;

class Item {
    private String code;
    private double price;

    public Item(String code, double price) {
        this.code = code;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }
}

public class Q_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Item[] items = new Item[5];

        // Accepting data for five objects
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter code for item " + (i + 1) + ":");
            String code = scanner.nextLine();
            System.out.println("Enter price for item " + (i + 1) + ":");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            items[i] = new Item(code, price);
        }

        // Displaying data in tabular form
        System.out.println("Code\tPrice");
        System.out.println("--------------");
        double total = 0;
        for (Item item : items) {
            System.out.println(item.getCode() + "\t" + item.getPrice());
            total += item.getPrice();
        }
        System.out.println("--------------");
        System.out.println("Total\t" + total);

        scanner.close();
    }
}
