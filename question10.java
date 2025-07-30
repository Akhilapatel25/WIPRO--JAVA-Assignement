package javaassignment;

import java.util.Scanner;
public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		  int eggs = s.nextInt();

	        int gross = eggs / 144;
	        eggs %= 144;

	        int dozen = eggs / 12;
	        int leftover = eggs % 12;

	        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + leftover);
	    
	}

}

/*
 * 3
Your number of eggs is 0 gross, 0 dozen, and 3

*/
