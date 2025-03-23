package pracs.week01;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        // Ask the user to get first name, last name, and student number
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scan.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scan.nextLine();
        System.out.print("Enter your student number: ");
        String studentNumber = scan.nextLine();


        // Display information
        System.out.println("Wecome to RMIT, " + firstName + " " + lastName + "! Your student number is " + studentNumber + ".");

        // Close the scanner
        scan.close();
    }
}
