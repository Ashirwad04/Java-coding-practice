package org.example.Collections;

import java.util.TreeSet;
import java.util.function.DoubleToIntFunction;

/*

    Create a TreeSet of integers.
    Add elements to the set.
    Demonstrate that the set stores elements in ascending order.
    Retrieve and remove the first and last elements.


 */
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set =new TreeSet<>();
        set.add(2);
        set.add(2);
        set.add(1);
        set.add(5);
        set.add(43);
        set.add(22);

        System.out.println(set);
        set.remove(1);
        set.remove(43);
        System.out.println(set);
    }


}
