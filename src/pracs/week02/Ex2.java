package pracs.week02;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for password
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        // Evaluate password strength
        String strength = checkPasswordStrength(password);

        // Print result
        System.out.println("Password Strength: " + strength);

        scanner.close();
    }

    public static String checkPasswordStrength(String password) {
        int length = password.length();
        boolean hasLetter = false, hasDigit = false, hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isLetter(ch)) hasLetter = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else if ("!@#$%^&*".contains(String.valueOf(ch))) hasSpecial = true;
        }

        // Branching logic for password strength
        if (length < 6 || (!(hasDigit && hasLetter) && !hasSpecial)) {
            return "Weak";
        } else if (length > 10 && hasLetter && hasDigit && hasSpecial) {
            return "Strong";
        } else {
            return "Moderate";
        }
    }
}

