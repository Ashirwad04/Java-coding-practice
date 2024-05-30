package org.example.Collections;
/*
    Create a HashMap to store student names (keys) and their corresponding grades (values).
    Add some entries to the map.
    Retrieve a grade for a specific student.
    Remove a student's entry from the map.
    Iterate through the map and print each key-value pair.
 */

import java.util.HashMap;
import java.util.Map;

public class HasMap_Student_short {
    public static void main(String[] args) {
        Map<String,Integer> student=new HashMap<>();
        student.put("azman",99991);
        student.put("sradha",2);
        student.put("pravin",420);
        student.put("ashirwad",320);

        System.out.println( student.get("sradha"));
        student.remove("azman");

        System.out.println(student);

        for (Map.Entry<String,Integer> stu : student.entrySet()){
            System.out.println("Student: " + stu.getKey() + ", Grade: " + stu.getValue());
        }









    }
}
