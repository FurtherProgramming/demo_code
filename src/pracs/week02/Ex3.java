package pracs.week02;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an expression (e.g., 10 + 5): ");
        String input = scanner.nextLine().trim();

        // Process input
        String[] parts = input.split("\\s+"); // Split by spaces

        // Validate input
        if (parts.length != 3) {
            System.out.println("Invalid format! Please enter in 'number operator number' format.");
            return;
        }

        double num1 = Double.parseDouble(parts[0]);
        double num2 = Double.parseDouble(parts[2]);
        char operator = parts[1].charAt(0);

        // Perform calculation using branching
        double result;
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                return;
        }

        // Display result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
