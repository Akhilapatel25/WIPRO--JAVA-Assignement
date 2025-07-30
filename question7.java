package javaassignment;

import java.util.Scanner;
public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		  Scanner s=new Scanner(System.in);
	        System.out.print("Enter number of classes held: ");
	        int held = s.nextInt();
	        System.out.print("Enter number of classes attended: ");
	        int attended = s.nextInt();

	        double percentage = (attended * 100.0) / held;
	        System.out.println("Attendance percentage: " + percentage + "%");

	        if (percentage >= 70)
	        {
	            System.out.println("Allowed to sit in exam");
	        }
	        else
	        {
	            System.out.println("Not allowed to sit in exam");

	        }
	}

}

/*
 * Enter number of classes held: 5
Enter number of classes attended: 2
Attendance percentage: 40.0%
Not allowed to sit in exam
*/
