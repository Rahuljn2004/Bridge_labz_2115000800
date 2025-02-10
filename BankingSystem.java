abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public abstract double calculateInterest();

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
}

interface Loanable {
    boolean applyForLoan(double amount);
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.04; // Corrected the calculation by using getBalance()
    }

    public boolean applyForLoan(double amount) {
        return amount < 50000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount(12345, "John Doe", 20000);
        System.out.println("Interest: " + acc.calculateInterest());
    }
}
