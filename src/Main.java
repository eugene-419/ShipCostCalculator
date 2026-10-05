import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double itemCost = 0;
        double shipCost = 0;
        double totalCost = 0;

        final double FREE_SHIP_LIMIT = 100;
        final double SHIP_RATE = 0.02;

        String newLine = "";
        String trash = "";

        // Input the item price
        // If the item price is $100 or more, shipping is free
        // Otherwise, calculate shipping as 2% of the item price
        // Calculate the total cost
        // Display the shipping cost and total cost

        System.out.print("Enter the price of your item in USD: ");

        if (in.hasNextDouble()) {

            itemCost = in.nextDouble();
            newLine = in.nextLine();

            if (itemCost >= FREE_SHIP_LIMIT) {
                shipCost = 0;
            } else {
                shipCost = itemCost * SHIP_RATE;
            }

            totalCost = itemCost + shipCost;

            System.out.printf("Your shipping cost is: $%.2f%n", shipCost);
            System.out.printf("Your total cost is: $%.2f%n", totalCost);

        } else {

            trash = in.nextLine();
            System.out.println("Invalid Item Price: " + trash);
        }
    }
}