package javaassignment;


import java.io.*;
import java.util.Scanner;

// Employee class implementing Serializable
class Employee implements Serializable {
    int emp_id;
    String emp_name;
    transient double emp_sal; // 'transient' so it won't be serialized

    public Employee(int id, String name, double sal) {
        this.emp_id = id;
        this.emp_name = name;
        this.emp_sal = sal;
    }

    public void display() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Salary: " + emp_sal);
    }
}

public class question38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        // Create employee object
        Employee emp = new Employee(id, name, salary);

        // Serialize the object
        try {
            FileOutputStream fos = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();
            fos.close();
            System.out.println("\nEmployee object serialized successfully.\n");
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        // Deserialize the object
        try {
            FileInputStream fis = new FileInputStream("employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee deserializedEmp = (Employee) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Deserialized Employee Object:");
            deserializedEmp.display(); // emp_sal will be 0.0 because it was transient
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }
}
/*
 * 
 * Enter Employee ID: 34
Enter Employee Name: akki
Enter Employee Salary: 35000

Employee object serialized successfully.

Deserialized Employee Object:
Employee ID: 34
Employee Name: akki
Employee Salary: 0.0
*/
