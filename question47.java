package javaassignment;



//Custom checked exception
class InvalidSalaryException extends Exception {
 public InvalidSalaryException(String message) {
     super(message);
 }
}

//Employee class
class Employee2 {
 int id;
 String name;
 double salary;

 public Employee2(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }
}

//Service class
class EmployeeService {

 public void validateSalary(double salary) throws InvalidSalaryException {
     if (salary < 0) {
         throw new InvalidSalaryException("Salary cannot be negative: " + salary);
     }
 }

 public void processSalary(Employee2 emp) throws InvalidSalaryException {
     validateSalary(emp.salary);
     System.out.println("Salary validated for employee: " + emp.name);
 }

 public void startProcess(Employee2 emp) throws InvalidSalaryException {
     processSalary(emp);
 }
}

//Main class to test everything
public class question47 {
 public static void main(String[] args) {
     Employee2 emp = new Employee2(101, "Akhila", -50000); // negative salary

     EmployeeService service = new EmployeeService();

     try {
         service.startProcess(emp);
     } catch (InvalidSalaryException e) {
         System.out.println("Exception Caught: " + e.getMessage());
     }
 }
}

/*
 * Exception Caught: Salary cannot be negative: -50000.0
*/
