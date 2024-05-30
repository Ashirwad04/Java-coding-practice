package org.example.Collections;

import java.util.HashSet;

/*
HashSet Basics:

    Create a HashSet of strings.
    Add elements to the set.
    Check if a specific element is in the set.
    Remove an element from the set.
    Iterate through the set and print each element.

 */
public class HasSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Aman");
        set.add("Karan");
        set.add("Rohan");
        set.add("priya");

        String checkname ="Aman";
        if (set.contains(checkname)){
            System.out.println("Yes ");
        }
        else {
            System.out.println("No");
        }

        set.remove("Aman");
     //   System.out.println(set);


        for (String name:set){
            System.out.println(name+" ");
        }



    }
}
