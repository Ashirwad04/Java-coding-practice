package org.example.StreamAPi;


/*
Given a list of integers, write a method to find the
 first even number. If no such number exists, return Optional.empty()
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EvenNumberFind {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1);

        EvenNumberFind e= new EvenNumberFind();
        //e.findFirstEven(numbers);
        System.out.println(e.findFirstEven(numbers));
    }

    public Optional<Integer> findFirstEven(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();
    }
}
