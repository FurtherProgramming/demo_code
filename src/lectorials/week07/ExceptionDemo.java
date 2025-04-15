package lectorials.week07;

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			
			String input = scanner.next();
			int size = Integer.parseInt(input); // number format
			ArrayList<Integer> array = new ArrayList<Integer>(size); // illegal argument 
		}catch(NumberFormatException e) {
			System.err.println("Please enter a valid number.");
		}catch(IllegalArgumentException e) {
			System.err.println("Can't initialize an array with a negative number.");
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.print("Continue the code");
	}

}
