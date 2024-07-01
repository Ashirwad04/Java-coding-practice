package org.example.FileHandling;

import java.io.*;
import java.util.stream.Collectors;

public class AddData {

    private static final String FILE_NAME = "addDta.txt";

    public static void main(String[] args) {
        // Example usage of the addTask method
       // addTask("4");
        //addTask("5");
        //addTask("6");

        System.out.println(readTask());
    }

    public static void addTask(String task) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(task);
            writer.newLine();
            System.out.println("Task added: " + task);
        } catch (IOException e) {
            System.out.println("Error adding task: " + e.getMessage());
        }
    }
    public static String readTask(){
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))){
            return br.lines().collect(Collectors.joining("\n"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
