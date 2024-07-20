package mapVsflatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {


    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725")),
                new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());
        
        //Stream of stream of stream 
//        return Stream.of(
//        new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725") , Arrays.asList(new Customer(1011, "john-jr1", "john-jr1@gmail.com", Arrays.asList("11111", "2222")),new Customer(1012, "john-jr2", "john-jr2@gmail.com", Arrays.asList("3333", "4444"))),
//        new Customer(102, "smith","smith@gmail.com", Arrays.asList("89563865", "2487238947") , Arrays.asList(new Customer(1012, "smith-jr1", "smith-jr1@gmail.com", Arrays.asList("5555", "666")),new Customer(1022, "smith-jr2", "smith-jr2@gmail.com", Arrays.asList("7777", "8888")))
//        ).collect(Collectors.toList());
    }


}
