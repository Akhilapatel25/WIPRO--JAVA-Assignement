package javaassignment;


import java.util.*;

public class question26 {
    public static void main(String[] args) {
        int[] input = {2, 3, 54, 1, 6, 7, 7};

        // Use LinkedHashSet to remove duplicates and maintain insertion order
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (int num : input) {
            uniqueNumbers.add(num);
        }

        int evenSum = 0;
        System.out.print("Unique elements: ");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
            if (num % 2 == 0) {
                evenSum += num;
            }
        }

        System.out.println("\nSum of even numbers: " + evenSum);
    }
}
