package mypojofiles;

import javax.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;
    private double amount;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Transaction() {}

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Description: " + description + ", Amount: " + amount;
    }
}
