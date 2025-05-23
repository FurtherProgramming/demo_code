package lectorials.week11;

import java.util.*;

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>(Arrays.asList("Oranges", "Apples", "Pears", "Bananas"));
		Collections.sort(words, new Comparator<>() {
			public int compare(String o1, String o2) {
				// 1 -> o1 > o2
				// 0 -> o1 == o2
				// -1 -> o1 < o2
				return - o1.compareTo(o2);
			}
		});
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 1, -1, 20));
		Collections.sort(numbers, (o1, o2) -> {
			return - o1.compareTo(o2);
		});
		
		System.out.println(numbers);

	}

}
