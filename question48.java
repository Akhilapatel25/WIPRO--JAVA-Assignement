package javaassignment;


//Functional interface
@FunctionalInterface
interface EmployeeProcessor {
 void process(Employee3 e);
}

//Employee class
class Employee3 {
 int id;
 String name;
 double salary;

 public Employee3(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }
}

//Main class
public class question48 {
 public static void main(String[] args) {
     Employee3 e1 = new Employee3(101, "Akhila", 60000);
     Employee3 e2 = new Employee3(102, "Ravi", 75000);

     // Print name and salary
     EmployeeProcessor printDetails = (e) -> 
         System.out.println("Name: " + e.name + ", Salary: " + e.salary);

     // Calculate and print bonus
     EmployeeProcessor calculateBonus = (e) -> 
         System.out.println("Bonus for " + e.name + ": " + (e.salary * 0.10));

     // Process employees
     System.out.println("Employee Details:");
     printDetails.process(e1);
     printDetails.process(e2);

     System.out.println("\nBonus Calculation:");
     calculateBonus.process(e1);
     calculateBonus.process(e2);
 }
}


/*
 * Employee Details:
Name: Akhila, Salary: 60000.0
Name: Ravi, Salary: 75000.0

Bonus Calculation:
Bonus for Akhila: 6000.0
Bonus for Ravi: 7500.0
*/
