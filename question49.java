package javaassignment;


import java.util.Optional;

//Custom exception if required fields are missing
class MissingFieldException extends Exception {
 public MissingFieldException(String message) {
     super(message);
 }
}

//Employee class
class Employee4 {
 private int id;
 private String name;
 private Optional<String> email;
 private Optional<String> department;

 public Employee4(int id, String name, Optional<String> email, Optional<String> department) {
     this.id = id;
     this.name = name;
     this.email = email;
     this.department = department;
 }

 public void displayDetails() throws MissingFieldException {
     System.out.println("ID: " + id);
     System.out.println("Name: " + name);

     // Provide default value if email is not present
     String emailValue = email.orElse("No Email Provided");
     System.out.println("Email: " + emailValue);

     // Throw custom exception if department is missing
     if (department.isPresent()) {
         System.out.println("Department: " + department.get());
     } else {
         throw new MissingFieldException("Department is required but not provided!");
     }
 }
}

//Main class
public class question49 {
 public static void main(String[] args) {
     try {
         // Employee with both email and department
         Employee4 emp1 = new Employee4(101, "Akhila", 
             Optional.of("akhila@example.com"), 
             Optional.of("IT"));
         emp1.displayDetails();

         System.out.println("\n---");

         // Employee with missing email, and department is present
         Employee4 emp2 = new Employee4(102, "Ravi", 
             Optional.empty(), 
             Optional.of("HR"));
         emp2.displayDetails();

         System.out.println("\n---");

         // Employee with missing department – should throw exception
         Employee4 emp3 = new Employee4(103, "Priya", 
             Optional.of("priya@example.com"), 
             Optional.empty());
         emp3.displayDetails(); // This will throw exception

     } catch (MissingFieldException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}


/*
 * 
 * ID: 101
Name: Akhila
Email: akhila@example.com
Department: IT

---
ID: 102
Name: Ravi
Email: No Email Provided
Department: HR

---
ID: 103
Name: Priya
Email: priya@example.com
Exception: Department is required but not provided!

*/
