package pracs.week03;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        String userInputNoSpaces;
        int i;

        userInput = scnr.nextLine();
        userInputNoSpaces = "";

        for (i = 0; i < userInput.length(); ++i) {
            if ( Character.isLetter(userInput.charAt(i)) ){
                userInputNoSpaces += userInput.charAt(i);
            }
        }

        System.out.println(userInputNoSpaces);
    }

}
