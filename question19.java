package javaassignment;

import java.util.*;

abstract class Bank {
    String accNo;
    String custName;
    int custGender;  // 1 = Male, 2 = Female
    String custJob;
    double curBal;

    Bank(String accNo, String custName, int custGender, String custJob, double curBal) {
        this.accNo = accNo;
        this.custName = custName;
        this.custGender = custGender;
        this.custJob = custJob;
        this.curBal = curBal;
    }

    public String toString() {
        String genderStr = (custGender == 1) ? "Male" : "Female";
        return "Account No: " + accNo + "\nName: " + custName + "\nGender: " + genderStr +
               "\nJob: " + custJob + "\nCurrent Balance: " + curBal;
    }

    public abstract double calcBalance();
}

// Subclass Saving
class Saving extends Bank {
    double savRate;  // percent interest rate (e.g., 0.05 = 5%)

    Saving(String accNo, String custName, int custGender, String custJob, double curBal, double savRate) {
        super(accNo, custName, custGender, custJob, curBal);
        this.savRate = savRate;
    }

    @Override
    public double calcBalance() {
        return curBal + (savRate * curBal);
    }
}

// Subclass Current
class Current extends Bank {
    boolean fixedDep; // true if has fixed deposit
    double curRate;   // percent interest rate

    Current(String accNo, String custName, int custGender, String custJob, double curBal, double curRate, boolean fixedDep) {
        super(accNo, custName, custGender, custJob, curBal);
        this.curRate = curRate;
        this.fixedDep = fixedDep;
    }

    @Override
    public double calcBalance() {
        double balance = curBal + (curRate * curBal);
        if (fixedDep) {
            balance -= 150;  // service fee
        }
        return balance;
    }
}

// Main class
public class question19{
    public static void main(String[] args) {
        List<Bank> customers = new ArrayList<>();

        // Adding sample data
        customers.add(new Saving("S1001", "Akhila", 2, "Engineer", 5000, 0.05));
        customers.add(new Saving("S1002", "Kiran", 1, "Teacher", 4000, 0.04));
        customers.add(new Current("C2001", "Ravi", 1, "Doctor", 8000, 0.03, true));
        customers.add(new Current("C2002", "Sneha", 2, "Nurse", 6000, 0.02, false));
        customers.add(new Current("C2003", "Manoj", 1, "Clerk", 7000, 0.025, true));

        Scanner sc = new Scanner(System.in);

        // (b) Search by account number
        System.out.print("Enter account number to search: ");
        String searchAccNo = sc.nextLine();
        boolean found = false;

        for (Bank b : customers) {
            if (b.accNo.equalsIgnoreCase(searchAccNo)) {
                System.out.println("\nCustomer Details:");
                System.out.println(b);
                System.out.println("Calculated Balance: " + b.calcBalance());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Customer with account number " + searchAccNo + " not found.");
        }

        // (c) Count current account holders and total balance
        int currentCount = 0;
        double totalBalance = 0;

        for (Bank b : customers) {
            if (b instanceof Current) {
                currentCount++;
                totalBalance += b.calcBalance();
            }
        }

        System.out.println("\nTotal number of Current account holders: " + currentCount);
        System.out.println("Total balance of all Current account holders: " + totalBalance);
    }
}


/*
 * Enter account number to search: S1001

Customer Details:
Account No: S1001
Name: Akhila
Gender: Female
Job: Engineer
Current Balance: 5000.0
Calculated Balance: 5250.0

Total number of Current account holders: 3
Total balance of all Current account holders: 21235.0

*/
