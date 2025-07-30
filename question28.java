package javaassignment;

import java.util.Scanner;

interface PerformOperation {
    boolean check(int a);
}

public class question28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PerformOperation isOdd = a -> a % 2 != 0;
        PerformOperation isPrime = a -> {
            if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
        PerformOperation isPalindrome = a -> {
            String str = Integer.toString(a);
            return str.equals(new StringBuilder(str).reverse().toString());
        };

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Odd/Even: " + (isOdd.check(number) ? "Odd" : "Even"));
        System.out.println("Prime: " + (isPrime.check(number) ? "Yes" : "No"));
        System.out.println("Palindrome: " + (isPalindrome.check(number) ? "Yes" : "No"));

       
    }
}

