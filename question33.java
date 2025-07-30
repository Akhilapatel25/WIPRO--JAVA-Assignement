package javaassignment;


//Custom Exception Class
class LowSalException extends Exception {
 public LowSalException(String message) {
     super(message);
 }
}

public class question33{
 private int empId;
 private String empName;
 private String designation;
 private double basic;
 private double hra;  // read-only field (no setter provided)

 // Constructor that validates BASIC and initializes fields
 public question33(int empId, String empName, String designation, double basic) throws LowSalException {
     if (basic < 50000) {
         throw new LowSalException("Basic salary must be at least 50000.");
     }
     this.empId = empId;
     this.empName = empName;
     this.designation = designation;
     this.basic = basic;
     calculateHRA();  // Calculate HRA during object creation
 }

 // Method to calculate HRA based on designation and basic
 public void calculateHRA() {
     if (designation.equalsIgnoreCase("Manager")) {
         this.hra = 0.10 * basic;
     } else if (designation.equalsIgnoreCase("TeamLeader")) {
         this.hra = 0.12 * basic;
     } else if (designation.equalsIgnoreCase("HR")) {
         this.hra = 0.05 * basic;
     } else {
         // If designation is not supported, HRA is set to 0 (or you could throw an exception)
         this.hra = 0;
     }
 }

 // Method to print employee details
 public void printDET() {
     System.out.println("Employee Details:");
     System.out.println("ID: " + empId);
     System.out.println("Name: " + empName);
     System.out.println("Designation: " + designation);
     System.out.println("Basic Salary: " + basic);
     System.out.println("HRA: " + hra);
 }

 // Main method to test the class
 public static void main(String[] args) {
	 
 
     try {
         // Example with valid basic salary
         question33 emp1 = new question33(101, "John Doe", "Manager", 75000);
         emp1.printDET();
     } catch (LowSalException e) {
         System.out.println("Error: " + e.getMessage());
     }

     try {
         // Example with basic salary less than 50000 which will trigger LowSalException
         question33 emp2 = new question33(102, "Jane Smith", "TeamLeader", 45000);
         emp2.printDET();
     } catch (LowSalException e) {
         System.out.println("Error: " + e.getMessage());
     }
 
}

}

/*
 * 
 *Employee Details:
ID: 101
Name: John Doe
Designation: Manager
Basic Salary: 75000.0
HRA: 7500.0
Error: Basic salary must be at least 50000.


*/
 */

