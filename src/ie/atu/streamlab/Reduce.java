package ie.atu.streamlab;

import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int sum = numbers.stream()
                            .reduce(0, (a,b) -> a+b);
        System.out.println("Sum: " + sum); //output: Sum: 15

        int max = numbers.stream()
                            .reduce(Integer.MIN_VALUE, (a,b) -> Math.max(a, b));
        System.out.println("Max value: " + max); //output: Max value: 5

        List<String> words = Arrays.asList("Hello", " ", "World", "!");
        String combined = words.stream()
                                .reduce("", (a,b) -> a+b);
        System.out.println("Combined string: " + combined); //ouput: Combined string: Hello World!
    
        System.out.println();
        //Task 5 DIY
        List<Integer> nums = Arrays.asList(2,4,6,8,10);

        int product = nums.stream()
                            .reduce(1, (a,b) -> a*b);
        System.out.println("Product: " + product); //output: Sum: 30

        int min = nums.stream()
                        .reduce(Integer.MAX_VALUE, (a,b) -> Math.min(a,b));
        System.out.println("Min value: " + min); //output: Min value: 2


    
    
    }
}
