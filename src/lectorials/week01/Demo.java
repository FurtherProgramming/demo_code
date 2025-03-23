package lectorials.week01;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int i; // Declare
        i = 0; // Initialization

        i = 2;
        long j = i;
        double d = 1.0;
//        float x = (float)d;
//        float y = 1.0f;
//        char z = 'a';
//        String name = "Hello";
//
//        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
//        name = scanner.nextLine();
//        System.out.println("Thank you! " + name);
//
//        System.out.println("Enter your grade for AP:");
//
//        double grade = scanner.nextDouble();
//        System.out.println("Your grade is " + grade);

        String message = scanner.next();
        System.out.println("First scan" + message);
        message = scanner.nextLine();
        System.out.println("Second scan" + message);


    }
}
