package ie.atu.streamlab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, Java Streams!");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        /* 
        names.stream()
        .map(name -> name.toUpperCase())
        .forEach(name -> System.out.println(name));

        names.stream()
        .map(String::toUpperCase)
        .forEach(name -> System.out.println(name));
        */



        /*names.stream()
        .filter(name -> name.startsWith("A"))
        .forEach(name -> System.out.println(name));
        

        List<String> filteredNames = names.stream()
                                    .filter(name -> name.length() > 3)
                                    .sorted()
                                    .collect(Collectors.toList());

        filteredNames.forEach(name -> System.out.println(name));
        */
        //Task 2 DIY
        /*List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numbers.stream()
        .filter(number -> number % 2 !=0)
        .forEach(number -> System.out.print(number + ","));
        */


        //Task 3 DIY
        /* 
        List<String> fruits = Arrays.asList("apple", "banana", "grape", "kiwi", "oranage", "mango");

        List<String> filteredFruits = fruits.stream()
                                    .filter(fruit -> fruit.length() > 4)
                                    .sorted()
                                    .map(String::toUpperCase)
                                    .collect(Collectors.toList());

        filteredFruits.forEach(fruit -> System.out.println(fruit));
        */

        //Task 4 DIY
        /*List<Integer> nums = Arrays.asList(1,2,3,4,5);

        nums.stream()
        .sorted(Comparator.comparing(NumberUtils::doubleNumber));

        nums.forEach(System.out.println());
        */
    }
}
