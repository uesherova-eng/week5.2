package polymorphism;

public class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;


    }
}
class SavingsAccount extends BankAccount {
    private int withdrawalLimit = 3;
    private int withdrawals = 0;

    public SavingsAccount(double balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        if (withdrawals < withdrawalLimit) {
            if (amount <= balance) {
                balance -= amount;
                withdrawals++;
                System.out.println("Withdrawn: " + amount + " from Savings");
            } else {
                System.out.println("Insufficient funds");
            }
        } else {
            System.out.println("Withdrawal limit reached");
        }
    }
}
class CheckingAccount extends BankAccount {
    private double fee = 2.0;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        double totalAmount = amount + fee;
        if (totalAmount <= balance) {
            balance -= totalAmount;
            System.out.println("Withdrawn: " + amount + " + som" + fee + " fee");
        } else {
            System.out.println("Insufficient funds including fee");
        }
    }
}