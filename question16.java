package javaassignment;




import java.util.Scanner;


public class question16 {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] marks = new int[3];

	        for (int i = 0; i < 3; i++) {
	            while (true) {
	                System.out.print("Enter the mark (0-100) for student " + (i + 1) + ": ");
	                int input = scanner.nextInt();

	              
	                if (input >= 0 && input <= 100) {
	                    marks[i] = input;
	                    break;
	                } else {
	                    System.out.println("Invalid input, try again...");
	                }
	            }
	        }

	      
	        double average = (marks[0] + marks[1] + marks[2]) / 3.0;

	   
	        System.out.printf("The average is: %.2f\n", average);

	        
	   
	}


}


/*
Enter the mark (0-100) for student 1: 56
Enter the mark (0-100) for student 2: 67
Enter the mark (0-100) for student 3: 23
The average is: 48.67
*/