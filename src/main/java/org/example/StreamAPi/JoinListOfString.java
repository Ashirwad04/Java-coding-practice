package org.example.StreamAPi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Given a list of strings,
write a method to join all the strings into a single string separated by commas
 */
public class JoinListOfString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Ashirwad");
        list.add("Aman");
        list.add("Kajal");
        list.add("Rohan");
        System.out.println(list);


        String collect = list.stream().collect(Collectors.joining(", "));

        System.out.println(collect);

    }
}
