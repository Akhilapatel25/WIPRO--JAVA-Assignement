package mypojofiles;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String holderName;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Transaction> transactions = new ArrayList<>();

    public Account() {}

    public Account(String holderName) {
        this.holderName = holderName;
    }

    public int getId() {
        return id;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
        t.setAccount(this);
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account ID: ").append(id)
          .append(", Holder: ").append(holderName)
          .append("\nTransactions:\n");
        for (Transaction t : transactions) {
            sb.append(t).append("\n");
        }
        return sb.toString();
    }
}
