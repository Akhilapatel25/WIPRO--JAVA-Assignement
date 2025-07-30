package javaassignment;

import java.util.Scanner;
public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        System.out.print("Enter number of classes held: ");
	        int held = s.nextInt();
	        System.out.print("Enter number of classes attended: ");
	        int attended = s.nextInt();

	        double percentage = (attended * 100.0) / held;
	        System.out.println("Attendance percentage: " + percentage + "%");

	        if (percentage >= 70) {
	            System.out.println("Allowed to sit in exam");
	        } else {
	            System.out.print("Do you have a medical cause? (Y/N): ");
	            char cause = s.next().charAt(0);
	            if (cause == 'Y' || cause == 'y')
	                System.out.println("Allowed to sit in exam due to medical cause");
	            else
	                System.out.println("Not allowed to sit in exam");
	        }

	}

}

/*
 * Enter number of classes held: 56
Enter number of classes attended: 23
Attendance percentage: 41.07142857142857%
Do you have a medical cause? (Y/N): Y
Allowed to sit in exam due to medical caus
*/
