package org.example.FileHandling;

import java.io.*;
import java.util.*;

public class ToDoList {

    private static final String FILE_NAME = "todolist.txt";
    private static List<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        loadTasks();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTo-Do List:");
            System.out.println("1. View tasks");
            System.out.println("2. Add task");
            System.out.println("3. Update task");
            System.out.println("4. Delete task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    viewTasks();
                    break;
                case 2:
                    addTask(scanner);
                    break;
                case 3:
                    updateTask(scanner);
                    break;
                case 4:
                    deleteTask(scanner);
                    break;
                case 5:
                    saveTasks();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void loadTasks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                tasks.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error loading tasks: " + e.getMessage());
        }
    }

    private static void saveTasks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Enter task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added.");
    }

    private static void updateTask(Scanner scanner) {
        viewTasks();
        System.out.print("Enter the task number to update: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();  // consume newline

        if (taskNumber <= 0 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
        } else {
            System.out.print("Enter new task: ");
            String newTask = scanner.nextLine();
            tasks.set(taskNumber - 1, newTask);
            System.out.println("Task updated.");
        }
    }

    private static void deleteTask(Scanner scanner) {
        viewTasks();
        System.out.print("Enter the task number to delete: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();  // consume newline

        if (taskNumber <= 0 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
        } else {
            tasks.remove(taskNumber - 1);
            System.out.println("Task deleted.");
        }
    }

    public static class T1 {

        private static final String FILE_NAME = "t1.txt";

        public static void main(String[] args) {
            // Example usage of the addTask method
            addTask("Buy groceries");
            addTask("Finish homework");
            addTask("Call Mom");
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
    }
}
