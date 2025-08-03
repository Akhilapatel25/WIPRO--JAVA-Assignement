package mymainfiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mydaofiles.AccountDAO;
import mypojofiles.Account;
import mypojofiles.Transaction;

public class mainMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountDAO dao = new AccountDAO();

        while (true) {
            System.out.println("\nHIBERNATE: Account & Transaction");
            System.out.println("1. Create Account with Transactions");
            System.out.println("2. View All Accounts");
            System.out.println("3. View Account by ID");
            System.out.println("4. Delete Account by ID");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter account holder name: ");
                    String holderName = sc.nextLine();

                    Account acc = new Account();
                    acc.setHolderName(holderName);

                    System.out.print("Enter number of transactions: ");
                    int txnCount = sc.nextInt(); sc.nextLine();

                    List<Transaction> transactions = new ArrayList<>();
                    for (int i = 1; i <= txnCount; i++) {
                        System.out.print("Enter transaction " + i + " description: ");
                        String desc = sc.nextLine();

                        System.out.print("Enter transaction " + i + " amount: ");
                        double amount = sc.nextDouble(); sc.nextLine();

                        Transaction txn = new Transaction();
                        txn.setDescription(desc);
                        txn.setAmount(amount);
                        txn.setAccount(acc);

                        transactions.add(txn);
                    }

                    acc.setTransactions(transactions);
                    dao.createAccountWithTransaction(acc);
                    break;

                case 2:
                    List<Account> accounts = dao.getAllAccounts();
                    accounts.forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Enter Account ID: ");
                    Account accById = dao.getAccountById(sc.nextInt());
                    System.out.println(accById != null ? accById : "Account not found.");
                    break;

                case 4:
                    System.out.print("Enter Account ID to delete: ");
                    dao.deleteAccount(sc.nextInt());
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
