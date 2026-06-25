public class BankAccount {
    int accountNumber;
    String holder;
    int balance;
    static int count=0;
    BankAccount(int accountNumber, String holder,int balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        count++;
    }
    public static int totalAccounts(){
        return count;
    }
    public void deposit(int amount){
        if(amount>0){
            balance=balance+amount;
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public void withdraw(int amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Amount Withdrawl Successfully");
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public void getStatement(){
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Balance        : " + balance);
    }
}


class MainAccount{
    public static void main(String[] args) {
        BankAccount b1=new BankAccount(1,"Apeksha",50000);
        BankAccount b2=new BankAccount(2,"Vaishnavi",25000);
        BankAccount b3=new BankAccount(3,"Krishna",10000);
        BankAccount b4=new BankAccount(4,"Payal",34000);
        BankAccount b5=new BankAccount(5,"Paras",60000);
        System.out.println(BankAccount.totalAccounts());
        b1.deposit(5000);
        b1.withdraw(3000);
        b1.deposit(2000);
        b1.withdraw(10000);
        b1.deposit(1000);
        b2.deposit(1000);
        b2.withdraw(5000);
        b2.deposit(3000);
        b2.withdraw(1000);
        b2.deposit(2000);
        b3.deposit(500);
        b3.withdraw(2000);
        b3.deposit(1500);
        b3.withdraw(500);
        b3.deposit(1000);
        b4.getStatement();
        b5.getStatement();
        b1.getStatement();

    }
}
