package lectorials.week02;

import java.util.Scanner;

public class WithdrawManager {
    public static void main(String[] args) {
        // Get balance
        System.out.println("Enter the balance: ");
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();

        //Get withdraw amount
        System.out.println("Enter how much you want to withdraw: ");
        int amount = sc.nextInt();

        // Eligibility check
//        if (balance >= amount) {
//            // sufficient balance
//            // Computation
//            balance = balance - amount;
//            System.out.println("Withdraw Successful");
//        }
//            balance -= amount;
        int remainingBalance = balance >= amount?balance - amount:balance;
        String message = balance >= amount?"Withdraw Successful":"Withdraw Failed";
        System.out.println(message);
        // Print out result
        System.out.println("Your new balance is: " + remainingBalance);



    }
}
