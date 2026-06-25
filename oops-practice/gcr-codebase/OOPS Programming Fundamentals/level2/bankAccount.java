class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, "Rahul", 50000);

        sa.displayDetails();
        System.out.println("Balance: " + sa.getBalance());

        sa.setBalance(60000);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}