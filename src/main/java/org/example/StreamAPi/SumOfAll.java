package org.example.StreamAPi;

import java.util.Arrays;
import java.util.List;

/*
Given a list of integers, write a method
to compute the sum of all the integers using the reduce method.
 */
public class SumOfAll {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8,9,9);

        SumOfAll s = new SumOfAll();
        System.out.println(s.regularSum(num));


    }

    public int regularSum (List<Integer>number){
        int sum =  number.stream().mapToInt(Integer :: intValue).sum();
        return sum;
    }

}
