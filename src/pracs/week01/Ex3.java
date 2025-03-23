package pracs.week01;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for input
        System.out.print("Enter the total bill amount ($): ");
        double billAmount = scanner.nextDouble();

        System.out.print("Enter the tip percentage (%): ");
        double tipPercentage = scanner.nextDouble();

        // Calculations
        double tipAmount = (tipPercentage / 100) * billAmount;
        double totalAmount = billAmount + tipAmount;

        // Displaying results
        System.out.println("\n=== Tip Calculation ===");
        System.out.printf("Tip Amount: $%.2f\n", tipAmount);
        System.out.printf("Total Amount to Pay: $%.2f\n", totalAmount);

        // Closing scanner
        scanner.close();
    }
}

