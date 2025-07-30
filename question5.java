package javaassignment;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner s=new Scanner(System.in);

	       System.out.print("Enter your salary: ");
	        double salary = s.nextDouble();

	       System.out.print("Enter your years of service: ");
	        int years = s.nextInt();

	        if (years > 6) 
	        {
	        	 double bonus=salary * (0.10);
	            System.out.println("Bonus amount: " + bonus);
	            
             } 
	        
	        else {
	            System.out.println("No bonus, service is less than 7 years.");
	        }

	}

}
