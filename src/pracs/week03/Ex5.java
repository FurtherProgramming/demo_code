package pracs.week03;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt;
        int sumInts;
        int numInts;
        int maxInt;

        sumInts = 0;
        numInts = 0;
        maxInt  = -1;

        userInt = scnr.nextInt();

        while (userInt >= 0) {
            sumInts = sumInts + userInt;
            numInts = numInts + 1;

            if (userInt > maxInt) {
                maxInt = userInt;
            }
            userInt = scnr.nextInt();
        }

        System.out.println(maxInt + " " + sumInts / numInts);
    }

}
