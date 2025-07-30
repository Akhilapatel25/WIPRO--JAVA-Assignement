package javaassignment;

import java.util.*;

class Student1 {
    private static int rollCounter = 1001;

    private int rollNo;
    private String studName;
    private int marksInEng;
    private int marksInMaths;
    private int marksInScience;

    public Student1(String studName, int eng, int maths, int science) {
        this.rollNo = rollCounter++;
        this.studName = studName;
        this.marksInEng = eng;
        this.marksInMaths = maths;
        this.marksInScience = science;
    }

    // Getters and setters
    public int getRollNo() { return rollNo; }
    public String getStudName() { return studName; }
    public int getMarksInEng() { return marksInEng; }
    public int getMarksInMaths() { return marksInMaths; }
    public int getMarksInScience() { return marksInScience; }

    public int getTotalMarks() {
        return marksInEng + marksInMaths + marksInScience;
    }

    public double getPercentage() {
        return getTotalMarks() / 3.0;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + studName;
    }
}

class Standard {
    private List<Student1> students;

    public Standard() {
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    // 1. Display students by ascending roll no
    public void displayByRollNo() {
        students.stream()
                .sorted(Comparator.comparingInt(Student::getRollNo))
                .forEach(s -> System.out.println(s));
    }

    // 2. Display student with highest percentage
    public void displayTopper() {
        Student1 topper = students.stream()
                .max(Comparator.comparingDouble(Student::getPercentage))
                .orElse(null);
        if (topper != null) {
            System.out.println("Topper -> " + topper + ", Percentage: " + topper.getPercentage());
        }
    }

    // 3. Display student with highest math marks
    public void displayMathsTopper() {
        Student1 mathTopper = students.stream()
                .max(Comparator.comparingInt(Student::getMarksInMaths))
                .orElse(null);
        if (mathTopper != null) {
            System.out.println("Maths Topper -> " + mathTopper + ", Marks: " + mathTopper.getMarksInMaths());
        }
    }

    // 4. Display students in ascending order of (Maths + Science)
    public void displayByMathsScienceTotal() {
        students.stream()
                .sorted(Comparator.comparingInt(s -> s.getMarksInMaths() + s.getMarksInScience()))
                .forEach(s -> System.out.println(s + ", Maths+Science: " +
                        (s.getMarksInMaths() + s.getMarksInScience())));
    }

    // 5. Display roll no, name, total, percentage, rank (desc order)
    public void displayRankList() {
        students.sort(Comparator.comparingInt(Student::getTotalMarks).reversed());

        int rank = 1;
        System.out.println("Rank List:");
        for (Student1 s : students) {
            System.out.printf("Rank %d: Roll No: %d, Name: %s, Total: %d, Percentage: %.2f%%\n",
                    rank++, s.getRollNo(), s.getStudName(), s.getTotalMarks(), s.getPercentage());
        }
    }
}

public class question12 {
    public static void main(String[] args) {
        Standard std = new Standard();

        std.addStudent(new Student("Akhila", 80, 90, 85));
        std.addStudent(new Student("Ravi", 70, 88, 77));
        std.addStudent(new Student("Sneha", 60, 95, 90));
        std.addStudent(new Student("Kiran", 85, 65, 75));
        std.addStudent(new Student("Meena", 95, 97, 92));
        std.addStudent(new Student("Arjun", 78, 89, 88));
        std.addStudent(new Student("Divya", 85, 85, 85));
        std.addStudent(new Student("Manoj", 90, 94, 90));

        System.out.println("\n1. Students in Ascending Order of Roll No:");
        std.displayByRollNo();

        System.out.println("\n2. Student with Highest Percentage:");
        std.displayTopper();

        System.out.println("\n3. Student with Highest Maths Marks:");
        std.displayMathsTopper();

        System.out.println("\n4. Students by Total of Maths + Science (Ascending):");
        std.displayByMathsScienceTotal();

        System.out.println("\n5. Rank List:");
        std.displayRankList();
    }
}
