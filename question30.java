package javaassignment;


import java.util.Scanner;

//Functional interface with a method to find minimum of three floats
@FunctionalInterface
interface MinimumFinder {
 float minimum3(float a, float b, float c);
}

public class question30 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Read 3 floating-point numbers from user
     float num1 = scanner.nextFloat();
     float num2 = scanner.nextFloat();
     float num3 = scanner.nextFloat();

     // Use lambda with method references to Math.min
     MinimumFinder minFinder = (a, b, c) -> Math.min(a, Math.min(b, c));

     float result = minFinder.minimum3(num1, num2, num3);

     // Display the result
     System.out.println("Minimum value: " + result);
 }
}


//output
/*
 3.5
5.6
1.5
Minimum value: 1.5
*/
 */

