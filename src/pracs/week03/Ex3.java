package pracs.week03;

import java.util.Scanner;

public class Ex3 {
    public static double milesToLaps(double userMiles) {
        return userMiles / 0.25;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double userMiles;

        userMiles = scnr.nextDouble();
        System.out.printf("%.2f", milesToLaps(userMiles));
    }

}
