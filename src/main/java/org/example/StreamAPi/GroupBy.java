package org.example.StreamAPi;
// Given a list of words, group them by their length and count
// the number of words in each group using Java Streams.
//Input: ["apple", "banana", "cherry", "date", "fig", "grape"]
//Output: {5=2, 6=2, 4=1, 3=1}


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

        Map<Integer, Long> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.counting()
                ));

        System.out.println(groupedByLength);
    }
}
