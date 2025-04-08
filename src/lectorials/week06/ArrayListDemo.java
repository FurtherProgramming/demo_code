package lectorials.week06;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		array1.add(1);
		array1.contains(Integer.valueOf(1));

		for(int i=2; i < 5; i++) {
			array1.add(i);
		}
		System.out.println(array1);
		
		System.out.println(array1.contains(1));
		System.out.println("Index of 2 is: " + array1.indexOf(2));
		
		array1.remove(1);
		System.out.println(array1);
		System.out.println("Index of 2 is: " + array1.indexOf(2));
		
		array1.remove(Integer.valueOf(1));
		System.out.println(array1);
		// initialization
		ArrayList<Integer> array2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)); 
	}

}
