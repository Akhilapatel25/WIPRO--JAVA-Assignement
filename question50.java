package javaassignment;

import java.util.*;
import java.util.stream.Collectors;

public class question50 {

    static class Employee {
        private int id;
        private String name;
        private String department;
        private double salary;

        public Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public String getDepartment() { return department; }
        public double getSalary() { return salary; }

        @Override
        public String toString() {
            return id + " - " + name + " - " + department + " - " + salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(101, "Ravi", "HR", 50000),
            new Employee(102, "Priya", "IT", 60000),
            new Employee(103, "Arun", "HR", 55000),
            new Employee(104, "Kavya", "IT", 70000),
            new Employee(105, "Divya", "Sales", 45000)
        );

        // Q1
        System.out.println("Q1. All Employee Names:");
        employees.stream().map(Employee::getName).forEach(System.out::println);

        // Q2
        System.out.println("\nQ2. Employees with salary > 55000:");
        employees.stream().filter(e -> e.getSalary() > 55000).forEach(System.out::println);

        // Q3
        System.out.println("\nQ3. Number of employees in HR:");
        long hrCount = employees.stream().filter(e -> e.getDepartment().equals("HR")).count();
        System.out.println(hrCount);

        // Q4
        System.out.println("\nQ4. Employees sorted by salary descending:");
        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                 .forEach(System.out::println);

        // Q5
        System.out.println("\nQ5. Highest paid employee:");
        employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);

        // Q6
        System.out.println("\nQ6. Average salary:");
        double avg = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
        System.out.println(avg);

        // Q7
        System.out.println("\nQ7. All names in a List:");
        List<String> names = employees.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(names);

        // Q8
        System.out.println("\nQ8. Group by department:");
        Map<String, List<Employee>> byDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(byDept);

        // Q9
        System.out.println("\nQ9. Total salary per department:");
        Map<String, Double> totalSalaryPerDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
        System.out.println(totalSalaryPerDept);

        // Q10
        System.out.println("\nQ10. Names in IT sorted by salary:");
        List<String> itNames = employees.stream()
            .filter(e -> e.getDepartment().equals("IT"))
            .sorted(Comparator.comparingDouble(Employee::getSalary))
            .map(Employee::getName)
            .collect(Collectors.toList());
        System.out.println(itNames);

        // Q11
        System.out.println("\nQ11. Any employee with salary < 40000:");
        boolean anyLow = employees.stream().anyMatch(e -> e.getSalary() < 40000);
        System.out.println(anyLow);

        // Q12
        System.out.println("\nQ12. Comma-separated names:");
        String joinedNames = employees.stream().map(Employee::getName).collect(Collectors.joining(", "));
        System.out.println(joinedNames);

        // Q13
        System.out.println("\nQ13. Top 2 highest earning employees:");
        List<Employee> top2 = employees.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
            .limit(2)
            .collect(Collectors.toList());
        top2.forEach(System.out::println);

        // Q14
        System.out.println("\nQ14. Skip first 2 employees:");
        employees.stream().skip(2).forEach(System.out::println);

        // Q15
        System.out.println("\nQ15. First 3 employee names:");
        employees.stream().limit(3).map(Employee::getName).forEach(System.out::println);

        // Q16
        System.out.println("\nQ16. Min salary in HR:");
        employees.stream()
            .filter(e -> e.getDepartment().equals("HR"))
            .min(Comparator.comparingDouble(Employee::getSalary))
            .ifPresent(System.out::println);

        // Q17
        System.out.println("\nQ17. Partition by salary > 55000:");
        Map<Boolean, List<Employee>> partitioned = employees.stream()
            .collect(Collectors.partitioningBy(e -> e.getSalary() > 55000));
        System.out.println(partitioned);

        // Q18
        System.out.println("\nQ18. Average salary per department:");
        Map<String, Double> avgSalaryPerDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment,
                     Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryPerDept);

        // Q19
        System.out.println("\nQ19. Sort by name, then salary:");
        employees.stream()
            .sorted(Comparator.comparing(Employee::getName)
                    .thenComparing(Employee::getSalary))
            .forEach(System.out::println);

        // Q20
        System.out.println("\nQ20. Convert to Map<Id, Name>:");
        Map<Integer, String> idToName = employees.stream()
            .collect(Collectors.toMap(Employee::getId, Employee::getName));
        System.out.println(idToName);

        // Challenge 1
        System.out.println("\n🔹 Challenge 1: Names starting with 'D' and ending with 'a':");
        List<Employee> dToA = employees.stream()
            .filter(e -> e.getName().startsWith("D") && e.getName().endsWith("a"))
            .collect(Collectors.toList());
        System.out.println(dToA);

        // Challenge 2
        System.out.println("\n🔹 Challenge 2: Departments with more than 1 employee:");
        Map<String, Long> deptCount = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        deptCount.entrySet().stream()
            .filter(e -> e.getValue() > 1)
            .forEach(e -> System.out.println(e.getKey()));

        // Challenge 3
        System.out.println("\n🔹 Challenge 3: Second highest salary:");
        employees.stream()
            .map(Employee::getSalary)
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst()
            .ifPresent(sal -> System.out.println(sal));
    }
}




/*
 * 
 * Q1. All Employee Names:
Ravi
Priya
Arun
Kavya
Divya

Q2. Employees with salary > 55000:
102 - Priya - IT - 60000.0
104 - Kavya - IT - 70000.0

Q3. Number of employees in HR:
2

Q4. Employees sorted by salary descending:
104 - Kavya - IT - 70000.0
102 - Priya - IT - 60000.0
103 - Arun - HR - 55000.0
101 - Ravi - HR - 50000.0
105 - Divya - Sales - 45000.0

Q5. Highest paid employee:
104 - Kavya - IT - 70000.0

Q6. Average salary:
56000.0

Q7. All names in a List:
[Ravi, Priya, Arun, Kavya, Divya]

Q8. Group by department:
{Sales=[105 - Divya - Sales - 45000.0], HR=[101 - Ravi - HR - 50000.0, 103 - Arun - HR - 55000.0], IT=[102 - Priya - IT - 60000.0, 104 - Kavya - IT - 70000.0]}

Q9. Total salary per department:
{Sales=45000.0, HR=105000.0, IT=130000.0}

Q10. Names in IT sorted by salary:
[Priya, Kavya]

Q11. Any employee with salary < 40000:
false

Q12. Comma-separated names:
Ravi, Priya, Arun, Kavya, Divya

Q13. Top 2 highest earning employees:
104 - Kavya - IT - 70000.0
102 - Priya - IT - 60000.0

Q14. Skip first 2 employees:
103 - Arun - HR - 55000.0
104 - Kavya - IT - 70000.0
105 - Divya - Sales - 45000.0

Q15. First 3 employee names:
Ravi
Priya
Arun

Q16. Min salary in HR:
101 - Ravi - HR - 50000.0

Q17. Partition by salary > 55000:
{false=[101 - Ravi - HR - 50000.0, 103 - Arun - HR - 55000.0, 105 - Divya - Sales - 45000.0], true=[102 - Priya - IT - 60000.0, 104 - Kavya - IT - 70000.0]}

Q18. Average salary per department:
{Sales=45000.0, HR=52500.0, IT=65000.0}

Q19. Sort by name, then salary:
103 - Arun - HR - 55000.0
105 - Divya - Sales - 45000.0
104 - Kavya - IT - 70000.0
102 - Priya - IT - 60000.0
101 - Ravi - HR - 50000.0

Q20. Convert to Map<Id, Name>:
{101=Ravi, 102=Priya, 103=Arun, 104=Kavya, 105=Divya}

🔹 Challenge 1: Names starting with 'D' and ending with 'a':
[105 - Divya - Sales - 45000.0]

🔹 Challenge 2: Departments with more than 1 employee:
HR
IT

🔹 Challenge 3: Second highest salary:
60000.0


*/
