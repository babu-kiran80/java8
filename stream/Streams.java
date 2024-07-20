package stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<List<String>> countries = Arrays.asList(Arrays.asList("0", "", "", "cuba"),
				Arrays.asList("1", "", "", "", "china"), Arrays.asList("2", "", "", "", "cuba"),
				Arrays.asList("3", "", "", "", "turky"), Arrays.asList("3", "", "", "", "china"),
				Arrays.asList("3", "", "", "", "china"));

		System.out.println("** " + countries);
		 printCountOfCountries(countries);
		 
		 
			String s = "Hello, How are you";
			
			char ch = 'H';
			long count = s.chars().filter(i->i==ch).count();
			
			System.out.println("Count of a character '" + ch + "' in the string '"+s+"' : " + count);
			
	        Map<Character, Long> charCount = s.chars()
	                .mapToObj(c -> (char) c) // Convert int stream to char stream
	                .collect(Collectors.groupingBy(
	                        Function.identity(), // Group by the characters themselves
	                        Collectors.counting() // Count the occurrences of each character
	                ));
		 
	        System.out.println("Count of all characters in the string '"+s+"' : " + charCount);
	        
	        
	        String words = "Hello alan i am here where are you"+"and what are you doing hello are you there";
	        
	        //Arrays.asList(words.split(" ")).stream().map(String::toUpperCase).forEach(System.out::println);
	        
	        Map<String, Long> countOfWords = Arrays.asList(words.split(" ")).stream()
	        		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	        
	        System.out.println("Count of all words in the string '"+s+"' : " + countOfWords);
	        
		 
	}

	
	  private static void printCountOfCountries(List<List<String>> countries) {
	  
	  List<String> countryList = countries.stream().flatMap(c -> c.stream()).toList(); 
	  
	  for(String s : countryList) {
		  System.out.println("Streams.printCountOfCountries() : " + s);
	  };
	  
      
      // Create a map to store counts
      Map<String, Integer> counts = new HashMap<>();
	  // Iterate through the list and count occurrences
	  countryList.stream().forEach(s -> counts.put(s, counts.getOrDefault(s, 0) + 1));
	  
		/*
		 * Map<String, Long> counts = countryList.stream()
		 * .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		 */
	          
      counts.entrySet().stream()
      .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
	  
	  }

}
