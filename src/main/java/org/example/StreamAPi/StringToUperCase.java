package org.example.StreamAPi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a list of strings, write a method to convert all the
strings to uppercase and collect them into a new list.
 */
public class StringToUperCase {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Aman","roha","sohan","pohan");
        list.stream()
                .map(l -> l.toUpperCase()).forEach(System.out::println);
    }
}
