package springcore;

public class Bank2 {
    private int bankId;
    private String bankName;

    public Bank2(int bankId, String bankName) {
        this.bankId = bankId;
        this.bankName = bankName;
    }

    public String getBankDetails() {
        return "Bank ID: " + bankId + ", Bank Name: " + bankName;
    }
}
