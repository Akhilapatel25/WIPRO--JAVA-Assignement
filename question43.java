package javaassignment;


import java.io.*;

public class question43 {
    public static void main(String[] args) {
        String fileName = "sample.txt"; // You can change this to your file path

        // Try-with-resources for auto-closing BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
/*
File not found: sample.txt





akki
Java Assignment
BufferedReader Example
*/