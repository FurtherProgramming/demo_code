package pracs.week01;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for input
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your favorite animal: ");
        String favoriteAnimal = scanner.nextLine();

        // Creating the secret agent name
        String agentCodeName = firstName + "_" + lastName + "_" + favoriteAnimal;

        // Displaying results
        System.out.println("\n=== Secret Agent Code Name ===");
        System.out.println("Generated Code Name: " + agentCodeName);
        System.out.println("Uppercase: " + agentCodeName.toUpperCase());
        System.out.println("Lowercase: " + agentCodeName.toLowerCase());
        System.out.println("Reversed: " + new StringBuilder(agentCodeName).reverse());

        // Closing scanner
        scanner.close();
    }
}
