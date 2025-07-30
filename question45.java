package javaassignment;


import java.util.*;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;
    String department;

    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;  // To print only the name when displaying list
    }
}

public class question45 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Sample student data
        students.add(new Student(101, "Akhila", "CSE"));
        students.add(new Student(102, "Ravi", "ECE"));
        students.add(new Student(103, "Priya", "CSE"));
        students.add(new Student(104, "Anil", "EEE"));
        students.add(new Student(105, "Deepa", "ECE"));

        // Grouping students by department using streams
        Map<String, List<Student>> groupedByDept = students.stream()
                .collect(Collectors.groupingBy(s -> s.department));

        // Printing each department and student names
        System.out.println("Students Grouped by Department:");
        for (Map.Entry<String, List<Student>> entry : groupedByDept.entrySet()) {
            System.out.println("Department: " + entry.getKey());
            for (Student s : entry.getValue()) {
                System.out.println(" - " + s.name);
            }
        }
    }
}

/*
 * Students Grouped by Department:
Department: EEE
 - Anil
Department: CSE
 - Akhila
 - Priya
Department: ECE
 - Ravi
 - Deepa

*/
