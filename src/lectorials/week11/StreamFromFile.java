package lectorials.week11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamFromFile {
  public static void main(String[] args) throws IOException {
	  // Another way to get the stream
//	BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
//	Stream<String> lines = reader.lines();
	
	//source
	// Example of one element: "A,12,3.7" - String
	Stream<String> rows = Files.lines(Paths.get("data.txt"));
	 // "A,12,3.7" -> ["A", "12", "3.7"]
	rows.filter(line -> line.split(",").length == 3).
			filter(line -> Double.parseDouble(line.split(",")[2]) < 3.0).
			sorted((line1, line2) -> Double.compare(Double.parseDouble(line1.split(",")[2]), Double.parseDouble(line2.split(",")[2]))).
			forEach(System.out::println);


  }
}

