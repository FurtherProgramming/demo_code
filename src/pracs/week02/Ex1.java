package pracs.week02;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter traffic light color (red, yellow, green): ");
        String color = scanner.nextLine().toLowerCase(); // Convert input to lowercase

        // Branching logic
        if (color.equals("red")) {
            System.out.println("Action: Stop!");
        } else if (color.equals("yellow")) {
            System.out.println("Action: Slow down!");
        } else if (color.equals("green")) {
            System.out.println("Action: Go!");
        } else {
            System.out.println("Invalid input! Please enter red, yellow, or green.");
        }

        scanner.close();
    }
}

