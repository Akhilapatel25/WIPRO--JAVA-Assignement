package javaassignment;


import java.util.*;

//Employee class
class Employee1 {
 int id;
 String name;
 double salary;

 public Employee1(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }

 public String toString() {
     return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
 }
}

//Generic Repository class
class Repository<T, ID> {
 private Map<ID, T> dataStore = new HashMap<>();

 public void save(ID id, T entity) {
     dataStore.put(id, entity);
 }

 public T findById(ID id) {
     return dataStore.get(id);
 }

 public List<T> findAll() {
     return new ArrayList<>(dataStore.values());
 }

 public void deleteById(ID id) {
     dataStore.remove(id);
 }
}

//Main class to test the Repository
public class question46 {
 public static void main(String[] args) {
     Repository<Employee1, Integer> empRepo = new Repository<>();

     // Adding 3 employees
     empRepo.save(101, new Employee1(101, "Akhila", 50000));
     empRepo.save(102, new Employee1(102, "Ravi", 60000));
     empRepo.save(103, new Employee1(103, "Priya", 55000));

     // Retrieve and print all employees
     System.out.println("All Employees:");
     for (Employee1 e : empRepo.findAll()) {
         System.out.println(e);
     }

     // Retrieve a specific employee by ID
     System.out.println("\nEmployee with ID 102:");
     Employee1 emp = empRepo.findById(102);
     System.out.println(emp != null ? emp : "Employee not found");

     // Delete an employee and print remaining data
     empRepo.deleteById(102);
     System.out.println("\nAfter deleting employee with ID 102:");
     for (Employee1 e : empRepo.findAll()) {
         System.out.println(e);
     }
 }
}


/*
 * All Employees:
ID: 101, Name: Akhila, Salary: 50000.0
ID: 102, Name: Ravi, Salary: 60000.0
ID: 103, Name: Priya, Salary: 55000.0

Employee with ID 102:
ID: 102, Name: Ravi, Salary: 60000.0

After deleting employee with ID 102:
ID: 101, Name: Akhila, Salary: 50000.0
ID: 103, Name: Priya, Salary: 55000.0

*/
