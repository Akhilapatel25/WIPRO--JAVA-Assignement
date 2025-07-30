package javaassignment;

import java.util.Scanner;

public class question24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] speeds = new int[5];
        int sum = 0;

        // Taking input
        System.out.println("Enter speeds of 5 bikers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Speed of Biker " + (i + 1) + ": ");
            speeds[i] = sc.nextInt();
            sum += speeds[i];
        }

        // Calculating average
        double average = sum / 5.0;
        System.out.println("Average speed: " + average);

        // Printing qualifying bikers
        System.out.println("Qualifying biker speeds (greater than average):");
        boolean found = false;
        for (int speed : speeds) {
            if (speed > average) {
                System.out.println(speed);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No biker qualified.");
        }

     
    }
}

