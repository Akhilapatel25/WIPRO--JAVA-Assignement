package javaassignment;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s=new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String name=s.nextLine();

	        System.out.print("Enter your roll number: ");
	        String roll=s.nextLine();

	        System.out.print("Enter your field of interest: ");
	        String interest=s.nextLine();

	        System.out.println("Hey, my name is " + name + " and my roll number is " + roll + ". My field of interest is" + interest + ".");

	}

}
