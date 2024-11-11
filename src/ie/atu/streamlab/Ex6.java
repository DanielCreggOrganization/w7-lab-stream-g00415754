package ie.atu.streamlab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ex6 {
    public static void main(String[] args) {
        String inputPath = "resources/input.txt";

        try (Stream<String> lines = Files.lines(Paths.get(inputPath))) {
            lines.filter(line -> line.contains("Java"))
                 .map(String::trim)
                 .forEach(line -> System.out.println(line));
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        try(Stream<String> lines = Files.lines(Paths.get(inputPath))) {
            long count = lines.filter(line -> line.contains("Java")).count();
            System.out.println("Lines containing \"Java\":" + count);
            
            double averageLength = Files.lines(Paths.get(inputPath))
                                        .mapToInt(String::length)
                                        .average()
                                        .orElse(0.0);
            System.out.println("Average length: " + averageLength);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
