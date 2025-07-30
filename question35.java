package javaassignment;


import java.util.Scanner;

//Custom exception class
class InvalidEmployeeCode extends Exception {
 public InvalidEmployeeCode(String message) {
     super(message);
 }
}

//Employee class
public class question35 {
 String empCode;
 String name;
 String designation;

 // Constructor
 public question35(String empCode, String name, String designation) {
     this.empCode = empCode;
     this.name = name;
     this.designation = designation;
 }

 // Method to display employee details
 public void displayDetails() {
     System.out.println("\nEmployee Details:");
     System.out.println("Employee Code: " + empCode);
     System.out.println("Name: " + name);
     System.out.println("Designation: " + designation);
 }

 // Method to validate employee code
 public static void validateCode(String code) throws InvalidEmployeeCode {
     // Valid format: 3 capital letters followed by 4 digits (e.g., EMP1234)
     if (!code.matches("[A-Z]{3}\\d{4}")) {
         throw new InvalidEmployeeCode("Invalid Employee Code: " + code);
     }
 }

 // Main method
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try {
         System.out.print("Enter Employee Code (e.g., EMP1234): ");
         String code = sc.nextLine();

         // Validate code
         validateCode(code);

         System.out.print("Enter Name: ");
         String name = sc.nextLine();

         System.out.print("Enter Designation: ");
         String designation = sc.nextLine();

         // Create and display employee object
         question35 emp = new question35(code, name, designation);
         emp.displayDetails();

     } catch (InvalidEmployeeCode e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}


/*
 * 
 * 
Employee Details:
Employee Code: EMP4356
Name: RAM
Designation: Developer
*/
