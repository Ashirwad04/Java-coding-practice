package org.example.StreamAPi;

import java.util.Arrays;
import java.util.List;

/*
Given a list of integers, write a method to find the maximum value using parallel stream.
 */
public class MaxNum {

    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
        System.out.println(num.parallelStream().max(Integer::compare).get());
        System.out.println(num.stream().max(Integer::compare).get());;
    }
}
