package springcore;

public class Account2 {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private Bank2 bank;

    public Account2(int accountNumber, String accountHolderName, double balance, Bank2 bank) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.bank = bank;
    }

    public void printDetails() {
        System.out.println("Account Number   : " + accountNumber);
        System.out.println("Account Holder   : " + accountHolderName);
        System.out.println("Balance          : " + balance);
        System.out.println(bank.getBankDetails());
    }
}
