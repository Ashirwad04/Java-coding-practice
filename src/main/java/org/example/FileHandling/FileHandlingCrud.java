package org.example.FileHandling;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileHandlingCrud {

    private static final String FILE_NAME = "fcrud.txt";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Choose an option");
            System.out.println("1. Create data");
            System.out.println("2. Read data");
            System.out.println("3. Update data");
            System.out.println("4. Delete data");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addData(scanner);
                    break;
                case 2:
                    System.out.println("Reading data");
                    String pd = readData();
                    System.out.println(pd);
                    break;
                case 3:
                    updateData(scanner);
                    break;
                case 4:
                    deleteData(scanner);
                    break;
                case 5:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Wrong input, choose again.");
            }
        }
    }

    public static void addData(Scanner scanner) {
        System.out.println("You have chosen to add data.");
        System.out.println("Enter the data to add: ");
        String data = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(data);
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Data added successfully");
    }

    public static String readData() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            return br.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            e.printStackTrace();
            return "Error reading data";
        }
    }

    public static void updateData(Scanner scanner) {
        System.out.println("You have chosen to update data.");
        System.out.println("Enter the old data to update: ");
        String oldData = scanner.nextLine();
        System.out.println("Enter the new data: ");
        String newData = scanner.nextLine();

        try {
            List<String> fileContent = new BufferedReader(new FileReader(FILE_NAME)).lines().collect(Collectors.toList());
            boolean found = false;
            for (int i = 0; i < fileContent.size(); i++) {
                if (fileContent.get(i).equals(oldData)) {
                    fileContent.set(i, newData);
                    found = true;
                    break;
                }
            }
            if (found) {
                Files.write(Paths.get(FILE_NAME), fileContent);
                System.out.println("Data updated successfully");
            } else {
                System.out.println("Old data not found");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error updating data");
        }
    }

    public static void deleteData(Scanner scanner) {
        System.out.println("You have chosen to delete data.");
        System.out.println("Enter the data to delete: ");
        String dataToDelete = scanner.nextLine();

        try {
            List<String> fileContent = new BufferedReader(new FileReader(FILE_NAME)).lines().collect(Collectors.toList());
            boolean found = fileContent.remove(dataToDelete);

            if (found) {
                Files.write(Paths.get(FILE_NAME), fileContent);
                System.out.println("Data deleted successfully");
            } else {
                System.out.println("Data to delete not found");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error deleting data");
        }
    }
}
