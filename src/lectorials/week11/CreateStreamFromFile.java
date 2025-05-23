package lectorials.week11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamFromFile {
	  public static void main(String[] args) throws IOException {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		numbers.stream().forEach(x -> System.out.println(x));
		
		Stream<String> lines = Files.lines(Paths.get("data.txt"));
		lines.forEach(x -> System.out.println(x));
		
				
	  }
	}
