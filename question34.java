package javaassignment;


public class question34 {
    private String employeeId;
    private String name;
    private int yearOfBirth;

    // Constructor
    public question34(String employeeId, String name, int yearOfBirth) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    // Method to display employee details
    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Year of Birth: " + yearOfBirth);

        // Parsing the employeeId
        String[] parts = employeeId.split("-");

        if (parts.length == 3) {
            String year = parts[0];
            String designationCode = parts[1];
            String number = parts[2];

            String designation = "";
            if (designationCode.equalsIgnoreCase("F")) {
                designation = "Faculty";
            } else if (designationCode.equalsIgnoreCase("S")) {
                designation = "Staff";
            } else {
                designation = "Unknown";
            }

            System.out.println("Parsed Details:");
            System.out.println("Joining Year: 19" + year);
            System.out.println("Designation: " + designation);
            System.out.println("Employee Number: " + number);
        } else {
            System.out.println("Invalid employee ID format.");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        question34 emp1 = new question34("81-F-112", "John Doe", 1960);
        emp1.printDetails();

        System.out.println();

        question34 emp2 = new question34("79-S-254", "Jane Smith", 1958);
        emp2.printDetails();
    }
}


/*
 * 
Employee Details:
ID: 81-F-112
Name: John Doe
Year of Birth: 1960
Parsed Details:
Joining Year: 1981
Designation: Faculty
Employee Number: 112

Employee Details:
ID: 79-S-254
Name: Jane Smith
Year of Birth: 1958
Parsed Details:
Joining Year: 1979
Designation: Staff
Employee Number: 254

*/
