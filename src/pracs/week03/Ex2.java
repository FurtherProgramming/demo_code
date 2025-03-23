package pracs.week03;

import java.util.Scanner;

public class Ex2 {
    public static double getAvgMark(int mark1, int mark2, int mark3){
        return (mark1 + mark2 + mark3) / 3.0;
    }

    public static double getMaxScore(int mark1, int mark2, int mark3){
        return Math.max(Math.max(mark1, mark2), mark3);
    }

    public static double getMinScore(int mark1, int mark2, int mark3){
        return Math.min(Math.min(mark1, mark2), mark3);
    }

    public static void main(String[] args) {
        // read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mark of the first student:");
        int mark1 = scanner.nextInt();

        System.out.println("Enter the mark of the second student:");
        int mark2 = scanner.nextInt();

        System.out.println("Enter the mark of the third student:");
        int mark3 = scanner.nextInt();

        // calculation
        double avgScore = getAvgMark(mark1, mark2, mark3);
        double maxScore = getMaxScore(mark1, mark2, mark3);
        double minScore = getMinScore(mark1, mark2, mark3);

        // print out results
        System.out.printf("The average score is %5.2f, the minimum score is %5.2f, and the maximum score is %5.2f.", avgScore, minScore, maxScore);

    }

}
