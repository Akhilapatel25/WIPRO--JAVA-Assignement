package javaassignment;


import java.util.*;

public class question31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // InputMismatchException demonstration
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();  // throws InputMismatchException if not an integer

            scanner.nextLine(); // Clear the buffer

            // StringIndexOutOfBoundsException demonstration
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            System.out.print("Enter an index to access: ");
            int index = scanner.nextInt();

            char ch = word.charAt(index);  // throws StringIndexOutOfBoundsException if index invalid
            System.out.println("Character at index " + index + ": " + ch);

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: Please enter the correct type of input.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: Index is out of range for the string.");
        }
    }
}

/*
 Enter an integer: 123
Enter a word: abc
Enter an index to access: 2
Character at index 2: c


Enter an integer: abc
InputMismatchException caught: Please enter the correct type of input.


Enter an integer: 12
Enter a word: add
Enter an index to access: 5
StringIndexOutOfBoundsException caught: Index is out of range for the string.
*/

