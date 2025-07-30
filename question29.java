package javaassignment;


import java.util.*;

public class question29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter Register Number: ");
            String regNo = scanner.nextLine();
            
            System.out.print("Enter Mobile Number: ");
            String mobileNo = scanner.nextLine();

            // Check length conditions
            if (regNo.length() != 9) {
                throw new IllegalArgumentException("Register Number must be 9 characters.");
            }

            if (mobileNo.length() != 10) {
                throw new IllegalArgumentException("Mobile Number must be 10 digits.");
            }

            // Check for invalid characters in Register Number
            if (!regNo.matches("[a-zA-Z0-9]+")) {
                throw new NoSuchElementException("Register Number contains invalid characters.");
            }

            // Check if Mobile Number contains only digits
            if (!mobileNo.matches("\\d+")) {
                throw new NumberFormatException("Mobile Number must contain only digits.");
            }

            // If all checks pass
            System.out.println("valid");

        } 
        catch (NoSuchElementException e) {
            System.out.println("invalid");
        } catch (NumberFormatException e) {
            System.out.println("invalid");
        } catch (IllegalArgumentException e) {
            System.out.println("invalid");
        }
    }
}


/*Enter Register Number: akki@qe
Enter Mobile Number: 245787s
invalid




Enter Register Number: 123456789
Enter Mobile Number: 7993117502
valid

*/



