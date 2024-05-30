package org.example.Collections;

import java.util.LinkedList;

/*
LinkedList Usage:

    Create a LinkedList of strings.
    Add elements at the beginning and end of the list.
    Remove the first and last elements.
Iterate through the list using both an iterator and a for-each loop.
 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>();
        list.add("Ashirwad");
        list.add("aman");
        list.add("kajal");
        list.add("priya");
        list.addLast("Rohan");
        list.remove(0);
        System.out.println(list);
    }
}
