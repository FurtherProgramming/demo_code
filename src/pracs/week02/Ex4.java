package pracs.week02;

import java.util.Scanner;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter your birth day (1-31): ");
        int day = scanner.nextInt();

        String zodiac = findZodiacSign(month, day);

        if (zodiac.equals("Invalid")) {
            System.out.println("Invalid date! Please enter a valid month and day.");
        } else {
            System.out.println("Your zodiac sign is: " + zodiac);
        }

        scanner.close();
    }

    public static String findZodiacSign(int month, int day) {
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) return "Aquarius \u2652";
        else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) return "Pisces \u2653";
        else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Aries \u2648";
        else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Taurus \u2649";
        else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return "Gemini \u264A";
        else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return "Cancer \u264B";
        else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return "Leo \u264C";
        else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return "Virgo \u264D";
        else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return "Libra \u264E";
        else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return "Scorpio \u264F";
        else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return "Sagittarius \u2650";
        else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) return "Capricorn \u2651";
        else return "Invalid"; // Invalid date
    }
}


