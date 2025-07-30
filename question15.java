package javaassignment;


import java.util.HashMap;

public class question15{
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 2, 5, 6, 8, 8, 5, 2}; // Array with 10 elements

        // HashMap to store frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            // If the number already exists, increment its count
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Display the frequency of each element
        System.out.println("Element Frequencies:");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " occurs " + frequencyMap.get(key) + " times");
        }
    }
}

/*
 * Element Frequencies:
2 occurs 3 times
5 occurs 3 times
6 occurs 1 times
8 occurs 3 times
*/
