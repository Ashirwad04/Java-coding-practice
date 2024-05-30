package org.example.Collections;
/*

ArrayList Operations:

Create an ArrayList of integers and perform the following operations:
Add elements to the list.
Remove an element from the list.
Find the index of a specific element.
Iterate through the list and print each element.

 */





import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original list: " + numbers);

        // Remove an element from the list (e.g., remove the element at index 2)
        numbers.remove(2); // This will remove the element 30
        System.out.println("List after removing element at index 2: " + numbers);

        // Find the index of a specific element (e.g., find the index of element 40)
        int index = numbers.indexOf(40);
        if (index != -1) {
            System.out.println("The index of element 40 is: " + index);
        } else {
            System.out.println("Element 40 is not in the list.");
        }

        // Iterate through the list and print each element
        System.out.println("Iterating through the list:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
