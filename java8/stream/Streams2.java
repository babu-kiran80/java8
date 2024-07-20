package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Streams2 {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	
		generateStream();
		
		printEven(numbers);
	}

	private static void generateStream() {
		Stream<Integer> randomNumbers = Stream
	      .generate(() -> (new Random()).nextInt(100));

		randomNumbers.limit(5).forEach(System.out::println);
	}

	private static void printEven(List<Integer> numbers) {
		// Using a Stream to filter even numbers and then double them
		List<Integer> evenNumber = numbers.stream().filter(n -> n % 2 == 0) // Filter even numbers
				.toList(); // Collect the results into a new list

		System.out.println("Even Numbers List: " + evenNumber); // [2, 4, 6, 8, 10]
	}

}
