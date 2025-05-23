package lectorials.week11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ArrayStream {
	  public static void main(String[] args) throws IOException {
		List<Integer> numbers = Arrays.asList(1, 2, 1, -1);
		Stream<Integer> myStream = numbers.stream();
		// print total length using count()
		int count = (int) myStream.count();
		System.out.println(count);
		
		// forEach
		myStream = numbers.stream();
		myStream.filter(x -> x>0).skip(1).map(x -> x+1).forEach(x -> System.out.println(x));	
		// max
		myStream = numbers.stream();
		myStream.map(x -> x * x).filter(x -> x<0).max((o1, o2) -> o1.compareTo(o2)).
		ifPresentOrElse(x -> System.out.println(x), () -> System.out.println("Empty Stream"));

		
		// reduce the stream
		myStream = numbers.stream();
		int sum = myStream.reduce(-1, Integer::sum);
		
		System.out.println(sum);

				
		// sorting
	
	  }
}
