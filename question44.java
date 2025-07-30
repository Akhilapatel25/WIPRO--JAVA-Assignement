package javaassignment;




import java.util.*;

class MyEmployee {
    int id;
    String name;
    double salary;

    public MyEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class question44 {
    public static void main(String[] args) {
        List<MyEmployee> employees = new ArrayList<>();

        // Adding sample employees
        employees.add(new MyEmployee(101, "Akhila", 50000));
        employees.add(new MyEmployee(102, "Ravi", 75000));
        employees.add(new MyEmployee(103, "Priya", 60000));
        employees.add(new MyEmployee(104, "Deepak", 75000));

        // Sort by salary in descending order
        employees.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));

        System.out.println("Sorted by Salary (Descending):");
        for (MyEmployee e : employees) {
            System.out.println(e);
        }

        // Sort by name alphabetically using lambda expression
        employees.sort((e1, e2) -> e1.name.compareToIgnoreCase(e2.name));

        System.out.println("\nSorted by Name (Alphabetically):");
        for (MyEmployee e : employees) {
            System.out.println(e);
        }
    }
}


/*
 * 
 * Sorted by Salary (Descending):
ID: 102, Name: Ravi, Salary: 75000.0
ID: 104, Name: Deepak, Salary: 75000.0
ID: 103, Name: Priya, Salary: 60000.0
ID: 101, Name: Akhila, Salary: 50000.0

Sorted by Name (Alphabetically):
ID: 101, Name: Akhila, Salary: 50000.0
ID: 104, Name: Deepak, Salary: 75000.0
ID: 103, Name: Priya, Salary: 60000.0
ID: 102, Name: Ravi, Salary: 75000.0

*/
