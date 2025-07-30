package javaassignment;

import java.util.Scanner;
public class question9 {

	
		
		// Q9: Read product number and quantity sold, use switch to calculate total value
	
		    public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);
		        double total = 0;
		        char choice=' ';

		        do {
		            System.out.print("Enter product number (1/2/3): ");
		            int product = s.nextInt();
		            System.out.print("Enter quantity sold: ");
		            int quantity = s.nextInt();

		            double price = 0;
		            switch (product) {
		                case 1: price = 22.50; break;
		                case 2: price = 44.50; break;
		                case 3: price = 9.98; break;
		                default:
		                    System.out.println("Invalid product number!");
		                    continue;
		            }

		            total += price * quantity;

		            System.out.print("Do you want to enter more? (Y/N): ");
		            choice = s.next().charAt(0);
		        } while (choice == 'Y' || choice == 'y');

		        System.out.println("Total retail value of all products sold: Rs. " + total);
		    
	

	}

}

/*
 * Enter product number (1/2/3): 2
Enter quantity sold: 3
Do you want to enter more? (Y/N): Y
Enter product number (1/2/3): 1
Enter quantity sold: 4
Do you want to enter more? (Y/N): N
Total retail value of all products sold: Rs. 223.5

*/
