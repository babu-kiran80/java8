package map_reduce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapReduceExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);

        List<String> words = Arrays.asList("corejava", "spring", "hibernate");

        //List<Integer> list = Arrays.asList(2, 4, 6, 8, 10); 
        
        numbers.stream()
            .forEach( System.out::print );
        System.out.println("");
        
        numbers.stream()
        .forEachOrdered( System.out::print );
        System.out.println("");
        
        System.out.print("Sort : ");
        numbers.stream().sorted().forEach(System.out::print);
        System.out.println("");
                
        reverseSort(numbers);
        
        int sum = 0;
        for (int no : numbers) {
            sum = sum + no;
        }
        System.out.println(sum);
        
        int sum1 = numbers.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);

        Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("reduceSum: " +reduceSum);

        Optional<Integer> reduceSumWithMethodReference = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodReference.get());

        Integer mulResult = numbers.stream().reduce(1, (a, b) -> a * b);
        //System.out.println(mulResult);

        Integer maxvalue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        //System.out.println(maxvalue);

        Integer maxvalueWithMethodReference = numbers.stream().reduce(Integer::max).get();
        //System.out.println(maxvalueWithMethodReference);


        String longestString = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        //System.out.println(longestString);

        //get employee whose grade A
        //get salary
        double avgSalary = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();

        System.out.println(avgSalary);

        double sumSalary = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println(sumSalary);
        
        double sumSalaryWithReduce = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .reduce((double) 0, (a,b)->a+b);
        System.out.println(sumSalaryWithReduce);
        
    }

	private static void reverseSort(List<Integer> list) {
		
		Comparator<Integer> reverseComparator = new Comparator<Integer>() {
          @Override
          public int compare(Integer i1, Integer i2) {
            return i2.compareTo(i1);
          }
        }; 

		/*
		 * List<Integer> sortedList = list.stream().sorted(reverseComparator)
		 * .collect(Collectors.toList());
		 */
        
        				//or - Below can be done for primitive types
        
		
		  List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).toList();
		 
        
        System.out.println("ReverseOrder" + sortedList);
	}


}
