package javaassignment;


import java.io.*;
import java.util.Scanner;

public class question37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "batchmates.txt";

        try {
            // 1. Create and write to the file
            FileWriter writer = new FileWriter(fileName);
            
            System.out.print("Enter the number of batchmates: ");
            int count = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            for (int i = 1; i <= count; i++) {
                System.out.print("Enter name of batchmate " + i + ": ");
                String name = scanner.nextLine();
                writer.write(name + "\n");
            }

            writer.close();
            System.out.println("\nBatchmates saved successfully in " + fileName);

            // 2. Read and display the file content
            System.out.println("\n--- Batchmates List ---");
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


/*
 * Enter the number of batchmates: 5
Enter name of batchmate 1: akki
Enter name of batchmate 2: anju
Enter name of batchmate 3: ram
Enter name of batchmate 4: siri
Enter name of batchmate 5: manju

Batchmates saved successfully in batchmates.txt

--- Batchmates List ---
akki
anju
ram
siri
manju
*/
