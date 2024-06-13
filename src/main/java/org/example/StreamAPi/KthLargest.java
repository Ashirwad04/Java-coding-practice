package org.example.StreamAPi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Problem: Given an array of integers and an integer k, find the kth largest element using Java Streams.

Input: [3, 2, 1, 5, 6, 4], k = 2
Output: 5
 */
public class KthLargest {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(9,8,7,6,5,4,3,2,1);
        int k=2;
        List<Integer> se =num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        int l= se.size();


        for (int i =1;i< l;i++){
            if (i==k-1){
                System.out.println(se.indexOf(i));
                break;
            }
        }

    }
}
