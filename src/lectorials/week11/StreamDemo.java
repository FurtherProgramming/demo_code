package lectorials.week11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {
  public static void main(String[] args) throws IOException {
//	BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
//	Stream<String> lines = reader.lines();
	
	
	Stream<String> rows = Files.lines(Paths.get("data.txt"));
	// Your code goes here
	rows.map(x -> x.split(",")).
	filter(x -> x.length == 3).filter(x -> Double.parseDouble(x[2]) < 3.0).sorted((x1, x2) -> Double.compare(Double.parseDouble(x1[2]), Double.parseDouble(x2[2])))
			.forEach(System.out::println);
	
	rows.close();
  }
}

